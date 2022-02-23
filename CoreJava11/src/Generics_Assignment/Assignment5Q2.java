package Generics_Assignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment5Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, Double> h1=new HashMap<>();
h1.put(1, 16.1);
h1.put(2, 22.2);
h1.put(3, 33.3);
h1.put(4, 45.4);
h1.put(5, 56.4);
h1.put(6, 63.3);
h1.put(7, 70.2);
h1.put(8, 82.1);
h1.put(9, 91.0);
h1.put(10, 100.0);
System.out.println(h1);
for(Map.Entry m:h1.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}

}