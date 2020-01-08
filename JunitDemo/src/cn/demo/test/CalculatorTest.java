package cn.demo.test;

import cn.demo.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void init(){
        System.out.println("init...");
    }

    @After
    public void close(){
        System.out.println("closed.");
    }

   @Test
    public void testAdd(){
       Assert.assertEquals(3,new Calculator().add(1,2));
   }

   @Test
    public void testSub(){
       Assert.assertEquals(-1,new Calculator().sub(1,2));
   }
}
