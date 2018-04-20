package com.example.appsflyerapp.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Quiz {

    private Question question1 = new Question("מה הפירוש של OOP?",new Answer("Object Oriented Programming", 1),
            new Answer("מערכת הפעלה", 3),  new Answer("פקד לVS", 2), new Answer("זן של אבוקדו", 4));
    private Question question2 = new Question("מי זכתה במונדיאל 2014?",new Answer("גרמניה", 1),
            new Answer("ארגנטינה", 2),  new Answer("ברזיל", 3), new Answer("ישראל", 4));
    private Question question3 = new Question("מי זכתה במונדיאל 2010?",new Answer("ספרד", 1),
            new Answer("הולנד", 2),  new Answer("פיקוד מרכז", 4), new Answer("גרמניה", 3));
    private Question question4 = new Question("מי זכתה במונדיאל 2022?",new Answer("צרפת", 2),
            new Answer("בלגיה", 1),  new Answer("פורטוגל", 2), new Answer("התקווה 6", 4));

    private ArrayList<Question> questions =  new ArrayList<Question>();

    private ArrayList<Question> bonusQuestions =  new ArrayList<Question>();


    public Quiz()
    {
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
    }
    public Question getQuetionFromQuiz(){

        int index = new Random().nextInt(questions.size());
        Question currentQuestion = questions.get(index);
        questions.remove(index);
        return currentQuestion;

    }







}
