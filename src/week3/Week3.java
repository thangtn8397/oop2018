package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất

        return (m > n ? m : n);
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int n = array.length;
        int min = array[0];
        for(int i=0; i<n; i++){
            if(min > array[i]) min = array[i];
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        String result;
        double ibm = (weight)/ (height*height);
        if(ibm < 18.5)  result = "Thieu can";
        else if(ibm >=18.5 && ibm <= 24.9) result = "Binh thuong";
        else if(ibm >= 25 && ibm <= 29.5) result = "Thua can";
        else result = "Beo phi";
        return result;
    }
}
