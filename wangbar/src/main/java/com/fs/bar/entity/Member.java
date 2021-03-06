package com.fs.bar.entity;
import java.io.Serializable;
import java.util.Date;
public class Member implements Serializable{
private static final long serialVersionUID = 1L;
private Long id;//

private String username;//用户名即使用手机号
private String pawword;//密码
private String nickname;//昵称
private String avatar;//头像
private Integer status;//0正常  1删除
private Integer type;//0普通用户 1网吧管理者
private Date createTime;//创建时间

public Long getId(){
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getUsername(){
return username;
}

public void setUsername(String username) {
this.username = username;
}

public String getPawword(){
return pawword;
}

public void setPawword(String pawword) {
this.pawword = pawword;
}

public String getNickname(){
return nickname;
}

public void setNickname(String nickname) {
this.nickname = nickname;
}

public String getAvatar(){
return avatar;
}

public void setAvatar(String avatar) {
this.avatar = avatar;
}

public Integer getStatus(){
return status;
}

public void setStatus(Integer status) {
this.status = status;
}

public Integer getType(){
return type;
}

public void setType(Integer type) {
this.type = type;
}

public Date getCreateTime(){
return createTime;
}

public void setCreateTime(Date createTime) {
this.createTime = createTime;
}
}