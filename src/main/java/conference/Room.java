package conference;

public class Room {
    public Room(){    }
    public Room(String roomid,String addr,double price){
        this.roomid = roomid;
        this.addr = addr;
        this.price = price;
    }
    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return this.roomid;
    }

    private String  roomid;
    private String addr;
    private double price;
}
