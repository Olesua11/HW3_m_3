package com.example.hw3_m_3;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {

private TextView rv_spisoc;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        rv_spisoc = itemView.findViewById(R.id.rv_spisoc);
    }
    public void onBind(String rec1){
        rv_spisoc.setText(rec1);

    }
}

