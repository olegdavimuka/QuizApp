package com.example.android.quizapp;

import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Question {
    private String tvSeries;
    private String question;
    private String answer_1;
    private String answer_2;
    private String answer_3;
    private String correctAnswer;
    private TextView questionTextView;
    private RadioGroup answersRadioGroup;
    private RadioButton answer_1_RadioButton;
    private RadioButton answer_2_RadioButton;
    private RadioButton answer_3_RadioButton;
    private RadioButton correctAnswerRadioButton;
    private Button submitButton;

    public Question(String tvSeries) {
        this.tvSeries = tvSeries;
    }

    public Question(String tvSeries, String question, String answer_1, String answer_2,
                    String answer_3, String correctAnswer) {
        this.tvSeries = tvSeries;
        this.question = question;
        this.answer_1 = answer_1;
        this.answer_2 = answer_2;
        this.answer_3 = answer_3;
        this.correctAnswer = correctAnswer;
    }

    public Question(String tvSeries, String question, String answer_1, String answer_2,
                    String answer_3, String correctAnswer, TextView questionTextView, RadioGroup answersRadioGroup,
                    RadioButton answer_1_RadioButton, RadioButton answer_2_RadioButton,
                    RadioButton answer_3_RadioButton, RadioButton correctAnswerRadioButton,
                    Button submitButton) {
        this.tvSeries = tvSeries;
        this.question = question;
        this.answer_1 = answer_1;
        this.answer_2 = answer_2;
        this.answer_3 = answer_3;
        this.correctAnswer = correctAnswer;
        this.questionTextView = questionTextView;
        this.answersRadioGroup = answersRadioGroup;
        this.answer_1_RadioButton = answer_1_RadioButton;
        this.answer_2_RadioButton = answer_2_RadioButton;
        this.answer_3_RadioButton = answer_3_RadioButton;
        this.correctAnswerRadioButton = correctAnswerRadioButton;
        this.submitButton = submitButton;
    }

    public String getTvSeries() {
        return tvSeries;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer_1() {
        return answer_1;
    }

    public String getAnswer_2() {
        return answer_2;
    }

    public String getAnswer_3() {
        return answer_3;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public TextView getQuestionTextView() {
        return questionTextView;
    }

    public RadioGroup getAnswersRadioGroup() {
        return answersRadioGroup;
    }

    public RadioButton getAnswer_1_RadioButton() {
        return answer_1_RadioButton;
    }

    public RadioButton getAnswer_2_RadioButton() {
        return answer_2_RadioButton;
    }

    public RadioButton getAnswer_3_RadioButton() {
        return answer_3_RadioButton;
    }

    public RadioButton getCorrectAnswerRadioButton() {
        return correctAnswerRadioButton;
    }

    public Button getSubmitButton() {
        return submitButton;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer_1(String answer_1) {
        this.answer_1 = answer_1;
    }

    public void setAnswer_2(String answer_2) {
        this.answer_2 = answer_2;
    }

    public void setAnswer_3(String answer_3) {
        this.answer_3 = answer_3;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setQuestionTextView(TextView questionTextView) {
        this.questionTextView = questionTextView;
    }

    public void setAnswersRadioGroup(RadioGroup answersRadioGroup) {
        this.answersRadioGroup = answersRadioGroup;
    }

    public void setAnswer_1_RadioButton(RadioButton answer_1_RadioButton) {
        this.answer_1_RadioButton = answer_1_RadioButton;
    }

    public void setAnswer_2_RadioButton(RadioButton answer_2_RadioButton) {
        this.answer_2_RadioButton = answer_2_RadioButton;
    }

    public void setAnswer_3_RadioButton(RadioButton answer_3_RadioButton) {
        this.answer_3_RadioButton = answer_3_RadioButton;
    }

    public void setCorrectAnswerRadioButton(RadioButton correctAnswerRadioButton) {
        this.correctAnswerRadioButton = correctAnswerRadioButton;
    }

    public void setSubmitButton(Button submitButton) {
        this.submitButton = submitButton;
    }
}

