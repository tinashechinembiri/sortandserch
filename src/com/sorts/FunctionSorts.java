package com.sorts;

public class FunctionSorts implements SortInterface {

    public void quicksort (double [][] data_needed, int Left, int Right, int size  )
    {
        int left = Left; int right = Right;
        double pivot =  data_needed [(left+right)/2] [0];


        while (left <= right)
        {
            while ( new Double(data_needed[left][size]).compareTo(pivot) < 0)
            {
                left ++;
            }
            while ( new Double(data_needed[right][size]).compareTo(pivot)  > 0)
            {
                right --;
            }
            if (left <= right)
            {
                for ( int i = 0; i <= 3; i++) {
                    double temp = data_needed[left][i];
                    data_needed[left][i] = data_needed[right][i];
                    data_needed[right][i] = temp;

                }
                left++;
                right--;
            }

        }
        if (Left< right)
        {
            quicksort(data_needed, Left, right, size);
        }
        if (left < Right)
        {
            quicksort(data_needed, left, Right, size);
        }


    }
}
