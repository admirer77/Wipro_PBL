import java.io.IOException;
import java.io.File;
import java.io.FileReader;

public class Copy {
 public static void main(String[] args) throws IOException {
    
    File inputFile = new File("Source.txt");
    FileReader in =new FileReader(inputFile);
    int c;
    int m=0;
    while ((c=in.read())!=-1){
        if (c==114){
            m+=1;
        }

    }
    System.out.println("The number of r's are: "+m);
 }   
}
