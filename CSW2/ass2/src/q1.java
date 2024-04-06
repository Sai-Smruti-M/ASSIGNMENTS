class STUDENT<T>
{
	public STUDENT(String name, T rollno, int age) {
		
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getRollno() {
		return rollno;
	}
	public void setRollno(T rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String name;
	T rollno;
	int age;
	@Override
	public boolean equals(Object o)
	{
		STUDENT<T> ob=(STUDENT<T>)o;
		if(this.rollno.equals(ob.rollno))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
}
public class q1 {

	public static void main(String[] args)
	{
		STUDENT<Double> s=new STUDENT<Double>("SAI",2.3,19);
		STUDENT<Integer> s2=new STUDENT<Integer>("AKSA",2,19);
		STUDENT<Double> s3=new STUDENT<Double>("SAI",2.3,19);
		
		System.out.println("details of student 1");
		System.out.println(s.getAge());
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		
		System.out.println("details of student 2");
		System.out.println(s2.getAge());
		System.out.println(s2.getName());
		System.out.println(s2.getRollno());
		
		System.out.println("details of student 3");
		System.out.println(s3.getAge());
		System.out.println(s3.getName());
		System.out.println(s3.getRollno());
		
		System.out.println("check the equality");
		System.out.println(s.equals(s3));
		
	}

}

