package com.example.hw3_m_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {
    public ContactAdapter(ArrayList<String> spisoc) {
        this.spisoc = spisoc;
    }

    private ArrayList <String>spisoc;
    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_1, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
holder.onBind(spisoc.get(position));
    }

    @Override
    public int getItemCount() {
        return spisoc.size();
    }
}
