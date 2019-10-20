
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<body>
	<h1 class="text-center">NMTSA Refferal</h1>
	<p class="text-center"><br>In order to better understand your therapy and scheduling needs, please fill out the following information. Should you have further questions, please feel free to contact us at <a href="mailto:info@nmtsa.org">info@nmtsa.org</a>. <br><br></p>

	
	<form:form method="POST" modelAttribute="client" action="reg">
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
		<td><form:label path="birthDate">Birth date:</form:label></td>
		<td><form:input path="birthDate"/><form:errors path="birthDate"/></td>
	</tr>
		<tr>
		<td><form:label path="parent1">Parent 1:</form:label></td>
		<td><form:input path="parent1"/><form:errors path="parent1"/></td>
	</tr>
	<tr>
		<td><form:label path="parent2">Parent 2:</form:label></td>
		<td><form:input path="parent2"/><form:errors path="parent2"/></td>
	</tr>
		<tr>
		<td><form:label path="diagnosis">Diagnosis:</form:label></td>
		<td><form:checkboxes path="diagnosis" items="${diagnosisList}" /> </td>
	</tr>
	<tr>
		<td><form:label path="email">Email Address:</form:label></td>
		<td><form:input path="email"/><form:errors path="email"/></td>
	</tr>
	<tr>
		<td><form:label path="phoneNumber">Phone Number:</form:label></td>
		<td><form:input path="phoneNumber"/><form:errors path="phoneNumber"/></td>
	</tr>
	<tr>
		<td><form:label path="address">Home Address:</form:label></td>
		<td><form:input path="address"/><form:errors path="address"/></td>
	</tr>
	<tr>
		<td><form:label path="reason">Reason:</form:label></td>
		<td><form:input path="reason"/><form:errors path="reason"/></td>
	</tr>
	<tr>
		<td><form:label path="funding">Funding Source:</form:label></td>
		<td><form:input path="funding"/><form:errors path="funding"/></td>
	</tr>
	<tr>
		
		<td><form:label path="availableDay">Days Available:</form:label></td>
		<td>
		<c:forEach var="item" items="${availableDay}">
		<div class="weekDays-selector">
		 <form:checkbox class="weekday" path="availableDay" value="${item}"></form:checkbox><form:label path="availableDay">${item}</form:label>
		 </div>
		</c:forEach>
		<%-- <form:checkboxes  path="availableDay" items="${availableDay}" /></td> --%>
		
	</tr>
	<tr>
		<td><form:label path="availableTime">Time slots Available:</form:label></td>
		<td><form:checkboxes path="availableTime" items="${availableTime}" /></td>
	</tr>
	<tr>
		<td><form:label path="notes">Additional Notes:</form:label></td>
		<td><form:input path="notes"/><form:errors path="notes"/></td>
	</tr>
	<tr>
		<td colspan="2">
		<input type="submit" value="Run"/>
		</td>
	</tr>
	</table>
	</form:form>
</body>
