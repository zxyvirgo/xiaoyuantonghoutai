package com.xyt.action;

import java.io.IOException;  
import java.io.UnsupportedEncodingException;  
import java.util.ArrayList;  
import java.util.List;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import org.apache.struts2.interceptor.ServletRequestAware;  
import org.apache.struts2.interceptor.ServletResponseAware;    
import com.opensymphony.xwork2.ActionSupport;  
import com.xyt.pageModel.Json;
import com.xyt.pageModel.User;
  
public class LoginAction extends ActionSupport implements ServletRequestAware,  
        ServletResponseAware  
{  
  
    /** * */  
    private static final long serialVersionUID = 1L;  
  
    HttpServletRequest request;  
  
    HttpServletResponse response;  
  
    private String username;  
  
    private String password;  
  
    public String getPassword()  
    {  
        return password;  
    }  
  
    public void setPassword(String password)  
    {  
        this.password = password;  
    }  
  
    public String getUsername()  
    {  
        return username;  
    }  
  
    public void setUsername(String username)  
    {  
        this.username = username;  
    }  
  
    public void setServletRequest(HttpServletRequest request)  
    {  
        this.request = request;  
    }  
  
    public void setServletResponse(HttpServletResponse response)  
    {  
        this.response = response;  
    }  
  
    /**  
     * 模拟用户登录的业务  
     */  
    public void login()  
    {  
        returnUserInfo();  
    }  
  
    private void returnUserInfo()  
    {  
  
        this.response.setContentType("text/json;charset=utf-8");  
        this.response.setCharacterEncoding("UTF-8");  
        String json;  
        if (username == null || password == null)  
        {  
  
            json = "请求参数错误";  
            flushData(json);  
            return;  
        }  
        if (username.equals("123") && password.equals("123"))  
        {  
            List<User> list = new ArrayList<User>();  
            Json gson = new Json();  
            for (int i = 0; i < 10; i++)  
            {  
                User st = new User();  
                 st.setUserId("10");
                 st.setName("zxy");
                list.add(st);  
            }  
          //  json = gson.toJson(list);  
            json = gson.getMsg();
        }  
        else  
        {  
            json = "非法登陆信息！";  
        }  
        flushData(json);  
    }  
  
    private void flushData(String json)  
    {  
        byte[] jsonBytes;  
        try  
        {  
            jsonBytes = json.getBytes("utf-8");  
            response.setContentLength(jsonBytes.length);  
            response.getOutputStream().write(jsonBytes);  
            response.getOutputStream().flush();  
        }  
        catch (UnsupportedEncodingException e)  
        {  
            e.printStackTrace();  
        }  
        catch (IOException e)  
        {  
            e.printStackTrace();  
        }  
        finally  
        {  
            try  
            {  
                response.getOutputStream().close();  
            }  
            catch (IOException e)  
            {  
                e.printStackTrace();  
            }  
        }  
  
    }  
}  
