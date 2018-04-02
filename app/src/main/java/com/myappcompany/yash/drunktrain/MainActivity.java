package com.myappcompany.yash.drunktrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    int randomNumber;
    int randomRand;
    public void generateRandomNumber() {

        Random rand = new Random();
        randomNumber = rand.nextInt(15 )+ 1;
    }

    public void generateRand() {

        Random rand = new Random();
        randomRand = rand.nextInt(3)+1;
    }

    public void press (View view) {

        Log.i("info","sorted");
        EditText editText = (EditText) findViewById(R.id.editText2);

        int pressValue = Integer.parseInt(editText.getText().toString());

        String mess;

        if (pressValue>randomRand) {
            mess = "Wrong start again";
        }
        else if (pressValue<randomRand) {
            mess = "Wrong start again";
        }
        else {
            mess="got it";

           generateRand();
        }

        Toast.makeText(this,mess, Toast.LENGTH_LONG).show();





    }


    public void guess (View view) {


        Log.i("Info",Integer.toString(randomNumber));

        EditText editText = (EditText) findViewById(R.id.editText);

        int guessValue = Integer.parseInt(editText.getText().toString());

        String message;

        if(guessValue > randomNumber) {

            message = "Lower, take a shot";


        }
            else if (guessValue <randomNumber)
        {

            message = "Higher, take a shot";
        }
             else
        {
            message = "you got it,give other guy a chance";

            generateRandomNumber();
        }

        Toast.makeText(this,message, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRand();
        generateRandomNumber();



    }
}
