package week2.task2;

import static week2.task1.Task1.gcd;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int numerator, denominator;
    public void toigian(){

        int UC = gcd(this.denominator, this.numerator);
        this.denominator = this.denominator/UC;
        this.numerator = this.numerator/UC;
    }
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f = new Fraction(0,1);
        f.numerator = this.numerator*other.denominator + other.numerator * this.denominator;
        f.denominator = this.denominator*other.denominator;
        return f;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f = new Fraction(0,1);
        f.numerator = this.numerator*other.denominator - other.numerator * this.denominator;
        f.denominator = this.denominator*other.denominator;
        return f;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f = new Fraction(0,1);
        f.numerator = this.numerator * other.numerator;
        f.denominator = this.denominator *other.denominator;
        return f;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f = new Fraction(0,1);
        f.numerator = this.numerator * other.denominator;
        f.denominator = this.denominator * other.denominator;
        return f;
    }
    public boolean equals(Object obj){
       //obj = new Fraction(0,1);
        if(((Fraction) obj).denominator * this.numerator == this.denominator * ((Fraction) obj).numerator)
            return true;
        return false;
    }
    public static void main(String [] argc){
        Fraction ps= new Fraction(1,6);
        Fraction ps1= new Fraction(2, 6);
        Fraction c = new Fraction(1,3);
        Fraction d = new Fraction(5,3);
        if(ps.equals(ps1)) System.out.println("true");
        else System.out.println("false");
    }
}
