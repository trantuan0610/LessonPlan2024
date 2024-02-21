package com.example.lessonplan.KeThua

open abstract class NhanVien {
    // instance var
    protected var ten = ""
    protected var cccd = ""
    protected var que = ""
    val luongCoBan = 1200.0

    //ham trừu tượng(ép class con phải có hàm này)
    public abstract fun TinhLuong():Double

    constructor(ten: String, cccd: String, que: String) {
        this.ten = ten
        this.cccd = cccd
        this.que = que
    }

    constructor(ten: String, cccd: String) {
        this.ten = ten
        this.cccd = cccd
    }
}