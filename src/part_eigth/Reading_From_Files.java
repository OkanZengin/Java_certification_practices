package part_eigth;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reading_From_Files {

	public static void main(String[] args) throws FileNotFoundException {
		File test_file = new File("./files/test_to_practice.txt");
		Scanner user_input;
		try {
			user_input = new Scanner(test_file);
			while (user_input.hasNextLine()) {
				String file_lines = user_input.nextLine();
				System.out.println(file_lines);
			}
			user_input.close();

		} catch (FileNotFoundException e) {
			System.out.println("Couldn't find the file..");
		}

		Scanner user_inputs_to_add_file = new Scanner(System.in);
		FileWriter writeToFile;

		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Enter " + i + ".line: ");
				String inputs_to_add_file = user_inputs_to_add_file.nextLine();
				writeToFile = new FileWriter(test_file, true);
				BufferedWriter bufferedwriter = new BufferedWriter(writeToFile);
				bufferedwriter.write(inputs_to_add_file);
				bufferedwriter.newLine();
				bufferedwriter.close();
			} catch (IOException e) {
				System.out.println("something went wrong");
			}

		}

		user_inputs_to_add_file.close(); // Close the scanner for user inputs

        // Reading and printing accumulated lines side by side
        try {
            Scanner input2 = new Scanner(test_file);
            StringBuilder combinedLines = new StringBuilder(); // To accumulate lines side by side

            while (input2.hasNextLine()) {
                String line = input2.nextLine();
                combinedLines.append(line).append(" "); // Add a space between lines
            }
            input2.close(); // Close the scanner for file reading

            System.out.println("Combined lines:");
            System.out.println(combinedLines.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file..");
        }
    }
}
