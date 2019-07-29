package com.example.imageselector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private EditText selection;
    private Button displayImage;
    private TextView errorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.imgSelect);
        selection = (EditText) findViewById(R.id.etSelect);
        displayImage = (Button) findViewById(R.id.btnDisplay);
        errorMessage = (TextView) findViewById(R.id.error);

        displayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selection.getText().toString().equalsIgnoreCase("Sun")){

                    image.setVisibility(View.VISIBLE);
                    errorMessage.setText("");
                    image.setImageResource(R.drawable.sun);

                }else if(selection.getText().toString().equalsIgnoreCase("Snow")){

                    image.setVisibility(View.VISIBLE);
                    errorMessage.setText("");
                    image.setImageResource(R.drawable.snow);

                }else if(selection.getText().toString().equalsIgnoreCase("Rain")){

                    image.setVisibility(View.VISIBLE);
                    errorMessage.setText("");
                    image.setImageResource(R.drawable.rain);

                }else if(selection.getText().toString().equalsIgnoreCase("Cloud")){

                    image.setVisibility(View.VISIBLE);
                    errorMessage.setText("");
                    image.setImageResource(R.drawable.cloud);

                }else{

                    image.setVisibility(View.INVISIBLE);
                    errorMessage.setText("Error, You must correctly fill out the box!");

                }
            }
        });
    }
}
