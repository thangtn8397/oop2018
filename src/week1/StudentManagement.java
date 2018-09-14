package week1;
import java.util.ArrayList;
public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public static ArrayList<Student> students = new ArrayList<> ();
    public String[] Group = new String[students.size()];
    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup().equals(s2.getGroup())) return true;
        return false;
    }

    public void studentsByGroup() {
        // TODO:
        int countGroup = 0;
        //Student a = students.get(0);
        Group[countGroup] = students.get(0).getGroup();
        for(Student i : students) {
            if(!i.getGroup().equals(Group[countGroup])) {
                countGroup++;
                Group[countGroup] = i.getGroup();

            }
        }

        for(int i = 0; i<=countGroup; i++) {
            System.out.println(Group[i]);
        }

        for(int i=0; i<=countGroup; i++){
            System.out.println("Cac hoc sinh thuoc lop " + Group[i] + " la:");
            for(Student j : students){
                if(j.getGroup().equals(Group[i]) ){
                    System.out.println((j.getInfo()));
                }
            }
        }

    }

    void removeStudent(String id) {
        // TODO
        for(int i=0; i<students.size(); i++) {
            if(students.get(i).getID().equals(id)) {
                students.remove(i);
            }
        }

    }

    public static void main(String[] args) {
        // TODO:
        Student a = new Student("Trinh Nhu Thang", "17021026", "17021026@vnu.edu.vn");
        Student b = new Student("Nguyen Van A", "17021028", "ax@gmail.com");
        Student c = new Student(a);
        students.add(a);
        students.add(b);
        students.add(c);
        System.out.println(sameGroup(a,b));
		students.get(0).setGroup("INT2201");
    	System.out.println(students.get(0).getInfo());
        StudentManagement studentManagement = new StudentManagement();
//		studentManagement.studentsByGroup();
        studentManagement.removeStudent("17021026");
//		System.out.println(students);

        for(Student i : students) {
            System.out.println(i.getInfo());
        }
    }
}
