package com.example.imas.activitychanging;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by imas on 6/20/16.
 */
public class Button1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lifecycle", "onCreate1 called");
        System.out.println("Inside button 1 class onCreate");
        setContentView(R.layout.button_1);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lifecycle", "onResume1 called");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle", "onStart1 called");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lifecycle", "onPause1 called");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle", "onStop1 called");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle", "onDestroy1 called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("lifecycle", "onRestart1 called");
    }
}
