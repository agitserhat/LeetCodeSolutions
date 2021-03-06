/*
Goal Parser Interpretation

You own a Goal Parser that can interpret a string command.
The command consists of an alphabet of "G", "()" and/or "(al)" in some order. 
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". 
The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.


Example 1:
Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".


Example 2:
Input: command = "G()()()()(al)"
Output: "Gooooal"
 */


class Solution {
    public String interpret(String command) {
StringBuilder stryapici = new StringBuilder();

         
            for (int i = 0; i < command.length(); i++) {
                if (command.charAt(i)=='G') {
                    stryapici.append("G");
                }
                if (command.charAt(i)=='(' && command.charAt(i+1)==')') {
                    stryapici.append("o");

                }
                
                if (command.charAt(i)=='(' && command.charAt(i+1)=='a'&& command.charAt(i+2)=='l'&& command.charAt(i+3)==')') {
                    stryapici.append("al");
                }
        }
        
        return stryapici.toString();
        
    }
}