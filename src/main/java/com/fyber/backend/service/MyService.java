package com.fyber.backend.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyService {
    
    public void invoke(String filePath) throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream(filePath);

        System.out.println("fileInputStream.toString() = " + fileInputStream.toString());
        
    }
    
}
