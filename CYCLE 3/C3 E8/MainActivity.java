package com.example.arradapter;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the ListView in the layout file by its ID
        ListView listView=findViewById(R.id.listView);

        //This is the data we want to display in the ListView

        String[]fruits={"Apple","Banana","Cherry","Date","Kiwi","Lemon","Mango","Orange","Peach"}
        //Create an ArrayAdapter to bind the data(the 'fruits' array) to the list.
        //The ArrayAdapter needs three things:
        //1.The current context(this).
        //2.The layout for a single list item(we use a simple built-in Android layout)
        //3.the data array to display

        ArrayAdapter<String>adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,fruits);
    }
}