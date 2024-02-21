package com.example.lessonplan.DaHinh

fun main(){
    // tạo 1 đối tương nv1, kiểu dữ liệu là NhanSu
    var nv1:NhanSu = PhoPhong()
    println("luong của ông nv1 là:" +nv1.tinhLuong(23))
    //nv1 len truong phong
    nv1 = TruongPhong()
    println("luong của ông nv1 là:" +nv1.tinhLuong(23))
}
