package com.newx.pojo;

public class ScoreKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.paper_id
     *
     * @mbggenerated
     */
    private Integer paperId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public ScoreKey(Integer userId, Integer paperId) {
        this.userId = userId;
        this.paperId = paperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public ScoreKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.user_id
     *
     * @return the value of score.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.user_id
     *
     * @param userId the value for score.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.paper_id
     *
     * @return the value of score.paper_id
     *
     * @mbggenerated
     */
    public Integer getPaperId() {
        return paperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.paper_id
     *
     * @param paperId the value for score.paper_id
     *
     * @mbggenerated
     */
    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }
}