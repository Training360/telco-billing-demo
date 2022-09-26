package training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookFileTest {

    @Test
    void getBook() {
        var file = new BookFile(BookFileTest.class.getResourceAsStream("/book.json"));
        assertEquals("Java", file.getBook().getTitle());
    }
}