public class Main {
    public static void division() {
        System.out.println("______________________________");
    }
    public static void main(String[] args) {
        Author lermontov = new Author("Михаил", "Лермонтов");
        Author pushkin = new Author("Александр", "Пушкин");
        Book maskarad = new Book("Маскарад", lermontov, 1835);
        Book borisGodunov = new Book("Борис Годунов", pushkin, 1831);
        division();
        System.out.println("Название книги - " + maskarad.getName());
        System.out.println("Автор - " + maskarad.getAuthor());
        System.out.println("Год публикации - " + maskarad.getYear());
        division();
        System.out.println("Название книги - " + borisGodunov.getName());
        System.out.println("Автор - " + borisGodunov.getAuthor());
        System.out.println("Год публикации - " + borisGodunov.getYear());
        division();
        maskarad.setYear(1834);
        System.out.println("Внесены изменения:");
        System.out.println("Название книги - " + maskarad.getName());
        System.out.println("Автор - " + maskarad.getAuthor());
        System.out.println("Год публикации - " + maskarad.getYear());
        division();



    }
}
