package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int numerator, denominator;

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
}
