/*
 * Wendy Wang 
 * 28 February
 * 
 */

package palindrome;

import javax.swing.JOptionPane;

/**
 *
 * @author wewan5525
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String word, backwardsWord;
        int pos;

        // set up the pop up window and text.
        word = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a words are a palindrome.\n\n"
                + "Enter a phrase (do not inculding a punctuation mark):");
         

        // Reverse the words get text from "", what user type. get it a new name calls backwardsWod
        backwardsWord = "";
        //set backwardsWord is a string 
        String str = backwardsWord;
        // set new string, replace all space from the backwardWord
        String newstr = str.replaceAll(" ", "");
        //set a array. Check the words one by one and kepp going untill this sentence end.
        for (pos = word.length() - 1; pos >= 0; pos--) {
            newstr += word.charAt(pos);
        }

        //Check these words and set the answer.
        if (word.equalsIgnoreCase(newstr)) {
            JOptionPane.showMessageDialog(null, word + " in reverse is " + newstr
                    + ".\nIt IS a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, word + " in reverse is " + newstr
                    + ".\nIt IS NOT a palindrome.");
        }
    
    }
    
}
