package com.example;
 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

 
public class Fileio
{
    @SuppressWarnings("resource")
    public static void main( String[] args )
    {
        File f= new File("names1.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
            //f.deleteOnExit();
            writer.write("gopal writer done");
            System.out.println("File written successfully!");
 
 
            // Scanner sc = new Scanner(f);
            // while (sc.hasNextLine()) {
            //     System.out.println(sc.nextLine());
               
            // }
            //sc.close();
        } catch (Exception e) {
           System.out.println("file not found");
        }
    }
}
 