package dao.model.base;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_password
     *
     * @mbg.generated
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_phone
     *
     * @mbg.generated
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_email
     *
     * @mbg.generated
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_create_time
     *
     * @mbg.generated
     */
    private Date userCreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_update_time
     *
     * @mbg.generated
     */
    private Date userUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_state
     *
     * @mbg.generated
     */
    private Byte userState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_group_id
     *
     * @mbg.generated
     */
    private String userGroupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_real_name
     *
     * @mbg.generated
     */
    private String userRealName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_sex
     *
     * @mbg.generated
     */
    private Byte userSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_age
     *
     * @mbg.generated
     */
    private Byte userAge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_group_top_id
     *
     * @mbg.generated
     */
    private String userGroupTopId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_role
     *
     * @mbg.generated
     */
    private Byte userRole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_img
     *
     * @mbg.generated
     */
    private String userImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_password
     *
     * @return the value of user.user_password
     *
     * @mbg.generated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_password
     *
     * @param userPassword the value for user.user_password
     *
     * @mbg.generated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_phone
     *
     * @return the value of user.user_phone
     *
     * @mbg.generated
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_phone
     *
     * @param userPhone the value for user.user_phone
     *
     * @mbg.generated
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_email
     *
     * @return the value of user.user_email
     *
     * @mbg.generated
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_email
     *
     * @param userEmail the value for user.user_email
     *
     * @mbg.generated
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_create_time
     *
     * @return the value of user.user_create_time
     *
     * @mbg.generated
     */
    public Date getUserCreateTime() {
        return userCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_create_time
     *
     * @param userCreateTime the value for user.user_create_time
     *
     * @mbg.generated
     */
    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_update_time
     *
     * @return the value of user.user_update_time
     *
     * @mbg.generated
     */
    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_update_time
     *
     * @param userUpdateTime the value for user.user_update_time
     *
     * @mbg.generated
     */
    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_state
     *
     * @return the value of user.user_state
     *
     * @mbg.generated
     */
    public Byte getUserState() {
        return userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_state
     *
     * @param userState the value for user.user_state
     *
     * @mbg.generated
     */
    public void setUserState(Byte userState) {
        this.userState = userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_group_id
     *
     * @return the value of user.user_group_id
     *
     * @mbg.generated
     */
    public String getUserGroupId() {
        return userGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_group_id
     *
     * @param userGroupId the value for user.user_group_id
     *
     * @mbg.generated
     */
    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId == null ? null : userGroupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_real_name
     *
     * @return the value of user.user_real_name
     *
     * @mbg.generated
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_real_name
     *
     * @param userRealName the value for user.user_real_name
     *
     * @mbg.generated
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_sex
     *
     * @return the value of user.user_sex
     *
     * @mbg.generated
     */
    public Byte getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_sex
     *
     * @param userSex the value for user.user_sex
     *
     * @mbg.generated
     */
    public void setUserSex(Byte userSex) {
        this.userSex = userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_age
     *
     * @return the value of user.user_age
     *
     * @mbg.generated
     */
    public Byte getUserAge() {
        return userAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_age
     *
     * @param userAge the value for user.user_age
     *
     * @mbg.generated
     */
    public void setUserAge(Byte userAge) {
        this.userAge = userAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_group_top_id
     *
     * @return the value of user.user_group_top_id
     *
     * @mbg.generated
     */
    public String getUserGroupTopId() {
        return userGroupTopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_group_top_id
     *
     * @param userGroupTopId the value for user.user_group_top_id
     *
     * @mbg.generated
     */
    public void setUserGroupTopId(String userGroupTopId) {
        this.userGroupTopId = userGroupTopId == null ? null : userGroupTopId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_role
     *
     * @return the value of user.user_role
     *
     * @mbg.generated
     */
    public Byte getUserRole() {
        return userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_role
     *
     * @param userRole the value for user.user_role
     *
     * @mbg.generated
     */
    public void setUserRole(Byte userRole) {
        this.userRole = userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_img
     *
     * @return the value of user.user_img
     *
     * @mbg.generated
     */
    public String getUserImg() {
        return userImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_img
     *
     * @param userImg the value for user.user_img
     *
     * @mbg.generated
     */
    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserCreateTime() == null ? other.getUserCreateTime() == null : this.getUserCreateTime().equals(other.getUserCreateTime()))
            && (this.getUserUpdateTime() == null ? other.getUserUpdateTime() == null : this.getUserUpdateTime().equals(other.getUserUpdateTime()))
            && (this.getUserState() == null ? other.getUserState() == null : this.getUserState().equals(other.getUserState()))
            && (this.getUserGroupId() == null ? other.getUserGroupId() == null : this.getUserGroupId().equals(other.getUserGroupId()))
            && (this.getUserRealName() == null ? other.getUserRealName() == null : this.getUserRealName().equals(other.getUserRealName()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserAge() == null ? other.getUserAge() == null : this.getUserAge().equals(other.getUserAge()))
            && (this.getUserGroupTopId() == null ? other.getUserGroupTopId() == null : this.getUserGroupTopId().equals(other.getUserGroupTopId()))
            && (this.getUserRole() == null ? other.getUserRole() == null : this.getUserRole().equals(other.getUserRole()))
            && (this.getUserImg() == null ? other.getUserImg() == null : this.getUserImg().equals(other.getUserImg()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserCreateTime() == null) ? 0 : getUserCreateTime().hashCode());
        result = prime * result + ((getUserUpdateTime() == null) ? 0 : getUserUpdateTime().hashCode());
        result = prime * result + ((getUserState() == null) ? 0 : getUserState().hashCode());
        result = prime * result + ((getUserGroupId() == null) ? 0 : getUserGroupId().hashCode());
        result = prime * result + ((getUserRealName() == null) ? 0 : getUserRealName().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserAge() == null) ? 0 : getUserAge().hashCode());
        result = prime * result + ((getUserGroupTopId() == null) ? 0 : getUserGroupTopId().hashCode());
        result = prime * result + ((getUserRole() == null) ? 0 : getUserRole().hashCode());
        result = prime * result + ((getUserImg() == null) ? 0 : getUserImg().hashCode());
        return result;
    }
}