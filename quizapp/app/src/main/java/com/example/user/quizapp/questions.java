package com.example.user.quizapp;

import android.util.Log;

import java.util.Random;

public class questions {
    char arr[]={'+','-','*'};
    Random r = new Random();
      static int ans;

   public String[] getquestion_answer() {


       int a = r.nextInt(3);

       int b = r.nextInt(100);
       int c = r.nextInt(100);
c=c+1;
       int d = r.nextInt(1000);
       String question=b+""+arr[a]+""+c;
       char operation=arr[a];
       switch(operation)
       {
           case '+':
               ans = b+c;
               break;
           case '-':
               ans = b-c;
               break;
           case '*':

               ans = b*c;
               break;



       }
       String s1[]=new String[2];
       s1[0]=question;
       s1[1]=Integer.toString(ans);

       return s1;
   }

    public String[] getoptions() {

        int a = r.nextInt(4);

        int b = r.nextInt(500);
        int c = r.nextInt(700);
        int d = r.nextInt(200);
        int e = r.nextInt(100);


        String s[]=new String[4];
        s[0]=Integer.toString(b);
        s[1]=Integer.toString(c);
        s[2]=Integer.toString(d);
        s[3]=Integer.toString(e);


  return s;

    }

}
