package ru.otus.otuskotlin.dating.backend.common.model

import java.time.LocalDate
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertEquals
internal class DatingTest {
    lateinit var profile:Profile
    lateinit var dating:Dating
    init{
        profile = Profile("0",
                "Marya",
                "Semenovna",
                "volk",
                LocalDate.of(2020,11,12),
                "volk@mail.ru",
                "21-21-21",
                Gender.FEMALE)
        dating = Dating("1",profile,
                LocalDate.of(2021,1,12),
                LocalTime.of(11,12),
                "city")
    }
    @Test
    fun getProfile() {
        assertEquals(profile,dating.profile)
    }

    @Test
    fun setProfile() {
        var profile2 = Profile("0",
                "Nadia",
                "Petrovna",
                "Ivanova",
                LocalDate.of(2020,11,12),
                "volk@mail.ru",
                "21-21-21",
                Gender.FEMALE)
        dating.profile = profile2
        assertEquals(profile2,dating.profile)
    }

    @Test
    fun getDate() {
        assertEquals(LocalDate.of(2021,1,12),dating.date)
    }

    @Test
    fun setDate() {
        var date2 = LocalDate.of(2021,1,12)
        dating.date = date2
        assertEquals(date2,dating.date)
    }

    @Test
    fun getTime() {
        assertEquals(LocalTime.of(11,12),dating.time)
    }

    @Test
    fun setTime() {
        var time2 = LocalTime.of(10,2)
        dating.time = time2
        assertEquals(time2,dating.time)
    }

    @Test
    fun getLocation() {
        assertEquals("city",dating.location)
    }

    @Test
    fun setLocation() {
        var location2 = "village"
        dating.location = location2
        assertEquals(location2,dating.location)
    }
}