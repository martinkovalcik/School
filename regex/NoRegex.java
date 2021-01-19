package sk.itsovy.kovalcik.regex;

public class NoRegex {
    public boolean isValidSPZ(String text){
        if(text==null)
            return false;

        text=text.toUpperCase();

        if (text.length()!=7)
            return false;

        for (int i=0;i<=1;i++)
            if (!Character.isAlphabetic(text.charAt(i)))
                return false;


            for(int i=2;i<=6;i++)
                if (!Character.isLetterOrDigit(text.charAt(i)))
                    return false;

                return true;
    }
}
