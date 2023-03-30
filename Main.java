package OOP_HomeWork;

import org.junit.Test;

public class Main {
    @Test
    public void Test_Document(){
        Book book = new Book("10520","ABC",10,"Nha Pham",50);
        book.DisplayInfo();
        Magazine magazine = new Magazine("10521","Sao Vang",25,126,"03/2023");
        magazine.DisplayInfo();
        Newspaper news= new Newspaper("105202","Phuong Nam",30,"10/04/2023");
        news.DisplayInfo();
    }
}
