package edu.handong.csee.java.hw2.converters;

/**
 * arg[2]값으로 'all'이 들어왔을 때 사용되는 class
 */

public class AllConverter {
    private double fromValue;
    private String originalMeasure;
    
    /**
    * 터미널에 입력된 숫자(arg[0])를 현재 클래스의 fromValue 변수에 넣어줌
    * @param fromValue 입력된 숫자(arg[0])
    * @return 이 클래스의 fromValue
    */
    public AllConverter setFromValue(double fromValue){
        this.fromValue = fromValue;
        return this;
    }

    /**
    * 터미널에 입력된 단위(arg[1])를 현재 클래스의 fromValue 변수에 넣어줌
    * @param  originalMeasure 입력된 단위(arg[1])
    * @return 이 클래스의 originalMeasure
    */
    public AllConverter setOriginalMeasure(String originalMeasure){
        this.originalMeasure = originalMeasure;
        return this;
    }

    /**
    * TON을 G과 KG로 convert
    * KM을 M과 MILE로 convert
    */
    public void convertAndPrintOut(){
        if(originalMeasure.equals("TON")){
            System.out.println(fromValue + " " + originalMeasure + " to " + fromValue*1000 + " KG");
            System.out.println(fromValue + " " + originalMeasure + " to " + fromValue*1000000 + " G");
        }
        else if(originalMeasure.equals("KM")){
            System.out.println(fromValue + " " + originalMeasure + " to " + fromValue*1000 + " M");
            System.out.println(fromValue + " " + originalMeasure + " to " + fromValue/1.6 + " MILE");
        }
        else {
            System.out.println("AllConverter cannot support the measure!");
        }
    }
}
