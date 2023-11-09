package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class User
{
    @TableId(type = IdType.AUTO)
  private   long id;
  private   String name;
  private   String password;
    
    public User()
    {
    }
    
    public User(long id, String name, String password)
    {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    
    /**
     * 获取
     * @return id
     */
    public long getId()
    {
        return id;
    }
    
    /**
     * 设置
     * @param id
     */
    public void setId(long id)
    {
        this.id = id;
    }
    
    /**
     * 获取
     * @return name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * 设置
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * 获取
     * @return password
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * 设置
     * @param password
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String toString()
    {
        return "User{id = " + id + ", name = " + name + ", password = " + password + "}";
    }
}
