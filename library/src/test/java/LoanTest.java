import models.Book;
import models.Customer;
import models.Loan;
import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LoanTest {

    //VG
    @Test
    public void testDueDate() {
        Loan loan = new Loan(1,
                new Customer("Mrs", "Tulipe", "De L'anoé", "", "", "", 1, GenderType.UNKNOWN),
                new Book(1, "Tulipe's Garden", "Papillon", "", "", 300));

        LocalDate expectedDate = LocalDate.now().plusDays(14);

        assertEquals(expectedDate, loan.getDueDate());


    }
}