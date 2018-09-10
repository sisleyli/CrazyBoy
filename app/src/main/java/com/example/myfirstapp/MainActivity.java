package com.example.myfirstapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent); // Do something in response to button
    }
    public void displayToast(View v){
        Toast.makeText(this,"超级瞄准已部署",Toast.LENGTH_LONG).show();
    }

    public void OfficalInternet(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://gf.ppgame.com/web/pc/index.html"));
        startActivity(intent);
    }
    public void OpenLogin(View v)
    {
        Intent intent=new Intent(MainActivity.this,LoginActivity.class);
        startActivityForResult(intent,1);
    }
    public void OpenRecycle(View v)
    {
        Intent intent=new Intent(MainActivity.this,RecyclerActivity.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"免费版无需登录",Toast.LENGTH_SHORT).show();
            break;
            case R.id.remove_item:
            { Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivityForResult(intent,1);
            }
            break;
            case R.id.zhizun_item:
            {
                Toast.makeText(this,"研发中",Toast.LENGTH_SHORT).show();
                //Intent intent=new Intent(MainActivity.this,LuActivity.class);
                //startActivity(intent);
            }
            break;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Button button4 = (Button) findViewById(R.id.button4);
                String returnedData=data.getStringExtra("loginfuck");
                button4.setText(returnedData);

    }

}

