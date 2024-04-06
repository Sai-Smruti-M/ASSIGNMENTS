class Qn1
{
    public static void main(String[]args)
    {
        try{
        String s=null;
        System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("cant find the length of a null value");
        }
    }
}