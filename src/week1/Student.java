package week1;

public class Student {



    // TODO: khai báo các thuộc tính cho Student
    private String Name;
    private String ID;
    private String Group;
    private String Email;



    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName(){
        return this.Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public String getID(){
        return this.ID;
    }
    public void setID(String id){
        this.ID = id;
    }
    public String getGroup(){
        return this.Group;
    }
    public void setGroup(String group){
        this.Group = group;
    }
    public String getEmail() {
        return this.Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.Name = "Student";
        this.ID = "000";
        this.Group = "INT22041";
        this.Email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.Name = n;
        this.ID = sid;
        this.Group = "INT22041";
        this.Email = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.Name = s.Name;
        this.ID = s.ID;
        this.Group = s.Group;
        this.Email = s.Email;
    }
    String getInfo() {

        String Info= "Name: " + this.Name +"\nID: " + this.ID
                + "\nGroup:" + this.Group + "\nEmail:" + this.Email;
        return Info;
    }

}
