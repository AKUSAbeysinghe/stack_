import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StudentID {

    public static void main(String[] args) {

        Queue<Integer> id =new LinkedList<>();

        id.offer(25245);
        id.offer(25246);
        id.offer(25247);
        id.offer(25248);

        System.out.println("Student ID's: "+id);

        int removeId = id.poll();

        System.out.println("Removed Student ID: "+removeId);

        System.out.println("Updated Student ID'S :"+id);



    }
}
