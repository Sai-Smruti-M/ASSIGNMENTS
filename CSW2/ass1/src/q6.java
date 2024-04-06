import java.util.*;
abstract class libraryresource
{
	private String title;
	private String author;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public libraryresource(String title, String author)
	{
		super();
		this.title = title;
		this.author = author;
	}
	
	public abstract void displaydetails();
	
}
class book extends libraryresource{
	private int pageCount;
	public int getPageCount() {
		return pageCount;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public book(String title, String author,int pageCount)
	{
		super(title, author);
		this.pageCount=pageCount;
	}
	
	@Override
	public void displaydetails() {
		System.out.println("BOOK TITLE:- "+getTitle()+"\nAUTHOR:- "+getAuthor()+"\nPAGE COUNT:- "+this.pageCount);
	}
	
}

class magazine extends libraryresource
{
	public String getIssuedate() {
		return issuedate;
	}
	
	public void setissuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	
	private String issuedate;
	public magazine(String title, String author, String issuedate) 
	{
		super(title, author);
		this.issuedate=issuedate;
	}
	
	@Override
	public void displaydetails() {
		System.out.println("MAGAZINE TITLE:- "+getTitle()+"\nAUTHOR:- "+getAuthor()+"\nDATE OF ISSUE:- "+this.issuedate);
	}
	
}

class DVD extends libraryresource{
	private int duration;
	public DVD(String title, String author,int duration) {
		super(title, author);
		this.duration=duration;
	}

	@Override
	public void displaydetails() {
		System.out.println("DVD TITLE:- "+getTitle()+"\nAUTHOR:- "+getAuthor()+"\nDURATION:- "+this.duration+" minutes");
	}
	
}

public class q6{

	public static void main(String[] args) {
		libraryresource b=new book("title1","author1",55);
		libraryresource Magazine=new magazine("title2","author2","24.07.2024");
		libraryresource DVD=new DVD("title3","author3",77);
		System.out.println("the details are:- ");
		System.out.println();
		
		b.displaydetails();
		System.out.println();
		
		Magazine.displaydetails();
		System.out.println();
		
		DVD.displaydetails();
	}

}