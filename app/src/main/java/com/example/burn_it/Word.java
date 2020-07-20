package com.example.burn_it;

import android.content.Context;

public class Word {
    private String mexcersise;
    private String mrepetion;
    private static final int NO_VALID_IMAGE=-1;
    private int mimgageresourceid=NO_VALID_IMAGE;


    public Word(String excersise,String repetion,int imgageresourceid)
    {
        mexcersise=excersise;
        mrepetion=repetion;
        mimgageresourceid=imgageresourceid;
    }

    public String getExcersise() {
        return mexcersise;
    }

    public String getRepetion() {
        return mrepetion;
    }

    public int getImgageresourceid()
    {

        return mimgageresourceid;

    }
    public boolean hasImage()
    {
        return mimgageresourceid!=NO_VALID_IMAGE;
    }


}
