package com.example.android.quizapp;

import android.widget.Button;

class Question {
    private Button submitButton;

    Question() {

    }

    Button getSubmitButton() {
        return submitButton;
    }

    void setSubmitButton(Button submitButton) {
        this.submitButton = submitButton;
    }
}
