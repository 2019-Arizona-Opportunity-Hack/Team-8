
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<body>
	<h1 class="text-center">NMTSA Refferal&nbsp;</h1>
	<p class="text-center"><br>In order to better understand your therapy and scheduling needs, please fill out the following information. Should you have further questions, please feel free to contact us at <a href="mailto:info@nmtsa.org">info@nmtsa.org</a>. <br><br></p>
	
	
	<form:form method="POST" modelAttribute="calculation" action="doCalc">
	<div style="margin-right: 49%;">
	<table>
	<tr>
		<td><form:label path="op1">Operand 1:</form:label></td>
		<td><form:input path="op1"/><form:errors path="op1"/></td>
	</tr><tr>
		<td><form:label path="op2">Operand 2:</form:label></td>
		<td><form:input path="op2"/><form:errors path="op2"/></td>
	</tr>

	<tr>
		<td>
		<form:radiobutton path="funct" value="0"/>Add </td> </tr>
		<tr><td>
		<form:radiobutton path="funct" value="1"/>Subtract </td></tr>
		<tr><td>
		<form:radiobutton path="funct" value="2"/>Multiply</td></tr>
		 <tr><td>
		<form:radiobutton path="funct" value="3"/>Divide	</td></tr>
	
	
	<tr>
		<td colspan="2">
		<input type="submit" value="Run"/>
		</td>
	</tr>
	</table>
	</form:form>
</body>
