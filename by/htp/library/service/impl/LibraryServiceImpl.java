package by.htp.library.service.impl;

import java.util.List;

import by.htp.library.bean.Catalog;
import by.htp.library.bean.Edition;
import by.htp.library.dao.LibraryDao;
import by.htp.library.dao.LibraryDaoException;
import by.htp.library.dao.impl.LibraryDaoImpl;
import by.htp.library.service.LibraryService;
import by.htp.library.service.LibraryServiceException;

public class LibraryServiceImpl implements LibraryService {

	private static final String Books = "books.txt";
	private static final String Magazines = "magazines.txt";
	private static final String Newspapers = "newspapers.txt";
	private LibraryDao dao = new LibraryDaoImpl();

	@Override
	public void createCatalog(Catalog catalog) throws LibraryServiceException {
		try {
			catalog.setBooks(dao.readInfo(Books));
			catalog.setMagazines(dao.readInfo(Magazines));
			catalog.setNewspapers(dao.readInfo(Newspapers));
		} catch (LibraryDaoException e) {
			throw new LibraryServiceException("Error: " + e.getMessage(), e);
		}
	}

	@Override
	public void printCatalog(Catalog catalog) {
		System.out.println("Catalog: ");
		System.out.println("Books: ");
		for (Edition book : catalog.getBooks()) {
			System.out.println(book);
		}
		System.out.println("Magazines: ");
		for (Edition magazine : catalog.getMagazines()) {
			System.out.println(magazine);
		}
		System.out.println("Newspapers");
		for (Edition newspaper : catalog.getNewspapers()) {
			System.out.println(newspaper);
		}
	}

	@Override
	public void addBook(Catalog catalog,Edition book) {
		List<Edition> newBooks=catalog.getBooks();
		newBooks.add(book);
		catalog.setBooks(newBooks);
	}

	@Override
	public void addNewspaper(Catalog catalog,Edition newspaper) {
		catalog.getNewspapers().add(newspaper);
	}

	@Override
	public void addMagazine(Catalog catalog, Edition magazine) {
		catalog.getMagazines().add(magazine);
	}
	@Override
	public void writeCatalog(Catalog catalog) throws LibraryServiceException{
		System.out.println("Write catalog into files...");
		try {
		dao.writeInfo(catalog.getBooks(), Books);
	    dao.writeInfo(catalog.getMagazines(), Magazines);
		dao.writeInfo(catalog.getNewspapers(), Newspapers);

			System.out.println("Writing has done");
        } catch (LibraryDaoException e) {
	  	throw new LibraryServiceException("Error with data (service layer): " + e.getMessage(), e);
		}
	}
}
