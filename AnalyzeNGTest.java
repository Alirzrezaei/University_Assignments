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
public class AnalyzeNGTest {
    
    public AnalyzeNGTest() {
    }

    @Test
    public void testCalcDistanceBetween_TrueCase() {
        int [] pos1 = {2, 2};
        int [] pos2 = {3, 5};
        assertEquals(4, Analyze.distance(pos1, pos2)); 
        
    }
     @Test
    public void testCalcDistanceBetween_invalidValue() {
        int [] pos1 = {1, 2};
        int [] pos2 = {3, 11};
        assertEquals(Integer.MAX_VALUE, Analyze.distance(pos1, pos2)); 
    }
    @Test
    public void testCalcDistanceBetween_invalidValueNegative() {
        int [] pos1 = {-1, 2};
        int [] pos2 = {3, 5};
        assertEquals(Integer.MAX_VALUE, Analyze.distance(pos1, pos2)); 
    }
    @Test
    public void testCalcDistanceBetween_invalidAllValue() {
        int [] pos1 = {-1, 13};
        int [] pos2 = {12, -3};
        assertEquals(Integer.MAX_VALUE, Analyze.distance(pos1, pos2)); 
    }
    /*****************************************/
    @Test
    public void testFlyDroneTo_trueCase(){
        //flownDrone is a helper method
        int [] pos1 = {5, 5}; 
        assertEquals(8, Analyze.flownDrone(pos1)); 
        int [] pos2 = {2, 2}; 
        assertEquals(13, Analyze.flownDrone(pos2)); 
        int [] pos3 = {0, 0};
        assertEquals(16, Analyze.flownDrone(pos3)); 
    }
    @Test
    public void testFlyDroneTo_invalidIndex(){
        //the dimension of the map is 10x7
        //flownDrone is a helper method
        int [] pos1 = {10, 8}; 
        assertEquals(-1, Analyze.flownDrone(pos1)); 
        int [] pos2 = {11, 7}; 
        assertEquals(-1, Analyze.flownDrone(pos2)); 
        int [] pos3 = {-4, -4}; 
        assertEquals(-1, Analyze.flownDrone(pos3)); 
        
    }
   @Test
   public void testTransportSameProducts_true(){
       Analyze.resetToOrigState();
       int [] from = {0, 0};
       int [] from2 = {4, 6};
       int[] to = {1, 2};
       assertEquals(0, Analyze.transportSameProduct(from, to, 4, 2));
      assertEquals(1, Analyze.transportSameProduct(from, to, 3, 3));
       Analyze.getMap();
       //assertEquals(3, Analyze.getMap()[0][0].length);
   }
  
   @Test
   public void testTransportSameProducts_enough(){
   Analyze.resetToOrigState();
       int [] from = {0, 0};
       int[] to = {3, 4};
       assertEquals(1, Analyze.transportSameProduct(from, to, 4, 5));
       
       //assertEquals(5, Analyze.getMap()[0][0].length);
   }
    @Test
   public void testTransportSameProducts_enough2(){
   Analyze.resetToOrigState();
       int [] from = {0, 0};
       int [] from2 = {6, 3};
       int[] to = {3, 4};
       assertEquals(0, Analyze.transportSameProduct(from2, to, 4, Analyze.transportSameProduct(from, to, 4, 5)));
       Analyze.getMap();
   }

   @Test
   public void testTransportSameProducts_invalidProduct(){
       int [] from = {0, 0};
       int[] to = {3, 4};
       assertEquals(3, Analyze.transportSameProduct(from, to, 5, 3));
       //assertEquals(8, Analyze.getMap()[0][0].length);
   }
   @Test
   public void testfindNearestWarehouse_Truecase(){
       Analyze.resetToOrigState();
       int pos[] = {0 ,0};     
       assertEquals(0 , Analyze.FindNearestWarehous(pos, 4)[0]);
       assertEquals(3 , Analyze.FindNearestWarehous(pos, 2)[1]);
   }
    @Test
   public void testfindNearestWarehouse2_Truecase(){
       Analyze.resetToOrigState();
       int pos[] = {0 ,0};     
       assertEquals(0 , Analyze.FindNearestWarehous(pos, 3)[0]);
       assertEquals(0 , Analyze.FindNearestWarehous(pos, 3)[1]);
   }
   @Test
   public void testtransportOrdersOfOneSeries_TrueCase(){
       Analyze.resetToOrigState();
       int [][] ord=Data.getOrderSeries(0);
       assertTrue(Analyze.transportOrdersOfOneSeries(ord));
       Analyze.getMap();
   }
    @Test
   public void testtransportOrdersOfOneSeries_TrueCase2(){
       Analyze.resetToOrigState();
       assertFalse(Analyze.transportOrdersOfOneSeries(Data.getOrderSeries(3)));
       Analyze.getMap();
   }
     @Test
   public void testtransportOrdersOfOneSeries_FalseCase3(){
       Analyze.resetToOrigState();
       assertFalse(Analyze.transportOrdersOfOneSeries(Data.getOrderSeries(3)));
       Analyze.getMap();
   }
     @Test
   public void testtransportOrdersOfOneSeries_TrueCase3(){
       Analyze.resetToOrigState();
       assertTrue(Analyze.transportOrdersOfOneSeries(Data.getOrderSeries(2)));
       Analyze.getMap();
   }
    @Test
   public void testGetPrintWidthPerColumn(){
       Analyze.resetToOrigState();
        assertEquals(8, Analyze.GetPrintWidthPerColumn(0));
   }
   @Test
   public void testGetPrintWidthPerColumn2(){
       Analyze.resetToOrigState();
        assertEquals(0, Analyze.GetPrintWidthPerColumn(1));
   }
    @Test
   public void testGetPrintWidthPerColumn3(){
       Analyze.resetToOrigState();
        assertEquals(1, Analyze.GetPrintWidthPerColumn(4));
   }
 
}
