package Annotations_Assignment;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Info
{int AuthorId() default 1;
String Author() default "Hemanth";
String Supervisor() default "Madhu"; 
String date() default "11/02/2022";
String time() default "22:58 PM";
String version();
String Description() default "Annotations Assignment";

}
@Info(version="s4")
class doc
{
	void print()
	{
	System.out.println("Hello");
	}
	
}

public class Assignment7Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
doc a=new doc();
Class c=a.getClass();
Annotation an=(Annotation)c.getAnnotation(Info.class);
Info s=(Info)an;
System.out.println("Author : "+s.Author()+"\n"+"Id : "+s.AuthorId()+"\n"+"Supervisor : "+s.Supervisor()+"\n"+"date : "+s.date()+"\n"+"Time : "+s.time()+"\n"+"Version : "+s.version()+"\n"+"Description : "+s.Description());
	}

}