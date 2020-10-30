package ru.otus.otuskotlin.dating.backend.common.services

import ru.otus.otuskotlin.dating.backend.common.model.Dating
import ru.otus.otuskotlin.dating.backend.common.repositories.DatingRepo

class DatingService{
    private var DatingDAO = DatingRepo().getDatings()

    fun getAll() :List<Dating>{
        return DatingDAO
    }

    fun getById(id:String):Dating?{
       for(dating :Dating in DatingDAO) {
           if(dating.id.equals(id)){
               return dating
           }
       }
        return null
    }
    fun deleteById(id: String):Dating?{
       return(getById(id).apply { if(this!=null){
           DatingDAO.remove(this)
       } })
    }
    fun insert(dating: Dating){
        DatingDAO.add(dating)
    }
    fun update(dating: Dating):Dating?{
        DatingDAO.forEachIndexed{index, value->
            if(value.equals(dating)){
                DatingDAO.set(index, dating)
                return dating
            }
        }
        DatingDAO.add(dating)

        return dating
    }
}