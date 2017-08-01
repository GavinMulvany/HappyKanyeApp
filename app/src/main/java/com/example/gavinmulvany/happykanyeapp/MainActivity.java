package com.example.gavinmulvany.happykanyeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView left, middle, right;

    Button new_game;

    List<Integer> cups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left = (ImageView) findViewById(R.id.left);
        middle = (ImageView) findViewById(R.id.middle);
        right = (ImageView) findViewById(R.id.right);

        new_game = (Button) findViewById(R.id.new_game);


        cups = new ArrayList<>();
        cups.add(107);
        cups.add(207);
        cups.add(407);

        Collections.shuffle(cups);

        new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(cups);



                left.setImageResource(R.drawable.kanyecup);
                middle.setImageResource(R.drawable.kanyecup);
                right.setImageResource(R.drawable.kanyecup);

                Animation anim_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left);
                Animation anim_middle = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.middle);
                Animation anim_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right);



                left.startAnimation(anim_left);
                middle.startAnimation(anim_middle);
                right.startAnimation(anim_right);

            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(cups.get(0) == 107){
                    left.setImageResource(R.drawable.kh1);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                }
                else if(cups.get(0) == 207){
                    left.setImageResource(R.drawable.ks1);
                }
                else if(cups.get(0) == 407){
                    left.setImageResource(R.drawable.ks1);
                }

                if(cups.get(1) == 107){
                    middle.setImageResource(R.drawable.kh1);

                }
                else if(cups.get(1) == 207){
                    middle.setImageResource(R.drawable.ks1);
                }
                else if(cups.get(1) == 407){
                    middle.setImageResource(R.drawable.ks1);
                }

                if(cups.get(2) == 107){
                    right.setImageResource(R.drawable.kh1);

                }
                else if(cups.get(2) == 207){
                    right.setImageResource(R.drawable.ks1);
                }
                else if(cups.get(2) == 407){
                    right.setImageResource(R.drawable.ks1);
                }




            }
        });

        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cups.get(1) == 107){
                    middle.setImageResource(R.drawable.kh1);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                }
                else if(cups.get(1) == 207){
                    middle.setImageResource(R.drawable.ks1);
                }
                else if(cups.get(1) == 407){
                    middle.setImageResource(R.drawable.ks1);
                }

                if(cups.get(0) == 107){
                    left.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(0) == 207){
                    left.setImageResource(R.drawable.ks1);
                }
                else if(cups.get(0) == 407){
                    left.setImageResource(R.drawable.ks1);
                }

                if(cups.get(2) == 107){
                    right.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(2) == 207){
                    right.setImageResource(R.drawable.ks1);
                }
                else if(cups.get(2) == 407){
                    right.setImageResource(R.drawable.ks1);
                }


            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cups.get(2) == 107){
                    right.setImageResource(R.drawable.kh1);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                }
                else if(cups.get(2) == 207){
                    right.setImageResource(R.drawable.ks1);
                }
                else if(cups.get(2) == 407){
                    right.setImageResource(R.drawable.ks1);
                }

                if(cups.get(1) == 107){
                    middle.setImageResource(R.drawable.kh1);

                }
                else if(cups.get(1) == 207){
                    middle.setImageResource(R.drawable.ks1);
                }
                else if(cups.get(1) == 407){
                    middle.setImageResource(R.drawable.ks1);
                }

                if(cups.get(0) == 107){
                    left.setImageResource(R.drawable.kh1);
                }
                else if(cups.get(0) == 207){
                    left.setImageResource(R.drawable.ks1);
                }
                else if(cups.get(0) == 407){
                    left.setImageResource(R.drawable.ks1);
                }

            }
        });

    }



}
