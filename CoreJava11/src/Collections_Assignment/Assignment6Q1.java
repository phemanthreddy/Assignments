package Collections_Assignment;

import java.util.Map.Entry;
import java.util.TreeMap;

import collectionsassign.Contacts.Gender;

class Contacts
{ 
String Name;
String Email;
Gender genderr;
enum Gender
{
	MALE,FEMALE
}
long PhoneNumber;
public Contacts(String name, String email,Gender genderr) {
	super();
	
	this.Name = name;
	this.Email = email;
	this.genderr=genderr;
}
Long Phone(long PhoneNumber)
{
	this.PhoneNumber=PhoneNumber;
	return PhoneNumber;
}
  
}

public class Assignment6Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
TreeMap<Long, Contacts> t1=new TreeMap<>();
Gender M=Gender.MALE;
Gender F=Gender.FEMALE;

Contacts c1=new Contacts("Hemanth","hemanth@345",M);
Contacts c2=new Contacts("mahe","mahe@2361",M);
Contacts c3=new Contacts("madhu","madhu@45",F);
Contacts c4=new Contacts("hema","hema@435",F);

t1.put( c1.Phone( 919345543), c1);
t1.put( c2.Phone( 993543455), c2);
t1.put( c3.Phone( 963545355), c3);
t1.put( c4.Phone( 953454545) , c4);

for(Entry<Long, Contacts> entry:t1.descendingMap().entrySet()){    
    Long key=entry.getKey();  
    Contacts b=entry.getValue();  
    
    System.out.println(key+" "+b.Name+" "+b.Email+" "+b.genderr);   
} 

	}
}