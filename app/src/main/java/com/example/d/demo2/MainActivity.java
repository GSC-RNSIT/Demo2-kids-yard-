package com.example.d.demo2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    Button mButton;
    EditText mEdit;
    TextView mText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdit = (EditText) findViewById(R.id.editText);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.done_item:
                open();
                // int id = item.getItemId();
                // if (id == R.id.done_item) {
                //    nextScreen.putExtra("name", inputName.getText().toString());
                //    startActivity(new Intent(getApplicationContext(), MainActivity2.class));

                //  return true;
        }
        return super.onOptionsItemSelected(item);

        //       return true;

        //   default:
        //      return super.onOptionsItemSelected(item);
    }


    public void open() {
        Intent myint = new Intent(MainActivity.this, MainActivity2.class);
        myint.putExtra("name", mEdit.getText().toString());
        Log.e("n", mEdit.getText()+".");
        startActivity(myint);
        //   mEdit   = (EditText)findViewById(R.id.editText);
        //   mText = (TextView)findViewById(R.id.textView);
        //  mText.setText("Typed - "+mEdit.getText().toString()+"!");

    }
}


