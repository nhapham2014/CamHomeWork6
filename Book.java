package OOP_HomeWork;

import org.junit.Test;

public class Book extends Document{
     String AuthorName;
     int PageNumber;
     Book(String DocID, String NameXB, int NumberRelease, String AuthorName,int PageNumber){
        this.DocID=DocID;
        this.NameXB=NameXB;
        this.NumberRelease=NumberRelease;
        this.AuthorName=AuthorName;
        this.PageNumber=PageNumber;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Thông Tin Sách:");
        System.out.println("Mã Tài Liệu:"+DocID);
        System.out.println("Nhà Xuất Bản:"+NameXB);
        System.out.println("Số bản phát hành:"+NumberRelease);
        System.out.println("Tên tác giả:"+AuthorName);
        System.out.println("Số trang:"+PageNumber);

    }

}
