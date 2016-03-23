package com.bigfacestudio.fragmenttest;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        String[] listStr = new String[]{"test1", "test2", "test3", "test4", "test5", "test6", "test7"};
        List aList = new ArrayList<String>(Arrays.asList(listStr));

        ArrayAdapter arrAdapter = new ArrayAdapter(
                getActivity(),
                R.layout.list_item, // The layout that contains a "TextView"
                R.id.list_item_textview, // The Id of the "TextView"
                aList);

        
        View v =  inflater.inflate(R.layout.fragment_main, container, false); // The layout which will contain the LIST
        ListView lw = (ListView) v.findViewById(R.id.listivew);
        lw.setAdapter(arrAdapter);

        return v;
    }
}
