package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final String[] colors = {"Red", "Blue", "Black", "Cyan", "Green", "LTGray", "Magenta", "White", "Yellow", "DKGray"};
    public String chosenColor;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=(Spinner)findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        //View mainView = this.getWindow().getDecorView();

        ColorAdapter colorAdapter=new ColorAdapter(MainActivity.this, colors);
        spinner.setAdapter(colorAdapter);



    }

   // @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ConstraintLayout main = (ConstraintLayout) findViewById(R.id.main_layout);
        chosenColor = colors[position];
        TextView selected = (TextView) view.findViewById(R.id.textView);
        //Set Background color
        if(chosenColor.equals("Red")){
            main.setBackgroundColor(Color.RED);
            selected.setBackgroundColor(Color.WHITE);
        }
        if(chosenColor.equals("Blue")){
            main.setBackgroundColor(Color.BLUE);
            selected.setBackgroundColor(Color.WHITE);
        }
        if(chosenColor.equals("Black")){
            main.setBackgroundColor(Color.BLACK);
            selected.setBackgroundColor(Color.WHITE);
        }
        if(chosenColor.equals("Cyan")){
            main.setBackgroundColor(Color.CYAN);
            selected.setBackgroundColor(Color.WHITE);
        }
        if(chosenColor.equals("Green")){
            main.setBackgroundColor(Color.GREEN);
            selected.setBackgroundColor(Color.WHITE);
        }
        if(chosenColor.equals("LTGray")){
            main.setBackgroundColor(Color.LTGRAY);
            selected.setBackgroundColor(Color.WHITE);
        }
        if(chosenColor.equals("DKGay")){
            main.setBackgroundColor(Color.DKGRAY);
            selected.setBackgroundColor(Color.WHITE);
        }
        if(chosenColor.equals("Magenta")){
            main.setBackgroundColor(Color.MAGENTA);
            selected.setBackgroundColor(Color.WHITE);
        }
        if(chosenColor.equals("White")){
            main.setBackgroundColor(Color.WHITE);
            selected.setBackgroundColor(Color.WHITE);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}