<%@ page language="java" contentType="textml; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- <%@taglib prefix="s" uri="/struts-tags" %>  -->
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<s:iterator  value="Reportlist">
<tr>
<td>
<a href=<s:url action="choose">
<s:param name="ISBN" value="ISBN"></s:param>
<s:param name="AuthorID" value="AuthorID"></s:param></s:url>>
<s:property value="Title"/>
</a>
<a href=<s:url action="delete">
 <s:param name="bookname" value="Title"></s:param>
</s:url>>删除</a>