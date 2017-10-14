package com.zeeshanlalani.mylab;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Students extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        String[] students = getResources().getStringArray(R.array.student_names);
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.lblStudentName, students));

    }
}
