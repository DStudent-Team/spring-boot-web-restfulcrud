package com.LiteTravel.web.Model;

import java.math.BigDecimal;

public class Bed {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_bed.bed_id
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private Integer bedId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_bed.bed_name
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private String bedName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_bed.bed_size
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    private BigDecimal bedSize;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_bed.bed_id
     *
     * @return the value of travel_bed.bed_id
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public Integer getBedId() {
        return bedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_bed.bed_id
     *
     * @param bedId the value for travel_bed.bed_id
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_bed.bed_name
     *
     * @return the value of travel_bed.bed_name
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_bed.bed_name
     *
     * @param bedName the value for travel_bed.bed_name
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setBedName(String bedName) {
        this.bedName = bedName == null ? null : bedName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_bed.bed_size
     *
     * @return the value of travel_bed.bed_size
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public BigDecimal getBedSize() {
        return bedSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_bed.bed_size
     *
     * @param bedSize the value for travel_bed.bed_size
     *
     * @mbg.generated Mon Dec 21 17:35:48 CST 2020
     */
    public void setBedSize(BigDecimal bedSize) {
        this.bedSize = bedSize;
    }
}