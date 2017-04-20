package com.example.shun323.orz_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setMain();
        setMain2();
    }

    private void setMain2() {
        setContentView(R.layout.activity_main);

        //START!ボタン
        Button btn_rule = (Button) findViewById(R.id.button);
        btn_rule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSub2();
            }
        });
    }


    private void setMain() {
        setContentView(R.layout.activity_main);

        //ルールボタン
        Button btn_rule = (Button) findViewById(R.id.button2);
        btn_rule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSub2();
            }
        });
    }

    private void setSub() {
        setContentView(R.layout.layout);

        Button btn_ruleb = (Button) findViewById(R.id.button3);
        btn_ruleb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMain();
            }
        });

        //戻るボタン
        Button btn_back = (Button) findViewById(R.id.button3);
    }

    private void setSub2(){
        setContentView (R.layout.game);
    }
}