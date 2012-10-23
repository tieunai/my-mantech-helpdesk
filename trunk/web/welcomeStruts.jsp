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
        <link rel="stylesheet" type="text/css" href="mos-css/mos-style.css">
        <html:base/>
    </head>
    <body style="background-color: white">
        
        <logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
            <div  style="color: red">
                ERROR:  Application resources not loaded -- check servlet container
                logs for error messages.
            </div>
        </logic:notPresent>
        <div id="header">
            <div class="inHeader">
                <div class="mosAdmin">
                    Hallo, Mas Administrator<br>
                    <a href="">Lihat website</a> | <a href="">Help</a> | <a href="login.html">Keluar</a>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        
        <div id="wrapper">
            <div id="leftBar">
                <ul>
                    <!--<li><a href="index.html">Dashboard</a></li>-->
                    <li><a href="tabel.html">Complaint</a></li>
                    <li><a href="form.html">Staff</a></li>
                    <li><a href="form.html">Department</a></li>
                    <li><a href="form.html">Solution</a></li>
                    <li><a href="form.html">Article</a></li>
                    <li><a href="form.html">Statistic</a></li>
                </ul>
            </div>
            <div id="rightContent">
                <h3>Statistic</h3>
                <div class="quoteOfDay">
                    <b>Quote of the day :</b><br>
                    <i style="color: #5b5b5b;">"If you think you can, you really can"</i>
                </div>
               
                <div class="clear"></div>
                
                <div id="smallRight"><h3>Complaint</h3>
                    <table style="border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;">
                        <tr><td style="border: none;padding: 4px;">Jumlah posting</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah kategori</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah komentar diterbitkan</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah komentar belum diterbitkan</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah foto dalam galeri</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah data buku tamu</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                    </table>
                </div>
                
                <div id="smallRight"><h3>Staff</h3>
                    <table style="border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;">
                        <tr><td style="border: none;padding: 4px;">Jumlah posting</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah kategori</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah komentar diterbitkan</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah komentar belum diterbitkan</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah foto dalam galeri</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah data buku tamu</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                    </table>
                </div>
                <div id="smallRight"><h3>Department</h3>
                    <table style="border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;">
                        <tr><td style="border: none;padding: 4px;">Jumlah posting</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah kategori</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah komentar diterbitkan</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah komentar belum diterbitkan</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah foto dalam galeri</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Jumlah data buku tamu</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                    </table>
                </div>
                <div id="smallRight"><h3>Article</h3>
                    
                    <table style="border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;">
                        <tr><td style="border: none;padding: 4px;">Pengunjung online</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Pengunjung hari ini</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Total pengunjung</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Hit hari ini</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                        <tr><td style="border: none;padding: 4px;">Total hit</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                    </table>
                </div>
            </div>
            <div class="clear"></div>
            <div id="footer">
                &copy; 2012 MOS css template | <a href="#">Nama Website Anda</a> | design <a href="http://arirusmanto.com" target="_blank">arirusmanto.com</a><br>
                redesign <a href="#">Tulis nama anda disini</a> | Silahkan baca <a href="lisensi.txt" target="_blank">Lisensi</a>
            </div>
        </div>
        
    </body>
</html:html>
