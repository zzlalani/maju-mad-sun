package com.zeeshanlalani.mylab;

import android.app.ListActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Students extends ListActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        final String[] list = {"0","0","0","0","0","0","0","0","0","0"};

        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.lblStudentName, list));

        listView = getListView();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                AlertDialog.Builder alert = new AlertDialog.Builder(Students.this);
//                alert.setMessage(String.valueOf(id));
//                alert.show();
                String num = ((TextView)view).getText().toString();
                int val = Integer.valueOf(num) + 1;
                ((TextView)view).setText(String.valueOf(val));
            }
        });

    }
}
