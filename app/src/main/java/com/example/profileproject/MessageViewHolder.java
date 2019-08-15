package com.example.profileproject;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessageViewHolder extends RecyclerView.ViewHolder {
    private CircleImageView avatar;
    private TextView name;
    private TextView message;
    private TextView time;
    private View view;
    private int id;


    public MessageViewHolder(@NonNull View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.avatar);
        name = itemView.findViewById(R.id.name);
        message = itemView.findViewById(R.id.message);
        time = itemView.findViewById(R.id.time);
        view = itemView;
        id = itemView.getId();
    }

    public CircleImageView getAvatar() {
        return avatar;
    }

    public TextView getName() {
        return name;
    }

    public TextView getMessage() {
        return message;
    }

    public TextView getTime() {
        return time;
    }

    public View getView() {
        return view;
    }

    public int getId() {
        return id;
    }
}
