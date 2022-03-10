package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    TextView text;
    EditText inputxt;
    EditText inputxt1;


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        inputxt = findViewById(R.id.editTextTextPersonName);


        text = findViewById(R.id.textView);
        inputxt1 = findViewById(R.id.editTextTextPersonName);

        inputxt1 = (EditText) findViewById(R.id.editTextTextPersonName);
        //Register listener
        inputxt1.addTextChangedListener(this);

    }

    public void Function(View v) {
        System.out.println("Hello World!");
        text.setText("Hello World!");

    }


    public void inputFunction(View v) {
        text.setText(inputxt.getText());
    }
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    @Override
    public void afterTextChanged(Editable s) {
        text.setText(s);
    }
}
