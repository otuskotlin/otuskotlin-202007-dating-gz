package ru.otus.otuskotlin.dating.backend.common.services

import ru.otus.otuskotlin.dating.backend.common.model.Dating
import ru.otus.otuskotlin.dating.backend.common.model.Gender
import ru.otus.otuskotlin.dating.backend.common.model.Profile
import java.time.LocalDate
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class DatingServiceTest{
    @Test
    fun allTests(){
        var datingService:DatingService = DatingService()
        assertEquals(datingService.getAll().size,2)
        var dating: Dating? =datingService.getById("0").apply {
            if(this != null){
                assertEquals(this.location,"London")
                var profile = this.profile
                assertEquals(profile.id,"0")
                assertEquals(profile.fName , "Ivan")
                assertEquals(profile.mName , "Ivanovich")
                assertEquals(profile.lName, "Ivanov")
                assertEquals(profile.dob , LocalDate.MIN)
                assertEquals(profile.email , "Ivanov@mail.ru")
                assertEquals(profile.phone , "112233")
                assertEquals(profile.gender , Gender.MALE)
            }
        }
        assertNull(datingService.getById("3"))

        var profile = Profile(
                id = "2",
                fName = "Ivan1",
                mName = "Ivanovich1",
                lName= "Ivanov1",
                dob = LocalDate.MIN,
                email = "Ivanov1@mail.ru",
                phone = "112233",
                gender = Gender.MALE
        )
        var dating1 =  Dating(
                id="2",
                profile =profile,
                date= LocalDate.MIN,
                time = LocalTime.MIN,
                location = "London"
        )
        datingService.insert(dating1)
        assertEquals(datingService.getAll().size,3)

        var dating2: Dating? =datingService.getById("2").apply {
            if(this != null){
                assertEquals(this.location,"London")
                var profile = this.profile
                assertEquals(profile.id,"2")
                assertEquals(profile.fName , "Ivan1")
                assertEquals(profile.mName , "Ivanovich1")
                assertEquals(profile.lName, "Ivanov1")
                assertEquals(profile.dob , LocalDate.MIN)
                assertEquals(profile.email , "Ivanov1@mail.ru")
                assertEquals(profile.phone , "112233")
                assertEquals(profile.gender , Gender.MALE)
            }
        }
        var profile2 = Profile(
                id = "2",
                fName = "Ivan2",
                mName = "Ivanovich2",
                lName= "Ivanov2",
                dob = LocalDate.MIN,
                email = "Ivanov1@mail.ru",
                phone = "112233",
                gender = Gender.MALE
        )
        var dating3 =  Dating(
                id="2",
                profile =profile2,
                date= LocalDate.MIN,
                time = LocalTime.MIN,
                location = "London"
        )
        datingService.update(dating3)

        assertEquals(datingService.getAll().size,3)
        var dating4: Dating? =datingService.getById("2").apply {
            if(this != null){
                assertEquals(this.location,"London")
                var profile = this.profile
                assertEquals(profile.id,"2")
                assertEquals(profile.fName , "Ivan2")
                assertEquals(profile.mName , "Ivanovich2")
                assertEquals(profile.lName, "Ivanov2")
                assertEquals(profile.dob , LocalDate.MIN)
                assertEquals(profile.email , "Ivanov1@mail.ru")
                assertEquals(profile.phone , "112233")
                assertEquals(profile.gender , Gender.MALE)
            }
        }
        datingService.deleteById("2")


        for(dating:Dating in datingService.getAll()){
            println(dating.id)
            println(dating.profile.id)
            println(dating.profile.fName)
            println(dating.profile.lName)
            println("**************************************")
        }

        assertEquals(datingService.getAll().size,2)
    }

}