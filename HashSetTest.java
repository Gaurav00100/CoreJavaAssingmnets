import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

class Student
{
	int studentId;
	String studentName;
	String className;
	String schoolName;
	
	public Student(int studentId, String studentName, String className, String schoolName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.className = className;
		this.schoolName = schoolName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", className=" + className
				+ ", schoolName=" + schoolName +"]";
	}
	@Override
	public int hashCode() { 
				
		final int prime = 31;
		
		int result = 1;				
		result = prime * result + ((className == null) ? 0 : className.hashCode());

					
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode()); //Java
		
	
		return result = prime * result + studentId;
		
	}  
	
	@Override
	public boolean equals(Object obj) {

		if (this == obj) 
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj; 
		
		if (className == null) {
			if (other.className != null)
				return false;
			
		} else if (!className.equals(other.className))
			return false; // indication to hashSet to take it as a unique object
				
		if (schoolName != other.schoolName)
			return false;
		
		if (studentName == null) {
			if (other.studentName != null)
				return false;
			
		} else if (!studentName.equals(other.studentName))
			return false;
		
		if (studentId != other.studentId)
			return false;
		
		
		return true;
	}
	
	
}
public class HashSetTest {
	public static void main(String[] args) {
		
		Student a = new Student(101, "Virat kohli",  "twelth", "Dellhi public");
		Student b = new Student(101, "Rohit sharma", "elevent", " Sanskar valley");
		Student c = new Student(101, "Hardikpandya ", "twelth", " billa bong");
		Student d = new Student(101, "KL rahul",      "tenth", "Dellhi public");
		Student e = new Student(101, "KL rahul",      "tenth", "Dellhi public");
			
		
		HashSet<Student> studentDetails = new HashSet<Student>();
			
		studentDetails.add(a);
		studentDetails.add(b);
		studentDetails.add(c);
		studentDetails.add(d);
		studentDetails.add(e);

		
		Iterator myIterator = studentDetails.iterator();
		
		while(myIterator.hasNext())
		{
			Object o = myIterator.next(); 
			
			Student s = (Student) o; 
			System.out.println("Student : "+s);
		}
	}
}