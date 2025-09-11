package com.example.optmenu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean OnCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id=item.getItemId();

        if(id==R.id.action_activity_one){

            Intent intent = new Intent(MainActivity.this,ActivityOne.class);
            startActivity(intent);
            Toast.makeText(this,"Navigating to Activity One",Toast.LENGTH_SHORT.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}