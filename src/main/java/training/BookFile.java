package training;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;

@Getter
@Slf4j
public class BookFile {

    private Book book;

    public BookFile(InputStream stream) {
        log.info("Reading file");
        ObjectMapper objectMapper = new ObjectMapper();
        try (stream) {
            book = objectMapper.readValue(stream, Book.class);
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Can not read file", e);
        }
    }

}
