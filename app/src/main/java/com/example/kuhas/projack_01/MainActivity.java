package com.example.kuhas.projack_01;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;//แสดงผล   แถวเดียว
    private RecyclerAdapter adapter;
    private List<Contact> contacts;
    private ApiInterface apiInterface;
    private GridLayoutManager lLayout;//แสดงผลกริด
    private LinearLayoutManager linearLayoutManager;//แสดงแนวนอน HORIZONTAL

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycleView);
        //แสดงแนวนอน HORIZONTAL
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        //Gridview
        lLayout = new GridLayoutManager(MainActivity.this, 2);
        //listview
        layoutManager = new LinearLayoutManager(this);


        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);


        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);


        Call<List<Contact>> call = apiInterface.getContacts();
        call.enqueue(new Callback<List<Contact>>() {
            @Override
            public void onResponse(Call<List<Contact>> call, Response<List<Contact>> response) {
                contacts = response.body();
                adapter = new RecyclerAdapter(contacts);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Contact>> call, Throwable t) {
                Log.d("Fail", t.getMessage());

            }
        });
    }
}