import java.lang.System;
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String , Integer> histogramData = new HashMap<>();
        for(char c = 'A'; c <= 'Z'; c++){
            histogramData.put(String.format("%c" , c) , 0);
        }
        for(int i = 0; i < 4; i++){
            String line = scanner.nextLine();
            for(char c = 'A'; c <= 'Z'; c++){
                int prev = histogramData.get(c+"");
                prev += countOccurences(c , line);
                histogramData.put(c+"",prev);
            }
        }
        int max = 0;
        for(char c = 'A'; c <= 'Z'; c++){
            if(histogramData.get(c +"") > max){
                max = histogramData.get(c+"");
            }
        }
        while(max > 0){
            for(char i = 'A'; i <= 'Z'; i++){
               if(histogramData.get(i+"") >= max) {
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            max--;
            System.out.println("");
        }
        for(char c = 'A'; c <= 'Z'; c++){
            System.out.print(c + " ");
        }

    }

    private static int countOccurences(char c , String string){
        int count = 0;
        for(char letter : string.toCharArray()){
            if(letter == c){
               count++;
            }
        }
        return count;
    }

}