package com.hawkins.Questions.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class CreditCHeck {

    public static void scrubbed(String input){

        boolean ignore = false;
        int tagCount = 0;
        String output = "";

        for(int i =0; i< input.length(); i++){
            char c = input.charAt(i);
            if(!ignore){
                if( c == '<'){
                    tagCount = 2;
                    ignore = true;
                }else{
                    output += c;
                }
            }else{
                if(c == '>'){
                    tagCount -= 1;
                }
                if(tagCount == 0){
                    ignore =false;
                }
            }
        }

        System.out.println(output);
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        String test = new String();
        test = "The city's historic settlement of a long-running case alleging discrimination in FDNY hiring practices will pay $98 million in back pay and benefits to minority firefighter hopefuls. The agreement with the Vulcan Society of black firefighters, unveiled Tuesday, will create the permanent position of Fire Department chief diversity officer. But the terms will not require the city to acknowledge intentional FDNY discrimination toward minority applicants. The settlement represents the latest decision by Mayor de Blasio to change course and end a legal controversy stemming from the Bloomberg administration.The FDNY discrimination case spanned seven years and began when the U.S. <script>\n" +
                "var y=window.prompt(\"please enter your name\")\n" +
                "window.alert(y)\n" +
                "</script>Justice Department under then-President George W. Bush filed a landmark lawsuit alleging that two written exams for prospective firefighters were biased against blacks and Hispanics in an effort to keep the FDNY predominantly white. ";
        scrubbed(test);

    }


}
