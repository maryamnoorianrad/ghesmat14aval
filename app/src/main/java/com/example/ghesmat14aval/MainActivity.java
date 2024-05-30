package com.example.ghesmat14aval;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button showRadioButton;
    private RadioGroup radioGroup;
    private RadioButton selectedRadioButton;
    private TextView titleText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showRadioButton=(Button) findViewById(R.id.showSelectedRadio);
        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
        titleText=(TextView) findViewById(R.id.radiotitle);
        selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());

        // قرار دادن OnClickListener بعد از مقداردهی selectedRadioButton
       // showRadioButton.setOnClickListener(new View.OnClickListener() {

        selectedRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id =radioGroup.getCheckedRadioButtonId();
                selectedRadioButton=(RadioButton) findViewById(id);
                titleText.setText(selectedRadioButton.getText());
                Toast.makeText(getApplicationContext(),selectedRadioButton.getText() , Toast.LENGTH_SHORT).show();

            }
        });

    }
}