package numberofStudetsUnableToEatLunch;

public class Test {
    public static void main(String[] args) {
        int[] students = new int[]{1,1,0,0};
        int[] sandw = new int[]{0,1,0,1};
        CountStudents.countStudents(students,sandw);
    }
}
