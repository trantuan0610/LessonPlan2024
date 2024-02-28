package com.example.lessonplan

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter : RecyclerView.Adapter<ProductAdapter.MyViewHolder>(){
//Adapter sẽ cung cấp dữ liệu cho RecyclerView và quản lý việc hiển thị các item.
    private var dataList = listOf<Product>()

    fun setData(data: List<Product>) {
        dataList = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductAdapter.MyViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvNameProduct: TextView = itemView.findViewById(R.id.tvNameProduct)
        private val tvIsActive: TextView = itemView.findViewById(R.id.tvIsActiveProduct)
        private val imgProduct: ImageView = itemView.findViewById(R.id.imgProduct)

        @SuppressLint("SetTextI18n", "ResourceAsColor")
        fun bind(product: Product) {
            tvNameProduct.text = product.name
            imgProduct.setImageResource(R.drawable.phone)
            if (product.isActive){
                tvIsActive.text = "Nhóm Mở"
                tvIsActive.setTextColor(R.color.black)
            } else {
                tvIsActive.text = "Nhóm Đóng"
                tvIsActive.setTextColor(R.color.purple_700)
            }
        }
    }
}