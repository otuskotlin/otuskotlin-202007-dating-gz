package ru.otus.otuskotlin.dating.backend.common.model

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

internal class TestGenger{
    var genderF: Gender = Gender.FEMALE
    var genderM: Gender = Gender.MALE

    @Test
    fun testQuestion(){
        assertEquals(genderF,Gender.FEMALE)
        assertEquals(genderM,Gender.MALE)
    }
}