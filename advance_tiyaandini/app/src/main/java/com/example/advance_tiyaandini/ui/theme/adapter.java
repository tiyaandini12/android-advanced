package com.example.advance_tiyaandini.ui.theme;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advance_tiyaandini.R;
import com.example.advance_tiyaandini.ViewHolder;

import java.util.List;

import javax.xml.namespace.QName;

public class adapter extends RecyclerView.Adapter<ViewHolder> {

    Context context;
    List<ClipData.Item> Item;

    public adapter(Context context, List<ClipData.Item> Item) {
        this.context = context;
        this.Item = Item;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nameView.setText(Item.get(position).getName());
        holder.emailView.setText(Item.get(position).getEmail());
        holder.imageView.setImageResource(Item.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return Item.size();
    }
}
