
package has_a_relation;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("2936","Marzia",3.90);
        Course c1 = new Course("SE211");
        s1.course_registration(c1);
        s1.print_all_info();
    }
    
}
