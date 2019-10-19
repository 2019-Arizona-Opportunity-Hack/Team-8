
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<body>
	<h1 class="text-center">NMTSA Refferal</h1>
	<p class="text-center"><br>In order to better understand your therapy and scheduling needs, please fill out the following information. Should you have further questions, please feel free to contact us at <a href="mailto:info@nmtsa.org">info@nmtsa.org</a>. <br><br></p>
<!--private String timeStamp;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String diagnosis;
	private long phoneNumber;
	private String parent1;
	private String parent2;
	private String email;
	private String address;
	private String reason;
	private String funding;
	private String availableDay;
	private String availableTime;
	private String notes; -->
	
	<form:form method="POST" modelAttribute="client" action="doReg">
	<div style="margin-right: 49%;">
	<table>
	<tr>
		<td><form:label path="firstName">First name:</form:label></td>
		<td><form:input path="firstName"/><form:errors path="firstName"/></td>
	</tr>
	<tr>
		<td><form:label path="lastName">Last name:</form:label></td>
		<td><form:input path="lastName"/><form:errors path="lastName"/></td>
	</tr>
	<tr>
		<td><form:label path="birthDate">Last name:</form:label></td>
		<td><form:input path="birthDate"/><form:errors path="birthDate"/></td>
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
