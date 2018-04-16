package com.example.user.quizapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class quiz extends AppCompatActivity {
    Button ans1,ans2,ans3,ans4,restart,view_sc;
    TextView score,question,timer;
    Random r = new Random();
    int sc=0,time=30,flag=0;
    static String answer;
    questions q = new questions();
    SQLiteDatabase sd;
ArrayList<String> al=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        ans1=(Button) findViewById(R.id.ans1);
        ans2=(Button) findViewById(R.id.ans2);
        ans3=(Button) findViewById(R.id.ans3);
        ans4=(Button) findViewById(R.id.ans4);
        restart=(Button) findViewById(R.id.restart);
        view_sc=(Button) findViewById(R.id.viewscore);

         sd = openOrCreateDatabase("SCOREDB",MODE_PRIVATE,null);
        sd.execSQL("CREATE TABLE IF NOT EXISTS SCORE(T_ques INTEGER,C_ans INTEGER,I_ans INTEGER,Score VARCHAR(10),Percentage REAL);");


        score=(TextView) findViewById(R.id.score);
        question=(TextView) findViewById(R.id.question);
        timer=(TextView) findViewById(R.id.timer);

        timer.setText("time left: "+Integer.toString(time));
        score.setText("score is: "+Integer.toString(sc));
       answer= func();

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag++;
                if(ans1.getText()==answer){
                    sc++;
                    score.setText("score is: "+String.valueOf(sc));
                }
                if(flag==1) {
                    new CountDownTimer(32000, 1000) {
                        public void onTick(long millisUntilFinished) {
                            timer.setText("time left: "+String.valueOf(time));
                            time--;
                        }

                        public void onFinish() {

                            String score1;
                            int inc;
                            float per;
                            inc=flag-sc;
                            per=(((float)sc/(float)flag)*100);
                            Log.e("per",String.valueOf(per));
                            score1=String.valueOf(sc);
                           sd.execSQL("INSERT INTO SCORE VALUES('"+flag+"','"+sc+"','"+inc+"','"+score1+"','"+per+"');");

                            restart.setVisibility(View.VISIBLE);
                            view_sc.setVisibility(View.VISIBLE);
                            ans1.setEnabled(false);
                            ans2.setEnabled(false);
                            ans3.setEnabled(false);
                            ans4.setEnabled(false);



                                                  }
                    }.start();

                }

                answer=func();

            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag++;
                if(ans2.getText()==answer){
                    sc++;
                    score.setText("score is: "+String.valueOf(sc));
                }
                if(flag==1) {
                    new CountDownTimer(32000, 1000) {
                        public void onTick(long millisUntilFinished) {
                            timer.setText("time left: "+String.valueOf(time));
                            time--;
                        }

                        public void onFinish() {
                            String score1;
                            int inc;
                            float per;
                            inc=flag-sc;
                            per=(((float)sc/(float)flag)*100);
                            Log.e("per",String.valueOf(per));
                            score1=String.valueOf(sc);
                            sd.execSQL("INSERT INTO SCORE VALUES('"+flag+"','"+sc+"','"+inc+"','"+score1+"','"+per+"');");

                            restart.setVisibility(View.VISIBLE);
                            view_sc.setVisibility(View.VISIBLE);
                            ans1.setEnabled(false);
                            ans2.setEnabled(false);
                            ans3.setEnabled(false);
                            ans4.setEnabled(false);

                        }
                    }.start();

                }

                answer=func();


            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag++;
                if(ans3.getText()==answer){
                    sc++;
                    score.setText("score is: "+String.valueOf(sc));
                }
                if(flag==1) {
                    new CountDownTimer(32000, 1000) {
                        public void onTick(long millisUntilFinished) {
                            timer.setText("time left: "+String.valueOf(time));
                            time--;
                        }

                        public void onFinish() {

                            String score1;
                            int inc;
                            float per;
                            inc=flag-sc;
                            per=(((float)sc/(float)flag)*100);
                            Log.e("per",String.valueOf(per));
                            score1=String.valueOf(sc);
                            sd.execSQL("INSERT INTO SCORE VALUES('"+flag+"','"+sc+"','"+inc+"','"+score1+"','"+per+"');");

                            restart.setVisibility(View.VISIBLE);
                            view_sc.setVisibility(View.VISIBLE);
                            ans1.setEnabled(false);
                            ans2.setEnabled(false);
                            ans3.setEnabled(false);
                            ans4.setEnabled(false);

                        }
                    }.start();

                }

                answer=func();


            }
        });
        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag++;
                if(ans4.getText()==answer){
                    sc++;
                    score.setText("score is: "+String.valueOf(sc));
                }
                if(flag==1) {
                    new CountDownTimer(32000, 1000) {
                        public void onTick(long millisUntilFinished) {
                            timer.setText("time left: "+String.valueOf(time));
                            time--;
                        }

                        public void onFinish() {
                            String score1;
                            int inc;
                            float per;
                            inc=flag-sc;
                            per=(((float)sc/(float)flag)*100);
                            Log.e("per",String.valueOf(per));
                            score1=String.valueOf(sc);
                            sd.execSQL("INSERT INTO SCORE VALUES('"+flag+"','"+sc+"','"+inc+"','"+score1+"','"+per+"');");

                            restart.setVisibility(View.VISIBLE);
                            view_sc.setVisibility(View.VISIBLE);
                            ans1.setEnabled(false);
                            ans2.setEnabled(false);
                            ans3.setEnabled(false);
                            ans4.setEnabled(false);

                        }
                    }.start();

                }

                answer=func();


            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sc=0;
                time=30;
                flag=0;
                Intent i=new Intent(quiz.this,quiz.class);
                startActivity(i);
            }
        });
        view_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cursor resultSet = sd.rawQuery("Select * from SCORE",null);
                int c=resultSet.getCount();
                Log.e("rows",String.valueOf(c));
          int s=resultSet.getColumnIndex("Score");
                Log.e("sc",String.valueOf(s));
        resultSet.moveToFirst();
        al.clear();
        do{
        if(resultSet!=null&& c!=0) {
            String score = resultSet.getString(s);
            Log.e("score",score);
            al.add(score);
        }
        }while (resultSet.moveToNext());
                Intent i=new Intent(quiz.this,score.class);
                i.putExtra("array_list", al);
                startActivity(i);
            }
        });
    }
    String func(){



        String s1[] = q.getquestion_answer();

        question.setText(s1[0]);
        String op[] = q.getoptions();

        int a = r.nextInt(4);
        op[a] = s1[1];

        ans1.setText(op[0]);
        ans2.setText(op[1]);
        ans3.setText(op[2]);
        ans4.setText(op[3]);
          Log.e("tanya"+a,op[a]);
          return op[a];
    }

}
