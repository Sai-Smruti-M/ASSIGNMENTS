package q6;

class animal
{
    String name;
    String color;
    String type;
    animal(String name,String color,String type)
    {
        this.name=name;
        this.color=color;
        this.type=type;


    }
    @Override
	public int hashCode() 
    {
		
		int a = 23;
        int b = 1;
        b = a * b + ((name == null) ? 0 : name.hashCode());
        b = a * b + ((color == null) ? 0 : color.hashCode());
        b = a * b + ((type == null) ? 0 : type.hashCode());
        return b;
	}
   

}
    public class q6 
{
    public static void main(String[] args)
     {
        animal dog = new animal("Dog", "black", "Pet");
        animal cat = new animal("Cat", "yellow", "Pet");
        animal tiger = new animal("Tiger", "white", "Wild");

        System.out.println("Dog hashCode: " + dog.hashCode());
        System.out.println("Cat hashCode: " + cat.hashCode());
        System.out.println("Tiger hashCode: " + tiger.hashCode());
    }
}