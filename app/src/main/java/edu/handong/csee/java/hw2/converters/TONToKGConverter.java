package edu.handong.csee.java.hw2.converters;

/**
 * 입력된 숫자의 단위를 Ton에서 Kg으로 변경
 */
public class TONToKGConverter implements Convertible{
    private double fromValue;

    /**
     * parameter fromValue로 들어온 숫자(단위 : Ton)를 현재 클래스의 fromValue 변수에 넣어줌
     */
    public void setFromValue(double fromValue){
        this.fromValue = fromValue;
    }

    /**
     * 현재 클래스의 fromValue값을 return해줌
     * @return 현재 클래스의 fromValue값
     */
    public double getConvertedValue(){
        return this.fromValue;
    }

    /**
     * 현재 클래스의 fromvalue값을 Kg 기준의 숫자로 변환
     */
    public void convert(){
        this.fromValue = this.fromValue*1000;
    }
}
