package sk.itsovy.kovalcik.projectshop.util;

public class Util {
    public static double convertEuroToSkk(double value){
        return value*30.106;
    }

    public static String formatPrice(double price){
        double result = Math.round(price*100)/100.0;
        String ret = String.valueOf(result);
        return ret;
    }
}
