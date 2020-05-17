/* Nama : Nabilatul Rahma
   Tgl pengerjaan : 11 mei 2020
    waktu 22:15
*/ 
/* Program Java mendemonstrasikan bagaimana cara implementasi static dan non static class pada program Java */
class OuterClass{ 
private static String msg = "GeeksForGeeks"; 
 
/* Static nested class */
public static class NestedStaticClass{ 
 
/* Hanya anggota static dari outer class yang diakses secara langsung dalam nested */ 
/* Static class */
public void printMessage() { 

/* Mencoba membuat 'message' sebuah non static variabel, akan terdapat compiler error */ 
System.out.println("Message from nested static class: " + msg); 
} 
} 
 
/* Class nested non static atau juga disebut sebagai inner class */ 
public class InnerClass{ 
  
/* Keduanya baik anggota static dan non static dari outer class dapat diakses dalam inner class pada bagian ini */
public void display(){ 
System.out.println("Message from non-static nested class: "+ msg); 
} 
} 
} 
class Main 
{ 
/* Bagaimana cara menciptakan instance dari static dan non static nested class */
public static void main(String args[]){ 
  
/* Menciptakan instance dari nested static class */ 
OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass(); 
  
/* Memanggil non static method dari nested static class */ 
printer.printMessage(); 

/* Untuk menciptakan instance dari inner class dibutuhkan instance outer class */
/* Ciptakan instance outer class untuk menciptakan non static nested class */ 
OuterClass outer = new OuterClass();   
OuterClass.InnerClass inner = outer.new InnerClass(); 
  
/* Memanggil non static method dari inner class */
inner.display(); 
  
/* Dapat juga dilakukan kombinasi pada tahap di atas dalam satu tahapan untuk menciptakan instance dari inner class */
OuterClass.InnerClass innerObject = new OuterClass().new InnerClass(); 
  
/* Hal yang sama juga dapat dilakukan untuk memanggil inner class method */ 
innerObject.display(); 
} 
}

