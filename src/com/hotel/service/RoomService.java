package com.hotel.service;

import com.hotel.pojo.Room;
import com.hotel.util.Pager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * com.hotel.service
 *
 * @desc
 * @author:EumJi
 * @year: 2016
 * @month: 10
 * @day: 18
 * @time: 2016/10/18
 */
public interface RoomService {
    List<Room> getAllRoom(Pager<Room> pager, HashMap<String, Object> paramMap);
    List<Room> getPartRoom(Pager<Room> pager, HashMap<String, Object> paramMap);

    Room getRoomInfoById(String id);

    int deleteRoomsById(Map<String, String[]> roomsId);

    boolean updateRoomState(Room room);

    List<Room> getRoomByOwnerId(Pager<Room> pager, HashMap<String, Object> paramMap);

}
