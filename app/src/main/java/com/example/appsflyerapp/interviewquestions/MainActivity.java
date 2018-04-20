package com.example.appsflyerapp.interviewquestions;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Quiz quiz = new Quiz();
    private TextView mQuestionView, mQestionNumber;
    private Button mButtonOne, mButtonTwo, mButtonThree, mButtonFour;
    private String mAnswer;
    private int questionsCounter = 0, mScore = 3;
    Answer answerA, answerB, answerC, answerD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionView = (TextView)findViewById(R.id.question);
        mQestionNumber = (TextView)findViewById(R.id.question_number);
        mButtonOne = (Button)findViewById(R.id.first_choice);
        mButtonTwo = (Button)findViewById(R.id.second_choice);
        mButtonThree = (Button)findViewById(R.id.third_choice);
        mButtonFour = (Button)findViewById(R.id.forth_choice);
        createQuestion();

        mButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonOne.getText() == mAnswer)
                {
                    mScore++;
                    mButtonOne.setBackgroundColor(getColor(R.color.greenCover));
                   // if(questionsCounter%4 == 0)     // Bonus question
                     //   increaseBitcoins(mScore);
                }

                else {
                    mScore--;
                    mButtonOne.setBackgroundColor(getColor(R.color.redCover));
                    if(mButtonTwo.getText() == mAnswer)
                        mButtonTwo.setBackgroundColor(getColor(R.color.greenCover));
                    else if(mButtonThree.getText() == mAnswer)
                        mButtonThree.setBackgroundColor(getColor(R.color.greenCover));
                    else if(mButtonFour.getText() == mAnswer)
                        mButtonFour.setBackgroundColor(getColor(R.color.greenCover));

                    //if(questionsCounter%4 == 0)     // Bonus question
                       // reduceBitcoins(mScore);
                }
                updateQuestion();
            }
        });

        mButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonTwo.getText() == mAnswer)
                {
                    mScore++;
                    mButtonTwo.setBackgroundColor(getColor(R.color.greenCover));
                   // if(questionsCounter%4 == 0)     // Bonus question
                     //   increaseBitcoins(mScore);
                }

                else {
                    mScore--;
                    mButtonTwo.setBackgroundColor(getColor(R.color.redCover));
                    if(mButtonOne.getText() == mAnswer)
                        mButtonOne.setBackgroundColor(getColor(R.color.greenCover));
                    else if(mButtonThree.getText() == mAnswer)
                        mButtonThree.setBackgroundColor(getColor(R.color.greenCover));
                    else if(mButtonFour.getText() == mAnswer)
                        mButtonFour.setBackgroundColor(getColor(R.color.greenCover));

                   // if(questionsCounter%4 == 0)     // Bonus question
                     //   reduceBitcoins(mScore);
                }
                updateQuestion();
            }
        });

        mButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonThree.getText() == mAnswer)
                {
                    mScore++;
                    mButtonThree.setBackgroundColor(getColor(R.color.greenCover));
                    //if(questionsCounter%4 == 0)     // Bonus question
                       // increaseBitcoins(mScore);
                }

                else {
                    mScore--;
                    mButtonThree.setBackgroundColor(getColor(R.color.redCover));
                    if(mButtonOne.getText() == mAnswer)
                        mButtonOne.setBackgroundColor(getColor(R.color.greenCover));
                    else if(mButtonTwo.getText() == mAnswer)
                        mButtonTwo.setBackgroundColor(getColor(R.color.greenCover));
                    else if(mButtonFour.getText() == mAnswer)
                        mButtonFour.setBackgroundColor(getColor(R.color.greenCover));

                  //  if(questionsCounter%4 == 0)     // Bonus question
                     //   reduceBitcoins(mScore);
                }
                updateQuestion();
            }
        });

        mButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonFour.getText() == mAnswer)
                {
                    mScore++;
                    mButtonFour.setBackgroundColor(getColor(R.color.greenCover));
                    //if(questionsCounter%4 == 0)     // Bonus question
                       // increaseBitcoins(mScore);
                }

                else {
                    mScore--;
                    mButtonFour.setBackgroundColor(getColor(R.color.redCover));
                    if(mButtonOne.getText() == mAnswer)
                        mButtonOne.setBackgroundColor(getColor(R.color.greenCover));
                    else if(mButtonTwo.getText() == mAnswer)
                        mButtonTwo.setBackgroundColor(getColor(R.color.greenCover));
                    else if(mButtonThree.getText() == mAnswer)
                        mButtonThree.setBackgroundColor(getColor(R.color.greenCover));

                   // if(questionsCounter%4 == 0)     // Bonus question
                       // reduceBitcoins(mScore);
                }
                updateQuestion();
            }
        });
    }




    private void updateQuestion(){

        new CountDownTimer(3000, 1000) {
            public void onFinish() {
                // When timer is finished
                // Execute your code here
                if(questionsCounter == 4)
                    finish();
                mButtonOne.setBackgroundColor(getColor(R.color.colorPrimary));
                mButtonTwo.setBackgroundColor(getColor(R.color.colorPrimary));
                mButtonThree.setBackgroundColor(getColor(R.color.colorPrimary));
                mButtonFour.setBackgroundColor(getColor(R.color.colorPrimary));

                createQuestion();
                mButtonOne.setEnabled(true);
                mButtonTwo.setEnabled(true);
                mButtonThree.setEnabled(true);
                mButtonFour.setEnabled(true);

            }

            public void onTick(long millisUntilFinished) {
                // millisUntilFinished    The amount of time until finished.

                mButtonOne.setEnabled(false);
                mButtonTwo.setEnabled(false);
                mButtonThree.setEnabled(false);
                mButtonFour.setEnabled(false);


            }
        }.start();
    }

    private void createQuestion()
    {
        Question question = quiz.getQuetionFromQuiz();

        answerA = question.getAnswer();
        mButtonOne.setText(answerA.getAnswer());

        answerB = question.getAnswer();
        mButtonTwo.setText(answerB.getAnswer());

        answerC = question.getAnswer();
        mButtonThree.setText(answerC.getAnswer());

        answerD = question.getAnswer();
        mButtonFour.setText(answerD.getAnswer());


        mAnswer = question.getCorrectAnswer(answerA, answerB, answerC, answerD);
        mQuestionView.setText(question.getQestion());
        questionsCounter++;

        mQestionNumber = (TextView) findViewById(R.id.question_number);
        mQestionNumber.setText(questionsCounter + "/20");
    }
    private void increaseBitcoins(int score) {
        }

    private void reduceBitcoins(int score) {
        }


    }


