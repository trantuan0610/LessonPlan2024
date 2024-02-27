package com.example.lessonplan

import android.os.Build
import androidx.annotation.RequiresApi

var item = "hello"
val item2 = "hello"
@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    println("Hello, world!!!")
    //  item2 = "h"
    // item = 1
    val name = "Tuấn"
    var name2 : Char = 'a'
    var so1 =40_000
    var so2=40_000 +1_0
    println("In ra $so2 " + so1 + "\n" + so2)
    // Quy tắc đặt tên biến : Camel
    var isDone : Boolean
    // ép kiểu từ dữ liệu bé -> lớn : Int->Long->Float->Double
    var soA : Int= 10
    var soB = soA.toString()
    // kiểm tra loại của biến
    println(soB::class.java.typeName)
    //phép toán + - * / %(chia Kiểu Int ko ra kết quả chính xác, muốn chính xác chai theo kiểu float)
    var so3 :Double= 10.0
    var so4 :Double= 3.0
    var so5 : Double = so3/so4
    println(so5)
    //toán tử gán +=,-=,*=,/=
    so3 += so4
    println(so3)
    // so sánh 2 phần tử ==,!=,>,<,>=,<=,equals, compareTo(so sánh 2 chuỗi, bằng nhau trả về giá trị 0, khác nhau trả về giá trị âm dương )
    // toán tử logic || và && , !
    // toán tử tiền tố hậu tố ++,--

    // if else -> bài tập BMI
    // when
    var i = 0
    when(i){
        1 -> println("1")
        in -1..7 -> println("4->7")
        3 -> println("3")
        4 -> println("4")
        0 -> println("0")
        else -> println("so khac")
    }
    // vòng lặp for
    var tong = 0
    for (i in 1.. 9 step 2){
        println(i)
        tong += i
    }
    println("tổng các số lẻ từ 1 đến 9 là: $tong")

    var dsTen = arrayOf("Tuan","Lan", "Khanh","Huong")
    for (i in dsTen){
        println(i)
    }

    dsTen.forEach {
        println(it)
    }
    // while
    var a = 10
//    while (a >0){
//        println(a)
//        a -= 1
//    }

    // do-while
    var b= 1
    do {
        b++

        println(b)

    }while (b < 10)

    //break, continue
    var mangSoNguyen = intArrayOf(1,2,3,4,5,6)
    for (i in mangSoNguyen){
        if (i.equals(2)){
            println("Số 2 sau đó break")
            break
        }
    }



}