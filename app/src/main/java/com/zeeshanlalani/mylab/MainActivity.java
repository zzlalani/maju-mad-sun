package com.zeeshanlalani.mylab;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView testTextView;
    TextView newTextView;
    Button btnAlertBox;
    int increment;
    EditText txtName;

    Button btnActivity, btnActivity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increment = 1;
        newTextView = (TextView) findViewById(R.id.newTextView);
        newTextView.setText("Zeeshan Lalani");

        btnAlertBox = (Button) findViewById(R.id.btnAlertBox);
        btnActivity = (Button) findViewById(R.id.btnActivity);
        btnActivity2 = (Button) findViewById(R.id.btnActivity2);

        txtName = (EditText) findViewById(R.id.txtName);

        btnActivity.setOnClickListener(this);
        btnActivity2.setOnClickListener(this);

        btnAlertBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // newTextView.setText( String.valueOf(increment++) );
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Alert!")
                        .setMessage("Welcome to MAD class")
                        .setNegativeButton("Subtract", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                newTextView.setText( String.valueOf(--increment) );
                                dialogInterface.cancel();
                            }
                        })
                        .setPositiveButton("Add", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                newTextView.setText( String.valueOf(++increment) );
                                dialogInterface.cancel();
                            }
                        });
                alertDialog.show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        if ( view == btnActivity ) {
            Intent i = new Intent(MainActivity.this, RegisterActivity.class);
            String name = txtName.getText().toString();
            i.putExtra("name", name);
            startActivity(i);
        } else if ( view == btnActivity2 ) {
            Intent i = new Intent(MainActivity.this, Students.class);
            i.putExtra("name", "Lalani");
            startActivity(i);
        }
    }
}
