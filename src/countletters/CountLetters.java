
package countletters;

import java.io.*;
import java.util.ArrayList;

public class CountLetters {
    public static void main(String[] args) throws IOException {
        TakeFile modFile = new TakeFile(); //creates an instance of class ModifyFile
        ArrayList<String> lines = new ArrayList<String>(); // creates an arraylist
        lines = modFile.TakeLines(); // initializes the list of words that has the file

        CounterWorker count = new CounterWorker(lines); // creates an instance of class CountLetters

        long startTime = System.nanoTime(); // starts counting the time of execution of the program
//        Thread mThread = new Thread(count); // creates a Thread with the runnable CountLetters
//        mThread.start(); // run the method "run" from class CountLetters

        count.run();


//        while (mThread.isAlive()) { // running until stop the Thread
//        }
        long endTime = System.nanoTime(); // stops counts the time of execution of the program
        long totalTime = endTime - startTime; // count the total time

        System.out.println("The letters is : " + count.getSumOfLetters()); // print the sum of characters
        System.out.println("The total time is : " +totalTime); // print the total time
    }

}
