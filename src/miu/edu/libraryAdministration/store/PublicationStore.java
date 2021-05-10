package miu.edu.libraryAdministration.store;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import miu.edu.libraryAdministration.model.publication.Cd;
import miu.edu.libraryAdministration.model.publication.Magazine;

public class PublicationStore {
	

	public List<Book> getBookStore() {
		return bookStore;
	}

	public List<Cd> getCdStore() {
		return cdStore;
	}

	public List<Magazine> getMagazineStore() {
		return magazineStore;
	}

	private static PublicationStore publcationStore;
	private  final List<Book> bookStore;
	private  final List<Cd> cdStore;
	private  final List<Magazine> magazineStore;
	
	private PublicationStore() {
		super();
		bookStore = new ArrayList<>();
		cdStore = new ArrayList<>();
		magazineStore = new ArrayList<>();
	}
	
	public static PublicationStore publicationStoreFactory() {
	if(publcationStore == null) {
		publcationStore = new PublicationStore();
		return publcationStore;
	}
	return publcationStore;
	}
}

