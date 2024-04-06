package ass1;
import java.util.*;
public class gb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>as=new ArrayList<Integer>();
as.add(10);
as.add(20);
as.add(30);
ListIterator<Integer>it=as.listIterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
while(it.hasPrevious()) {
	System.out.println(it.previous());
}
it.add(100);
System.out.println(as);
it.next();
it.set(200);
System.out.println(as);
	}

}
