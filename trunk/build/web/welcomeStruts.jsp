<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>

<html:html locale="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" href="CSS/style.css">
        <html:base/>
    </head>
    <body style="background-color: white">
        
        <logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
            <div  style="color: red">
                ERROR:  Application resources not loaded -- check servlet container
                logs for error messages.
            </div>
        </logic:notPresent>
        <div id="stylized" class="login">
            <form id="form" name="form" method="post" action="/index.php">
                <h1>Mantech Helpdesk Login</h1>
                <p>Access your account</p>
                <!-- Name / Email -->
                <label for="email">Email</label>
                <input type="text" name="email" id="email" />
                <!-- Password -->
                <label for="password">Password</label>
                <input type="password" name="password" id="password" />
                <button type="submit">Login</button>
                <div class="spacer"></div>
            </form>
        </div>
        <tiles:insert attribute="footer"/>
    </body>
</html:html>
