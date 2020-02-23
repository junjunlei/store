package com.servlet.store.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 通用Servlet抽取
 *
 * @author leijunjun18@163.com
 * @create 2020-02-23 14:53
 */
public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // servlet 方法执行的时候 格式：localhost:8080/store/productServlet?method=addProduct
        //1.获取方法名
        String method = req.getParameter("method");
        if (method == null || "".equals(method) || "".equals(method.trim())) {
            method = "execute";
        }
        //2.获取方法对象
        //获取子类对象字节码
        Class clazz = this.getClass();
        //获取字类名为method的方法 方法类型为HttpServletRequest HttpServletResponse
        try {

            Method md = clazz.getMethod(method, HttpServletRequest.class, HttpServletResponse.class);
            if (md != null) {
                //3.让方法执行，接收返回值
                String jspPath = (String) md.invoke(this, req, resp);
                if (jspPath != null) {
                    //4.统一执行请求转发
                    req.getRequestDispatcher(jspPath).forward(req, resp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 默认执行
     * @param req
     * @param resp
     * @return
     * @throws Exception
     */
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        return null;
    }

}
