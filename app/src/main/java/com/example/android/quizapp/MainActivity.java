package com.example.android.quizapp;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    int correctAnswersCount = 0;
    int submittedAnswersCount = 0;

    ScrollView scMain;
    RadioGroup[] radioGroups = new RadioGroup[10];
    RadioButton[] correctAnswers = new RadioButton[10];
    Button[] buttons = new Button[10];

    Button btnSubmit_1, btnSubmit_2, btnSubmit_3, btnSubmit_4, btnSubmit_5, btnSubmit_6,
            btnSubmit_7, btnSubmit_8, btnSubmit_9, btnSubmit_10;

    RadioGroup rgAnswers_1, rgAnswers_2, rgAnswers_3, rgAnswers_4, rgAnswers_5, rgAnswers_6,
            rgAnswers_7, rgAnswers_8, rgAnswers_9, rgAnswers_10;

    RadioButton rbAnswer_1A, rbAnswer_1B, rbAnswer_1C, rbAnswer_2A, rbAnswer_2B, rbAnswer_2C,
            rbAnswer_3A, rbAnswer_3B, rbAnswer_3C, rbAnswer_4A, rbAnswer_4B, rbAnswer_4C,
            rbAnswer_5A, rbAnswer_5B, rbAnswer_5C, rbAnswer_6A, rbAnswer_6B, rbAnswer_6C,
            rbAnswer_7A, rbAnswer_7B, rbAnswer_7C, rbAnswer_8A, rbAnswer_8B, rbAnswer_8C,
            rbAnswer_9A, rbAnswer_9B, rbAnswer_9C, rbAnswer_10A, rbAnswer_10B, rbAnswer_10C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scMain = findViewById(R.id.scMain);

        btnSubmit_1 = findViewById(R.id.btnSubmit_1);
        btnSubmit_2 = findViewById(R.id.btnSubmit_2);
        btnSubmit_3 = findViewById(R.id.btnSubmit_3);
        btnSubmit_4 = findViewById(R.id.btnSubmit_4);
        btnSubmit_5 = findViewById(R.id.btnSubmit_5);
        btnSubmit_6 = findViewById(R.id.btnSubmit_6);
        btnSubmit_7 = findViewById(R.id.btnSubmit_7);
        btnSubmit_8 = findViewById(R.id.btnSubmit_8);
        btnSubmit_9 = findViewById(R.id.btnSubmit_9);
        btnSubmit_10 = findViewById(R.id.btnSubmit_10);

        buttons[0] = btnSubmit_1;
        buttons[1] = btnSubmit_2;
        buttons[2] = btnSubmit_3;
        buttons[3] = btnSubmit_4;
        buttons[4] = btnSubmit_5;
        buttons[5] = btnSubmit_6;
        buttons[6] = btnSubmit_7;
        buttons[7] = btnSubmit_8;
        buttons[8] = btnSubmit_9;
        buttons[9] = btnSubmit_10;

        rgAnswers_1 = findViewById(R.id.rgAnswers_1);
        rgAnswers_2 = findViewById(R.id.rgAnswers_2);
        rgAnswers_3 = findViewById(R.id.rgAnswers_3);
        rgAnswers_4 = findViewById(R.id.rgAnswers_4);
        rgAnswers_5 = findViewById(R.id.rgAnswers_5);
        rgAnswers_6 = findViewById(R.id.rgAnswers_6);
        rgAnswers_7 = findViewById(R.id.rgAnswers_7);
        rgAnswers_8 = findViewById(R.id.rgAnswers_8);
        rgAnswers_9 = findViewById(R.id.rgAnswers_9);
        rgAnswers_10 = findViewById(R.id.rgAnswers_10);

        radioGroups[0] = rgAnswers_1;
        radioGroups[1] = rgAnswers_2;
        radioGroups[2] = rgAnswers_3;
        radioGroups[3] = rgAnswers_4;
        radioGroups[4] = rgAnswers_5;
        radioGroups[5] = rgAnswers_6;
        radioGroups[6] = rgAnswers_7;
        radioGroups[7] = rgAnswers_8;
        radioGroups[8] = rgAnswers_9;
        radioGroups[9] = rgAnswers_10;

        rbAnswer_1A = findViewById(R.id.rbAnswer_1A);
        rbAnswer_1B = findViewById(R.id.rbAnswer_1B);
        rbAnswer_1C = findViewById(R.id.rbAnswer_1C);

        rbAnswer_2A = findViewById(R.id.rbAnswer_2A);
        rbAnswer_2B = findViewById(R.id.rbAnswer_2B);
        rbAnswer_2C = findViewById(R.id.rbAnswer_2C);

        rbAnswer_3A = findViewById(R.id.rbAnswer_3A);
        rbAnswer_3B = findViewById(R.id.rbAnswer_3B);
        rbAnswer_3C = findViewById(R.id.rbAnswer_3C);

        rbAnswer_4A = findViewById(R.id.rbAnswer_4A);
        rbAnswer_4B = findViewById(R.id.rbAnswer_4B);
        rbAnswer_4C = findViewById(R.id.rbAnswer_4C);

        rbAnswer_5A = findViewById(R.id.rbAnswer_5A);
        rbAnswer_5B = findViewById(R.id.rbAnswer_5B);
        rbAnswer_5C = findViewById(R.id.rbAnswer_5C);

        rbAnswer_6A = findViewById(R.id.rbAnswer_6A);
        rbAnswer_6B = findViewById(R.id.rbAnswer_6B);
        rbAnswer_6C = findViewById(R.id.rbAnswer_6C);

        rbAnswer_7A = findViewById(R.id.rbAnswer_7A);
        rbAnswer_7B = findViewById(R.id.rbAnswer_7B);
        rbAnswer_7C = findViewById(R.id.rbAnswer_7C);

        rbAnswer_8A = findViewById(R.id.rbAnswer_8A);
        rbAnswer_8B = findViewById(R.id.rbAnswer_8B);
        rbAnswer_8C = findViewById(R.id.rbAnswer_8C);

        rbAnswer_9A = findViewById(R.id.rbAnswer_9A);
        rbAnswer_9B = findViewById(R.id.rbAnswer_9B);
        rbAnswer_9C = findViewById(R.id.rbAnswer_9C);

        rbAnswer_10A = findViewById(R.id.rbAnswer_10A);
        rbAnswer_10B = findViewById(R.id.rbAnswer_10B);
        rbAnswer_10C = findViewById(R.id.rbAnswer_10C);

        correctAnswers[0] = rbAnswer_1C;
        correctAnswers[1] = rbAnswer_2B;
        correctAnswers[2] = rbAnswer_3C;
        correctAnswers[3] = rbAnswer_4A;
        correctAnswers[4] = rbAnswer_5B;
        correctAnswers[5] = rbAnswer_6A;
        correctAnswers[6] = rbAnswer_7B;
        correctAnswers[7] = rbAnswer_8A;
        correctAnswers[8] = rbAnswer_9C;
        correctAnswers[9] = rbAnswer_10B;

    }

    public void submit(View view) {
        int checkedRadioButtonId;
        RadioGroup currentRadioGroup;
        Button currentButton;
        switch (view.getId()) {
            case R.id.btnSubmit_1:
                currentRadioGroup = radioGroups[0];
                currentButton = buttons[0];
                checkedRadioButtonId = currentRadioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId == correctAnswers[0].getId()) {
                    correctAnswersCount++;
                } else if (checkedRadioButtonId != -1) {
                    findViewById(checkedRadioButtonId).setBackgroundColor(Color.parseColor("#CCd50000"));
                }

                submittedAnswersCount++;
                correctAnswers[0].setBackgroundColor(Color.parseColor("#CC76ff03"));
                for (int i = 0; i < currentRadioGroup.getChildCount(); i++) {
                    currentRadioGroup.getChildAt(i).setClickable(false);
                }
                currentButton.setClickable(false);
                if (submittedAnswersCount == 10) result();
                break;
            case R.id.btnSubmit_2:
                currentRadioGroup = radioGroups[1];
                currentButton = buttons[1];
                checkedRadioButtonId = currentRadioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId == correctAnswers[1].getId()) {
                    correctAnswersCount++;
                } else if (checkedRadioButtonId != -1) {
                    findViewById(checkedRadioButtonId).setBackgroundColor(Color.parseColor("#CCd50000"));
                }

                submittedAnswersCount++;
                correctAnswers[1].setBackgroundColor(Color.parseColor("#CC76ff03"));
                for (int i = 0; i < currentRadioGroup.getChildCount(); i++) {
                    currentRadioGroup.getChildAt(i).setClickable(false);
                }
                currentButton.setClickable(false);
                if (submittedAnswersCount == 10) result();
                break;
            case R.id.btnSubmit_3:
                currentRadioGroup = radioGroups[2];
                currentButton = buttons[2];
                checkedRadioButtonId = currentRadioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId == correctAnswers[2].getId()) {
                    correctAnswersCount++;
                } else if (checkedRadioButtonId != -1) {
                    findViewById(checkedRadioButtonId).setBackgroundColor(Color.parseColor("#CCd50000"));
                }

                submittedAnswersCount++;
                correctAnswers[2].setBackgroundColor(Color.parseColor("#CC76ff03"));
                for (int i = 0; i < currentRadioGroup.getChildCount(); i++) {
                    currentRadioGroup.getChildAt(i).setClickable(false);
                }
                currentButton.setClickable(false);
                if (submittedAnswersCount == 10) result();
                break;
            case R.id.btnSubmit_4:
                currentRadioGroup = radioGroups[3];
                currentButton = buttons[3];
                checkedRadioButtonId = currentRadioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId == correctAnswers[3].getId()) {
                    correctAnswersCount++;
                } else if (checkedRadioButtonId != -1) {
                    findViewById(checkedRadioButtonId).setBackgroundColor(Color.parseColor("#CCd50000"));
                }

                submittedAnswersCount++;
                correctAnswers[3].setBackgroundColor(Color.parseColor("#cc76ff03"));
                for (int i = 0; i < currentRadioGroup.getChildCount(); i++) {
                    currentRadioGroup.getChildAt(i).setClickable(false);
                }
                currentButton.setClickable(false);
                if (submittedAnswersCount == 10) result();
                break;
            case R.id.btnSubmit_5:
                currentRadioGroup = radioGroups[4];
                currentButton = buttons[4];
                checkedRadioButtonId = currentRadioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId == correctAnswers[4].getId()) {
                    correctAnswersCount++;
                } else if (checkedRadioButtonId != -1) {
                    findViewById(checkedRadioButtonId).setBackgroundColor(Color.parseColor("#ccd50000"));
                }

                submittedAnswersCount++;
                correctAnswers[4].setBackgroundColor(Color.parseColor("#cc76ff03"));
                for (int i = 0; i < currentRadioGroup.getChildCount(); i++) {
                    currentRadioGroup.getChildAt(i).setClickable(false);
                }
                currentButton.setClickable(false);
                if (submittedAnswersCount == 10) result();
                break;
            case R.id.btnSubmit_6:
                currentRadioGroup = radioGroups[5];
                currentButton = buttons[5];
                checkedRadioButtonId = currentRadioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId == correctAnswers[5].getId()) {
                    correctAnswersCount++;
                } else if (checkedRadioButtonId != -1) {
                    findViewById(checkedRadioButtonId).setBackgroundColor(Color.parseColor("#ccd50000"));
                }

                submittedAnswersCount++;
                correctAnswers[5].setBackgroundColor(Color.parseColor("#cc76ff03"));
                for (int i = 0; i < currentRadioGroup.getChildCount(); i++) {
                    currentRadioGroup.getChildAt(i).setClickable(false);
                }
                currentButton.setClickable(false);
                if (submittedAnswersCount == 10) result();
                break;
            case R.id.btnSubmit_7:
                currentRadioGroup = radioGroups[6];
                currentButton = buttons[6];
                checkedRadioButtonId = currentRadioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId == correctAnswers[6].getId()) {
                    correctAnswersCount++;
                } else if (checkedRadioButtonId != -1) {
                    findViewById(checkedRadioButtonId).setBackgroundColor(Color.parseColor("#ccd50000"));
                }

                submittedAnswersCount++;
                correctAnswers[6].setBackgroundColor(Color.parseColor("#cc76ff03"));
                for (int i = 0; i < currentRadioGroup.getChildCount(); i++) {
                    currentRadioGroup.getChildAt(i).setClickable(false);
                }
                currentButton.setClickable(false);
                if (submittedAnswersCount == 10) result();
                break;
            case R.id.btnSubmit_8:
                currentRadioGroup = radioGroups[7];
                currentButton = buttons[7];
                checkedRadioButtonId = currentRadioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId == correctAnswers[7].getId()) {
                    correctAnswersCount++;
                } else if (checkedRadioButtonId != -1) {
                    findViewById(checkedRadioButtonId).setBackgroundColor(Color.parseColor("#ccd50000"));
                }

                submittedAnswersCount++;
                correctAnswers[7].setBackgroundColor(Color.parseColor("#cc76ff03"));
                for (int i = 0; i < currentRadioGroup.getChildCount(); i++) {
                    currentRadioGroup.getChildAt(i).setClickable(false);
                }
                currentButton.setClickable(false);
                if (submittedAnswersCount == 10) result();
                break;
            case R.id.btnSubmit_9:
                currentRadioGroup = radioGroups[8];
                currentButton = buttons[8];
                checkedRadioButtonId = currentRadioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId == correctAnswers[8].getId()) {
                    correctAnswersCount++;
                } else if (checkedRadioButtonId != -1) {
                    findViewById(checkedRadioButtonId).setBackgroundColor(Color.parseColor("#ccd50000"));
                }

                submittedAnswersCount++;
                correctAnswers[8].setBackgroundColor(Color.parseColor("#cc76ff03"));
                for (int i = 0; i < currentRadioGroup.getChildCount(); i++) {
                    currentRadioGroup.getChildAt(i).setClickable(false);
                }
                currentButton.setClickable(false);
                if (submittedAnswersCount == 10) result();
                break;
            case R.id.btnSubmit_10:
                currentRadioGroup = radioGroups[9];
                currentButton = buttons[9];
                checkedRadioButtonId = currentRadioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId == correctAnswers[9].getId()) {
                    correctAnswersCount++;
                } else if (checkedRadioButtonId != -1) {
                    findViewById(checkedRadioButtonId).setBackgroundColor(Color.parseColor("#CCd50000"));
                }

                submittedAnswersCount++;
                correctAnswers[9].setBackgroundColor(Color.parseColor("#CC76ff03"));
                for (int i = 0; i < currentRadioGroup.getChildCount(); i++) {
                    currentRadioGroup.getChildAt(i).setClickable(false);
                }
                currentButton.setClickable(false);
                if (submittedAnswersCount == 10) result();
                break;
        }
    }

    private void result() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Your result")
                .setMessage("You answered correctly " + correctAnswersCount + " out of " +
                        submittedAnswersCount + " questions.")
                .setPositiveButton("Try again",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                refresh();
                                dialog.cancel();
                            }
                        })
                .setNegativeButton("Great!",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        })
                .setCancelable(false);
        AlertDialog alert = builder.create();
        alert.show();
    }

    private void refresh() {
        submittedAnswersCount = 0;
        correctAnswersCount = 0;

        for (RadioGroup radioGroup : radioGroups) {
            for (int i = 0; i < radioGroup.getChildCount(); i++) {
                radioGroup.getChildAt(i).setClickable(true);
                radioGroup.getChildAt(i).setBackgroundColor(0);
                radioGroup.clearCheck();
            }
        }

        for (Button button : buttons) {
            button.setClickable(true);
        }

        scMain.scrollTo(0, scMain.getTop());
    }
}

