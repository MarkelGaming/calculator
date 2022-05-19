package com.example.myfirstproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView my_text;
    private static final String TAG = "myLogs";


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
       /*if (id == R.id.actionSettings)
        {
            Toast.makeText(MainActivity.this,getString(R.string.my_text),Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.actionSettings)
        {
            Toast.makeText(MainActivity.this,getString(R.string.my_text),Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.actionSettings)
        {
            Toast.makeText(MainActivity.this,getString(R.string.my_text),Toast.LENGTH_LONG).show();
        }else if (id == R.id.actionSettings)
       {
                 Toast.makeText(MainActivity.this,getString(R.string.my_text),Toast.LENGTH_LONG).show();
       }*/
        switch (id)
        {
            case R.id.actionSettings:
                Toast.makeText(MainActivity.this,getString(R.string.my_text),Toast.LENGTH_LONG).show();
                break;
            case R.id.actionitem1:
                Toast.makeText(MainActivity.this,getString(R.string.item1),Toast.LENGTH_LONG).show();
                break;
            case R.id.actionitem2:
                Toast.makeText(MainActivity.this,getString(R.string.item2),Toast.LENGTH_LONG).show();
                break;
            case R.id.actionitem3:
                Toast.makeText(MainActivity.this,getString(R.string.item3),Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Найдем View-елементы");
        Button button1 = findViewById(R.id.button12);
        Button button2 = findViewById(R.id.button22);
        Button button3 = findViewById(R.id.button32);
        my_text = findViewById(R.id.myprojectTest);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    my_text.setText("Нажата кнопка 1");
                    button1.setText("Обработка");
                    Toast toast = Toast.makeText(MainActivity.this,"Нажата кнопка 1",Toast.LENGTH_LONG);
                    LinearLayout toastImage = (LinearLayout) toast.getView();
                    ImageView  imageView = new ImageView(MainActivity.this);
                    imageView.setImageResource(R.drawable.logo);
                    toastImage.addView(imageView, 0);
                    toast.show();
                    Intent calculator = new Intent(MainActivity.this, Calculator.class);
                    startActivity(calculator);
                }
                catch (Exception e)
                {
                    Log.d(TAG, "Ошибка кнопки 1");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                try
                {
                    my_text.setText("Нажата кнопка 2");
                }
                catch (Exception e)
                {
                    Log.d(TAG, "Ошибка кнопки 2");
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    my_text.setText("Нажата кнопка 3");
                }
                catch (Exception e)
                {
                    Log.d(TAG, "Ошибка кнопки 3");
                }
            }
        });
    }
}