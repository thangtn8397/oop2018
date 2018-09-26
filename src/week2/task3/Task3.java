package week2.task3;

public class Task3 {

}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class employee{
    private String name;
    private String sex;
    private int age;
    private float salary;
    private int workDay;
    public int getWorkDay(){
        return this.workDay;
    }
    public boolean Bonus(){     // xét thưởng
        if(getWorkDay() > 26) return true;
        return false;
    }
    public void Rank(){     //cap bac nhan vien
        if(salary >= 20) System.out.println("Manager");
        else System.out.println("Employee");
    }
    public boolean isRetirement ()// xet tuoi nghi huu
    {
        if(age >= 60) return true;
        return false;
    }
}
class cow{
    private String name;
    private int age;
    private String color;
    private float weight;
    private int foodAmount;  // Luong thuc an con lai
    public boolean kill(){
        if(weight >= 150) return true;
        return false;
    }
    public void makeNoise(){
        if(foodAmount < 5) System.out.println("Moooo..!");
        else if(5<=foodAmount && foodAmount<10) System.out.println("OK");
        else System.out.println("Very good");
    }
    public boolean forMilk(){
        if(age>=5 && weight < 150) return true;
        return false;
    }
}
class MotorBike{
    private String producer; // hang san xuat
    private float fuel; // xang
    private int volume; // dung tich
    private float distance; // quang duong da di
    public boolean maintenance(){ // kiem tra bao duong
        if(distance > 10000) return true;
        else return false;
    }
    public void classify(){ // phan loai xe dua vao dung tich
        if(volume < 50) System.out.println("Xe gan may");
        else System.out.println("Xe motor");
    }
    public boolean checkFuel(){ // kiem tra da phai do xang hay chua
        if(fuel < 0.5) return true;
        return true;
    }
}
