package com.example.appsflyerapp.interviewquiz;

public class Answer {

    private String mAnswer;
    private int mStatus;     // 1-correct, 2-wrong,, 3-not possible, 4-ridiculous

    public Answer(String answer, int status)
    {
        mAnswer = answer;
        mStatus = status;
    }

    public String getAnswer(){
        return mAnswer;
    }

    public int getAnswerStatus(){
        return mStatus;
    }
}
