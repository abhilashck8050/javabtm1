class Students {

String Name;
String Branch;
String CollegeName;
int Rollno;
String Dateofbirth;
void studying(){

System.out.println(Name+" "+Branch+" "+CollegeName+" is studying at shimoga....!");

}
public static void main(String arg[]){

Students Abhilash = new Students();

Abhilash.Name = "Abhilash";
Abhilash.Branch = "Mechanical";
Abhilash.CollegeName = "Pesitm";
Abhilash.Rollno = 1;
Abhilash.Dateofbirth = "19-03-1998";
Abhilash.studying();

Students sameer = new Students();

sameer.Name = "sameer";
sameer.Branch = "civil";
sameer.CollegeName = "Jnnce";
sameer.Rollno = 25;
sameer.Dateofbirth = "19-09-1998";
sameer.studying();

Students Vijay = new Students();

Vijay.Name = "Vijay";
Vijay.Branch = "Computerscience";
Vijay.CollegeName = "Pesitm";
Vijay.Rollno = 106;
Vijay.Dateofbirth = "19-12-1998";

Vijay.studying();

}



}