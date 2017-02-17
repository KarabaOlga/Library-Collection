package by.htp.library.service;

import by.htp.library.bean.Catalog;
import by.htp.library.bean.Edition;

public interface LibraryService {
	
	void createCatalog(Catalog catalog) throws LibraryServiceException;
    void printCatalog(Catalog catalog);
	void addBook(Catalog catalog, Edition book);
	void addNewspaper(Catalog catalog, Edition newspaper);
	void addMagazine(Catalog catalog, Edition magazine);
	void writeCatalog(Catalog catalog) throws LibraryServiceException;
	
}
