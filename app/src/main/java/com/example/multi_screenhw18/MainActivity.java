package com.example.multi_screenhw18;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity
{
    public static int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

    }


    public void onNextScreenButtonClicked(View v)
    {
        MySingleton.initialize(num);
        //launch the next screen
        Intent i = new Intent(this, Screen2.class);
        //i.putExtra("name", "Mike");
        //i.putExtra("counter", counter);
        this.startActivity(i);


    }

}