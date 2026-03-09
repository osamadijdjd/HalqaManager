package com.example.halqamanager.data.dao

interface StudentDao {
    fun insert(student: Student)
    fun update(student: Student)
    fun delete(student: Student)
    fun queryAll(): List<Student>
    fun queryById(id: Int): Student?
}