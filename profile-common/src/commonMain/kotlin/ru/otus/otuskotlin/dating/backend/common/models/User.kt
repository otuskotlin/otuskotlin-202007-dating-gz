package ru.otus.otuskotlin.dating.backend.common.models

import java.time.LocalDate

data class User (
    var id: String = "",
    var fName: String = "",
    var mName: String = "",
    var lName: String = "",
    var dob: LocalDate = LocalDate.MIN,
    var email: String = "",
    var phone: String = "",
    var gender: Gender = Gender.FEMALE


){}