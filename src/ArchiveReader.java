import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ArchiveReader {
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
                        String[] momentaneo = line.split(": ");
                        fields[index] = momentaneo[1];

                        index++;
                        if (index == 8) {
                            Messages messages = new Messages(fields[0], fields[0], fields[0], fields[0], fields[0],
                                    fields[0], fields[0], fields[0]);
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