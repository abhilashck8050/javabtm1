class Flower {

String name;
String colour;
int noOfPetals;

void SheddingFragrance(){

System.out.println(colour+" "+name+" is Shedding fragrance...!");

  }

void blooming(){

System.out.println(colour+" "+name+" is blooming...!");

  }
 
public static void main(String srgs[]){

   Flower rose = new Flower();
   
   rose.name = "Rose";
   rose.colour = "Red";
   rose.noOfPetals = 12;
   
   rose.blooming();
   rose.SheddingFragrance();

}
}