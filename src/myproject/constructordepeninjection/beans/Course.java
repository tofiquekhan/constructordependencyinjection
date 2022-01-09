package myproject.constructordepeninjection.beans;

public class Course {

	private String cid;
	private String cname;
	private int cost;
	
	public Course() {
		super();
		System.out.println("0-args Constructor");
	}
	
	public Course(String cid) {
		super();
		System.out.println("1-args Constructor");
		this.cid = cid;
	}
	
	public Course(String cid, String cname) {
		super();
		System.out.println("2-args Constructor");
		this.cid = cid;
		this.cname = cname;
	}

	
	public Course(String cid, String cname, int cost) {
		super();
		System.out.println("3-args Constructor");
		this.cid = cid;
		this.cname = cname;
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
