package com.example.joshk.packopener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private int dustValue;
    private int craftCost;
    public ArrayList<Card> common;
    public ArrayList<Card> rare;
    public ArrayList<Card> epic;
    public ArrayList<Card> legendary;
    private Button card1;
    private Button card2;
    private Button card3;
    private Button card4;
    private Button card5;
    private Button next;
    private TextView craft;
    private TextView dust;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();

        dustValue = 0;
        craftCost = 0;
        craft.setText("Craft Cost: " + craftCost);
        dust.setText("Dust Value: " + dustValue);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    public void setter(Card set, int rarity) {
        if(rarity == 1)
        {
            common.add(set);
        }
        if(rarity == 2)
        {
            rare.add(set);
        }
        if(rarity == 3)
        {
            epic.add(set);
        }
        if(rarity == 4)
        {
            legendary.add(set);
        }
    }

    private void wireWidgets() {
        card1 = findViewById(R.id.button_card1);
        card2 = findViewById(R.id.button_card2);
        card3 = findViewById(R.id.button_card3);
        card4 = findViewById(R.id.button_card4);
        card5 = findViewById(R.id.button_card5);
        next = findViewById(R.id.nextPack);
        craft = findViewById(R.id.craftCost);
        dust = findViewById(R.id.dustValue);
    }

    private void revealCard() {
        //do an open pack for each of the cards you get per pack
    }

    private void openPack() {
        Double d = 100 * Math.random();
        if(d <= 1){
            //draw legendary
        }
        if (d > 1 && d <= 6)
        {
            //draw epic
        }
        if (d > 6 && d <=29)
        {
            //draw rare
        }
        if (d > 29)
        {
            //draw common
        }
        else{
            //draw common
        }
    }
}

