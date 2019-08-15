package com.example.profileproject;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private RecyclerViewAdapter recyclerViewAdapter;
    private RecyclerView recyclerView;
    private List<Message> items = new ArrayList<>();
    private MessageViewHolder holder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);
        setupToolbar();
        fillMessageList();
        setupNavigationDrawer();
        setupRecyclerView();

        //**************


    }


    private void setupNavigationDrawer() {
        navigationView = findViewById(R.id.navi);
        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void setupToolbar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void fillMessageList() {
        items.add(new Message("Mahdi N.S", R.drawable.mahdi, "Happiness means having a good friend.", "00:00"));
        items.add(new Message("p2", R.drawable.p2, "Friendship is one mind in two bodies.", "00:00"));
        items.add(new Message("Abbas", R.drawable.abbas, "Good friend’s life", "00:00"));
        items.add(new Message("Jaber", R.drawable.jaber, "Friends are God's way of taking care of us", "00:00"));
    }

    private void setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerViewAdapter = new RecyclerViewAdapter(items);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        dividerItemDecoration.setDrawable(getResources().getDrawable(R.drawable.recycler_item_divider));
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(layoutManager);
        int id = (int) recyclerView.getChildItemId(recyclerView);
        recyclerView.setAdapter(recyclerViewAdapter);

    }


}
