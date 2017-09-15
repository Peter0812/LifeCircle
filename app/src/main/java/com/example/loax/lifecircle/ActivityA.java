package com.example.loax.lifecircle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitya);
        //Toast物件顯示快顯 : onCreate(創建)
        Toast.makeText(ActivityA.this,"ActivityA onCreate(創建 A)", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(ActivityA.this,"ActivityA onStart(開始 A)",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(ActivityA.this,"ActivityA onStop(停止 A)",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(ActivityA.this,"ActivityA onDestroy(銷毀 A)",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(ActivityA.this,"ActivityA onPause(暫停 A)",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(ActivityA.this,"ActivityA onResume(恢復 A)",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(ActivityA.this,"ActivityA onRestart(重新開始 A)", Toast.LENGTH_SHORT).show();
    }
    //結束 ActivityA 執行
    public void onClick(View view){
        finish();
    }

}
