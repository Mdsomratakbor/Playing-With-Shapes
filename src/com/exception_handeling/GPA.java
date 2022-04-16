package com.exception_handeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GPA {
    static void validateAge (int age) throws AgeOutOfRangeException{
        if(age>25) {
            throw new AgeOutOfRangeException(age);
        }
        }

    static void validateGPA (double gpa) throws LowGpaException{
        if(gpa<2.5) {
            throw new LowGpaException();
        }
    }
        public  static  void main(String[] args){
        try {
            int age;
            double gpa;
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter your age:");
            age = sc.nextInt();
            System.out.print("Please enter your GPA:");
            gpa = sc.nextDouble();
            validateAge(age);
            validateGPA(gpa);
            System.out.println("Your application is accepted and is under study");
        }
        catch (InputMismatchException ex){
           System.out.println("please enter valid data type data, age is numeric type and GPA is decimal type data.");

        }
        catch (AgeOutOfRangeException ex){
                System.out.println("Age validation Message!!");
                System.out.println(ex.getMessage());
        }
        catch (LowGpaException ex){
            System.out.println("GPA validation Message!!");
            System.out.println(ex.getMessage());
        }
        finally {

        }
    }
}
