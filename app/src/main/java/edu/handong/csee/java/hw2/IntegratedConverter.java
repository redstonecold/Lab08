package edu.handong.csee.java.hw2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import edu.handong.csee.java.hw2.converters.*; // You will learn the import statement in L11.

/**
 * main함수와 Run함수가 정의된 클래스
 */
public class IntegratedConverter {

    private double fromValue;

    /**
     * run함수를 포함한 main 클래스
     * @param args 터미널 입력 값
     */
    public static void main(String[] args) {

        IntegratedConverter myConverter = new IntegratedConverter();

        myConverter.run(args);

    }

    /**
     * 프로그램을 돌리는 클래스
     * @param args 터미널 입력 값
     */
    private void run(String[] args) {

        fromValue = Double.parseDouble(args[0]); //input 숫자
        String originalMeasure = Util.getUppercaseString(args[1]); //Convert할 원래 단위
        String targetMeasure = Util.getUppercaseString(args[2]); // Convert할 결과 단위

        if(!targetMeasure.equals("ALL")) {

            String converterName = "edu.handong.csee.java.hw2.converters." + originalMeasure + "To" + targetMeasure + "Converter";

            // You will learn about the try-catch block and Exception in L19
            try {
                // Advanced Java feature: Reflection (it lets us use classes with their String class names.)
                // (JC does not teach this topic as it is advanced one but you can study by yourself!!)
                // https://www.oracle.com/technical-resources/articles/java/javareflection.html
                Class<?> converterClass = (Class<?>) Class.forName(converterName);
                Constructor<?> constructor = (Constructor<?>) converterClass.getConstructor();
                Convertible myConverter = (Convertible) constructor.newInstance();
                myConverter.setFromValue(fromValue);
                myConverter.convert();
                System.out.println(fromValue +" " + originalMeasure + " is " + myConverter.getConvertedValue() + " " + targetMeasure + "!");
                //getConvertedValue() : 변경한 숫자를 받아옴

            } catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                System.out.println("The converter (" + converterName + ") for " + originalMeasure + " to " + targetMeasure + " does not exist!!");
            }
            //converterName : convert한 class path

        } else {

            AllConverter myAllConverter = new AllConverter();
            // When your method returns `this' in methods of AllConverter, you can call them in this way (method chaining).
            // Think/understand how and why this work. Study and search for Method chaining
            // https://stackoverflow.com/questions/21180269/how-to-achieve-method-chaining-in-java
            // https://www.geeksforgeeks.org/method-chaining-in-java-with-examples/#:~:text=Method%20Chaining%20is%20the%20practice,with%20a%20(dot.).
            myAllConverter.setFromValue(fromValue).setOriginalMeasure(originalMeasure).convertAndPrintOut();
        }
    }
}

