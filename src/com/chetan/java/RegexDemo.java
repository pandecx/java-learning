package com.chetan.java;

import java.util.regex.*;

public class RegexDemo {
    public static void main(String[] args){
        String pattern="[a-z]+";
        String check="Happy Learning! Welcome to Java Learning!";
        Pattern p=Pattern.compile(pattern);
        System.out.println(p);
        Matcher c=p.matcher(check);
        while(c.find()){
            System.out.println(check.substring(c.start(),c.end()));
        }

        String s="I will arrive in 10 minutes , you can reach in to the club before me!!";
        Pattern p1=Pattern.compile("\\bin\\b");
        Matcher c1=p1.matcher(s);
        while (c1.find()){
            System.out.println("pattern found :"+c1.group()+" at"+c1.start());
        }
    }

}
