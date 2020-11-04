package com.example.gamereview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gamereview.R;

public class LoginScreen extends AppCompatActivity {

    private EditText userInput;
    private EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        userInput = (EditText) findViewById(R.id.userInput);
        passwordInput = (EditText) findViewById(R.id.passwordInput);

        getSupportActionBar().hide();
    }

    public void validateLogin(View v) {

        String user = userInput.getText().toString();
        String pass = passwordInput.getText().toString();

        if (user.equals("admin")) {
            if (pass.equals("admin")) {
                botaoClick(v);
            } else {
                Toast.makeText(LoginScreen.this, "Senha incorreta", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(LoginScreen.this, "Usuario incorreto", Toast.LENGTH_SHORT).show();
        }
    }

    public void botaoClick(View view) {
        Button button = (Button) findViewById(R.id.btnEntrar);
        Toast.makeText(LoginScreen.this, "Entrando....", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, TelaPrincipal.class);
        startActivity(intent);


    }


}