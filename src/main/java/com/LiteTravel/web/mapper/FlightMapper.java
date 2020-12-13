package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.Flight;
import com.LiteTravel.web.Model.FlightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    long countByExample(FlightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    int deleteByExample(FlightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    int deleteByPrimaryKey(Integer flightId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    int insert(Flight record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    int insertSelective(Flight record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    List<Flight> selectByExample(FlightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    Flight selectByPrimaryKey(Integer flightId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    int updateByExampleSelective(@Param("record") Flight record, @Param("example") FlightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    int updateByExample(@Param("record") Flight record, @Param("example") FlightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    int updateByPrimaryKeySelective(Flight record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight
     *
     * @mbg.generated Sun Dec 13 09:17:44 CST 2020
     */
    int updateByPrimaryKey(Flight record);
}