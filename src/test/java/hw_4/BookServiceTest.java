package hw_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void testBookServiceWithMockRepository() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        String idBook = "1";
        Book bookExpected = new Book("1", "Мастер и Маргарита", "М.А. Булгаков");

        when(bookRepository.findById(idBook)).thenReturn(new Book(idBook, "Мастер и Маргарита", "М.А. Булгаков"));
        Book book = bookService.findBookById(idBook);
        assertEquals(bookExpected.getAuthor(), book.getAuthor());
        assertEquals(bookExpected.getTitle(), book.getTitle());
        verify(bookRepository, times(1)).findById(idBook);
    }
}