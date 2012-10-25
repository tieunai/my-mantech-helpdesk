<%-- 
    Document   : Form
    Created on : Oct 24, 2012, 10:30:59 AM
    Author     : HAITHE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>

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
<html:form action="/StaffAction?operation=addStaff" method="post">
    <table width="95%">
        <!--<tr><td><b>Department</b></td><td>
            <select name="">
                <option selected>-- Select --</option>
                <option value="1">System</option>
            </select>
    </td></tr>-->
        <tr><td><b>Department</b></td><td><html:text property="departmentId" styleClass="panjang" /></td></tr>
        <tr><td><b>Account</b></td><td><html:text property="accountID" styleClass="panjang" /></td></tr>
        <tr><td><b>Fullname</b></td><td><html:text property="staffName" styleClass="panjang" /></td></tr>
        <tr><td><b>Phone No</b></td><td><html:text property="staffPhone" styleClass="panjang" /></td></tr>
        <tr><td><b>Email</b></td><td><html:text property="staffEmail" styleClass="panjang" /></td></tr>
        <tr><td><b>DOB</b></td><td><html:text property="dateOfBirth" styleClass="panjang" /></td></tr>
        <tr><td><b>Date Joined</b></td><td><html:text property="dateJoined" styleClass="panjang" /></td></tr>
        <tr><td><b>Date Left</b></td><td><html:text property="dateLeft" styleClass="panjang" /></td></tr>
        <tr><td><b>Status</b></td><td><html:text property="status" styleClass="panjang" /></td></tr>
      <!--  <tr>
            <td><b>Status</b></td>
            <td></td>
        </tr>-->
        <!--<select name="Status">
                <option selected>-- Select --</option>
                <option value="1">Available</option>
                <option value="0">Invisible</option>
            </select>
    </td></tr>-->
        <tr><td></td><td>
                <html:submit styleClass="button"/>
                <html:reset styleClass="button"/>
                <!-- <input type="submit" class="button" value="Submit">
                <input type="reset" class="button" value="Reset">-->
        </td></tr>
    </table>
</html:form>

