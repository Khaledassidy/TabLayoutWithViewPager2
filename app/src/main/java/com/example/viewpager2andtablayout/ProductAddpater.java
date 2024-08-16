package com.example.viewpager2andtablayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAddpater extends RecyclerView.Adapter<ProductAddpater.productViewholder> {

    ArrayList<Product> arrayList;

    public ProductAddpater(ArrayList<Product> arrayList){
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public productViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.costume_item,parent,false);
        return new productViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull productViewholder holder, int position) {

        holder.image.setImageResource(arrayList.get(position).getImage());
        holder.name.setText(arrayList.get(position).getName());
        holder.price.setText(String.valueOf(arrayList.get(position).getPrice()));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class productViewholder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name,price;
        public productViewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image_product);
            name=itemView.findViewById(R.id.name);
            price=itemView.findViewById(R.id.price);
        }
    }
}
