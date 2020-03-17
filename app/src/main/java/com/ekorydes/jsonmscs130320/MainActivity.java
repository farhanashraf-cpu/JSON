package com.ekorydes.jsonmscs130320;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Earth objEarth1=new Earth(1,"7","PAK");
        Earth objEarth2=new Earth(2,"3","PAK");

        Gson varGson=new Gson();
        String responseJson=varGson.toJson(objEarth1);

        String myJson="{\"name\":\"Ali\",\"countries\":7}";
        MyJsonClass myJsonClass=varGson.fromJson(myJson,MyJsonClass.class);

        Toast.makeText(this, myJsonClass.getName(), Toast.LENGTH_SHORT).show();

    }
}
