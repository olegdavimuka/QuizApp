package com.example.android.quizapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class BreakingBadFragment extends Fragment {

    final ArrayList<Question> questions = new ArrayList<>();
    int correctAnswersCount = 0;
    int submittedAnswersCount = 0;

    public BreakingBadFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.breaking_bad_layout, container, false);

        // Question 1
        Question question_1 = new Question(getString(R.string.breakingBad));
        question_1.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.breakingBadQuestion_1_AnswersRadioGroup));
        question_1.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.breakingBadQuestion_1_Answer_3_RadioButton));
        question_1.setSubmitButton((Button) rootView.findViewById(R.id.breakingBadQuestion_1_SubmitButton));

        // Question 2
        Question question_2 = new Question(getString(R.string.breakingBad));
        question_2.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.breakingBadQuestion_2_AnswersRadioGroup));
        question_2.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.breakingBadQuestion_2_Answer_2_RadioButton));
        question_2.setSubmitButton((Button) rootView.findViewById(R.id.breakingBadQuestion_2_SubmitButton));

        // Question 3
        Question question_3 = new Question(getString(R.string.breakingBad));
        question_3.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.breakingBadQuestion_3_AnswersRadioGroup));
        question_3.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.breakingBadQuestion_3_Answer_2_RadioButton));
        question_3.setSubmitButton((Button) rootView.findViewById(R.id.breakingBadQuestion_3_SubmitButton));

        // Question 4
        Question question_4 = new Question(getString(R.string.breakingBad));
        question_4.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.breakingBadQuestion_4_AnswersRadioGroup));
        question_4.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.breakingBadQuestion_4_Answer_1_RadioButton));
        question_4.setSubmitButton((Button) rootView.findViewById(R.id.breakingBadQuestion_4_SubmitButton));

        // Question 5
        Question question_5 = new Question(getString(R.string.breakingBad));
        question_5.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.breakingBadQuestion_5_AnswersRadioGroup));
        question_5.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.breakingBadQuestion_5_Answer_1_RadioButton));
        question_5.setSubmitButton((Button) rootView.findViewById(R.id.breakingBadQuestion_5_SubmitButton));

        // Question 6
        Question question_6 = new Question(getString(R.string.breakingBad));
        question_6.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.breakingBadQuestion_6_AnswersRadioGroup));
        question_6.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.breakingBadQuestion_6_Answer_3_RadioButton));
        question_6.setSubmitButton((Button) rootView.findViewById(R.id.breakingBadQuestion_6_SubmitButton));

        // Question 7
        Question question_7 = new Question(getString(R.string.breakingBad));
        question_7.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.breakingBadQuestion_7_AnswersRadioGroup));
        question_7.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.breakingBadQuestion_7_Answer_2_RadioButton));
        question_7.setSubmitButton((Button) rootView.findViewById(R.id.breakingBadQuestion_7_SubmitButton));

        // Question 8
        Question question_8 = new Question(getString(R.string.breakingBad));
        question_8.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.breakingBadQuestion_8_AnswersRadioGroup));
        question_8.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.breakingBadQuestion_8_Answer_1_RadioButton));
        question_8.setSubmitButton((Button) rootView.findViewById(R.id.breakingBadQuestion_8_SubmitButton));

        // Question 9
        Question question_9 = new Question(getString(R.string.breakingBad));
        question_9.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.breakingBadQuestion_9_AnswersRadioGroup));
        question_9.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.breakingBadQuestion_9_Answer_3_RadioButton));
        question_9.setSubmitButton((Button) rootView.findViewById(R.id.breakingBadQuestion_9_SubmitButton));

        // Question 10
        Question question_10 = new Question(getString(R.string.breakingBad));
        question_10.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.breakingBadQuestion_10_AnswersRadioGroup));
        question_10.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.breakingBadQuestion_10_Answer_1_RadioButton));
        question_10.setSubmitButton((Button) rootView.findViewById(R.id.breakingBadQuestion_10_SubmitButton));

        questions.add(question_1);
        questions.add(question_2);
        questions.add(question_3);
        questions.add(question_4);
        questions.add(question_5);
        questions.add(question_6);
        questions.add(question_7);
        questions.add(question_8);
        questions.add(question_9);
        questions.add(question_10);

        View.OnClickListener submit = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Searching in questions list
                for (Question question : questions) {
                    // If clicked Button equals some question submit button
                    if (view == question.getSubmitButton()) {
                        // If one of the radioButtons is checked
                        if (question.getAnswersRadioGroup().getCheckedRadioButtonId() != -1) {
                            // If the checked one is not correct answer
                            if (question.getAnswersRadioGroup().getCheckedRadioButtonId() !=
                                    question.getCorrectAnswerRadioButton().getId()) {
                                // set it's background color to red
                                rootView.findViewById(question.getAnswersRadioGroup().getCheckedRadioButtonId())
                                        .setBackgroundColor(getContext().getColor(R.color.incorrectAnswer));
                                // else increase correct answers count
                            } else {
                                correctAnswersCount++;
                            }
                        }
                        // Anyway increase submitted answers count and block radioButtons and
                        // submit Button, set correct radioButton background color to green
                        submittedAnswersCount++;
                        question.getCorrectAnswerRadioButton().setBackgroundColor(getContext().getColor(R.color.correctAnswer));
                        for (int i = 0; i < question.getAnswersRadioGroup().getChildCount(); i++) {
                            question.getAnswersRadioGroup().getChildAt(i).setClickable(false);
                        }
                        question.getSubmitButton().setClickable(false);
                    }
                }
                // If all the questions are submitted then call result()
                if (submittedAnswersCount == 10) {
                    result();
                    rootView.findViewById(R.id.breakingBadScrollView).scrollTo(0, rootView.findViewById(R.id.breakingBadScrollView).getTop());
                }
            }
        };

        for (Question question : questions) {
            question.getSubmitButton().setOnClickListener(submit);
        }

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        refresh();
    }

    private void result() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
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

        for (Question question : questions) {
            for (int i = 0; i < question.getAnswersRadioGroup().getChildCount(); i++) {
                question.getAnswersRadioGroup().getChildAt(i).setClickable(true);
                question.getAnswersRadioGroup().getChildAt(i).setBackgroundColor(0);
                question.getAnswersRadioGroup().clearCheck();
            }
            question.getSubmitButton().setClickable(true);
        }
    }
}

