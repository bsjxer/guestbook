<%@page import="com.bit2016.guestbook.dao.GuestBookDao"%>
<%@page import="com.bit2016.guestbook.vo.GuestBookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding( "UTF-8" );
	String name = request.getParameter( "name" );
	String content = request.getParameter( "content" );
	String password = request.getParameter( "pass" );
	
	GuestBookVo vo = new GuestBookVo();
	vo.setName(name);
	vo.setContent(content);
	vo.setPassword(password);
	
	GuestBookDao dao = new GuestBookDao();
	dao.insert( vo );
	
	//redirect
	response.sendRedirect( "/guestbook/index.jsp" );
%>