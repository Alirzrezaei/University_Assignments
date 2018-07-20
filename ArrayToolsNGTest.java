/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ueb02;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 * TODO: Use JUnit
 * @author Reyhan
 */
public class ArrayToolsNGTest {
    
    public ArrayToolsNGTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    @Test 
    public void containsAtTest_true(){
        int [] array = {2, 2};
        assertEquals(0, ArrayTools.containsAt(array, 2));
    }
    @Test 
    public void containsAtTest_EmptyArray(){
        int [] array = {};
        assertEquals(-1, ArrayTools.containsAt(array, 3));
    }
     @Test 
    public void containsAtTest_ValueNotInArray(){
        int [] array = {1, 2, 4, 5, 6};
        assertEquals(-1, ArrayTools.containsAt(array, 3));
    }
     @Test 
    public void containsAtTest_LastIndex(){
        int [] array = {1, 2, 3, 4, 5};
        assertEquals(4, ArrayTools.containsAt(array, 5));
    }
     @Test 
    public void containsAtTest_RepeatedValue(){
        int [] array = {1, 2, 3, 3, 3};
        assertEquals(2, ArrayTools.containsAt(array, 3));
    }
    /********************************************************************/
     @Test 
    public void deleteElementAtTest_trueValue(){
        int [] array = {1, 2, 3, 4, 5};
        assertEquals(4, ArrayTools.deleteElementAt(array, 3).length);
        int[] array2 = ArrayTools.deleteElementAt(array, 3).clone();
        assertEquals( -1, ArrayTools.containsAt(array2, 4));
        assertEquals( 3, ArrayTools.containsAt(array2, 5));
        assertEquals( 0, ArrayTools.containsAt(array2, 1));
        assertEquals( 1, ArrayTools.containsAt(array2, 2));
        assertEquals( 2, ArrayTools.containsAt(array2, 3));
    }
    @Test
         public void deleteElementAtTest_EmptyArray(){
        int [] array = {};
        assertEquals(null, ArrayTools.deleteElementAt(array, 3));
        
    }
    @Test 
        public void deleteElementAtTest_invalidIndex(){
        int [] array = {1,2,3,4};
        assertEquals(null, ArrayTools.deleteElementAt(array, 5));
        //assertNull(array);
    }
        @Test 
        public void deleteElementAtTest_oneElement(){
        int [] array = {1};
        assertEquals(0, ArrayTools.deleteElementAt(array, 0).length);
    }
        @Test 
        public void deleteElementAtTest_LastElement(){
        int [] array = {1, 1, 3, 3, 4};
        assertEquals(4, ArrayTools.deleteElementAt(array, 4).length);
    }
        
    
    /********************************************************************/
     @Test 
    public void insertElementAtTest_trueValue(){
        int [] array = {1, 2, 3, 4, 5};
        assertEquals(6, ArrayTools.insertElementAt(array, 2, 6).length);
        
    }
    @Test 
    public void insertElementAtTest_AtBeginning(){
        int [] array = {1, 2, 3, 4, 5};
        assertEquals(6, ArrayTools.insertElementAt(array, 0, 6).length);
        //assertEquals(3, ArrayTools.containsAt(array, 4));
    }
     @Test 
    public void insertElementAtTest_AtEnd(){
        int [] array = {1, 2, 3, 4, 5};
        assertEquals(6, ArrayTools.insertElementAt(array, 5, 6).length);
        //assertEquals(3, ArrayTools.containsAt(array, 4));
    }
    @Test 
    public void insertElementAtTest_EmptyArray(){
        int [] array = {};
        //assertEquals(1, ArrayTools.insertElementAt(array, 0, 3).length);
        assertEquals(1, ArrayTools.insertElementAt(array, 0, 3).length);
        //assertEquals(null, ArrayTools.insertElementAt(array, 2, 6));
    }
    @Test 
    public void insertElementAtTest_InvalIndex(){
        int [] array = {1};
        assertEquals(null, ArrayTools.insertElementAt(array, 2, 6));
    }
     @Test 
    public void insertElementAtTest_InvalIndexNegative(){
        int [] array = {1};
        assertEquals(null, ArrayTools.insertElementAt(array, -1, 6));
    }
    
     /********************************************************************/
     @Test 
    public void TestgetMaxLength_TrueCase(){
        int [][] array = {{1, 2} , {3, 4, 5} , {1}};
        assertEquals(3, ArrayTools.getLengthOfLongestArray(array));
        
    }
       @Test 
    public void TestgetMaxLength_emptyArray(){
        int [][] array = {};
        assertEquals( -1, ArrayTools.getLengthOfLongestArray(array));
    }
        @Test 
    public void TestgetMaxLength_equalLength(){
         int [][] array = {{1, 2} , {3, 4, 5} , {1, 3, 2}};
        assertEquals( 3, ArrayTools.getLengthOfLongestArray(array));
    }
    @Test
    public void testIsEmpty(){
        int [] array = {}; 
        assertTrue(ArrayTools.isEmpty(array));
    }
}
