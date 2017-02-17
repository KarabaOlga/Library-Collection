package by.htp.library.dao.impl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import by.htp.library.dao.LibraryDaoException;
import by.htp.library.bean.Book;
import by.htp.library.bean.Edition;
import by.htp.library.bean.Magazine;
import by.htp.library.bean.Newspaper;
import by.htp.library.dao.LibraryDao;

public class LibraryDaoImpl implements LibraryDao {

	@Override
	public List<String> readInfo(String path) throws LibraryDaoException {
		List<String> result = new ArrayList<>();
		try ( BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(new File(getClass().getClassLoader().getResource(path).getFile()))))){
		String line;
			while ((line = br.readLine())!= null) {
				result.add(line);
			}
		} catch (IOException e) {
			throw new LibraryDaoException("Reading: there is problem with data file (dao layer)", e);
		
		}
		return result;
	}

	@Override
	public void writeInfo(List<String> list, String path) throws LibraryDaoException {
		try (FileWriter writer = new FileWriter("d:/"+path, false)) {
			for (String e: list) {
				writer.write(e);
				writer.append('\n');				
			}
			writer.flush();
		} catch (IOException e) {
			throw new LibraryDaoException("Writing: there is problem with data file (dao layer)", e);
		}
	}
}


