package OOP_HomeWork;

import java.util.Date;

public class Magazine extends Document{
    int Release;
    String MonthRelease;
    Magazine(String DocID, String NameXB, int NumberRelease, int Release,String MonthRelease){
        this.DocID=DocID;
        this.NameXB=NameXB;
        this.NumberRelease=NumberRelease;
        this.Release=Release;
        this.MonthRelease=MonthRelease;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Thông Tin tạp chí:");
        System.out.println("Mã Tài Liệu:"+DocID);
        System.out.println("Nhà Xuất Bản:"+NameXB);
        System.out.println("Số bản phát hành:"+NumberRelease);
        System.out.println("Tên tác giả:"+Release);
        System.out.println("Số trang:"+MonthRelease);
    }
}
