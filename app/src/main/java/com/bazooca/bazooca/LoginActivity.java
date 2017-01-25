package com.bazooca.bazooca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edit_email;
    private EditText edit_pass;
    private LinearLayout linear_login;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.activity_open_translate, R.anim.activity_close_scale);
        setContentView(R.layout.activity_login);

        initUI();

    }

    private void initUI() {
        edit_email = (EditText) findViewById(R.id.edit_email);
        edit_pass = (EditText) findViewById(R.id.edit_pass);
        btn_login = (Button) findViewById(R.id.btn_login);


        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);

                break;


        }
    }
}
