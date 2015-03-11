<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>vLawyer - Trả lời</title>
</head>
<body>
	<p><a href="/vLawyer"><img src="images/default.png" width="550" height="180"></a></p>
	<p><b>Câu hỏi</b>: ${ question } </p>
	<!-- <p><b>Câu hỏi đã tách từ</b>: ${ tokenizedQuestion } </p>  -->
	<!-- <p><b>Câu hỏi đã gán nhãn từ loại</b>: ${ taggedQuestion } </p>  -->
	<p><b>Câu trả lời</b>: </p>
	<i>${ answer }</i>
</body>
</html>