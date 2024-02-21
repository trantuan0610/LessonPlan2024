package com.example.lessonplan.KeThua.InterfaceEx

class ConInterface:ViDuInterface {
    override fun ThongTin(ten: String, tuoi: Int, cccd: String) {
        println("định nghĩa lại thông tin")
    }

    override fun TinhToan(a: Int, b: Int): Int {
        return a+b
    }
}