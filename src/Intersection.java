import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*LeetCode
day6 #350. Intersection of Two Arrays II
        Given two arrays, write a function to compute their intersection.

        Example:
        Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].*/
public class Intersection {
    public static void main(String[] args) {
        int num1[] = {1, 2, 2};
        int num2[] = {2, 1, 3, 2};
        int[] re = Solution.intersect(num1, num2);
        System.out.println(Arrays.toString(re));
    }


    public static class Solution {
        public static int[] intersect(int[] nums1, int[] nums2) {
            List<Integer> list = new ArrayList<Integer>();
            List<Integer> common = new ArrayList<Integer>();
            for (int i : nums1) {
                list.add(i);
            }
            for (int j : nums2) {
                if (list.contains(j)) {
                    common.add(j);
                    list.remove((Integer) j);
                }
            }
            int[] result = new int[common.size()];
            for (int i = 0; i < common.size(); i++) {
                result[i] = common.get(i);
            }
            return result;
        }
    }
    /*public class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            ArrayList<Integer> result = new ArrayList<Integer>();
            for(int i = 0; i < nums1.length; i++)
            {
                if(map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i])+1);
                else map.put(nums1[i], 1);
            }

            for(int i = 0; i < nums2.length; i++)
            {
                if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
                {
                    result.add(nums2[i]);
                    map.put(nums2[i], map.get(nums2[i])-1);
                }
            }

            int[] r = new int[result.size()];
            for(int i = 0; i < result.size(); i++)
            {
                r[i] = result.get(i);
            }

            return r;
        }
     }*/

}