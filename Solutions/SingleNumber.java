public class Solution {
    public int singleNumber(int[] A) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int temp = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int a : A) {
            if (map.get(a) != null)
                temp -= a;
            else {
                map.put(a, 1);
                temp += a;
            }
        }
        
        return temp;
    }
}