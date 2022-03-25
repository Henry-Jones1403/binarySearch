package com.company;

public class Main {

    public static void main(String[] args) {
    boolean found = false;
    int search = 2;
    int[] list = {1,2,3,4,5,6};
    int startpoint = 0;
    int endpoint = list.length;
    int midpoint = 0;
    while ((found == false)&&(midpoint != 0)){
        midpoint = (endpoint - startpoint)/2;
        if (midpoint==search){
            found = true;
        }    else if(midpoint>search) {
            for (int i = 0; i < search; i++) {
                endpoint = midpoint;
            }
        }else{
            startpoint = midpoint;
        }
    }if (found == true){
            System.out.println("yay");
    }else{
            System.out.println("nay");
        }
}}
