package com.example.lessonplan;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private String[] mData;

    public MyAdapter(String[] data, SecondScreenActivity secondScreenActivity) {
        mData = data;
    }

    //Phương thức onCreateViewHolder tạo ra một ViewHolder mới cho mỗi mục trong RecyclerView.
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    //Phương thức onBindViewHolder gắn dữ liệu vào ViewHolder, đảm bảo dữ liệu phù hợp với vị trí của mục trong danh sách.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(mData[position]);
        handleItemClickHolder(holder, position);
    }

    private void handleItemClickHolder(MyViewHolder holder, int position) {
        holder.textView.setOnClickListener(view -> Log.d("AAA",mData[position]));
    }

    //Phương thức getItemCount trả về số lượng mục trong danh sách.
    @Override
    public int getItemCount() {
        return mData.length;
    }

    //Lớp này là một ViewHolder cho mỗi mục trong RecyclerView.
    //Nó giữ tham chiếu đến các thành phần giao diện người dùng (trong trường hợp này là một TextView)
    // để có thể cập nhật dữ liệu một cách hiệu quả.
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tvName);
        }
    }
}

