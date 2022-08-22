<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Edit Info</title>
<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->



</head>
<body>
	<h2>Edit Expense</h2>
		<form:form action="/expenses/${expense.id}" method="post" modelAttribute="expense" class="form">
			<input type="hidden" name="_method" value="put">
			<div class="form-group">
				<form:label path="name">Expense Name:</form:label>
				<form:errors path="name" class="error"/>
				<form:input path="name" type="text" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="vendor">Vendor:</form:label>
				<form:errors path="vendor" class="error"/>
				<form:input path="vendor" type="text" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="price">Amount:</form:label>
				<form:errors path="price" class="error"/>
				<form:input path="price" type="number" step="0.01" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="description">Description:</form:label>
				<form:errors path="description" class="error"/>
				<form:input path="description" type="text" class="form-control"/>
			</div>
			<button type="submit" class="btn-primary">Submit</button>
		</form:form>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
