package com.example.appsflyerapp.interviewquiz;

import java.util.ArrayList;
import java.util.Random;

public class Question {

    private String mQuestion;
    private ArrayList<Answer> mAnswers = new ArrayList<Answer>();


    public Question(String question, Answer answerA, Answer answerB, Answer answerC, Answer answerD)
    {
        mQuestion = question;
        mAnswers.add(answerA);
        mAnswers.add(answerB);
        mAnswers.add(answerC);
        mAnswers.add(answerD);
    }


    public String getQestion() {

        return mQuestion;
    }

    public Answer getAnswer() {

        int index = new Random().nextInt(mAnswers.size());
        Answer currentAnswer = mAnswers.get(index);
        mAnswers.remove(index);
        return currentAnswer;
    }


    public String getCorrectAnswer(Answer answerA, Answer answerB, Answer answerC, Answer answerD) {

        if(answerA.getAnswerStatus() == 1)
            return answerA.getAnswer();
        else if(answerB.getAnswerStatus() == 1)
            return answerB.getAnswer();
        else if(answerC.getAnswerStatus() == 1)
            return answerC.getAnswer();
        else if(answerD.getAnswerStatus() == 1)
            return answerD.getAnswer();

        return null;
    }

}
