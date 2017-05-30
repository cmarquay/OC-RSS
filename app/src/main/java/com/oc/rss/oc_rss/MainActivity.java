package com.oc.rss.oc_rss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* Class that manages activity_main layout.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //We are looking for the RecyclerView, if the id exists we attach it a LayoutManager and an Adapter
        RecyclerView rv = (RecyclerView) findViewById(R.id.list);
        if (rv != null) {
            rv.setLayoutManager(new LinearLayoutManager(this));
            rv.setAdapter(new MyAdapter(this));
        }
    }
}