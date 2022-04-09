package Lab4;

public class Bookshelf extends Book {


	public Bookshelf(String string, String string2, String string3, String string4) 
	{
		super(string, string2, string3, string4);
	}
	public static void main(String[] args) {
		Bookshelf bf = new Bookshelf("Born to Fly","Rich David","Martin","12/10/2002");
		
		System.out.println("Title of the book : "+bf.title);
		System.out.println("Author of the book : "+bf.author);
		System.out.println("Publisher of the book : "+bf.publisher);
		System.out.println("CopyRight date of the book : "+ bf.date);
		System.out.println();
		System.out.println(bf.toString());
	
	}

}
