package com.example.lessonplan

import java.util.Calendar
import java.util.Random

fun TinhTong (a:Int,b:Int,c:Int): Int {
    return a+b+c
}

fun XinChao(){
    println("Xin Chào")
}
fun main(){
    //function -> 2 loại trả về giá trị và hàm thủ tục
    var tong = TinhTong(1,2,23)
    println(tong)
    XinChao()

    //try-catch-finally
    var a= 10
    var b = 0
    try {
        var c = a/b
        println(c)
    } catch (e:Exception)
    {
        e.message
    } finally {
        println("Thoát")
    }
    println("Đoạn code sau")

    //Datetime
    var cal = Calendar.getInstance()
    println(cal)
    var nam = cal.get(Calendar.YEAR)
    var thang = cal.get(Calendar.MONTH) + 1
    var ngay = cal.get(Calendar.DAY_OF_MONTH)
    println("Ngay: $ngay thang $thang nam $nam")
    // random
    var random = (0..10).random()
    println("random" +random)
    //kiểu char vs method(isLetter, isDigit, isWhitespace, toLowerCase,toUpperCase, toInt)
    var x = 3
    val y = x++
    println("x : $x; y: $y")

    //kiểu string vs method

    //array - mảng 1 chiều(khai báo trc phần tử, kích thước cố định, có thể thay đổi các phần tử)
    val numbers1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    numbers1[0] = 2
    println(numbers1[0])
    // array mảng 2 chiều
// Initializing with values
    val matrix3: Array<Array<Int>> = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 6, 7, 8),
        arrayOf(9, 10, 11, 12)
    )
    val element = matrix3[1][2]
    matrix3[1][2] = 20 // Modifying the element at row 1, column 2

    // list kotlin -mutableList(thêm sửa xoá) vs List(read only)
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    val list = mutableListOf<Int>()
    list.addAll(listOf(1, 2, 3))
    println(list) // [1, 2, 3]
    list += listOf(4, 5)


}