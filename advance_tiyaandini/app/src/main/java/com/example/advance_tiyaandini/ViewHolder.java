package com.example.advance_tiyaandini;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import javax.xml.namespace.QName;

public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView nameView;
    public TextView emailView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        emailView = itemView.findViewById(R.id.email);
    }
}
