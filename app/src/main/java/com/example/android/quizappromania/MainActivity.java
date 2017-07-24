package com.example.android.quizappromania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView question2status;
    TextView question4status;
    TextView question2;
    int mScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question2status = (TextView) findViewById(R.id.q2_status);
        question4status = (TextView) findViewById(R.id.q4_status);
        question2 = (TextView)findViewById(R.id.question2);
    }

    public void submit(View v) {
        mScore = 0;

        // question 1
        RadioButton radioButtonA1 = (RadioButton) findViewById(R.id.A1_3);
        TextView question1 = (TextView) findViewById(R.id.Q1);
        if (radioButtonA1.isChecked()) {
            mScore++;
        } else {
            question1.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
        }
        radioButtonA1.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.green));

        //question2
        String question2StatusString = question2status.getText().toString();
        if (question2StatusString.equals(getResources().getText(R.string.select2))) {
            mScore++;
        } else {
            question2.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
            question2status.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
        }
        question2status.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.green));

        //question3
        RadioButton radioButtonA3 = (RadioButton) findViewById(R.id.A3_3);
        TextView question3 = (TextView) findViewById(R.id.question3);
        if (radioButtonA3.isChecked()) {
            mScore++;
        } else {
            question3.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
        }
        radioButtonA3.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.green));

        //question4
        TextView question4 = (TextView) findViewById(R.id.question4);
        String question4StatusString = question4status.getText().toString();
        if (question4StatusString.equals(getResources().getText(R.string.president_select3))) {
            mScore++;
        } else {
            question4.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
        }
        question4status.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.green));

        //question5
        EditText question5Answer = (EditText) findViewById(R.id.Q5Answer);
        TextView question5 = (TextView) findViewById(R.id.question5);
        String question5AnswerString = question5Answer.getText().toString();
        if (question5AnswerString.toLowerCase().contains("danube") && question5AnswerString.toLowerCase().contains("delta") ) {
            mScore++;
        } else {
            question5.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
            question5Answer.setText(getResources().getText(R.string.danubedelta));
        }
        question5Answer.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.green));

        //question6
        RadioButton radioButtonA6 = (RadioButton) findViewById(R.id.A6_2);
        TextView question6 = (TextView) findViewById(R.id.question6);
        if (radioButtonA6.isChecked()) {
            mScore++;
        } else {
            question6.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
        }
        radioButtonA6.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.green));

        //question7
        RadioButton radioButtonA7 = (RadioButton) findViewById(R.id.A7_1);
        TextView question7 = (TextView) findViewById(R.id.question7);
        if (radioButtonA7.isChecked()) {
            mScore++;
        } else {
            question7.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
        }
        radioButtonA7.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.green));

        //question8
        TextView question8 = (TextView) findViewById(R.id.question8);
        CheckBox answer8_1 = (CheckBox) findViewById(R.id.A8_1);
        CheckBox answer8_2 = (CheckBox) findViewById(R.id.A8_2);
        CheckBox answer8_3 = (CheckBox) findViewById(R.id.A8_3);
        CheckBox answer8_4 = (CheckBox) findViewById(R.id.A8_4);
        CheckBox answer8_5 = (CheckBox) findViewById(R.id.A8_5);
        CheckBox answer8_6 = (CheckBox) findViewById(R.id.A8_6);
        if (answer8_1.isChecked() && !answer8_2.isChecked() && !answer8_3.isChecked() && answer8_4.isChecked() && answer8_5.isChecked() && answer8_6.isChecked()) {
            mScore++;
        } else {
            question8.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
        }
        answer8_1.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.green));
        answer8_4.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.green));
        answer8_5.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.green));
        answer8_6.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.green));

        if (mScore == 8){
            Toast.makeText(MainActivity.this, "Your score is: " + mScore +"\n You are a true Romanian!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity.this, "Your score is: " + mScore+"out of 8", Toast.LENGTH_LONG).show();
        }
        Button submitButton = (Button) findViewById(R.id.submit);
        submitButton.setClickable(false);
    }

    // Q2Buttons
    public void onQuestion2Answer1Cliked(View v) {
        question2status.setText(getResources().getText(R.string.select1));
    }

    public void onQuestion2Answer2Cliked(View v) {
        question2status.setText(getResources().getText(R.string.select2));
    }

    public void onQuestion2Answer3Cliked(View v) {
        question2status.setText(getResources().getText(R.string.select3));
    }

    //q4 Buttons
    public void onQuestion4Answer1Cliked(View v) {
        question4status.setText(getResources().getText(R.string.president_select1));
    }

    public void onQuestion4Answer2Cliked(View v) {
        question4status.setText(getResources().getText(R.string.president_select2));
    }

    public void onQuestion4Answer3Cliked(View v) {
        question4status.setText(getResources().getText(R.string.president_select3));
    }


    public void reset(View v) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }


}
