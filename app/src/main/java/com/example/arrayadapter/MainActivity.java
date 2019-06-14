package com.example.arrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
ListView l;
    String ListItemsName[] = new String[]{
            "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN"};
    int ImageName[] = {
            R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(ListView) findViewById(R.id.l1);
        ListAdapter a= new ListAdapter(getApplicationContext(), ListItemsName,ImageName);
        l.setAdapter(a);
        l.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView <?> parent, View view, int position,
                            long id) {
        Toast.makeText(getApplicationContext(), "Item " + position,
                Toast.LENGTH_SHORT).show();
    }
}
