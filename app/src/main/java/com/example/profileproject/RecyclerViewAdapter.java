package com.example.profileproject;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<MessageViewHolder> {
    List<Message> items;

    public RecyclerViewAdapter(List<Message> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_item_list, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        holder.getAvatar().setImageResource(items.get(position).getAvatar());
        holder.getName().setText(items.get(position).getName());
        holder.getMessage().setText(items.get(position).getMessage());
        holder.getTime().setText(items.get(position).getTime());
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(view -> {
            //int id= (int) view.getTag(position);
            //int id = holder.getId();
            Intent intent = new Intent(view.getContext(), ProfileActivity.class);
            intent.putExtra("IMAGE", items.get(position).getAvatar());
            //intent.putExtra("TITLE", items.get(position).getName());
            view.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
