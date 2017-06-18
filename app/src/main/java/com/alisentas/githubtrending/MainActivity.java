package com.alisentas.githubtrending;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private class Repo {
        private String name;
        private String author;
        
        // constructor
        public Repo(){

        }
    }
}
