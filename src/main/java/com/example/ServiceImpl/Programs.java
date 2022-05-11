package com.example.ServiceImpl;

import java.util.ArrayList;

public class Programs {
    public static void main(String args[]){
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        int N = 100;
        for(int i = 2; i <=N; i++) {
            if(isPrime(i) == true){
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);
    }

    public static boolean isPrime(int number){
        for(int i = 2; i < number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}

