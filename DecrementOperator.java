class DecrementOperator{
public static void main(String []args){

   int a = 50;
   int b = --a;
   int c = b--;
   c--;
   --b;
   
   System.out.println("a ; "+ (a--)); //49
   System.out.println("b : "+ (--b)); //46
   System.out.println("c : "+ (c--)); //
   System.out.println("a+c : "+ (a+c));
   
  


}


}