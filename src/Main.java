
public class Main {

	//This is an attempt at problem 1
	
	public static void main(String[] args) {
		
		Quarantine q = new Quarantine();
		Person x = new Person(12345,"mmm");
		
		//Check add
		q.isolate(new Person(12345,"ooo"));
		q.isolate(new Person(12344));
		q.isolate(new Person(12343));
		q.isolate(x);
		q.isolate(x);
		System.out.println(q.peopleIsolated());
		//Check Duplicate
		q.isolate(new Person(12345));
		System.out.println();
		System.out.println(q.peopleIsolated());
		
		
	}
	
}
