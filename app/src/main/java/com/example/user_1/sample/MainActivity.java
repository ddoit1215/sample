package com.example.user_1.sample;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements OnClickListener {

    private Button buttonSimpleList1;
    private Button buttonSimpleList2;
    private Button buttonCustomList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.main_button_simple_list3);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View view){
                    switch (view.getId()) {
                        case R.id.main_button_simple_list1:
                            Intent intentSimpleList1 = new Intent(getApplicationContext(), SimpleList1Activity.class);
                            startActivity(intentSimpleList1);
                            break;
                        case R.id.main_button_simple_list2:
                            Intent intentSimpleList2 = new Intent(getApplicationContext(), SimpleList2Activity.class);
                            startActivity(intentSimpleList2);
                            break;

                        case R.id.main_button_simple_list3:
                            Intent intentCustomList = new Intent(getApplicationContext(), CustomListActivity.class);
                            startActivity(intentCustomList);
                            break;
                    }
                }


        });

    }

    @Override
    public void onClick(View view) {

    }
}

