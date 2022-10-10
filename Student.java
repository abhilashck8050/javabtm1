class Student {

String Name;
String Branch;
String CollegeName;
int Rollno;
String Dateofbirth;

void studying(){

System.out.println(Name+" "+Branch+" "+CollegeName+" is studying at shimoga....!");

}
public static void main(String arg[]){

Student Abhilash = new Student();

Abhilash.Name = "Abhilash";
Abhilash.Branch = "Mechanical";
Abhilash.CollegeName = "Pesitm";
Abhilash.Rollno = 1;
Abhilash.Dateofbirth = "19-03-1998";
Abhilash.studying();


}



}