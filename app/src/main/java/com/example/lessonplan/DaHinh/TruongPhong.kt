package com.example.lessonplan.DaHinh

import com.example.lessonplan.KeThua.NhanVien

class TruongPhong : NhanSu() {
    override fun tinhLuong(ngayCong: Int): Double {
        return 50*ngayCong*1.0
    }
}