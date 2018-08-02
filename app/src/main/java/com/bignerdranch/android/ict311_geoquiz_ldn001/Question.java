package com.bignerdranch.android.ict311_geoquiz_ldn001;

/**
 * Created by ldn001 on 2/08/2018.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResid, boolean answerTrue) {
        mTextResId = textResid;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
