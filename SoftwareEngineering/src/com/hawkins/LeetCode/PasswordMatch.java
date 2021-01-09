package com.hawkins.LeetCode;

public class PasswordMatch {

        public boolean solution(String S) {
            boolean numflag = false;
            boolean lowerCase = false;
            boolean upperCase = false;
            boolean special = false;
            if(S.length() < 6){
                return  false;
            }
            char[] sArray = S.toCharArray();

            for(int i = 0; i < sArray.length; i++){
                if(Character.isUpperCase(sArray[i])){
                    upperCase = true;
                }
                if(Character.isDigit(sArray[i])){
                    numflag = true;
                }
                if(Character.isLowerCase(sArray[i])){
                    lowerCase = true;
                }
                if(!Character.isDigit(sArray[i]) && !Character.isLetter(sArray[i]) && !Character.isWhitespace(sArray[i])){
                    special = true;
                }
            }

            if(numflag && lowerCase && upperCase && special){
                return true;
            }
            return false;
        }
}
