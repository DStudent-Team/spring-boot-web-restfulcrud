package com.LiteTravel.web.Model;

import java.math.BigDecimal;

public class Flight {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_id
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    private Integer flightId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_begin
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    private Integer flightBegin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_stop
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    private Integer flightStop;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_price
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    private BigDecimal flightPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_ticket_remain
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    private Integer flightTicketRemain;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_id
     *
     * @return the value of travel_flight.flight_id
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    public Integer getFlightId() {
        return flightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_id
     *
     * @param flightId the value for travel_flight.flight_id
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_begin
     *
     * @return the value of travel_flight.flight_begin
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    public Integer getFlightBegin() {
        return flightBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_begin
     *
     * @param flightBegin the value for travel_flight.flight_begin
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    public void setFlightBegin(Integer flightBegin) {
        this.flightBegin = flightBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_stop
     *
     * @return the value of travel_flight.flight_stop
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    public Integer getFlightStop() {
        return flightStop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_stop
     *
     * @param flightStop the value for travel_flight.flight_stop
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    public void setFlightStop(Integer flightStop) {
        this.flightStop = flightStop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_price
     *
     * @return the value of travel_flight.flight_price
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    public BigDecimal getFlightPrice() {
        return flightPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_price
     *
     * @param flightPrice the value for travel_flight.flight_price
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    public void setFlightPrice(BigDecimal flightPrice) {
        this.flightPrice = flightPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_ticket_remain
     *
     * @return the value of travel_flight.flight_ticket_remain
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    public Integer getFlightTicketRemain() {
        return flightTicketRemain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_ticket_remain
     *
     * @param flightTicketRemain the value for travel_flight.flight_ticket_remain
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    public void setFlightTicketRemain(Integer flightTicketRemain) {
        this.flightTicketRemain = flightTicketRemain;
    }
}