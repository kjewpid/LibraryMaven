import models.Book;
import models.BookCatalog;
import models.BookNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
        assertEquals(1, bc.getNumberOfBooks());
        bc.addBook(new Book(2, "Petite Tulipe", "Papillon", "", "", 300));
        assertEquals(2, bc.getNumberOfBooks());

    }

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
        Book result = bc.findBook(book1.getTitle());
        assertEquals(book1, result);
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException{
        Book result = bc.findBook(book1.getTitle().toUpperCase());
        assertEquals(book1, result);
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException{
        Book result = bc.findBook(book1.getTitle() + "  ");
        assertEquals(book1, result);
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {
        assertThrows(BookNotFoundException.class, () -> bc.findBook("NonExistentBook"));
    }

}
