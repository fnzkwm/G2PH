package com.example.administrator.g2ph;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        LinearLayout button1 = (LinearLayout) findViewById(R.id.button1);
        LinearLayout button2 = (LinearLayout) findViewById(R.id.button2);
        LinearLayout button3 = (LinearLayout) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.main_frame, new WritingActivity()).commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.main_frame, new KindsActivity()).commit();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.main_frame, new CarefulActivity()).commit();
            }
        });

    }


    public void onClicked1(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.blog.naver.com/only33777/220268994589"));
        startActivity(intent);
    }

    public void onClicked2(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.homify.co.kr/ideabooks/3946838/%EC%A7%91%EC%97%90%EC%84%9C-%ED%82%A4%EC%9A%B0%EA%B8%B0-%EC%A2%8B%EC%9D%80-%EC%B5%9C%EA%B3%A0%EC%9D%98-%EC%8B%9D%EB%AC%BC-7"));
        startActivity(intent);
    }


}
