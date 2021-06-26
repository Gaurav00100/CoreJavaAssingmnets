
class Student{
	
	private int studentId;
	private String subject;
	private int Assignment; 

	Student() { 
		System.out.println("Student ctor....");
	}

		Student(int sid, String sub, int assing) {
    
			studentId = sid;
			subject = sub;
			Assignment = assing;
    }
	
    void ShowStudent() { 
    	System.out.println(" Student Id  : "+studentId);
    	System.out.println(" Subject Name  : "+subject);
    	System.out.println(" No. of Assingments : "+Assignment);
    	System.out.println("----------------------------------");
    }
    public int getAssingments(String tn) {
    	System.out.println(tn+" getAssingments() invoked....");
    	return Assignment;
    }
    private void setAssingments(int sid, String tn) {
    	System.out.println(tn+" setAssingments() invoked....");
    	Assignment = sid;
    }
    public synchronized void deposit(int assigSubmission, String tn) {
    	System.out.println(tn+" started Assingments...."+assigSubmission);
		double currentAssingment = getAssingments(tn);
		double newBalance = currentAssingment + assigSubmission;
    	System.out.println(tn+" ");
    	setAssingments(studentId, tn);
    	System.out.println(tn+" "+assigSubmission);
    }
}


public class SynchronizedTest {
	public static void main(String[] args) {
		System.out.println("->Begin of main");
		Student st = new Student(101,"Java",10);
		st.ShowStudent();
		
		Trainer t1 = new Trainer("Virat",st,5000);
		Trainer t2 = new Trainer("\tRohit",st,7000);
		Trainer t3 = new Trainer("\t\tRahul",st,8000);
		System.out.println("->Starting the threads...");
		t1.start(); //intentionally --> not start
		t2.start();
		t3.start();
		System.out.println("->Started the threads...");
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e) {
			System.out.println("Some problem : "+e);
		}
		
		System.out.println("->After all transactions....lets check the balance....");
		st.ShowStudent();
		System.out.println("->End of main");
	}
}

class Trainer extends Thread 
{
	String trainerName;
	Student studentRef;
	int assigSubmission;
	
	Trainer(String tn, Student x, int as) {
		trainerName = tn;
		studentRef = x;
		assigSubmission = as;
	}
	
	public void run() {
			studentRef.deposit(assigSubmission,trainerName);
	}
}

