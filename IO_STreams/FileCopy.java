import java.io.*;
public class FileCopy {
    public static void main(String[] args) throws IOException {
     File inputFile=new File("Source.txt");
     File outputFile =new File("Destination.txt");
     FileInputStream fis = new FileInputStream(inputFile);
     FileOutputStream fos = new FileOutputStream(outputFile);
     int c;
     while((c=fis.read())!=-1){
        fos.write(c);
     }
     fis.close();
     fos.close();
    }
}
