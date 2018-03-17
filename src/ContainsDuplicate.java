/*LeetCode
day4 #217
Contains Duplicate
        Given an array of integers, find if the array contains any duplicates.
        Your function should return true if any value appears at least twice in the array,
                and it should return false if every element is distinct.
*/

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /*//bad way
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            boolean flag= false;
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(j==i){
                        j++;
                    }else if(nums[j]==nums[i]){
                        flag= true;
                    }
                }
            }
            return flag;
        }
    }*/
//1
    public class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (Integer num : nums) set.add(num);
            return !(set.size() == nums.length);
        }
    }

    //2
   /* public class Solution {

        public boolean containsDuplicate(int[] nums) {

            // 元素个数大于1才进行下面的操作
            if (nums != null && nums.length > 1) {
                //创建一个hashSet
                Set<Integer> set = new HashSet<>(nums.length);
                for(int i : nums) {
                    // 如果元素已经存在就返回true
                    if (set.contains(i)) {
                        return true;
                    }
                    // 没有就添加到元素集合中
                    else {
                        set.add(i);
                    }
                }
            }

            return false;
        }
    }*/
}
