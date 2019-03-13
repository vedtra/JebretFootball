package com.example.vedtra.beritaolahraga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText inputName = null;
    private EditText inputEmail = null;
    private Button btnNextScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputName = (EditText) findViewById(R.id.name);
        inputEmail = (EditText) findViewById(R.id.password);
        btnNextScreen = (Button) findViewById(R.id.btnNextScreen);
        btnNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Contoh eksplisit Intent dimana nama komponen yang akan dipanggil disebutkan pada constructor Intent
                Intent nextScreen = new
                        Intent(getApplicationContext(),MainActivity.class);
//Contoh penambahan data yang akan dilewatkan ke komponen yang dipanggil
                nextScreen.putExtra("name",
                        inputName.getText().toString());
                nextScreen.putExtra("email",
                        inputEmail.getText().toString());
                Log.e("n", inputName.getText() + "." +
                        inputEmail.getText());
//Method untuk mengeksekusi Intent yang akan memanggil komponen berupa Activity
                startActivity(nextScreen);
            }
        });
    }
}