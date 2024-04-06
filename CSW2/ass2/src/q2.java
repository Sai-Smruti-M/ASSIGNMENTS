class book<T>

{
    int bookid;
    String bookname;
    T price;
    book(int bookid,String bookname,T price)
    {
        this.bookid=bookid;
        this.bookname=bookname;
        this.price=price;

    }
    @Override
    public boolean equals(Object o)
    {
        book<T> obj=(book<T>)o;
        if(this.price.equals(obj.price))//465==465
        {
            return true;

        }
        else
        {
            return false;

        }

    }
}
    public class q2
 {
    public static void main(String[] args) 
    {
        book<Double> b1=new book<Double>(1251,"The black beauty",465.0);
        book<Double> b2=new book<Double>(1257,"The Theory of Everything",465.0);
        System.out.println(b1.equals(b2));
    }
}