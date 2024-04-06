package q1;
class pair<K,V>
{
	private K key;
	private V value;
	pair(K key, V value)
	{
		this.key=key;
		this.value=value;
		
	}
	public K getk() 
	{
		return key;
	}
	
	public V getv()
	{
		return value;
	}
	
	
	
}
public class q1 
{

	public static void main(String[] args)
	{
		pair<Integer,String> mypair1=new pair<Integer,String>(1,"SAI");
		pair<Double,String> mypair2=new pair<Double,String>(2.0,"AKSA");
        System.out.println("{Key:"+mypair1.getk()+", value:"+mypair1.getv()+"}");
        System.out.println("{Key:"+mypair2.getk()+", value:"+mypair2.getv()+"}");

	}

}
