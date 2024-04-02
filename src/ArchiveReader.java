import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ArchiveReader { 
    public void ReadFile() {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("./docs/telegram_corpus.txt"));
            String line =  bf.readLine();
            while(line != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
 }