package cs520.test;

import cs520.annotation.Test;
import cs520.sort.BubbleSort;

public class BubbleSortTest {

    public static void printArray( int a[] )
    {
        for( int i = 0; i < a.length; ++i )
            System.out.print( a[i] + " " );
        System.out.println();
    }

    @Test(repeat = 3)
    public static boolean test1()
    {
        int a[] = { 4, 5, 1 };

        printArray( a );
        BubbleSort.sort( a );
        printArray( a );

        return a[0] == 1 && a[1] == 4 && a[2] == 5;
    }

    @Test
    public static boolean test2()
    {
        int a[] = { 1, 5, 1, 2 };

        printArray( a );
        BubbleSort.sort( a );
        printArray( a );

        return a[0] == 1 && a[1] == 1 && a[2] == 2 && a[3] == 5;
    }

}
