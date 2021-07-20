package com.example.demo.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;

@Service
public class emailChecker {

    static String regex = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";

    public static boolean isValidEmail(String email){ 
       
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email); 
   
    }
}



    

        


    
    


