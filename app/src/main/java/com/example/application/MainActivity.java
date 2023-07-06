package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().length()==0){
                    editText1.setError("Field is mandatory");
                }
                else if (editText2.getText().length()==0) {
                    editText2.setError("Field is mandatory");
                }
                else if(editText3.getText().length()==0){
                    editText3.setError("Field is mandatory");
                }
                else {
                    Toast.makeText(getApplicationContext(), "Signed In", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}