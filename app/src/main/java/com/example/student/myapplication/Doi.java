package com.example.student.myapplication;

public class Doi {
float C;
float F;

    public float getC() {
        return C;
    }

    public float getF() {
        return F;
    }

    public void setC(float c) {
        C = c;
    }

    public void setF(float f) {
        F = f;
    }

    public float doiCF (){
        F= (float) (C*1.8+32);
        return F ;
    }
    public float doiFC(){
        C= (float) ((F-32)/1.8);
        return C;

    }
}
