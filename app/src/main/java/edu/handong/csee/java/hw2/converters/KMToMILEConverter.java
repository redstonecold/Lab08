package edu.handong.csee.java.hw2.converters;

/**
 * 입력된 숫자의 단위를 Km에서 MILE으로 변경
 */
public class KMToMILEConverter implements Convertible{
    private double fromValue;

    /**
     * parameter fromValue로 들어온 숫자(단위 : KM)를 현재 클래스의 fromValue 변수에 넣어줌
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
     * 현재 클래스의 fromvalue값을 MILE 기준의 숫자로 변환
     */
    public void convert(){
        this.fromValue = this.fromValue/1.6;
    }
    
    
}
