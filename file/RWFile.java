package sk.itsovy.kovalcik.file;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;


public class RWFile {
    public void copyFileWithCapital(String fileName) {
        BufferedReader reader;
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        try {
            FileReader fr= new FileReader(fileName);
            File file = new File(getFileName());
            file.createNewFile();
            FileWriter fw = new FileWriter(getFileName());
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

    private String getFileName(){
        String name;
        //zmena, vyhenerovat správny názov.
        name="b_.txt"; //nastaviť na automatický čas.
        return name;


    }
}
