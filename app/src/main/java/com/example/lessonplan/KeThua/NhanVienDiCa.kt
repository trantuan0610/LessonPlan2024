package com.example.lessonplan.KeThua

class NhanVienDiCa: NhanVien {
    constructor(ten:String,cccd:String,que:String):super(ten,cccd,que)

    override fun TinhLuong(): Double {
        return luongCoBan *1.05
    }
}