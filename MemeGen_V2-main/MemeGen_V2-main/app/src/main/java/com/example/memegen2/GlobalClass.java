package com.example.memegen2;



public class GlobalClass {

    public static GlobalClass instance;

    private GlobalClass(){


    }


    private String textTop = "Global class top text";
    private String textBottom = "Global class bottom text";

    public void setTextTop(String data){

        this.textTop = data;
    }

    public String getTextTop(){

        return this.textTop;
    }

    private String data;

    public void setTextBottom(String data){

        this.textBottom = data;
    }

    public String getTextBottom(){

        return this.textBottom;
    }

    public static  synchronized GlobalClass getInstance(){

        if(instance==null){

            instance=new GlobalClass();
        }

        return instance;
    }



}
