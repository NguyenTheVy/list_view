package com.example.listview_tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListDisplay extends Activity {
    // Array of strings...
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter); // do du lieu ra ListView

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                on_click(i);
            }
        });
    }
    public void on_click(int a){
        switch (a){
            case 0:
                androi();
                break;
            case 1:
                ios();
                break;
            case 2:

                break;
        }
    }

    public void androi(){
        Intent intent = new Intent(this, andoir.class);
        startActivity(intent);
        finish();
    }

    public void ios(){
        Intent intent = new Intent(this, IPhone.class);
        startActivity(intent);
        finish();
    }
}