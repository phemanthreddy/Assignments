package Lambda_Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment8Q5 {
	List<String> list = Arrays.asList("aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh");
	public static void main(String[] args) {
		Assignment8Q5 assignmentQ5 = new Assignment8Q5();
        processWords(assignmentQ5.list);
	}
	public static String processWords(List<String> list) {
        StringBuilder words = new StringBuilder();
        Consumer<String> consumer = p-> words.append(p.charAt(0));

         list.stream().forEach(consumer);
        System.out.println(words);
        return  words.toString();
    }

}