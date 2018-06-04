package example;

import example.entity.HotelManager;
import example.entity.MeetingRoom;
import org.junit.Assert;
import org.junit.Test;

public class MeetingRoomTest {

    @Test
    public void test_add_one_room(){
        HotelManager hotelManger = new HotelManager();
        MeetingRoom meetingRoom = new MeetingRoom();
        hotelManger.addMeetingRoom(meetingRoom);
        Assert.assertEquals(1,hotelManger.getMeetingRooms().size());

    }
    @Test
    public void test_add_two_room(){
        HotelManager hotelManger = new HotelManager();
        MeetingRoom meetingRoom = new MeetingRoom();
        MeetingRoom meetingRoom2 = new MeetingRoom();
        hotelManger.addMeetingRoom(meetingRoom);
        hotelManger.addMeetingRoom(meetingRoom2);
        Assert.assertEquals(2,hotelManger.getMeetingRooms().size());

    }

    @Test
    public void test_add_room_props(){
        HotelManager hotelManger = new HotelManager();
        MeetingRoom addRoom = new MeetingRoom("CityHotel","shanghai","50","800",false,"Anything");
        hotelManger.addMeetingRoom(addRoom);

        Assert.assertEquals(1,hotelManger.getMeetingRooms().size());
        MeetingRoom meetingRoom = hotelManger.getMeetingRooms().get(0);

        Assert.assertEquals("CityHotel", meetingRoom.getName());
        Assert.assertEquals("shanghai", meetingRoom.getLocation());
        Assert.assertEquals("50", meetingRoom.getNumberOfPeopleRongliang());
        Assert.assertEquals("800", meetingRoom.getPrice());
        Assert.assertEquals("", meetingRoom.getDescription());
    }
}
