package com.company;

public class Array {
    private int[] num;
    private int count;
   public Array(int size){

      num = new int[size];
      count = num.length;

    }

    public void print()
    {
        for(int i = 0; i< num.length;i++)
        {
            System.out.println(num[i]);
        }

    }

    public void insert(int n)
    {
     /*    My method
       for( int i=0;i < count;i++)

       {
            if (num[i] == 0) {
                num[i] = n;
                break;
            }
        }*/

        //if the array is full, resize it
        if(num.length == count) {
            //Create a new array ( Twice the size)
            int[] newItems = new int[count * 2];

            //Copy all the existing items

            for ( int i=0; i<count; i++)
            {
                newItems[i] = num[i];
            }

            //Set items to this new array
            {
                num = newItems;
            }

        }
        //Addition of new item to array
       {
           num[count++] = n;

       }

    }


    public void removeAt(int index)
    {
        //validate the index

        if(index < 0 || index >= count)
        {
            throw new IllegalArgumentException();

        }
        for( int i=index;i < count;i++)
        {
            num[i] = num[i+1];

        }
        count--;
    }
}
