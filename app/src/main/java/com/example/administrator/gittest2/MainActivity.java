package com.example.administrator.gittest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("第一次修改项目内容提交到仓库");
        System.out.println("我刚才创建了几个分之");
        System.out.println("我刚才创建了远程分之");
    }
}
