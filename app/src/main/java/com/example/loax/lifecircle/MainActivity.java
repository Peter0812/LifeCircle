package com.example.loax.lifecircle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast物件顯示快顯 : onCreate(創建)
        Toast.makeText(MainActivity.this,"onCreate(創建)", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast物件顯示快顯 : onStart(開始)
        Toast.makeText(MainActivity.this,"onStart(開始)",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast物件顯示快顯 : onStop(停止)
        Toast.makeText(MainActivity.this,"onStop(停止)",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast物件顯示快顯 : onDestroy(銷毀)
        Toast.makeText(MainActivity.this,"onDestroy(銷毀)",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast物件顯示快顯 : onPause(暫停)
        Toast.makeText(MainActivity.this,"onPause(暫停)",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast物件顯示快顯 : onResume(恢復)
        Toast.makeText(MainActivity.this,"onResume(恢復)",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast物件顯示快顯 : onRestart(重新開始)
        Toast.makeText(MainActivity.this,"onRestart(重新開始)",Toast.LENGTH_SHORT).show();
    }


    //事件
    public void onClickA(View view){
        Intent intent = new Intent(MainActivity.this,ActivityA.class);
        startActivity(intent);
    }

    //事件
    public void onClickB(View view){
        Intent intent = new Intent(MainActivity.this,ActivityB.class);
        startActivity(intent);
    }

    //事件
    public void onClickFinish(View view){
        finish();
    }

}
