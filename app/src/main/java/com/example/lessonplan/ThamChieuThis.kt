package com.example.lessonplan

class ThamChieuThis {
    //instance var
    var diemToan =  0f
    var diemVan = 0f

    fun TestCucBo(diemVan : Float, diemToan :Float){
        println("Tổng điểm trong biến cục bộ" + (diemVan + diemToan))
        println("Tổng điểm trong biến cục bộ" + (this.diemVan + this.diemToan))
        this.diemVan = diemVan
        this.diemToan = diemToan
    }
}