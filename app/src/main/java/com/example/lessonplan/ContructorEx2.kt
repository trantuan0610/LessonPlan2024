package com.example.lessonplan

class ContructorEx2 {
    var brand: String = ""
    var year: Int = 0

    // Secondary constructor
    constructor(brand: String, year: Int) {
        this.brand = brand
        this.year = year
    }

    // Phương thức của lớp
    fun displayInfo() {
        println("Brand: $brand, Year: $year")
    }
}