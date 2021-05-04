package garbage_code;


public class Book {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }
     public Book() {
        this("","");
        System.out.println("생성자 호출됨");
    }

    public Book(String title) {
        this(title, "작자미상"); //new Book도 안되고, Book도 안됨. new를 쓰는 경우 새 객체가 들어갈 영역을 할당하는 것이고, Book이라 쓰면 Book이라는 생성자가 아닌, Book이라는 함수가 호출되려고 함.
    }

    public Book(String title, String author)  {
        this.title = title;
        this.author = author;
    }
    public static void main(String[] args) {
        Book a = new Book();
    }
}
