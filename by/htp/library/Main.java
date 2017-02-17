package by.htp.library;

import by.htp.library.bean.Catalog;
import by.htp.library.service.LibraryService;
import by.htp.library.service.LibraryServiceException;
import by.htp.library.service.impl.LibraryServiceImpl;

public class Main{

public static void main(String[] args) {

		LibraryService service = new LibraryServiceImpl();
		Catalog catalog = new Catalog();
		try {
			service.createCatalog(catalog);
			service.printCatalog(catalog);
			
			service.addBook(catalog, null);
			service.writeCatalog(catalog);			
			
		} catch (LibraryServiceException e) {
			System.out.println(e.getMessage());}
    }
}
		