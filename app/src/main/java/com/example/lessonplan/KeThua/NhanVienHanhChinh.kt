package com.example.lessonplan.KeThua

class NhanVienHanhChinh : NhanVien {
    constructor(ten:String,cccd:String,que:String):super(ten,cccd,que)

    override fun TinhLuong(): Double {
        return luongCoBan
    }
}