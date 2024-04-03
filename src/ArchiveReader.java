import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ArchiveReader { 
    public static void ReadFile() {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("C:/Users/grafi/Desktop/Telegram Data/telegram-datasearch/docs/telegram_corpus.txt"));
            String line =  bf.readLine();
            while(line != null){
                line = bf.readLine();
                String [] fields = line.split(":");
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
 }