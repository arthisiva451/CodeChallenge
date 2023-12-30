import java.util.*;
class FrequenciesofLimitedRangeArrayElements{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static int[] frequencyCount(int arr[], int N, int P)
    {
        // code here
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<N;i++){
            if(!h.containsKey(arr[i]))
            h.put(arr[i],1);
            else{
                h.put(arr[i],h.get(arr[i])+1);
            }
        }
        for(int i=0;i<N;i++){
            if(!h.containsKey(i+1))
            arr[i]=0;
            else
            arr[i]=h.get(i+1);
        }
        return arr;
       // System.out.println(h);
    }
    public static void main(String[] args) {
        int arr[]={2, 3, 2, 3, 5};
        int n=5;
        int p=5;
        arr=frequencyCount(arr, n, p);
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}