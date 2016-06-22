package com.example.imas.activitychanging;
/** This Application Shows the basic activity lifecycle and
 * shows the implementation of two different types of intent*/
import android.content.Intent;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lifecycle", "onCreate called");
        setContentView(R.layout.activity_main);


        Button b1 = (Button) findViewById(R.id.button1);

        Button b2 = (Button)findViewById(R.id.button2);
        Button b3 = (Button)findViewById(R.id.button3);

        /*Explicit Intent*/
        if(b1 != null){
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i= new Intent(MainActivity.this, Button1.class);// changing the activity from mainactivity to button_1
                    startActivity(i);
                    System.out.println("Inside the Main Activity");

                }
            });
        }

        /*Implicit Intent*/
        if(b2!=null){

            b2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Uri webpage = Uri.parse("http://www.google.com");
                    Intent i = new Intent(Intent.ACTION_VIEW, webpage);
                    startActivity(i);
                }
            });
        }

        if(b3!=null){

            b3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Uri number = Uri.parse("tel:000000");
                    Intent callIntent = new Intent(Intent.ACTION_CALL, number);// to make a direct call
//                  Intent callIntent = new Intent(Intent.ACTION_CALL, number); //to show the dialer with number entered
                    startActivity(callIntent);
                }
            });
        }
    }




    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lifecycle", "onResume called");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle", "onStart called");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lifecycle", "onPause called");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle", "onDestroy called");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle", "onStop called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("lifecycle", "onRestart called");
    }



}
