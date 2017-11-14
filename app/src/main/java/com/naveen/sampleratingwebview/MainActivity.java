package com.naveen.sampleratingwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ratingBar = (RatingBar)findViewById(R.id.ratingbar);
        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.bn_click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ratingBar.getRating()==0){
                    Toast.makeText(MainActivity.this, "Kindly give some Rating", Toast.LENGTH_SHORT).show();
                }else {

                    Toast.makeText(MainActivity.this, "Given Rating is "+ratingBar.getRating(), Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}
