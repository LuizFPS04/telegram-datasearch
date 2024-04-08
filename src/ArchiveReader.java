import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ArchiveReader {
    public static void ReadFile() {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(
                    "docs/oi.txt"));
            String line = bf.readLine();
            String[] fields = new String[8];

            int index = 0;

            while (line != null) {
                if (line.matches("[a-zA-Z\\s{},]+")) {
                    line = bf.readLine();
                } else {
                    if (line.matches(".*[\\[\\]].*")) {
                        line = "";
                    }
                    line = line.replaceAll("\"", "");
                    fields = line.split(": ");
 
                    for (String string : fields) {
                        System.out.println(string);

                        index += 1;
                    }

                    line = bf.readLine();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}