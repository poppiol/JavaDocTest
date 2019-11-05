package com.zad1.zad1;

import lombok.*;

/**
 * Class contains details about some string which is set in constructor
 * Details: someString, numberOf: UpperLetters, LowerLetters, Numbers, SpecialCharacters
 */
@Data
public class Details {

    private final String someString;
    private long numberOfUpperLetters;
    private long numberOfLowerLetters;
    private long numberOfNumbers;
    private long numberOfSpecialCharacters;

    /**
     * Constructor with one parameter
     * @param someString to check
     */
    public Details(String someString) {
        this.someString = someString;
    }

}
