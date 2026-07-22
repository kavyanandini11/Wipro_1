public class BookDemo {

    public static void main(String[] args) {
        Author author = new Author("Robert Martin", "uncle.bob@cleancode.com", 'M');
        Book book = new Book("Clean Code", author, 550.75, 12);

        System.out.println("Book Details");
        System.out.println("Name        : " + book.getName());
        System.out.println("Price       : " + book.getPrice());
        System.out.println("Qty in stock: " + book.getQtyInStock());
        System.out.println("Author name : " + book.getAuthor().getName());
        System.out.println("Author email: " + book.getAuthor().getEmail());
        System.out.println("Author gender: " + book.getAuthor().getGender());
    }
}
