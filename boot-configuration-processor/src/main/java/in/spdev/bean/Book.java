package in.spdev.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "book")
public class Book {

    @Autowired
    private Publication publication;

    String author;

    String isbn;

    String title;

    String publisher;

    int version;

    double price;

    @Override
    public String toString() {
        return "Book{" +
                "publication=" + publication +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", version=" + version +
                ", price=" + price +
                '}';
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
