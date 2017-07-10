package com.newx.pojo;

import java.util.Date;

public class Score extends ScoreKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.score
     *
     * @mbggenerated
     */
    private Integer score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.join_time
     *
     * @mbggenerated
     */
    private Date joinTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.pass
     *
     * @mbggenerated
     */
    private Integer pass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.submit_time
     *
     * @mbggenerated
     */
    private Date submitTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public Score(Integer userId, Integer paperId, Integer score, Date joinTime, Integer pass, Date submitTime) {
        super(userId, paperId);
        this.score = score;
        this.joinTime = joinTime;
        this.pass = pass;
        this.submitTime = submitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public Score() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.score
     *
     * @return the value of score.score
     *
     * @mbggenerated
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.score
     *
     * @param score the value for score.score
     *
     * @mbggenerated
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.join_time
     *
     * @return the value of score.join_time
     *
     * @mbggenerated
     */
    public Date getJoinTime() {
        return joinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.join_time
     *
     * @param joinTime the value for score.join_time
     *
     * @mbggenerated
     */
    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.pass
     *
     * @return the value of score.pass
     *
     * @mbggenerated
     */
    public Integer getPass() {
        return pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.pass
     *
     * @param pass the value for score.pass
     *
     * @mbggenerated
     */
    public void setPass(Integer pass) {
        this.pass = pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.submit_time
     *
     * @return the value of score.submit_time
     *
     * @mbggenerated
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.submit_time
     *
     * @param submitTime the value for score.submit_time
     *
     * @mbggenerated
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }
}