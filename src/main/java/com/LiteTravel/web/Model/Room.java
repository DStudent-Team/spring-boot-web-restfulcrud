package com.LiteTravel.web.Model;

public class Room {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel_room.room_id
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private Integer roomId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel_room.hotel_id
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private Integer hotelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel_room.room_name
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private String roomName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel_room.room_price
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private Float roomPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel_room.room_remaining
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private Integer roomRemaining;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel_room.room_max
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private Integer roomMax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel_room.room_book_max
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private Integer roomBookMax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel_room.room_cancel
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private Integer roomCancel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel_room.room_size
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private Integer roomSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel_room.room_wifi
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private String roomWifi;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel_room.room_bed_add
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private Float roomBedAdd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel_room.room_description
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private String roomDescription;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel_room.room_id
     *
     * @return the value of travel_hotel_room.room_id
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel_room.room_id
     *
     * @param roomId the value for travel_hotel_room.room_id
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel_room.hotel_id
     *
     * @return the value of travel_hotel_room.hotel_id
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel_room.hotel_id
     *
     * @param hotelId the value for travel_hotel_room.hotel_id
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel_room.room_name
     *
     * @return the value of travel_hotel_room.room_name
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel_room.room_name
     *
     * @param roomName the value for travel_hotel_room.room_name
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel_room.room_price
     *
     * @return the value of travel_hotel_room.room_price
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public Float getRoomPrice() {
        return roomPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel_room.room_price
     *
     * @param roomPrice the value for travel_hotel_room.room_price
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setRoomPrice(Float roomPrice) {
        this.roomPrice = roomPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel_room.room_remaining
     *
     * @return the value of travel_hotel_room.room_remaining
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public Integer getRoomRemaining() {
        return roomRemaining;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel_room.room_remaining
     *
     * @param roomRemaining the value for travel_hotel_room.room_remaining
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setRoomRemaining(Integer roomRemaining) {
        this.roomRemaining = roomRemaining;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel_room.room_max
     *
     * @return the value of travel_hotel_room.room_max
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public Integer getRoomMax() {
        return roomMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel_room.room_max
     *
     * @param roomMax the value for travel_hotel_room.room_max
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setRoomMax(Integer roomMax) {
        this.roomMax = roomMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel_room.room_book_max
     *
     * @return the value of travel_hotel_room.room_book_max
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public Integer getRoomBookMax() {
        return roomBookMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel_room.room_book_max
     *
     * @param roomBookMax the value for travel_hotel_room.room_book_max
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setRoomBookMax(Integer roomBookMax) {
        this.roomBookMax = roomBookMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel_room.room_cancel
     *
     * @return the value of travel_hotel_room.room_cancel
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public Integer getRoomCancel() {
        return roomCancel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel_room.room_cancel
     *
     * @param roomCancel the value for travel_hotel_room.room_cancel
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setRoomCancel(Integer roomCancel) {
        this.roomCancel = roomCancel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel_room.room_size
     *
     * @return the value of travel_hotel_room.room_size
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public Integer getRoomSize() {
        return roomSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel_room.room_size
     *
     * @param roomSize the value for travel_hotel_room.room_size
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setRoomSize(Integer roomSize) {
        this.roomSize = roomSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel_room.room_wifi
     *
     * @return the value of travel_hotel_room.room_wifi
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public String getRoomWifi() {
        return roomWifi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel_room.room_wifi
     *
     * @param roomWifi the value for travel_hotel_room.room_wifi
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setRoomWifi(String roomWifi) {
        this.roomWifi = roomWifi == null ? null : roomWifi.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel_room.room_bed_add
     *
     * @return the value of travel_hotel_room.room_bed_add
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public Float getRoomBedAdd() {
        return roomBedAdd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel_room.room_bed_add
     *
     * @param roomBedAdd the value for travel_hotel_room.room_bed_add
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setRoomBedAdd(Float roomBedAdd) {
        this.roomBedAdd = roomBedAdd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel_room.room_description
     *
     * @return the value of travel_hotel_room.room_description
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel_room.room_description
     *
     * @param roomDescription the value for travel_hotel_room.room_description
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription == null ? null : roomDescription.trim();
    }
}