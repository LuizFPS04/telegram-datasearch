import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Classe "main". Classe principal, responável pela execução de todo o programa.
 */

public class Main {
    /**
     * Método responsável por realizar a execução. Solicita a classe "ArchiveReader"
     * a realizar o método "ReadFile"
     */
    public static void main(String[] args) {
        System.out.println("Telegram Dataset Project");
        ArchiveReader.ReadFile();
    }
}