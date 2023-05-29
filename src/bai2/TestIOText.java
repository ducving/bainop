package bai2;

import java.io.*;
import java.util.Arrays;

public class TestIOText {
    String []arraySong={"Hello califonia \n We don’t talk any more \n Nắng ấm xa dần \nEm của ngày hôm qua \n Thất tình"};
    public boolean writeDataToFileWithFileReader(){
        try {
            FileWriter fileWriter=new FileWriter("list_song.txt");
            fileWriter.write(Arrays.toString(arraySong));
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        } return true;
    }
    public boolean readDataToFileWithFileReader(){
        try {
            FileReader fileReader=new FileReader("list_song.txt");
            int read=fileReader.read();
            while (read!=-1){
                System.out.print((char)read);
                read = fileReader.read();
            } fileReader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

     return true;
    }
    public static void main(String[] args) {
        TestIOText testIOText=new TestIOText();
        testIOText.writeDataToFileWithFileReader();
        testIOText.readDataToFileWithFileReader();
        try {
            File file=new File("list_song.txt");
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
