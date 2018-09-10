package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
    }
    public void LoginSend(View view){
        Intent intent=new Intent(LoginActivity.this,MainActivity.class);
        EditText editText=(EditText)findViewById(R.id.editText4);
        String account=editText.getText().toString();
        intent.putExtra("loginfuck",account);
        setResult(RESULT_OK,intent);
        finish();
    }
}
