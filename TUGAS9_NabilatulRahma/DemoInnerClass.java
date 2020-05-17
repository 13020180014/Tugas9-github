/* Nama : Nabilatul Rahma
   Tgl pengerjaan : 11 mei 2020
    waktu 22:05
*/ 
package com.wordpress.bmadi.morenestedclass;
public class DemoInnerClass {
  private class Inner {
    public void printText(){
      System.out.println("Inner class example in Java");
    }
  }
  public static void main(String[] args){
    DemoInnerClass oDemo = new DemoInnerClass();
    DemoInnerClass.Inner oInner = oDemo.new Inner();
    oInner.printText();
  }
}