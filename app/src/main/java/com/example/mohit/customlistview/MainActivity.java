package com.example.mohit.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvv;
    private SingleRowClass ss;
    private ArrayList<SingleRowClass> aar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvv=findViewById(R.id.lv);

        //Data source
        String[] names={"User1","User2","User3","User4","User5"};
        String[] designation={"Developer","Analyst","Human_Resource","Tester","Finance"};
        int[] images={R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user};

        //creating an array list and merging all data into an array list
        aar=new ArrayList<>();
        for(int i=0;i<names.length;i++){
        ss=new SingleRowClass(names[i],designation[i],images[i]);
        aar.add(ss);
        }

        MyAdapter madp=new MyAdapter(this, aar);
        lvv.setAdapter(madp);
    }
}
