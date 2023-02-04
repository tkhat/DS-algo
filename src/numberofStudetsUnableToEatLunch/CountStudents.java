package numberofStudetsUnableToEatLunch;

import java.util.*;

public class CountStudents {

    public static int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        int[] stud = new int[students.length];
        int studIndex = 0;

        for (int i = students.length - 1; i >= 0; i--) {
            stack.add(sandwiches[i]);
            if (students[i] == 1) {
                stud[studIndex] = students[i];
                studIndex++;
            }
        }
        int fromFirst = 0;
        int fromLast = stud.length - 1;
        for (int i = 0; i < students.length; i++) {
            if (stack.peek() == stud[fromFirst]){
                stack.pop();
                fromFirst++;
            } else if (stack.peek() == stud[fromLast]) {
                stack.pop();
                fromLast--;
            } else {
                break;
            }
        }
        return stack.size();
    }
}
