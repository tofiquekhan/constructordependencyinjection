package myproject.constructordepeninjection.beans;

public class Course {

	private String cid;
	private String cname;
	private int cost;
	

	
	public Course(String cid, int cost) {
		super();
		System.out.println("2-args Constructor");
		this.cid = cid;
		this.cost = cost;
	}


	public void getCourseDetails() {
		System.out.println("Course Details");
		System.out.println("-------------------------------");
		System.out.println("Course Id 		: "+cid);
		System.out.println("Course Name		: "+cname);
		System.out.println("Course Cost		: "+cost);
	}
	
	
	
}
