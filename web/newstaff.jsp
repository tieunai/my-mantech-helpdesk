<%-- 
    Document   : Form
    Created on : Oct 24, 2012, 10:30:59 AM
    Author     : HAITHE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h3>Add New Staff</h3>
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
    <tr><td width="125px"><b>Staff ID</b></td><td><input type="text" class="pendek"></td></tr>
    <tr><td><b>Department</b></td><td>
            <select>
                <option selected>-- Select --</option>
                <option value="">System</option>
            </select>
    </td></tr>
    <tr><td><b>Account</b></td><td><input type="text" class="panjang"></td></tr>
    <tr><td><b>Fullname</b></td><td><input type="text" class="panjang"></td></tr>
    <tr><td><b>Phone No</b></td><td><input type="text" class="panjang"></td></tr>
    <tr><td><b>Email</b></td><td><input type="text" class="panjang"></td></tr>
    <tr><td><b>DOB</b></td><td><input type="text" class="panjang"></td></tr>
    <tr><td><b>Date Joined</b></td><td><input type="text" class="panjang"></td></tr>
    <tr><td><b>Date Left</b></td><td><input type="text" class="panjang"></td></tr>
    <tr><td><b>Status</b></td><td>
            <select>
                <option selected>-- Select --</option>
                <option value="">Available</option>
                <option value="">Invisible</option>
            </select>
    </td></tr>
    <tr><td></td><td>
            <input type="submit" class="button" value="Submit">
            <input type="reset" class="button" value="Reset">
    </td></tr>
</table>

