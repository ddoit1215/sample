package com.example.user_1.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class SimpleList1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list1);

        ListView listView = (ListView)findViewById(R.id.simple_list1_listVIew);
        ArrayList<String> arrayList1= new ArrayList<String>();

        arrayList1.add("data1");
        arrayList1.add("data2");
        arrayList1.add("data3");
        arrayList1.add("data4");

        ArrayAdapter<String > simpleAdapter1;
        simpleAdapter1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList1);
        listView.setAdapter(simpleAdapter1);
    }
}