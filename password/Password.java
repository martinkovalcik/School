package sk.itsovy.kovalcik.password;

import java.util.Random;

public class Password {
    public String randomCapitalPassword(){

        String pass="";
        Random rnd=new Random();
        int i =0;
        while(i<8){
            char z= (char)(rnd.nextInt(26)+65);
            pass+=z;
            i++;
        }
        return pass;
    }

    public String randomCapitalPassword(int length){

        String pass="";
        Random rnd=new Random();
        int i =0;
        while(i<length){
            char z= (char)(rnd.nextInt(26)+65);
            pass+=z;
            i++;
        }
        return pass;
    }

    public static String randomPassword(){
        String pass="";
        Random rnd=new Random();
        int i=0;
        while (i<10){
            int generating=(int)(rnd.nextInt(2)+0);
            switch (generating){
                case 0: int a=(int)(rnd.nextInt(9)+0);
                        pass=pass+a;
                        break;
                case 1: char b=(char)(rnd.nextInt(26)+65);
                        pass=pass+b;
                        break;
                case 2: char c=(char)(rnd.nextInt(26)+97);
                        pass=pass+c;
                        break;
                default:continue;
            }
        }
        return pass;
    }


    public static void main(String[] args) {
        randomPassword();
        System.out.println("skap");
    }
}
