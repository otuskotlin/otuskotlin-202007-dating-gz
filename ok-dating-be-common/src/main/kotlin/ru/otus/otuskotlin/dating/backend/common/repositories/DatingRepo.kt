package ru.otus.otuskotlin.dating.backend.common.repositories

import ru.otus.otuskotlin.dating.backend.common.model.Dating
import ru.otus.otuskotlin.dating.backend.common.model.Gender
import ru.otus.otuskotlin.dating.backend.common.model.Profile
import java.time.LocalDate
import java.time.LocalTime

class DatingRepo{
    private var Datings = mutableListOf<Dating>()
    init{
        var profile = Profile(
            id = "0",
        fName = "Ivan",
        mName = "Ivanovich",
        lName= "Ivanov",
        dob = LocalDate.MIN,
        email = "Ivanov@mail.ru",
        phone = "112233",
         gender = Gender.MALE
        )
        var profile2  = Profile(
                id = "1",
                fName = "Maria",
                mName = "Ivanovna",
                lName= "Ivanova",
                dob = LocalDate.MIN,
                email = "Ivanova@mail.ru",
                phone = "887766",
                gender = Gender.FEMALE
        )
       var dating =  Dating(
               id="0",
        profile =profile,
        date= LocalDate.MIN,
        time = LocalTime.MIN,
        location = "London"
        )
        var dating1 =  Dating(
                id="1",
                profile =profile2,
                date= LocalDate.MIN,
                time = LocalTime.MIN,
                location = "London"
        )
        Datings.add(dating)
        Datings.add(dating1)
    }
    fun getDatings(): MutableList<Dating> {
        return Datings
    }
}