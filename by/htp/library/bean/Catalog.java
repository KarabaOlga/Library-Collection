package by.htp.library.bean;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
	
	List<Edition> books = new ArrayList<>();
	List<Edition> newspapers = new ArrayList<>();
	List<Edition> magazines = new ArrayList<>();

	public List<Edition> getBooks(){
		return books;
	}
	public void setBooks(List<Edition> books){
		this.books = books;
	}
	public List<Edition> getNewspapers() {
		return newspapers;
	}
	public void setNewspapers(List<Edition> newspapers) {
		this.newspapers = newspapers;
	}
	public List<Edition> getMagazines() {
		return magazines;
	}
	public void setMagazines(List<Edition> magazines) {
		this.magazines = magazines;
	}
	
}

    //private Book[] books;
   // private Magazine[] magazines;
   // private Newspaper[] newspapers;
   // private int lastIndex;
    
/*
    public Catalog(int sizeB, int sizeN, int sizeM){
    	lastIndex=0;
    	books = new Book[sizeB];
    	newspapers = new Newspaper[sizeN];
    	magazines = new Magazine[sizeM];
    }
    
    public void addBook(Edition book){
    	if (lastIndex < books.length) {
  		  books[lastIndex]=(Book)book ; 
  		  lastIndex++;
  		  }
    	else System.out.println("enough");
	}
    public void addMagazine(Edition magazine){
    	if (lastIndex < books.length) {
  		  magazines[lastIndex]=(Magazine)magazine ; 
  		  lastIndex++;
  		  }
    	else System.out.println("enough");
	}
    
   public void addNewspaper(Edition newspaper,int lastIndex){
	   if (lastIndex < books.length) {
	  		  newspapers[lastIndex]=(Newspaper)newspaper ; 
	  		  lastIndex++;
	  		  }
	    	else System.out.println("enough");
	   }
	   public void removeBook(Book[] books, Book match){
	    	int i=0;
	    	for(int j=0; j<books.length; j++){
	    		if (books[j] != match){
	    			books[i++]=books[j];
	    		          }
	    	      }
	    	while (i<books.length){
	    		books[i++] = null;
	    	      }
	    	}
	  
	    public Book[] getBooks(){
	    	return books;
	    }
	    public void setBooks(Book[] books){
	    	this.books=books;
	    }
	    public Newspaper[] getNewspapers(){
	    	return newspapers;
	    }
	    public void setBooks(Newspaper[] newspapers){
	    	this.newspapers=newspapers;
	    }
	    public Magazine[] getMagazines(){
	    	return magazines;
	    }
	    public void setMagazines(Magazine[] magazines){
	    	this.magazines=magazines;
	    }
	    */
	  
   

    
