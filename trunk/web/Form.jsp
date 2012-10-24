<%-- 
    Document   : Form
    Created on : Oct 24, 2012, 10:30:59 AM
    Author     : HAITHE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="mos-css/mos-style.css">
    </head>
    <body>
        <div id="header">
            <div class="inHeader">
                <div class="mosAdmin">
                    Hallo, Mas Administrator<br>
                    <a href="">My Information</a> | <a href="">Change Password</a>
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
                <h3>Form</h3>
                <!--
                <div class="informasi">
                    ini adalah notifikasi pertanda informasi
                </div>
                
                <div class="gagal">
                    ini adalah notifikasi pertanda gagal
                </div>
                
                <div class="sukses">
                    ini adalah notifikasi pertanda sukses
                </div>
                -->
                <table width="95%">
                    <tr><td width="125px"><b>Input text pendek</b></td><td><input type="text" class="pendek"></td></tr>
                    <tr><td><b>Input text sedang</b></td><td><input type="text" class="sedang"></td></tr>
                    <tr><td><b>Input text panjang</b></td><td><input type="text" class="panjang"></td></tr>
                    <tr><td><b>Radio</b></td><td>
                            <input type="radio" name="radio" id="radio" value="radio 1">Radio 1
                            <input type="radio" name="radio" id="radio" value="radio 2">Radio 2
                    </td></tr>
                    <tr><td><b>Checkbox</b></td><td>
                            <input type="checkbox" name="checkbox" id="checkbox" value="checkbox 1">Checkbox 1<br>
                            <input type="checkbox" name="checkbox" id="checkbox" value="checkbox 2">Checkbox 2<br>
                            <input type="checkbox" name="checkbox" id="checkbox" value="checkbox 3">Checkbox 3<br>
                            <input type="checkbox" name="checkbox" id="checkbox" value="checkbox 4">Checkbox 4<br>
                    </td></tr>
                    <tr><td><b>Pilihan</b></td><td>
                            <select>
                                <option selected>-- pilihan --</option>
                                <option value="">Pilihan</option>
                            </select>
                    </td></tr>
                    <tr><td><b>Textarea</b></td><td><textarea></textarea></td></tr>
                    <tr><td></td><td>
                            <input type="button" class="button" value="Button">
                            <input type="submit" class="button" value="Submit">
                            <input type="reset" class="button" value="Reset">
                    </td></tr>
                </table>
            </div>
            <div class="clear"></div>
            
            <div id="footer">
                &copy; 2012 MOS css template | <a href="#">Nama Website Anda</a> | design <a href="http://arirusmanto.com" target="_blank">arirusmanto.com</a><br>
                redesign <a href="#">Tulis nama anda disini</a> | Silahkan baca <a href="lisensi.txt" target="_blank">Lisensi</a>
            </div>
        </div>
    </body>
</html>
