package com.example.user.quizapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class score extends AppCompatActivity {

   ListView lv;
    Button rs;
    ArrayList<String> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
         lv=(ListView) findViewById(R.id.listview);
         rs=(Button) findViewById(R.id.restart1);


//        sd = openOrCreateDatabase("SCOREDB",MODE_PRIVATE,null);
//        sd.execSQL("CREATE TABLE IF NOT EXISTS SCORE(T_ques INTEGER,C_ans INTEGER,I_ans INTEGER,Score VARCHAR(10),Percentage REAL);");
//
//        Cursor resultSet = sd.rawQuery("Select * from SCORE",null);
//        resultSet.moveToFirst();
//        while(resultSet!=null) {
//            String score = resultSet.getString(3);
//            al.add(score);
//
//        }
        Bundle b = getIntent().getExtras();

        if (null != b) {
            arr = b.getStringArrayList("array_list");
        }

        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        lv.setAdapter(ad);

        rs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(score.this,quiz.class);
                startActivity(i);
            }
        });

    }
}
