package workbook3.fileio;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) throws IOException {
        try {
            // create a FileReader object connected to the file
            FileReader fileReader = new FileReader("poem.txt");

            // create a BufferedReader to manage the input stream
            BufferedReader bufReader = new BufferedReader(fileReader);

            // This is a shorter verison but the file reader and buffer reader is clearer:
            // BufferedReader bufReader = new BufferedReader(new FileReader("poem.txt"));

            //empty word so it prints the file
            String input;

            // read until there is no more data
            while ((input = bufReader.readLine()) != null) {
                System.out.println(input);
                System.out.println("Chicken");
            }

            // close the stream and release the resources
            bufReader.close();
        } catch (IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();


        }
        try {
            // open the file (use new FileWriter("skills.txt", true) to append)
            FileWriter writer = new FileWriter("skills.txt");

            // write to the file
            writer.write("I wanna be a software devolper to make video games\n");
            writer.write("I also want to be able to make a decent income\n");
            writer.write("I want to see a story line I created in a app come to life\n");
            writer.write("I want to make a add blocker app\n");
            writer.write("I want to make an auto translator app to read book from other languages into english\n");

            // close the file when you are finished using it
            writer.close();

            // you can't print a try without the catch you probably could without the try but notin this case.

        } catch (IOException e) {
            System.out.println("ERROR: An unexpected error occurred");
            e.printStackTrace();

        }
        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);

        LocalTime currentTime = LocalTime.now();
        System.out.println("The current time is: " + currentTime);

        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Right now, it is: " + rightNow);
        LocalDate date = LocalDate.now();
        System.out.println("Day of Week: " + date.getDayOfWeek());
        System.out.println("Day of Month: " + date.getDayOfMonth());
        System.out.println("Day of Year: " + date.getDayOfYear());
        System.out.println("Month Name: " + date.getMonth());
        System.out.println("Month Value: " + date.getMonthValue());
        System.out.println("Year: " + date.getYear());

        LocalTime time = LocalTime.now();
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
        System.out.println("Nanosecond: " + time.getNano());


        {
            // open the file (use new FileWriter("skills.txt", true) to append)
            FileWriter writer = new FileWriter("Myreasons" + "  " + date.getDayOfWeek() + " " + date.getDayOfMonth() + " of " + date.getMonth() + " " + date.getYear()+ ".txt");
            writer.close();




        }
        File folder = new File("2026-10");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        File image = new File(folder, "zoom_screenshot.png");

        System.out.println(image.getPath());




    }
}







