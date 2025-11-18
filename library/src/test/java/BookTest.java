import models.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book1 = new Book(1, "Petit Papillon", "Tulipe", "", "", 300);
    private Book book2 = new Book(1, "Petit Papillon", "Tulipe", "", "", 300);
    private Book book3 = new Book(2, "Petite Tulipe", "Papillon", "", "", 250);

	//G
	@Test
	public void test2EqualBooks() {
        assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
        assertNotEquals(book1, book3);
	}

}
