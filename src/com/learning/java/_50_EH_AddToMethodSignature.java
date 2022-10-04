/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium Java Test Framework & Best Practices - Masterclass (https://www.udemy.com/course/selenium-java-test-framework/)
 * Tutor: Omprakash Chavan (https://www.udemy.com/user/omprakash-chavan/)
 */
/***************************************************/

package com.learning.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class _50_EH_AddToMethodSignature {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("./SomePath");

        // java.io.FileNotFoundException -> Compile Time Exception
        FileReader fileReader = new FileReader(file);

    }//main
}// class





