/* Nama : Nabila
   Tgl pengerjaan : 10 mei 2020
    waktu 20:40
*/ 
 

public class PrintNilai {
    
   // Metoda main
   public static void main(String[] args) {
 
      // Deklarasi dan pemberian nilai awal ke variabel
      Integer varInt = 8652339;
      Double varDouble = 96342.7656;
      Character varChar = 'H';
      String varString = "Belajar Java.";
 
      System.out.println();
      System.out.println("Nilai-nilai yang dicetak:");
 
      // Memanggil overloading metoda print
      print(varInt);
      print(varDouble);
      print(varChar);
      print(varString);         
   }
 
   // Metoda print untuk mencetak nilai tipe long
   public static void print(Integer nilaiInteger) {
      System.out.println(nilaiInteger);
   }
 
   // Metoda print untuk mencetak nilai tipe double
   public static void print(Double nilaiDouble) {
      System.out.println(nilaiDouble);
   }
 
   // Metoda print untuk mencetak nilai tipe char
   public static void print(Character nilaiChar) {
      System.out.println(nilaiChar);
   }
 
   // Metoda print untuk mencetak nilai tipe String
   public static void print(String nilaiString) {
      System.out.println(nilaiString);
   }
}