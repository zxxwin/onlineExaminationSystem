package com.newx.dao;

import com.newx.pojo.UserAnswer;
import com.newx.pojo.UserAnswerKey;

public interface UserAnswerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_answer
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(UserAnswerKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_answer
     *
     * @mbggenerated
     */
    int insert(UserAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_answer
     *
     * @mbggenerated
     */
    int insertSelective(UserAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_answer
     *
     * @mbggenerated
     */
    UserAnswer selectByPrimaryKey(UserAnswerKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_answer
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_answer
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserAnswer record);
}