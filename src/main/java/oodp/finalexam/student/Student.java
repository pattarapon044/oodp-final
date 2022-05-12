package oodp.finalexam.student;



public class Student {
	private String name;
    private String id;
    private int year;
    private double GPA;
    
  
    public Student(String name, String id, int year, double GPA) {
    	//TODO: create constructor which accept parameter as name, id, year, and GPA, respectively
        
        
    }
    
   //TODO: complete  tostring() method which should return, 
   //for example "Student ID:[001], name:[Anna], year:[1] ,GPA:[3.0]"
    public String toString() {
        return null;
          
    }    
    
   
	public boolean isMoreGPA(Student other) {
        return GPA > other.GPA;
    }
    
  
    public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public int getYear() {
		return year;
	}

	public double getGPA() {
		return GPA;
	}


}
