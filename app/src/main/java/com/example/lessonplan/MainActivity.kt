package com.example.lessonplan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rcvSanPham)
        recyclerView.layoutManager = LinearLayoutManager(this)

        //Khởi tạo và gắn adapter cho rcv
        adapter = ProductAdapter()
        recyclerView.adapter = adapter

        // Thêm dữ liệu vào Adapter (có thể thêm dữ liệu từ một nguồn dữ liệu bất kỳ)
        val data: List<Product> = listOf(Product("Tuấn","?",true),
            Product("Lớp A","?",true),
            Product("Lớp B","?",false),
            Product("Lớp C","?",true),
            Product("Lớp V","?",false),
            Product("Lớp E","?",false),
            Product("Lớp D","?",false),
            Product("Lớp G","?",false),
            Product("Lớp H","?",false),
            Product("Lớp O","?",false),
            Product("Lớp W","?",true),
            Product("Lớp Q","?",false),
            Product("Lớp S","?",true),
            Product("Lớp Z","?",false),
            Product("Lớp X","?",false),
            Product("Lớp B","?",true),
            Product("Lớp N","?",false),
            Product("Lớp M","?",true),
        )
        adapter.setData(data)
    }
}