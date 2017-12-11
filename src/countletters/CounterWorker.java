package countletters;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author vasilhs12
 */

//Create a Runnable
public class CounterWorker implements Runnable{


        ArrayList<String> list ; // creates a list
        private int sumOfLetters = 0;

        //It takes as arguments by cunstractor the list of words which containing in the file
        public CounterWorker( ArrayList<String> list ) throws IOException {
                this.list = list;
        }


        //for each word in the list counts, through a function, how many characters have any word
        //the results of the function for each word it adds to a variable
        @Override
        public void run() {
                for (int i=0; i<list.size(); i++) {
                        sumOfLetters += countLetters(list.get(i));
                }
        }

        //gets as arguments a word and returns how many characters have
        private static int countLetters(String input) {
                int lettersCount = 0;

                for (int i = 0; i < input.length(); i++) {
                        char ch = input.charAt(i);
                        if (Character.isLetter(ch) ) {
                                lettersCount++;
                        }
                }

                return lettersCount;
        }

        public int getSumOfLetters () {
                return sumOfLetters;
        }

}