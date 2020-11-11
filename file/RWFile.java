package sk.itsovy.kovalcik.file;

import java.io.*;


public class RWFile {
    public void copyFileWithCapital(String fileName) {
        BufferedReader reader;

        try {
            if (new File(fileName).exists()==false){
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
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    private String getFileName(char prefix){
        String name;
        //zmena, vyhenerovat správny názov.
        name=prefix+"b_.txt"; //nastaviť na automatický čas. b_221054.txt
        return name;


    }

    public void copyAndEncriptFile(String fileName){
        // C_hhmmss

        // ahoj + 3 znaky
        //koduju sa len pismena a cislice (z->c , 7->0, Y->B, !->!
        // vstup -> line -> char[]-> zmena/posun -> string -> zapis
    }
}
