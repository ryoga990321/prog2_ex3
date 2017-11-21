package jp.ac.uryukyu.ie.ex3.pair32;

public class ExDice extends Dice{
    private int minValue;
    private int maxValue;

    public ExDice(int minValue,int maxValue){
        this.minValue=minValue;
        this.maxValue=maxValue;
    }

    @Override
    public void play(){
        setValue((int)(Math.random()*3)+5);
    }

    public int getMinValue(){
        return minValue;
    }

    public void setMinValue(){
        this.minValue=minValue;
    }

    public int getMaxValue(){
        return maxValue;
    }

    public void setMaxValue(){
        this.maxValue=maxValue;
    }
}
