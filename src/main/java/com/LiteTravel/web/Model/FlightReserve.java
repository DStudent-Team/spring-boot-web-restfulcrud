package com.LiteTravel.web.Model;

public class FlightReserve {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight_reserve.reserve_id
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    private Integer reserveId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight_reserve.flight_id
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    private Integer flightId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight_reserve.total
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    private Float total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight_reserve.selected
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    private Boolean selected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight_reserve.company_id
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight_reserve.service
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    private String service;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight_reserve.reserve_id
     *
     * @return the value of travel_flight_reserve.reserve_id
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    public Integer getReserveId() {
        return reserveId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight_reserve.reserve_id
     *
     * @param reserveId the value for travel_flight_reserve.reserve_id
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    public void setReserveId(Integer reserveId) {
        this.reserveId = reserveId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight_reserve.flight_id
     *
     * @return the value of travel_flight_reserve.flight_id
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    public Integer getFlightId() {
        return flightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight_reserve.flight_id
     *
     * @param flightId the value for travel_flight_reserve.flight_id
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight_reserve.total
     *
     * @return the value of travel_flight_reserve.total
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    public Float getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight_reserve.total
     *
     * @param total the value for travel_flight_reserve.total
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    public void setTotal(Float total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight_reserve.selected
     *
     * @return the value of travel_flight_reserve.selected
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    public Boolean getSelected() {
        return selected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight_reserve.selected
     *
     * @param selected the value for travel_flight_reserve.selected
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight_reserve.company_id
     *
     * @return the value of travel_flight_reserve.company_id
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight_reserve.company_id
     *
     * @param companyId the value for travel_flight_reserve.company_id
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight_reserve.service
     *
     * @return the value of travel_flight_reserve.service
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    public String getService() {
        return service;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight_reserve.service
     *
     * @param service the value for travel_flight_reserve.service
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }
}