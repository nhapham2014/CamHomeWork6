package OOP_HomeWork;

public class Newspaper extends Document{
    String DateRelease;
    Newspaper(String DocID, String NameXB, int NumberRelease, String DateRelease){
        this.DocID=DocID;
        this.NameXB=NameXB;
        this.NumberRelease=NumberRelease;
        this.DateRelease=DateRelease;

    }
    @Override
    public void DisplayInfo() {
        System.out.println("Thông tin báo:");
        System.out.println("Mã Tài Liệu:"+DocID);
        System.out.println("Nhà Xuất Bản:"+NameXB);
        System.out.println("Số bản phát hành:"+NumberRelease);
        System.out.println("Số trang:"+DateRelease);
    }
}
