package PR1_Ver2.day6;

import java.io.*;
public class goon
{
    public static boolean found = false; // track if word appears at least once

    public static void searchWordInDirectory(String directory, String word) throws IOException {
        File dir = new File(directory);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Directory not found!");
            return;
        }

        File[] files = dir.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                // recursive call
                searchWordInDirectory(file.getAbsolutePath(), word);
            } else {
                searchInFile(file, word);
            }
        }
    }

    private static void searchInFile(File file, String word) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int lineNumber = 0;

        while ((line = br.readLine()) != null) {
            lineNumber++;
            if (line.contains(word)) {
                found = true;
                System.out.println("Found in " + file.getPath() + " at line " + lineNumber);
            }
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the word: ");
        String word = input.readLine();

        String directory = "."; // current folder
        searchWordInDirectory(directory, word);

        if (!found) {
            System.out.println("\"" + word + "\" is not found in this directory!");
        }
    }
}

