package com.example.mohit.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    ArrayList<SingleRowClass> arrr;

    public MyAdapter(Context context, ArrayList<SingleRowClass> arrr) {
        this.context = context;
        this.arrr= arrr;
    }

    @Override
    public int getCount() {
        return arrr.size();
    }

    @Override
    public Object getItem(int position) {
        return arrr.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        //these lines convert xml files to
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.single_row, parent, false);

        //Getting the views
        ImageView iv = view.findViewById(R.id.img1);
        TextView txtName = view.findViewById(R.id.name);
        TextView txtDesigantion = view.findViewById(R.id.desig);

        //Getting data from data source
        SingleRowClass ssw= arrr.get(position);
        int image=ssw.getImages();
        String name=ssw.getName();
        String desig=ssw.getDesignation();

        //loading data into views
        iv.setImageResource(image);
        txtName.setText(name);
        txtDesigantion.setText(desig);

        return view;
    }
}
