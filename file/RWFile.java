package sk.itsovy.kovalcik.file;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class RWFile {

    public static void main(String[] args) {
        RWFile rwFile = new RWFile();
        rwFile.copyFileWithCapital("resource/a.txt");
        rwFile.copyAndEncryptFile(rwFile.getFileName('b'),1);
    }
    public void copyFileWithCapital(String fileName) {
        BufferedReader reader;

        try {
            if (!new File(fileName).exists()){
                System.out.println("Problem : File "+fileName+ " doesn´t exist!");
                return;
            }
            FileReader fr= new FileReader(fileName);
            File file = new File(getFileName('b'));
            file.createNewFile();
            FileWriter fw = new FileWriter(getFileName('b'));
            reader=new BufferedReader(fr);
            String line;
            while ((line=reader.readLine())!=null){
                line=line.toUpperCase();
                System.out.println(line);
                fw.write(line+'\n');
            }
            fr.close();
            fw.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    private String getFileName(char prefix){
        String name;
        //zmena, vyhenerovat správny názov.
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        Date date = new Date();
        String time = formatter.format(date);

        name=prefix+"_"+ time + ".txt"; //nastaviť na automatický čas. b_221054.txt
        return name;


    }

    public void copyAndEncryptFile(String source, int offset){
        // E_hhmmss

        // ahoj + 3 znaky
        //koduju sa len pismena a cislice (z->c , 7->0, Y->B, !->!
        // vstup -> line -> char[]-> zmena/posun -> string -> zapis
        try {
            if (!new File(source).exists()) {
                System.out.println("Problem : File " + source + " doesn't exist!");
                return;
            }

            String target = getFileName((char) ('b' + offset));
            File myFile = new File(source);
            File otherFile = new File(target);
            FileWriter write = new FileWriter(target);
            FileReader fr = new FileReader(source);
            BufferedReader read = new BufferedReader(fr);
            String line;

            while ((line=read.readLine()) != null){
                for (int i = 0; i < line.length(); i++) {
                    char letter = line.charAt(i);

                    if (letter >= '1' && letter <= '9') { // 123
                        letter = (char) (letter + offset);
                        if (letter > '9') {
                            letter = (char) (letter - 10);
                        }
                    }
                    if (letter >= 'A' && letter <= 'Z') { // ABC
                        letter = (char) (letter + offset);
                        if (letter > 'Z') {
                            letter = (char) (letter - 26);
                        }
                    }
                    if (letter >= 'a' && letter <= 'z') { //abc
                        letter = (char) (letter + offset);
                        if (letter > 'z') {
                            letter = (char) (letter - 26);
                        }
                    }
                    write.write(letter);
                }
                write.write("\n");
            }

            read.close();
            write.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
