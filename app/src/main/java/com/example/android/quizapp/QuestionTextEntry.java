package com.example.android.quizapp;

import android.widget.EditText;

import java.util.List;

class QuestionTextEntry extends Question {
    private EditText answerEditText;
    private List<String> possibleAnswers;

    QuestionTextEntry() {

    }

    EditText getAnswerEditText() {
        return answerEditText;
    }

    void setAnswerEditText(EditText answerEditText) {
        this.answerEditText = answerEditText;
    }

    List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    void setPossibleAnswers(List<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }
}