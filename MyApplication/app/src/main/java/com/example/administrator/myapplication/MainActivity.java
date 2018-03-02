package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int test = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // REVIEW[龙科] lll 2017/2/15 19:47
        super.onCreate(savedInstanceState);
        // todo
        int i = 0;
        setContentView(R.layout.activity_main);
        // 龙科
        // TODO 测试1
        System.out.print("龙科" +
                "");
        test(1);
        test2();
    }

    private void test(int i) {

    }

    private void test2() {
        System.out.print("lk");
        String name = " ";
    }
}
