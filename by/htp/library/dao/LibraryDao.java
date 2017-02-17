package by.htp.library.dao;

import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.bean.Edition;
import by.htp.library.bean.Magazine;
import by.htp.library.bean.Newspaper;

public interface LibraryDao {
	
	public  List<String> readInfo(String path) throws LibraryDaoException;
	public void writeInfo(List<String> list, String path) throws LibraryDaoException;

}
