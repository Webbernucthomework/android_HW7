package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private Button bt2;
    private EditText bbb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bt2 = findViewById(R.id.button2);
        bbb = findViewById(R.id.editText2);

        Intent intent = getIntent();
        //把傳送進來的String型別的Message的值賦給新的變數message
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        //在textview中顯示出來message
        bbb.setText(message);

        bt2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);

                String messageb = bbb.getText().toString();
                //給message起一個名字，並傳給另一個activity
                intent.putExtra("EXTRA_MESSAGEb",messageb);
                //啟動意圖
                startActivity(intent);



            }
        }));

    }
}
