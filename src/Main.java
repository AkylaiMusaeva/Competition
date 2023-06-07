
public class Main {
    public static void main(String[] args) {
        Book book=new Book("Askar","Kenneshov");
        book.vipName(book.getName());
        book.replaceLetters(book.getAuthor());

    }

}