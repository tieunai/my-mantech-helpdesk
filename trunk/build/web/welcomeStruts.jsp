<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<html:html locale="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" href="CSS/style.css">
        <link rel="stylesheet" type="text/css" href="mos-css/mos-style.css">
        <html:base/>
    </head>
    
    <body style="background-color: white">
        <div id="header">
            <!--<div class="inHeader">
                <div class="mosAdmin">
                    Hallo, Mas Administrator<br>
                    <a href="">Lihat website</a> | <a href="">Help</a> | <a href="login.html">Keluar</a>
                </div>
                <div class="clear"></div>
            </div>-->
             <tiles:insert attribute="header" />
        </div>
        
        <div id="wrapper">
            <div id="leftBar">
                <!-- <ul>
                    <!--<li><a href="index.html">Dashboard</a></li>
                    <li><a href="tabel.html">Complaint</a></li>
                    <li><a href="form.html">Staff</a></li>
                    <li><a href="form.html">Department</a></li>
                    <li><a href="form.html">Solution</a></li>
                    <li><a href="form.html">Article</a></li>
                    <li><a href="form.html">Statistic</a></li>
                </ul>-->
                <tiles:insert attribute="left"/>
            </div>
            <div id="rightContent">
                <tiles:insert attribute="right"/>
                <div style="height: 10px"></div>
            </div>
            <div class="clear"></div>
            <div id="footer">
                <tiles:insert attribute="footer"/>
            </div>
        </div>
        
    </body>
</html:html>
