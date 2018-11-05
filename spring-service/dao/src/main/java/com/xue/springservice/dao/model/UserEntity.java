package com.xue.springservice.dao.model;/**
 * Created by Administrator on 2018/11/5.
 */

/**
 * @program: spring-cloud
 * @description:
 * @author: whf
 * @create: on 2018/11/5.
 **/
public class UserEntity {
    Long id ;
    String userName;
    String passWord;
    UserSexEnum userSex;
    String nickName;

    public UserEntity() {
    }

    public UserEntity(String userName, String passWord, UserSexEnum use_sex) {
        this.userName = userName;
        this.passWord = passWord;
        this.userSex = use_sex;
    }

    public UserEntity(Long id, String userName, String passWord, UserSexEnum userSex, String nickName) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.userSex = userSex;
        this.nickName = nickName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public UserSexEnum getUserSex() {
        return userSex;
    }

    public void setUserSex(UserSexEnum userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
