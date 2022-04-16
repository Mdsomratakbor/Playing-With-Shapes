package com.exception_handeling;

public class AgeOutOfRangeException extends  Exception{
    public  AgeOutOfRangeException(int age){
    super("You are older than the requested age (25 years), you are "+age+"!!!");
    }
}
