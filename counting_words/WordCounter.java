package counting_words;

import java.util.*;
import org.jetbrains.annotations.NotNull;

/**
 * WordCounter class is responsible for counting the frequency of words in a given text.
 */
public class WordCounter {
    private final Map<String, Integer> wordFrequencies = new HashMap<>();

    /**
     * Processes a line of text, updating the word frequency map.
     *
     * @param line the line of text to process
     */
    void processLine(@NotNull String line) {
        String[] words = line.toLowerCase().split("\\W+");
        countWords(words);
    }

    /**
     * Updates the word frequency map for the given words.
     *
     * @param words an array of words to count
     */
    private void countWords(@NotNull String @NotNull [] words) {
        for (String word : words) {
            wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
        }
    }

    /**
     * Returns the word with the highest frequency.
     *
     * @return the word with the highest frequency, or null if no words have been processed
     */
    public String getMostFrequentWord() {
        return wordFrequencies.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    /**
     * Returns an unmodifiable view of the word frequency map.
     *
     * @return an unmodifiable view of the word frequency map
     */
    public Map<String, Integer> getWordFrequencies() {
        return Collections.unmodifiableMap(wordFrequencies);
    }
}