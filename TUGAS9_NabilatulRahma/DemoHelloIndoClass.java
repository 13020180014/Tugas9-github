/* Nama : Nabilatul Rahma
   Tgl pengerjaan : 11 mei 2020
    waktu 22:18
*/ 

package com.wordpress.bmadi.morenestedclass;
public class DemoHelloIndoClass {
  interface HelloIndo{
    public void greet();
    public void greetSomeone(String someone);
  }
  public void sayHelloIndo() {
    class IndoGreeting implements HelloIndo {
      String name = "Indonesia";
 
      public void greet(){
        greetSomeone("Indonesia");
      }
 
      public void greetSomeone(String someone){
        name = someone;
        System.out.println("Hallo " + name);
      }
    }
 
    HelloIndo indoGreeting = new IndoGreeting();
 
    HelloIndo jawaGreeting = new HelloIndo() {
      String name = "Jawa";
      public void greet(){
        greetSomeone("Jawa");
      }
      public void greetSomeone(String someone){
        name = someone;
        System.out.println("Hay " + name);
      }
    };
 
    indoGreeting.greet();
    indoGreeting.greetSomeone("Sandi");
 
    jawaGreeting.greet();
    jawaGreeting.greetSomeone("Jumadi");
  }
 
  public static void main(String[] args){
    DemoHelloIndoClass myApp = new DemoHelloIndoClass();
    myApp.sayHelloIndo();
  }
}