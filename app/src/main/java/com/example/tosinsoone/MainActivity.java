package com.example.tosinsoone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button MyBtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView tw = findViewById(R.id.textViewOne);
        tw.setText("Mahmoud is Very Professional");

        MyBtn = findViewById(R.id.btnOne);
        final String[] cars ={"A","B","C","D","E","F"};
        final Random rnd = new Random();
                MyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               //MyBtn.setText("Exactly!");
                //Publish Message!
             //  Toast.makeText(getApplicationContext(),"به این دکمه دست نزن",Toast.LENGTH_LONG).show();
              //tw.setText("از داخل دکمه صدای ما را می شنوید!");

                int index = rnd.nextInt(cars.length); // yani: be sourate random beine sefr va cars length yek adad entekhab kon.
                //nextint: min:0, max: cars.length - gharar midahad dar index.
                tw.setText("ماشین شما" + cars[index]);


            }
        });




    }
}
