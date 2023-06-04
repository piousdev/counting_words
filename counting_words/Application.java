package counting_words;

import java.nio.file.*;
import java.io.*;
import java.util.Map;
import java.util.stream.Stream;

/**
 * The Application class is responsible for reading a file and displaying the word frequencies.
 */
public class Application {
    private static final String FILE_PATH = "counting_words/resources/philosophy_of_programing.txt";
    private final WordCounter wordCounter;

    public Application() {
        this.wordCounter = new WordCounter();
    }

    /**
     * Reads a file and processes each line to count word frequencies.
     *
     * @throws IOException if an error occurs during file processing
     */
    private void processFile() throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(Application.FILE_PATH))) {
            lines.forEach(wordCounter::processLine);
        }
    }

    /**
     * Prints the word frequencies in a sorted tabular format.
     */
    private void printWordFrequencies() {
        Map<String, Integer> frequencies = wordCounter.getWordFrequencies();
        frequencies.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.printf("%-20s %d%n", entry.getKey(), entry.getValue()));
    }

    public static void main(String[] args) {
        try {
            Application app = new Application();
            app.processFile();
            app.printWordFrequencies();
            System.out.println("Most frequent word: " + app.wordCounter.getMostFrequentWord());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}