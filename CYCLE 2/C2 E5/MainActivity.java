package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView facebookView=findViewById(R.id.fbView);
        ImageView likeImgView=findViewById(R.id.likeView);
        ImageView commentImgView=findViewById(R.id.cmmntView);
        ImageView shareImgView=findViewById(R.id.shareView);



        likeImgView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showToast("You clicked the like button");

            }
        });
       commentImgView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               showToast("You clicked the comment button");
           }
       });

       shareImgView.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               showToast("You clicked the share button");
           }
       });

    }
    private void showToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}