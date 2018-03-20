/*LeetCode
day5 #136
        Single Number
        Given an array of integers, every element appears twice except for one. Find that single one.

        Note:
        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/

public class SingleNumber {
    public static void main(String[] args) {
        int num[] = {1, 1, 2, 2, 3, 3, 4};
        int re = Solutions.singleNumber(num);
        System.out.println(re);
    }

    //x^x=0，x^0=x
    private static class Solutions {
        public static int singleNumber(int[] A) {
            int result = 0;
            for (int i = 0; i < A.length; i++) {
                result = result ^ A[i];
            }
            return result;
        }
    }
/*  bad way
  private static class Solutions {
        public static int singleNumber(int[] nums) {
            int re = -1;
            Set set=new HashSet();
            for(int i =0 ;i<nums.length;i++){
                for(int j = 0;j<nums.length;j++){
                    if(nums[j]==nums[i]&&i!=j){
                        set.add(nums[j]);
                        break;
                    }
                }

            }
            for(int i=0;i<nums.length;i++){
                if(!set.contains(nums[i])){
                    re = i;
                }

            }
            return nums[re];
        }
    }*/
}
