package ru.otus.otuskotlin.dating.backend.common.services

import ru.otus.otuskotlin.dating.backend.common.model.Dating

interface IService<T> {
    fun getAll() :List<T>


    fun getById(id:String): T?
    fun deleteById(id: String): T?
    fun insert(t: T)
    fun update(t: T): T?
}