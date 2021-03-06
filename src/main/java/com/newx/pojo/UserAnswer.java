package com.newx.pojo;

public class UserAnswer extends UserAnswerKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_answer.answer
     *
     * @mbggenerated
     */
    private String answer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_answer.result
     *
     * @mbggenerated
     */
    private Integer result;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_answer
     *
     * @mbggenerated
     */
    public UserAnswer(Integer userId, Integer paperId, Integer questionId, String answer, Integer result) {
        super(userId, paperId, questionId);
        this.answer = answer;
        this.result = result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_answer
     *
     * @mbggenerated
     */
    public UserAnswer() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_answer.answer
     *
     * @return the value of user_answer.answer
     *
     * @mbggenerated
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_answer.answer
     *
     * @param answer the value for user_answer.answer
     *
     * @mbggenerated
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_answer.result
     *
     * @return the value of user_answer.result
     *
     * @mbggenerated
     */
    public Integer getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_answer.result
     *
     * @param result the value for user_answer.result
     *
     * @mbggenerated
     */
    public void setResult(Integer result) {
        this.result = result;
    }
}