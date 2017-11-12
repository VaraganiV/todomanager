<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Add ToDo</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>ToDo - Task manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Add ToDo</h3>
	
		<form:form action="saveToDo" modelAttribute="todo" method="POST">
		
			<table>
				<tbody>
					<tr>
						<td><label>Description:</label></td>
						<td><form:input path="description" /></td>
					</tr>
				
					<tr>
						<td><label>Assigned To:</label></td>
						<td><form:input path="assignedto" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/todo/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>










