public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Author authorOne = new Author("Михаил", "Булгаков");
        Book bookOne = new Book("Мастер и Маргарита",authorOne, 1967);
        Author authorTwo = new Author("Николай", "Гоголь");
        Book bookTwo = new Book("Мертвые души",authorTwo, 1841);
        bookTwo.setYearPublication(1842);
       System.out.println("authorOne.getName() = " + authorOne.getName());
        System.out.println("authorOne.getSurName() = " + authorOne.getSurName());
        System.out.println("bookOne.getTitle() = " + bookOne.getTitle());
        System.out.println("bookOne.getAuthor() = " + bookOne.getAuthor());
        System.out.println("bookOne.getYearPublication() = " + bookOne.getYearPublication());
        System.out.println("bookTwo.getYearPublication() = " + bookTwo.getYearPublication());

        System.out.println(bookOne);
        System.out.println(authorOne);
        System.out.println(bookTwo);
        System.out.println(authorTwo);
    }
}