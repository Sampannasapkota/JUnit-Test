package org.example;

public class Practice1 {

   public int divide(int x, int y){
       if(x>y && y!=0){
           return x/y;
       }
       else {
           throw new RuntimeException("Error!");
       }
       }

   }

