package garbage_Cllctn;


public class pgm1 {
 private String myObject;
 public pgm1(String myObject) 
 { 
 this.myObject = myObject; 
 } 
 public static void main(String args[]) 
 { 
 pgm1 testObject1 = new pgm1("testObject1"); 
 // Setting testObject1 to Null will qualify it for the garbage collection
 testObject1 = null; 
 // Requesting garbage collection
 System.gc(); 
 } 
 @Override
 protected void finalize() throws Throwable 
 {
 // following line will confirm the garbage collected method name
 System.out.println("Garbage collection is succcessful for " + this.myObject);
 //Once the memory allocated to a certain variable or object is deemed useless and the purpose of the variable or object has 
// been completed, it is important for the allocated memory to be recycled and be usable for other purposes. And that is where 
// the garbage collector in Java comes into play
 //Another plus in Java is that if there are ever any objects that are not referenced, they are automatically removed from heap 
// memory to free up space for other objects and variables, making this an extremely memory-efficient language
 }
}