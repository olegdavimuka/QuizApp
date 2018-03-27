package com.example.android.quizapp;

import android.widget.RadioButton;
import android.widget.RadioGroup;

class QuestionRadioButton extends Question {
    private RadioGroup answersRadioGroup;
    private RadioButton correctAnswerRadioButton;

    QuestionRadioButton() {

    }

    RadioGroup getAnswersRadioGroup() {
        return answersRadioGroup;
    }

    void setAnswersRadioGroup(RadioGroup answersRadioGroup) {
        this.answersRadioGroup = answersRadioGroup;
    }

    RadioButton getCorrectAnswerRadioButton() {
        return correctAnswerRadioButton;
    }

    void setCorrectAnswerRadioButton(RadioButton correctAnswerRadioButton) {
        this.correctAnswerRadioButton = correctAnswerRadioButton;
    }
}

