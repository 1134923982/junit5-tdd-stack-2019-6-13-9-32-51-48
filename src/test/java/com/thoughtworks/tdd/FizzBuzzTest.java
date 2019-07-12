package com.thoughtworks.tdd;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FizzBuzzTest {
    @Test
    public void should_return_1_when_studen_is_1(){
    int student = 1;
    FizzBuzz fizzeBuzz = new FizzBuzz();

    String result = fizzeBuzz.say(student);
    assertThat(result, is("1"));
    }
    @Test
    public void should_return_2_when_studen_is_2(){
        int student = 2;
        FizzBuzz fizzeBuzz = new FizzBuzz();

        String result = fizzeBuzz.say(student);
        assertThat(result, is("2"));
    }
    @Test
    public void should_return_Fizz_when_studen_is_3(){
        int student = 3;
        FizzBuzz fizzeBuzz = new FizzBuzz();

        String result = fizzeBuzz.say(student);
        assertThat(result, is("Fizz"));
    }
    @Test
    public void should_return_4_when_studen_is_4(){
        int student = 4;
        FizzBuzz fizzeBuzz = new FizzBuzz();

        String result = fizzeBuzz.say(student);
        assertThat(result, is("4"));
    }
    @Test
    public void should_return_Buzz_when_studen_is_5(){
        int student = 5;
        FizzBuzz fizzeBuzz = new FizzBuzz();

        String result = fizzeBuzz.say(student);
        assertThat(result, is("Buzz"));
    }
    @Test
    public void should_return_Fizz_when_studen_is_6(){
        int student = 6;
        FizzBuzz fizzeBuzz = new FizzBuzz();

        String result = fizzeBuzz.say(student);
        assertThat(result, is("Fizz"));
    }
    @Test
    public void should_return_6_when_studen_is_6(){
        int student = 6;
        FizzBuzz fizzeBuzz = new FizzBuzz();

        String result = fizzeBuzz.say(student);
        assertThat(result, is("Fizz"));
    }
    @Test
    public void should_return_Whizz_when_studen_is_7(){
        int student = 7;
        FizzBuzz fizzeBuzz = new FizzBuzz();

        String result = fizzeBuzz.say(student);
        assertThat(result, is("Whizz"));
    }
    @Test
    public void should_return_FizzBuzz_when_studen_is_15(){
        int student = 15;
        FizzBuzz fizzeBuzz = new FizzBuzz();

        String result = fizzeBuzz.say(student);
        assertThat(result, is("FizzBuzz"));
    }
    @Test
    public void should_return_FizzBuzz_when_studen_is_21(){
        int student = 21;
        FizzBuzz fizzeBuzz = new FizzBuzz();

        String result = fizzeBuzz.say(student);
        assertThat(result, is("FizzWhizz"));
    }
    @Test
    public void should_return_FizzBuzzWhizz_when_studen_is_105(){
        int student = 105;
        FizzBuzz fizzeBuzz = new FizzBuzz();

        String result = fizzeBuzz.say(student);
        assertThat(result, is("FizzBuzzWhizz"));
    }
}



