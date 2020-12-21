package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.User;
import com.LiteTravel.web.Model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
<<<<<<< Updated upstream
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
=======
     * @mbg.generated Sun Dec 20 22:43:15 CST 2020
>>>>>>> Stashed changes
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
<<<<<<< Updated upstream
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
=======
     * @mbg.generated Sun Dec 20 22:43:15 CST 2020
>>>>>>> Stashed changes
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
<<<<<<< Updated upstream
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
=======
     * @mbg.generated Sun Dec 20 22:43:15 CST 2020
>>>>>>> Stashed changes
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
<<<<<<< Updated upstream
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
=======
     * @mbg.generated Sun Dec 20 22:43:15 CST 2020
>>>>>>> Stashed changes
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
<<<<<<< Updated upstream
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
=======
     * @mbg.generated Sun Dec 20 22:43:15 CST 2020
>>>>>>> Stashed changes
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
<<<<<<< Updated upstream
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
=======
     * @mbg.generated Sun Dec 20 22:43:15 CST 2020
>>>>>>> Stashed changes
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
<<<<<<< Updated upstream
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
=======
     * @mbg.generated Sun Dec 20 22:43:15 CST 2020
>>>>>>> Stashed changes
     */
    User selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
<<<<<<< Updated upstream
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
=======
     * @mbg.generated Sun Dec 20 22:43:15 CST 2020
>>>>>>> Stashed changes
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
<<<<<<< Updated upstream
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
=======
     * @mbg.generated Sun Dec 20 22:43:15 CST 2020
>>>>>>> Stashed changes
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
<<<<<<< Updated upstream
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
=======
     * @mbg.generated Sun Dec 20 22:43:15 CST 2020
>>>>>>> Stashed changes
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
<<<<<<< Updated upstream
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
=======
     * @mbg.generated Sun Dec 20 22:43:15 CST 2020
>>>>>>> Stashed changes
     */
    int updateByPrimaryKey(User record);
}