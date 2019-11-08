package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button bt1;
    private EditText aaa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.button);
        aaa = findViewById(R.id.editText);

        Intent intent = getIntent();
        //把傳送進來的String型別的Message的值賦給新的變數message
        String message = intent.getStringExtra("EXTRA_MESSAGEb");
        //在textview中顯示出來message
        aaa.setText(message);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity((intent));

                String message = aaa.getText().toString();
                //給message起一個名字，並傳給另一個activity
                intent.putExtra("EXTRA_MESSAGE",message);
                //啟動意圖
                startActivity(intent);

            }
        });
    }
}
