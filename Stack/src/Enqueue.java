import java.util.LinkedList;
import java.util.Queue;

public class Enqueue {

    public static void main(String[] args) {

        Queue<String> languages =new LinkedList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C");

        System.out.println("Programming Languages: "+languages);

        String top_element = languages.peek();
        System.out.println("First Programming Language in the List: "+top_element);

        String removed_value = languages.poll();
        System.out.println("Removed Programming Language in the List: "+removed_value);
        System.out.println("Update Programming Language List: "+languages);

        languages.offer("Swift");
        System.out.println("Updated Programming Language List: "+languages);

    }
}
