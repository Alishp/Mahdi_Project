package com.example.profileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {
    private CircleImageView picture;
    private TextView name;
    private ImageView search;
    String srt0 = "Alireza";
    String srt = "Jaber";
//    private List<Message> items;
//    private MessageViewHolder holder;

    public static final String KEY_AVATAR = "avatar";
    public static final String KEY_NAME = "name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);

        picture = findViewById(R.id.profilePicture);
        name = findViewById(R.id.name);
        search = findViewById(R.id.search);
        search.setOnClickListener(v -> Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show());


        //int id = holder.itemView.getId();
        //String title = getIntent().getStringExtra(KEY_NAME);
        int img = getIntent().getIntExtra(KEY_AVATAR,R.drawable.abbas);


        picture.setImageResource(img);
        //name.setText(title);




    }


    public int stringCompare(String str1, String str2) {
        str1 = "Alireza";
        str2 = "Jabeffege"
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int) str1.charAt(i);
            int str2_ch = (int) str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        if (l1 != l2) {
            return l1 - l2;
        } else {
            return 0;
        }
    }
}
