
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target=6;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int req = target-arr[i];
            if(hashmap.containsKey(req)){
                System.out.println(hashmap.get(req)+", "+ i);
            }else {
                hashmap.put(arr[i],i);
            }

        }
    }
}
