
public class hash {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "hash [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static void main(String[] args)
	{
		hash ob1=new hash();
		System.out.println(ob1);
		//hash@5a07e868:hexadecimal format
		//total 32 bit
		//class_name@hash code
		
		System.out.println(ob1.toString());
		//it will give the same thing
		//toString method will return the string type 
		//in the same format
		//we can override toString
		//simply right click and go for source 
		//then generate toString
		//it is overriding from the root class object
		//which has the toString method
		//if u create any class in java it acts as a chain class 
		//of object
		//even if u don't write extends
		System.out.println("ob1="+ob1.hashCode());
		//returns some integer value 
		//for a particular object
		System.out.println(ob1.equals(ob1));
		//it will check whether two objects are equal or not
		//
		
		hash ob2=ob1;
		//it will refer the same memory space which ob1 refers to
		System.out.println("ob2="+ob2.hashCode());
		//u see both ob1 and ob2 are equal
		//a method of creating hash code through objects may be
		//unique 
		//but via other methods may not be unique           
		//101%5
		//102%5
		//WHATEVER THE REMAINDER IS ,IT ACTS AS THE INDEX OF IN MEMORY 
		
	}

}
