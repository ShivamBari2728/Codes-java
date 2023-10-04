package Java.CustomArrayList;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DefaultSize = 10;
    private int size = 0;
    CustomArrayList()
    {
        this.data = new int[DefaultSize];
    }
    public void add(int vlaue)
    {
        if(Empty())
        {
            resize();
        }
        else
        {
            data[size++]=vlaue;
        }
    }
    private boolean Empty()
    {
        return size==data.length;
    }
    private void resize()
    {
        int[] temp = new int[data.length *2];
        int size2=0;
        for (int element : data){
  
            temp[size] = data[size2];
            size++;
        }
        data = temp;
    }
    public void display()
    {
       System.out.println(Arrays.toString(data));
    }
    public void remove()
    {
        size--;
        data[size]=0;
    }


    
}
