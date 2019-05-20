package com.example.darwin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_login = findViewById(R.id.button);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et_username = findViewById(R.id.editText1);
                EditText et_password = findViewById(R.id.editText);
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                String username1 = "darwinjoseph2f2@gmail.com";
                String password1 = "darwin2f2";
                if (username.equals(username1)) {
                    if (password.equals(password1)) {
                        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "incorrect password..... ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

