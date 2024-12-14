import java.util.*;

class Duplicate_elements{

    static boolean elements_check(int[] arr){
        //Brute force - time complexity = O(n^2)
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j])
                    return true;
            }
        
        //sorting - time complexity = O(n logn)
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr[i-1])
                return true;
        }

        //hashset - time complexity = O(n)
        Set<Integer> seen = new HashSet<>();
        for(int num : arr){
            if(seen.contains(num))
                return true;
            seen.add(num);
        }

        //Hashset length - time complexity = O(n)
        return Arrays.stream(arr).distinct().count() < arr.length;

        return false;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 3, 2, 7};
        Boolean outcome = elements_check(arr);
        System.out.println(outcome);
    }
}