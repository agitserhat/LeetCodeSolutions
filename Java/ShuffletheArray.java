
import java.util.ArrayList;

/*
Shuffle the Array
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList list3 = new ArrayList();
        
        //Dizinin ilk kýsmýný listeye ekledim
        for(int h=n;h<nums.length;h++){
            list.add(nums[h]);
        }
        //Dizinin ikinci kýsmýný ikinci listeye ekledim
        for(int h=0;h<n;h++){
            list2.add(nums[h]);
        }
        
        //Liste3 e önceki iki diziyi istenilen þekilde sýralanacak þekilde ekledim.
        for(int i=0;i<1;i++){
            for(int j=0;j<n;j++){
                list3.add((int)list2.get(j));
                list3.add((int)list.get(j));
            }
        }
        
        //return deðerinin dizi olmasý için listeyi diziye çevirdim.
        int[] array = new int[list3.size()];
        for(int i = 0; i < list3.size(); i++) {
            array[i] = (int)list3.get(i);
        }
        return array;
    }
}