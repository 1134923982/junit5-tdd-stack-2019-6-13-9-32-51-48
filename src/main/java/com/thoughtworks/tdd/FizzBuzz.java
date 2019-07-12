package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int student){
        String s = "";
        if(student%3==0){
            s+="Fizz";
        }
        if(student%5==0){
            s+="Buzz";
        }
        if(student%7==0){
            s+="Whizz";
        }
        if(s.length()==0){
            s+=student;
        }
        return s;
    }
}
