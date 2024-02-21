package com.example.lessonplan

// Primary constructor
class ContructorEx(val name: String, var age: Int) {
    // Không có khối mã nằm trong primary constructor

    // Phương thức của lớp
    fun speak() {
        println("$name is speaking.")
    }
}