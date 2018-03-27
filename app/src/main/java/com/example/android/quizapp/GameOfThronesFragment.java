package com.example.android.quizapp;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GameOfThronesFragment extends android.support.v4.app.Fragment {

    HashMap<String, String> savedValues = new HashMap<>();

    private View rootView;

    final ArrayList<Question> questions = new ArrayList<>();

    int correctAnswersCount = 0;
    int submittedAnswersCount = 0;

    public GameOfThronesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            for (String key : savedInstanceState.keySet()) {
                if (!key.equals("android:view_state") && !key.equals("android:user_visible_hint")) {
                    savedValues.put(key, savedInstanceState.getString(key));
                }
            }
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.game_of_thrones_layout, container, false);

        // QuestionRadioButton 1
        QuestionCheckBox question_1 = new QuestionCheckBox();
        question_1.setAnswersLinearLayout((LinearLayout) rootView.findViewById(R.id.gameOfThronesQuestion_1_LinearLayout));
        List<Integer> question_1_CorrectAnswers = new ArrayList<>();
        for (int i : getResources().getIntArray(R.array.gameOfThronesQuestion_1_CorrectAnswersPositions))
            question_1_CorrectAnswers.add(i);
        question_1.setCorrectAnswersPositions(question_1_CorrectAnswers);
        question_1.setSubmitButton((Button) rootView.findViewById(R.id.gameOfThronesQuestion_1_SubmitButton));

        // QuestionRadioButton 2
        QuestionTextEntry question_2 = new QuestionTextEntry();
        question_2.setAnswerEditText((EditText) rootView.findViewById(R.id.gameOfThronesQuestion_2_EditText));
        question_2.setPossibleAnswers(Arrays.asList(getResources().getStringArray(R.array.gameOfThronesQuestion_2_PossibleAnswers)));
        question_2.setSubmitButton((Button) rootView.findViewById(R.id.gameOfThronesQuestion_2_SubmitButton));

        // QuestionRadioButton 3
        QuestionRadioButton question_3 = new QuestionRadioButton();
        question_3.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.gameOfThronesQuestion_3_AnswersRadioGroup));
        question_3.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.gameOfThronesQuestion_3_Answer_3_RadioButton));
        question_3.setSubmitButton((Button) rootView.findViewById(R.id.gameOfThronesQuestion_3_SubmitButton));

        // QuestionRadioButton 4
        QuestionTextEntry question_4 = new QuestionTextEntry();
        question_4.setAnswerEditText((EditText) rootView.findViewById(R.id.gameOfThronesQuestion_4_EditText));
        question_4.setPossibleAnswers(Arrays.asList(getResources().getStringArray(R.array.gameOfThronesQuestion_4_PossibleAnswers)));
        question_4.setSubmitButton((Button) rootView.findViewById(R.id.gameOfThronesQuestion_4_SubmitButton));

        // QuestionRadioButton 5
        QuestionRadioButton question_5 = new QuestionRadioButton();
        question_5.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.gameOfThronesQuestion_5_AnswersRadioGroup));
        question_5.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.gameOfThronesQuestion_5_Answer_2_RadioButton));
        question_5.setSubmitButton((Button) rootView.findViewById(R.id.gameOfThronesQuestion_5_SubmitButton));

        // QuestionRadioButton 6
        QuestionTextEntry question_6 = new QuestionTextEntry();
        question_6.setAnswerEditText((EditText) rootView.findViewById(R.id.gameOfThronesQuestion_6_EditText));
        question_6.setPossibleAnswers(Arrays.asList(getResources().getStringArray(R.array.gameOfThronesQuestion_6_PossibleAnswers)));
        question_6.setSubmitButton((Button) rootView.findViewById(R.id.gameOfThronesQuestion_6_SubmitButton));

        // QuestionRadioButton 7
        QuestionRadioButton question_7 = new QuestionRadioButton();
        question_7.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.gameOfThronesQuestion_7_AnswersRadioGroup));
        question_7.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.gameOfThronesQuestion_7_Answer_2_RadioButton));
        question_7.setSubmitButton((Button) rootView.findViewById(R.id.gameOfThronesQuestion_7_SubmitButton));

        // QuestionRadioButton 8
        QuestionRadioButton question_8 = new QuestionRadioButton();
        question_8.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.gameOfThronesQuestion_8_AnswersRadioGroup));
        question_8.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.gameOfThronesQuestion_8_Answer_1_RadioButton));
        question_8.setSubmitButton((Button) rootView.findViewById(R.id.gameOfThronesQuestion_8_SubmitButton));

        // QuestionRadioButton 9
        QuestionCheckBox question_9 = new QuestionCheckBox();
        question_9.setAnswersLinearLayout((LinearLayout) rootView.findViewById(R.id.gameOfThronesQuestion_9_LinearLayout));
        List<Integer> question_9_CorrectAnswers = new ArrayList<>();
        for (int i : getResources().getIntArray(R.array.gameOfThronesQuestion_9_CorrectAnswersPositions))
            question_1_CorrectAnswers.add(i);
        question_9.setCorrectAnswersPositions(question_9_CorrectAnswers);
        question_9.setSubmitButton((Button) rootView.findViewById(R.id.gameOfThronesQuestion_9_SubmitButton));

        // QuestionRadioButton 10
        QuestionRadioButton question_10 = new QuestionRadioButton();
        question_10.setAnswersRadioGroup((RadioGroup) rootView.findViewById(R.id.gameOfThronesQuestion_10_AnswersRadioGroup));
        question_10.setCorrectAnswerRadioButton((RadioButton) rootView.findViewById(R.id.gameOfThronesQuestion_10_Answer_2_RadioButton));
        question_10.setSubmitButton((Button) rootView.findViewById(R.id.gameOfThronesQuestion_10_SubmitButton));

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

        View view;
        if (savedInstanceState != null) {
            for (String key : savedInstanceState.keySet()) {
                if (!key.equals("android:view_state") && !key.equals("android:user_visible_hint")) {
                    savedValues.put(key, savedInstanceState.getString(key));

                    switch (key) {
                        case "correctAnswersCount":
                            correctAnswersCount = Integer.parseInt(savedInstanceState.getString(key));
                            break;
                        case "submittedAnswersCount":
                            submittedAnswersCount = Integer.parseInt(savedInstanceState.getString(key));
                            break;
                        default:
                            view = rootView.findViewById(Integer.parseInt(key));
                            if (view instanceof Button) {
                                view.setClickable(false);
                                View currentView = rootView.findViewById(view.getNextFocusUpId());

                                if (currentView instanceof RadioGroup) {
                                    for (int i = 0; i < ((RadioGroup) currentView).getChildCount(); i++)
                                        ((RadioGroup) currentView).getChildAt(i).setClickable(false);
                                } else if (currentView instanceof LinearLayout) {
                                    for (int i = 0; i < ((LinearLayout) currentView).getChildCount(); i++)
                                        ((LinearLayout) currentView).getChildAt(i).setClickable(false);
                                } else if (currentView instanceof EditText)
                                    rootView.findViewById(view.getNextFocusUpId()).setFocusable(false);
                            }
                            // Radio button question and check box question
                            if (view instanceof RadioButton || view instanceof CheckBox)
                                view.setBackgroundColor(Integer.parseInt(savedValues.get(key)));
                            // Text entry question
                            if (view instanceof EditText)
                                view.setBackgroundTintList(ColorStateList.valueOf(Integer.parseInt(savedValues.get(key))));
                            break;
                    }
                }
            }
        }

        View.OnClickListener submit = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Searching in questions list
                for (Question question : questions) {
                    if (view == question.getSubmitButton()) {
                        // if current question is radio button question
                        if (question instanceof QuestionRadioButton) {
                            RadioGroup answersRadioGroup = ((QuestionRadioButton) question).getAnswersRadioGroup();
                            RadioButton correctRadioButton = ((QuestionRadioButton) question).getCorrectAnswerRadioButton();

                            // If one of the radioButtons is checked
                            if (answersRadioGroup.getCheckedRadioButtonId() != -1) {
                                // If the checked one is not correct answer
                                if (answersRadioGroup.getCheckedRadioButtonId() != correctRadioButton.getId())
                                    // set it's background color to red
                                    rootView.findViewById(answersRadioGroup.getCheckedRadioButtonId())
                                            .setBackgroundColor(getContext().getColor(R.color.incorrectAnswer));

                                    // else increase correct answers count
                                    else
                                    correctAnswersCount++;
                            }
                            // Anyway increase submitted answers count and block radioButtons and
                            // submit Button, set correct radioButton background color to green
                            correctRadioButton.setBackgroundColor(getContext().getColor(R.color.correctAnswer));
                            for (int i = 0; i < answersRadioGroup.getChildCount(); i++) {
                                answersRadioGroup.getChildAt(i).setClickable(false);

                                // Saving color
                                if (answersRadioGroup.getChildAt(i).getBackground() instanceof ColorDrawable)
                                    savedValues.put(String.valueOf(answersRadioGroup.getChildAt(i).getId())
                                            ,(String.valueOf(((ColorDrawable) answersRadioGroup.getChildAt(i).getBackground()).getColor())));
                            }
                            question.getSubmitButton().setClickable(false);

                            // if current question is check box question
                        } else if (question instanceof QuestionCheckBox) {
                            LinearLayout checkBoxesLinearLayout = ((QuestionCheckBox) question).getAnswersLinearLayout();
                            int answersCount = checkBoxesLinearLayout.getChildCount();
                            List<Integer> correctAnswersPositions = ((QuestionCheckBox) question).getCorrectAnswersPositions();
                            CheckBox answerCheckBox;

                            // Checking if answer is correct
                            for (int i = 0; i < answersCount; i++) {
                                answerCheckBox = (CheckBox) checkBoxesLinearLayout.getChildAt(i);

                                if (correctAnswersPositions.contains(i)) {
                                    if (!answerCheckBox.isChecked())
                                        break;
                                } else {
                                    if (answerCheckBox.isChecked())
                                        break;
                                }
                                if (i == answersCount - 1)
                                    correctAnswersCount++;
                            }

                            // Setting background color (red or green) and clickability to false
                            for (int i = 0; i < answersCount; i++) {
                                answerCheckBox = (CheckBox) checkBoxesLinearLayout.getChildAt(i);

                                if (answerCheckBox.isChecked() && !correctAnswersPositions.contains(i))
                                    answerCheckBox.setBackgroundColor(getContext().getColor(R.color.incorrectAnswer));
                                if (correctAnswersPositions.contains(i))
                                    answerCheckBox.setBackgroundColor(getContext().getColor(R.color.correctAnswer));
                                answerCheckBox.setClickable(false);

                                // Saving color
                                if (answerCheckBox.getBackground() instanceof ColorDrawable)
                                savedValues.put(String.valueOf(answerCheckBox.getId())
                                        ,(String.valueOf(((ColorDrawable) answerCheckBox.getBackground()).getColor())));
                            }
                            question.getSubmitButton().setClickable(false);

                            // if current question is text entry question
                        } else if (question instanceof QuestionTextEntry) {
                            List<String> possibleAnswers = ((QuestionTextEntry) question).getPossibleAnswers();
                            EditText answerEditText = ((QuestionTextEntry) question).getAnswerEditText();

                            // Checking is answer is correct and setting tint color (red or green)
                            for (int i = 0; i < possibleAnswers.size(); i++) {
                                if (answerEditText.getText().toString().toLowerCase()
                                        .equals(possibleAnswers.get(i).toLowerCase())) {
                                    answerEditText.setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(R.color.correctAnswer)));
                                    correctAnswersCount++;
                                    break;
                                }
                                if (i == possibleAnswers.size() - 1) {
                                    answerEditText.setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(R.color.incorrectAnswer)));
                                }
                            }
                            // Anyway setting correct answer as text, setting focus as false,
                            // setting clickability of submit button to false
                            answerEditText.setText((((QuestionTextEntry) question).getPossibleAnswers().get(0)));
                            answerEditText.setFocusable(false);
                            question.getSubmitButton().setClickable(false);

                            // Saving color
                            savedValues.put(String.valueOf(answerEditText.getId()),
                                    (String.valueOf(answerEditText.getBackgroundTintList().getDefaultColor())));

                        }
                        // Increasing count of submitted answers
                        submittedAnswersCount++;

                        // Saving clickability
                        savedValues.put(String.valueOf(question.getSubmitButton().getId()),
                                (String.valueOf(false)));
                    }
                }

                savedValues.put("correctAnswersCount", String.valueOf(correctAnswersCount));
                savedValues.put("submittedAnswersCount", String.valueOf(submittedAnswersCount));
                // If all the questions are submitted then call result()
                if (submittedAnswersCount == 10) {
                    result();
                    rootView.findViewById(R.id.gameOfThronesScrollView).scrollTo(0, rootView.findViewById(R.id.gameOfThronesScrollView).getTop());
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
        View view;
        for (String key : savedValues.keySet()) {
            savedValues.put(key, savedValues.get(key));

            switch (key) {
                case "correctAnswersCount":
                    correctAnswersCount = Integer.parseInt(savedValues.get(key));
                    break;
                case "submittedAnswersCount":
                    submittedAnswersCount = Integer.parseInt(savedValues.get(key));
                    break;
                default:
                    view = rootView.findViewById(Integer.parseInt(key));
                    if (view instanceof Button) {
                        view.setClickable(false);
                        View currentView = rootView.findViewById(view.getNextFocusUpId());

                        // Clickability depending on view type
                        if (currentView instanceof RadioGroup) {
                            for (int i = 0; i < ((RadioGroup) currentView).getChildCount(); i++)
                                ((RadioGroup) currentView).getChildAt(i).setClickable(false);
                        } else if (currentView instanceof LinearLayout) {
                            for (int i = 0; i < ((LinearLayout) currentView).getChildCount(); i++)
                                ((LinearLayout) currentView).getChildAt(i).setClickable(false);
                        } else if (currentView instanceof EditText)
                            rootView.findViewById(view.getNextFocusUpId()).setFocusable(false);
                    }
                    // Radio button question and check box question
                    if (view instanceof RadioButton || view instanceof CheckBox)
                        view.setBackgroundColor(Integer.parseInt(savedValues.get(key)));
                    // Text entry question
                    if (view instanceof EditText)
                        view.setBackgroundTintList(ColorStateList.valueOf(Integer.parseInt(savedValues.get(key))));
                    break;
            }
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        for (String key : savedValues.keySet()) {
            outState.putString(key, savedValues.get(key));
        }
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
        // Refreshing counts
        submittedAnswersCount = 0;
        correctAnswersCount = 0;

        // Refreshing questions:
        for (Question question : questions) {
            // refreshing radio buttons questions
            if (question instanceof QuestionRadioButton) {
                RadioGroup answersRadioGroup = ((QuestionRadioButton) question).getAnswersRadioGroup();
                RadioButton answerRadioButton;

                for (int i = 0; i < answersRadioGroup.getChildCount(); i++) {
                    answerRadioButton = (RadioButton) answersRadioGroup.getChildAt(i);

                    answerRadioButton.setClickable(true);
                    answerRadioButton.setBackgroundColor(0);
                    answersRadioGroup.clearCheck();
                }

                // refreshing check boxes questions
            } else if (question instanceof QuestionCheckBox) {
                LinearLayout answersLinearLayout = ((QuestionCheckBox) question).getAnswersLinearLayout();
                CheckBox answerCheckBox;

                for (int i = 0; i < answersLinearLayout.getChildCount(); i++) {
                    answerCheckBox = (CheckBox) answersLinearLayout.getChildAt(i);

                    answerCheckBox.setClickable(true);
                    answerCheckBox.setBackgroundColor(0);
                    answerCheckBox.setChecked(false);
                }

                // refreshing text entry questions
            } else if (question instanceof QuestionTextEntry) {
                EditText answerEditText = ((QuestionTextEntry) question).getAnswerEditText();

                answerEditText.setFocusable(true);
                answerEditText.setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(R.color.background_tint_and_text_color_tint)));
                answerEditText.setText("");
            }

            // refreshing submit buttons
            question.getSubmitButton().setClickable(true);
        }
    }
}
