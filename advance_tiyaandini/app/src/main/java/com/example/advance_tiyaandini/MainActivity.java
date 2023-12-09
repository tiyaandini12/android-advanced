package com.example.advance_tiyaandini;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import com.example.advance_tiyaandini.ui.theme.adapter;

public class MainActivity extends AppCompatActivty{

    @Override
    protected void onCreate(Bundle savedInstanceState, List<ClipData.Item> Item){
        super.onCreate(savedInstanceState, Item);
        setContentView(R.layout.tampilan);

        RecyclerView recyclerView = setContentView(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("John wick","john.wick@email.com",R.drawable.a));
        items.add(new Item("Robert j","robert.j@email.com",R.drawable.b));
        items.add(new Item("James Gunn","james.gunn@email.com",R.drawable.c));
        items.add(new Item("Ricky tales","rickey.tales@email.com",R.drawable.d));
        items.add(new Item("Micky mose","mickey.mouse@email.com",R.drawable.e));
        items.add(new Item("Pick War","pick.war@email.com",R.drawable.f));
        items.add(new Item("Leg piece","leg.piece@email.com",R.drawable.g));
        items.add(new Item("Apple Mac","apple.mac@email.com",R.drawable.g));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.a));
        items.add(new Item("Robert j","robert.j@email.com",R.drawable.b));
        items.add(new Item("James Gunn","james.gunn@email.com",R.drawable.c));
        items.add(new Item("Ricky tales","rickey.tales@email.com",R.drawable.d));
        items.add(new Item("Micky mose","mickey.mouse@email.com",R.drawable.e));
        items.add(new Item("Pick War","pick.war@email.com",R.drawable.f));
        items.add(new Item("Leg piece","leg.piece@email.com",R.drawable.g));
        items.add(new Item("Apple Mac","apple.mac@email.com",R.drawable.g));


        assert recyclerView != null;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapter(recyclerView.getContext(),Item));

    }

}
