import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
/**
 * 
 * Classe responsável para leitura do arquivo .TXT
 * 
 */

public class ArchiveReader {
    /**
     * Método responsável por separar o arquivo linha a linha e separá-lo em um
     * vetor
     */
    public static void ReadFile() {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(
                    "docs/telegram_corpus.txt"));
            String line = bf.readLine();
            String[] fields = new String[8];

            int index = 0;
            while (line != null) {
                if (line.matches("[a-zA-Z\\s{},]+")) {
                    line = bf.readLine();
                } else {
                    if (line.matches(".*[\\[\\]].*")) {
                        line = bf.readLine();
                    } else {
                        line = line.replaceAll("\"", "");
                        String[] moment = line.split(": ");
                        fields[index] = moment[1];

                        index++;
                        if (index == 8) {
                            Messages messages = new Messages(fields[0], fields[1], fields[2], fields[3], fields[4],
                                    fields[5], fields[6], fields[7]);
                            messages.showAll();
                            index = 0;
                            System.out.println("==============================");
                        }
                        line = bf.readLine();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}