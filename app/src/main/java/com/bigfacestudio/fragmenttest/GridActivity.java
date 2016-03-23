package com.bigfacestudio.fragmenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);


        String[] listStr = new String[]{"test1", "test2", "test3", "test4", "test5", "test6", "test7"};
        List aList = new ArrayList<String>(Arrays.asList(listStr));

        ArrayAdapter arrAdapter = new ArrayAdapter(
                this,
                R.layout.list_item, // The layout that contains a "TextView"
                R.id.list_item_textview, // The Id of the "TextView"
                aList);


        GridView lw = (GridView) findViewById(R.id.grid_view);
        lw.setAdapter(arrAdapter);




    }
}
