package cs520.sort;

public class BubbleSort {

    public static void sort( int[] a )
    {
        for( int i = 0; i < a.length - 1; ++i )
        {
            for( int j = i + 1; j < a.length; ++j )
                if( a[i] > a[j] )
                {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
        }
    }

}
