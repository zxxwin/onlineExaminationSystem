package com.newx.dao;

import com.newx.pojo.Paper;

public interface PaperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer paperId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated
     */
    int insert(Paper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated
     */
    int insertSelective(Paper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated
     */
    Paper selectByPrimaryKey(Integer paperId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Paper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Paper record);
}