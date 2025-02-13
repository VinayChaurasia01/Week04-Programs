package filehandling.file_reader;

import java.io.*;

public class ReadLargeFile {
    /*public static void generateFile(String str,long size){

        String text="This is text line error. ";
        long targetSize = size * 1024 * 1024;
        int currentSize=0;

        try(BufferedWriter writer=new BufferedWriter(new FileWriter(str))) {

            while (currentSize < targetSize) {
                writer.write(text);
                currentSize += text.length();
            }


        }catch (Exception e){
            System.out.println("FileWriting error");
        }
    }*/

    public static void main(String[] args) {
        //generateFile("500MB_File" , 500);
        String filePath = "500MB_File"; // Specify the large file path

        // Use try-with-resources to ensure automatic resource management
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Lines containing 'error':\n");

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Check if the line contains "error" (case insensitive)
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            // Handle file-related exceptions
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
