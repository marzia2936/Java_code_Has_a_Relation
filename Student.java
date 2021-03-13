
package has_a_relation;
public class Student {
   String id;
   String name;
   double cgpa;
   Course c1;  //this is object of course class
   
   Student(String i,String nm,double cg){
       id=i;
       name=nm;
       cgpa=cg;
       
   }
   void course_registration(Course c){
       c1=c;
   }
   void print_all_info(){
       System.out.println("ID:"+id);
       System.out.println("Name:"+name);
       System.out.println("Registered Course Code:"+c1.code);
   }
}
