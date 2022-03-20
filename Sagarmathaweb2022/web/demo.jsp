
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.Random,java.math.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!//decleation tag || not a scriptlet tag varibale decleared plus initialization
            int b=10;
            String s="apple";
            Random rand=new Random(10);//object creation
        %>
        
        <%//scriptlet tag
            int a=10;
            a++;
            //implicit object->already present, no need to re-instantiate.
            out.println(a);
            out.println("hello from jsp page"+b);
            out.println(rand.nextInt(6)+1);
        %> 
            <%-- expression tag|no semicolons //used when single variable value is printed;--%>
            
            
            <%= a%>