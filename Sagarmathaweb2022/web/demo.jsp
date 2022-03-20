
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%//scriptlet tag
            int a=10;
            a++;
            //implicit object->already present, no need to re-instantiate.
            out.println(a);
            out.println("hello from jsp page");%> 
            <%-- expression tag|no semicolons--%>
            
            <%=a%>//used when single variable value is printed;