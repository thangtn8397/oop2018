package week3;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()

    public void testMax(){
        assertEquals(4,Week3.max(4, 5));
        assertEquals(3724,Week3.max(3724,3725));
        assertEquals(10,Week3.max(10,20));
        assertEquals(0,Week3.max(0,1));
        assertEquals(5,Week3.max(5,30));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()

    public void testMinOfArray(){
        int[] arr = {2,1,4,7,8};
        assertEquals(1,Week3.minOfArray(arr));
        int[] arr1 = {5,1000,123,6};
        assertEquals(5,Week3.minOfArray(arr1));
        int[] arr2 = {56,4,6,7};
        assertEquals(4,Week3.minOfArray(arr2));
        int[] arr3 = {4,5,10,400,90};
        assertEquals(4,Week3.minOfArray(arr3));
        int[] arr4 = {5,100,3,0,7};
        assertEquals(0, Week3.minOfArray(arr4));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testcalculateBMI(){
        assertEquals("Binh thuong", Week3.calculateBMI(60,1.7));
        assertEquals("Beo phi", Week3.calculateBMI(100,1.5));
        assertEquals("Thua can", Week3.calculateBMI(70,1.6));
        assertEquals("Thieu can", Week3.calculateBMI(40,1.7));
        assertEquals("Thieu can", Week3.calculateBMI(30,1.5));

    }
}
