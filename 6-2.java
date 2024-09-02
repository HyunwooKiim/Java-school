public class Student {
    
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    
    String info() {
        int sum = kor + eng + math;
        double average = sum / 3.0;

        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + sum + ", " + String.format("%.1f", average);
    }
