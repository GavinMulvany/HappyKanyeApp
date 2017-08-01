package com.example.gavinmulvany.happykanyeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView left, middle, right;

    List<Integer> cups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left = (ImageView) findViewById(R.id.left);
        middle = (ImageView) findViewById(R.id.middle);
        right = (ImageView) findViewById(R.id.right);


        cups = new ArrayList<>();
        cups.add(107);
        cups.add(207);
        cups.add(407);

        Collections.shuffle(cups);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(cups.get(0) == 107){
                    left.setImageResource(R.drawable.kh1);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                }
                else if(cups.get(0) == 207){
                    left.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(0) == 407){
                    left.setImageResource(R.drawable.kh1);
                }

                if(cups.get(1) == 107){
                    middle.setImageResource(R.drawable.kh1);

                }
                else if(cups.get(1) == 207){
                    middle.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(1) == 407){
                    middle.setImageResource(R.drawable.kh1);
                }

                if(cups.get(2) == 107){
                    right.setImageResource(R.drawable.kh1);

                }
                else if(cups.get(2) == 207){
                    right.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(2) == 407){
                    right.setImageResource(R.drawable.kh1);
                }




            }
        });

        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cups.get(0) == 107){
                    middle.setImageResource(R.drawable.kh1);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                }
                else if(cups.get(0) == 207){
                    middle.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(0) == 407){
                    middle.setImageResource(R.drawable.kh1);
                }

                if(cups.get(1) == 107){
                    left.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(1) == 207){
                    left.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(1) == 407){
                    left.setImageResource(R.drawable.kh1);
                }

                if(cups.get(2) == 107){
                    right.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(2) == 207){
                    right.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(2) == 407){
                    right.setImageResource(R.drawable.kh1);
                }


            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cups.get(0) == 107){
                    right.setImageResource(R.drawable.kh1);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                }
                else if(cups.get(0) == 207){
                    right.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(0) == 407){
                    right.setImageResource(R.drawable.kh1);
                }

                if(cups.get(1) == 107){
                    middle.setImageResource(R.drawable.kh1);

                }
                else if(cups.get(1) == 207){
                    middle.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(1) == 407){
                    middle.setImageResource(R.drawable.kh1);
                }

                if(cups.get(2) == 107){
                    left.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(2) == 207){
                    left.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(2) == 407){
                    left.setImageResource(R.drawable.kh1);
                }

            }
        });

    }



}
