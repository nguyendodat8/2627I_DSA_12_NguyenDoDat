import java.util.*;

class Student{
    int id;
    String firstname;
    double cgpa;
    public Student(int id,String firstname,double cgpa){
        this.id = id;
        this.firstname = firstname;
        this.cgpa = cgpa;
    }
    public String getFirstname(){
        return firstname;
    }
    public int getId(){
        return id;
    }
    public double getCgpa(){
        return cgpa;
    }
}
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b){
        if (Double.compare(b.cgpa,a.cgpa) != 0){
            return Double.compare(b.cgpa,a.cgpa);
        }
        if (!a.firstname.equals(b.firstname)){
            return a.firstname.compareTo(b.firstname);
        }
        return Integer.compare(a.id,b.id);



    }
}
public class Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        if (sc.hasNextInt()){
            int q = sc.nextInt();
            List<Student> students = new ArrayList<>();
            for (int i = 0; i < q;i++){
                int id = sc.nextInt();
                String firstname = sc.next();
                double cgpa = sc.nextDouble();
                students.add(new Student(id, firstname, cgpa));

            }
            sc.close();
            Collections.sort(students, new StudentComparator());
            for (Student s: students){
                System.out.println(s.getFirstname());
            }
        }
    }

}
