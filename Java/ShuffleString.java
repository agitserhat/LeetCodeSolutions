
import java.util.ArrayList;

/*
Shuffle String

Given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith 
position moves to indices[i] in the shuffled string.
Return the shuffled string.


Example 1:
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.


Example 2:
Input: s = "aiohn", indices = [3,1,4,2,0]
Output: "nihao"
 */

class Solution {
    public String restoreString(String s, int[] indices) {
         String delim="";
        ArrayList list = new ArrayList();
        
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<indices.length;j++){
                if(i==indices[j]){
                    list.add(s.charAt(j));
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<list.size()-1){
            sb.append(list.get(i));
            sb.append(delim);
            i++;
        }
        sb.append(list.get(i));
        String res = sb.toString();
        
        
        
        return res;
    }
}