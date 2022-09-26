package training;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.Locale;

public class GeneratedBookFile {

    private Book book;

    public GeneratedBookFile(Book book) {
        this.book = book;
    }

    public String generate() {
        var resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("/templates/");
        resolver.setTemplateMode("HTML");
        resolver.setSuffix(".html");
        var templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(resolver);
        var context = new Context(new Locale("hu", "HU"));
        context.setVariable("book", book);
        return templateEngine.process("book-template", context);
    }
}
