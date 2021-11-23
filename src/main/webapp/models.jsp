<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<html>
<body>

<jsp:include page="header.jsp"></jsp:include>

    <h2>It is models page</h2>
    <h2>Input manufacturer of models, which need to display</h2>
        <form action="models" method ="post">
		<label for="manufacturer">Manufacturer:</label> <input name="manufacturer"><br><br>

		<input type="submit" value="Submit">
	</form>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
