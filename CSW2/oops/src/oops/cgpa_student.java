package oops;
interface cgpa_students
 {
	 public double calc_cgpa_students(student s);
	 
 }
 class cgpa_calc_btech implements cgpa_students
 {

	@Override
	public double calc_cgpa_students(student s) 
	{
		double sum=0;
		for(double mark:s.y_marks)
		{
			sum+=mark;
		}
		return sum/s.y_marks.length;
//		if(cgpa>8.5)
//		{
//			return 1;
//			
//		}
//		else if(cgpa>7.5)
//		{
//			return 2;
//		}
//		else
//		{
//			return 3;
//		}
	}
	 
 }
class student
{
	public student(String name, int age, double[] y_marks, int course_id) {
		super();
		this.name = name;
		this.age = age;
		this.y_marks = y_marks;
		this.course_id = course_id;
	}
	String name;
	int age;
	double[] y_marks;
	int course_id;
//	public int award_class()
//	{
//		double sum=0;
//		for(double mark:y_marks)
//		{
//			sum+=mark;
//		}
//		double cgpa=sum/y_marks.length;
//		if(cgpa>8.5)
//		{
//			return 1;
//			
//		}
//		else if(cgpa>7.5)
//		{
//			return 2;
//		}
//		else
//		{
//			return 3;
//		}
//	}
	
	
	public int award_class(cgpa_students e)
	{
		double cgpa = e.calc_cgpa_students(this);
		
		if(cgpa>8.5)
		{
			return 1;
			
		}
		else if(cgpa>7.5)
		{
			return 2;
		}
		else
		{
			return 3;
		}
	}
	
	

}
public class cgpa_student
{

	public static void main(String[] args) 
	{
		//cgpa_calc_btech f1=new cgpa_calc_btech();
		double a[]= {4,7,9,10};
         student s1_btech=new student("x1",20,a,1234);
      cgpa_students f1=new cgpa_students()
      {
    @Override	  
    public double calc_cgpa_students(student s) 
   	   {
   		double sum=0;
   		for(double mark:s.y_marks)
   		{
   			sum+=mark;
   		}
   		double cgpa=sum/s.y_marks.length;
   		return cgpa;

    }
   
  };
  
  
  cgpa_students f1_mtech=new cgpa_students()
  {
@Override	  
public double calc_cgpa_students(student s) 
	   {
		double sum=0, i=1;
		for(double mark:s.y_marks)
		{
			sum+=mark*i;
			i++;
		}
		double cgpa=sum/3;
		return cgpa;

}

};
	
s1_btech.award_class(f1_mtech);
}
}
