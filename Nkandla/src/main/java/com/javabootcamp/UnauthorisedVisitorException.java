package com.javabootcamp;

public class UnauthorisedVisitorException extends Exception
{
    public UnauthorisedVisitorException(){}
           
    public UnauthorisedVisitorException(String message) 
    {
       super(message);
    }
}
