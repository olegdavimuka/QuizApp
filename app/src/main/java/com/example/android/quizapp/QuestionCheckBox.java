package com.example.android.quizapp;

import android.widget.LinearLayout;

import java.util.List;

class QuestionCheckBox extends Question {
    private LinearLayout answersLinearLayout;
    private List<Integer> correctAnswersPositions;

    QuestionCheckBox() {

    }

    LinearLayout getAnswersLinearLayout() {
        return answersLinearLayout;
    }

    void setAnswersLinearLayout(LinearLayout answersLinearLayout) {
        this.answersLinearLayout = answersLinearLayout;
    }

    List<Integer> getCorrectAnswersPositions() {
        return correctAnswersPositions;
    }

    void setCorrectAnswersPositions(List<Integer> correctAnswersPositions) {
        this.correctAnswersPositions = correctAnswersPositions;
    }
}

