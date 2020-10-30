package ru.otuskotlin.transport.common.dto

import java.util.*
import java.time.LocalDate
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertEquals

internal class DatingDTOTest {
    lateinit var datingDTO: DatingDTO
    lateinit var newUUID : UUID
    init{
        newUUID =  UUID.randomUUID()
        datingDTO = DatingDTO(
            id=newUUID,
         idProfile= "aa",
        date = LocalDate.of(1,1,1),
        time = LocalTime.of(1,1),
        location= "bb"
        )
    }
    @Test
    fun getId() {
        assertEquals(newUUID,datingDTO.id)
    }

    @Test
    fun getIdUser() {
        assertEquals("aa",datingDTO.idProfile)
    }

    @Test
    fun getDate() {
        assertEquals(LocalDate.of(1,1,1),datingDTO.date)
    }

    @Test
    fun getTime() {
        assertEquals(LocalTime.of(1,1),datingDTO.time)
    }

    @Test
    fun getLocation() {
        assertEquals("bb",datingDTO.location)
    }

}