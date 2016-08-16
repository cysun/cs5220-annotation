package cs520.test;

import java.lang.reflect.Method;

import cs520.annotation.Test;

public class TestRunner {

    @SuppressWarnings("rawtypes")
    public static void main( String[] args ) throws Exception
    {

        Class clazz = Class.forName( "cs520.test.BubbleSortTest" );

        for( Method method : clazz.getMethods() )
        {
            Test testAnnotation = method.getAnnotation( Test.class );
            if( testAnnotation != null )
            {
                for( int i = 1; i <= testAnnotation.repeat(); ++i )
                {
                    Object result = method.invoke( null );
                    if( ((Boolean) result) == true )
                        System.out.println( method.getName() + " passed." );
                    else
                        System.out.println( method.getName() + " failed." );
                }
            }
        }
    }

}
