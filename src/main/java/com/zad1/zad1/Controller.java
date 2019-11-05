package com.zad1.zad1;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Http request handler class
 */
@RestController
public class Controller {

    /**
     * Method get some string and returns that string, count upper letters, lower letters, numbers and special characters in response
     *
     * @param someString from request.
     * @return Details class in json format
     */
    @RequestMapping("/getDetails/{someString}")
    public Details getDetailsAboutString(@PathVariable String someString) {
        Details response = new Details(someString);
        response.setNumberOfLowerLetters(someString.chars().filter(Character::isLowerCase).count());
        response.setNumberOfUpperLetters(someString.chars().filter(Character::isUpperCase).count());
        response.setNumberOfNumbers(someString.chars().filter(Character::isDigit).count());
        response.setNumberOfSpecialCharacters(someString.length() - response.getNumberOfLowerLetters() - response.getNumberOfNumbers() - response.getNumberOfUpperLetters());
        return response;
    }


}
