package UI.Demo;

public interface Demo1 {
     int number =5;

   public abstract void read();

   default String read1(){
       return "Bill Gates";
   }

   private int sum(int a,int b){
       return a+b;
   }
   static int sum1 (){
      return 5;
   }

}
