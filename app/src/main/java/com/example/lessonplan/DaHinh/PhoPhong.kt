package com.example.lessonplan.DaHinh

class PhoPhong : NhanSu() {
    override fun tinhLuong(ngayCong: Int): Double {
        return 40*ngayCong*1.0
    }
}