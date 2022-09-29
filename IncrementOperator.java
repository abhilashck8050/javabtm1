class IncrementOperator{
public static void main(String[] args){

   int x = 100;
   int y = ++x;
   int z = ++y;
   
   System.out.println("x : "+ x); //101
   System.out.println("y : "+ y); //102
   System.out.println("z : "+ z); //102
   
   int p = 500;
   int q = p++;
   
   System.out.println("p : "+ p); //501
   System.out.println("q : "+ q); //500
   
   int a = 10;
   a++;
   int c = ++a;
   
   System.out.println("a : "+ a); //12
   System.out.println("c : "+ (c++)); //13
   System.out.println("c : "+ c); //13
   

}


}