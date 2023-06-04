# Word Frequency Counter

This project offers a Java-based solution for computing the occurrence of words in a text file and determining the word that is used the most often. The project follows clean coding standards, resulting in a solution that is readily comprehensible, manageable, and testable.

## Getting Started

Before you start this project, you must have Java installed on your computer. If you don't already have Java, you can download it from the [official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

## Project Structure

The project is structured into two main classes:

1. `WordCounter`: This class is responsible for processing a line of text and updating the word frequency map.
2. `Application`: This class is responsible for reading a file, processing each line to count word frequencies, and displaying the word frequencies.

## How to Run

Compile and run the `Application` class. The application reads a file located at `counting_words/resources/philosophy_of_programing.txt` and prints the word frequencies and the most frequent word.

You can run the application from your terminal with the following command:

```bash
javac Application.java
java Application
```

Alternatively, you may use any Java-compatible IDE like IntelliJ by Jetbrains or code editor, such as VSCode.

## Output

The output of the application will be a list of words along with their frequencies, sorted alphabetically. The last line of the output will display the most frequently used word in the text file.

## Error Handling

The application is designed to handle `IOException`. If an `IOException` is thrown during the processing of the file, the application will print a stack trace to help diagnose the problem.

## Useful Vocabulary I learned

- **Class**: A class in Java is a blueprint or template that defines the properties and behaviors of objects— an object in simple terms can be anything, an entity. In this case a WordCounter and an application (computer program) to run (show or display) this WordCounter.

- **Map**: In the context of java, a map is a data structure that holds information in key-value pairs. It functions similarly to a dictionary in that you may search up a word (the key) and get its meaning or frequency (the value). The map is used in this instance to keep track of how many times each word occurs in a line of text. As a result, anytime a new word is encountered, the map is updated to include it in the count.

- **IOException**: This is an exception class that represents an input/output (IO) error, such as a failure in reading or writing data.

- **Stack Trace**: A stack trace is a list of method calls that shows the sequence of execution leading up to an exception or error, like an evidence log.


## Contributing

Contributions are welcome! Please feel free to submit a pull request.

## License

This project is licensed under the terms of the MIT license.

*This is a re-upload version of my class exercise from BeCode*
