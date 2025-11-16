package String;

public class MergeAlternatively {

    public static void main(String[] args) {

        /*
        You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.



Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
         */

        String word1 = "ab";
        String word2 = "pqrs";

        int l = 0;
        int r = 0;
        StringBuilder ans = new StringBuilder("");
        while (l< word1.length() &&  r < word2.length()){
            ans.append(word1.charAt(l));
            ans.append(word2.charAt(r));

            l++;
            r++;
        }

        while(l < word1.length()){
            ans.append(word1.charAt(l));
            l++;
        }
        while(r < word2.length()){
            ans.append(word2.charAt(r));
            r++;
        }

        System.out.println(ans.toString());
    }
}