import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ArchiveReader {
    public static void ReadFile() {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(
                    "C:/Users/grafi/Desktop/Telegram Data/telegram-datasearch/docs/telegram_corpus.txt"));
            String line = bf.readLine();
            int count = 0;
            while (line != null) {
                if (line == "{" || line == "},") {
                    line = bf.readLine();
                } else {
                    String[] fields = line.split("\": ");
                    // 0 = date 1 = numero 2 = messae 3 = numero
                    for (String string : fields) {
                        System.out.println(string);
                    }

                    count++;
                    if (count == 8) {
                        // 1

                        // reseto array
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}