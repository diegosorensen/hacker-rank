//
//import java.util.*;
//import org.junit.*;
//
///* Permutation Problem
//        * Problem Statement:
//        * Given a collection of numbers, nums, that might contain duplicates,
//        * return all possible unique permutations in any order. Test your solution using the 2 methods provided.
//        Example 1:
//        Input: nums = [1,1,2]
//        Output:
//        [[1,1,2],
//        [1,2,1],
//        [2,1,1]]
//        Example 2:
//        Input: nums = [1,2,3]
//        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//        Constraints:
//        1 <= nums.length <= 8
//*/
//
//public class SolutionPaypal {
//    @Test
//    public void testHappy() {
////TODO: Add a positive test case
//    }
//    @Test
//    public void testUnhappy() {
////TODO: Add a negative test case
//    }
//
//
//    public static void main(String[] args) {
//        SolutionPaypal s = new SolutionPaypal();
//        System.out.println(s.permuteUnique(new int[]{1, 2, 3}));
//    }
//
//
//    public List<List<Integer>> permuteUnique(int[] nums) {
//
//        List<List<Integer>> result = new ArrayList<>();
//        //Write your code Here
//
//        List<Integer> firstlist = new ArrayList<>();
//
//        if (1 <= nums.length && nums.length>=8 )
//
//        {
//            if (nums.length ==1)
//            {
//               // List<Integer> firstlist = new ArrayList<>();
//                firstlist.add(nums[0]);
//                result.add(firstlist);
//            }
//            else if (nums.length ==2)
//            {
//                // 1.2   1.2  y 2.1
//               firstlist.add(nums[0]);
//               firstlist.add(nums[1]);
//               result.add(firstlist);
//
//
//                firstlist.add(nums[1]);
//                firstlist.add(nums[0]);
//
//              if ( result.contains(firstlist.lastIndexOf()) > 0)
//
//
//            }
//
//
//
//        }
//
//
//
//        return result;
//    }
//}
