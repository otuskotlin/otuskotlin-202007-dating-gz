package ru.otus.otuskotlin.dating.backend.common.model

//import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

internal class ProfileTest {
    lateinit var profile:Profile
    init{
        profile = Profile("0",
                "Marya",
                "Semenovna",
                 "volk",
           LocalDate.of(2020,11,12),
        "volk@mail.ru",
        "21-21-21",
        Gender.FEMALE)
    }
    @Test
    fun getId() {
        assertEquals("0",profile.id)
    }

    @Test
    fun setId() {
        profile.id = "1"
        assertEquals("1",profile.id)
    }

    @Test
    fun getFName() {
        assertEquals("Marya",profile.fName)
    }

    @Test
    fun setFName() {
        profile.fName = "Katya"
        assertEquals("Katya",profile.fName)
    }

    @Test
    fun getMName() {
        assertEquals("Semenovna",profile.mName)
    }

    @Test
    fun setMName() {
        profile.mName = "Petrovna"
        assertEquals("Petrovna",profile.mName)
    }

    @Test
    fun getLName() {
        assertEquals("volk",profile.lName)
    }

    @Test
    fun setLName() {
        profile.lName = "Petrova"
        assertEquals("Petrova",profile.lName)
    }

    @Test
    fun getDob() {
        var date = LocalDate.of(2020,11,12)
        assertEquals(date,profile.dob)
    }

    @Test
    fun setDob() {
        var date = LocalDate.of(2020,12,14)
        profile.dob = date
        assertEquals(date,profile.dob)
    }

    @Test
    fun getEmail() {
        assertEquals("volk@mail.ru",profile.email)
    }

    @Test
    fun setEmail() {
        profile.email = "aaa@mail.ru"
        assertEquals("aaa@mail.ru",profile.email)
    }

    @Test
    fun getPhone() {
        assertEquals("21-21-21",profile.phone)
    }

    @Test
    fun setPhone() {
        profile.phone = "01-01-01"
        assertEquals("01-01-01",profile.phone)
    }

    @Test
    fun getGender() {
        assertEquals(Gender.FEMALE,profile.gender)
    }

    @Test
    fun setGender() {
        profile.gender = Gender.MALE
        assertEquals(Gender.MALE,profile.gender)
    }
}