package edu.handong.csee.java.hw2.converters;

/**
 * 인터페이스 Convertible
 */
public interface Convertible  {

    /**
     * input된 숫자를 클래스에 저장
     * @param fromValue input된 숫자
     */
    public void setFromValue(double fromValue);
    /**
     * 현재 클래스의 fromValue값을 return해줌
     * @return 현재 클래스의 fromValue값
     */
    public double getConvertedValue();
    /**
     * 현재 클래스의 fromvalue값을 input된 단위 기준의 숫자로 변환
     */
    public void convert();

}