public class Bubble_Shorting {
    public static void sorting(int[]a)   //main code for bubble sorting...
    {
        int end= a.length-1; 
        boolean swap = false;  
        for(int i=0;i<a.length;i++)
        {
            for (int j=1;j<=end;j++)
            {
                if(a[j]<a[j-1])    //Swap if the number is smaller then previous number...
                {
                    int temp=0;
                    temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    swap = true;
                }
                
            }
            if(!swap)   //break loop of " i " is array is sorted..
            {
                break;
            }
            
        }
        
        System.out.print("Sorted array is :- ");
        
        for(int i =0;i<=a.length-1;i++) //Printing sorted array..
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
    int[] arr={8,2,4,6,7};
    System.out.print("Orignal unsorted array is :- ");
    
    for(int i =0;i<=arr.length-1;i++) //Printing orignal array..
        {
            System.out.print(" "+arr[i]);
        }
    System.out.println();
        
    sorting(arr);
    
}
}

