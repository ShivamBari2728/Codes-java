import java.util.Arrays;

public class MergeShort {
    public static void main(String[] args) {
        int[] arr={5,2,1,8,9,3,0};
        int[] ans = Merge_Short(arr);
        System.out.println(Arrays.toString(ans));
        
    }
//----------Recursive function to devide array in half and run merge function----------

    static int[] Merge_Short(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int midpint = arr.length/2;
        int[] left = Merge_Short(Arrays.copyOfRange(arr, 0, midpint));
        int[] right = Merge_Short(Arrays.copyOfRange(arr, midpint, arr.length));
        return merge(left,right);

    }
//----------Merge finction----------

    static int[] merge(int[]left,int[]right)
    {
        int[] mix = new int[left.length+right.length];
        int left_pointer = 0;
        int right_pointer = 0;
        int mix_pointer = 0;

        while(left_pointer<left.length && right_pointer<right.length)
        {
            if(left[ left_pointer ] < right[ right_pointer ])
            {
                mix[ mix_pointer ] = left[left_pointer];
                left_pointer++;
            }
            else
            {
                mix [ mix_pointer ]= right[ right_pointer ];
                right_pointer++;
            }
            mix_pointer++;
        }
        
    //---When the one of the array is larger then another---

        while(left_pointer<left.length)
        {
            mix[mix_pointer]=left[left_pointer];
            left_pointer++;
            mix_pointer++;
        }
        while(right_pointer<right.length)
        {
            mix[mix_pointer]=right[right_pointer];
            right_pointer++;
            mix_pointer++;
        }

        return mix;
    }
    
}
