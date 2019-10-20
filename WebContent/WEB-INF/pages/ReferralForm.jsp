
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<body>
	<h1 class="text-center">NMTSA Refferal</h1>
	<p class="text-center"><br>In order to better understand your therapy and scheduling needs, please fill out the following information. Should you have further questions, please feel free to contact us at <a href="mailto:info@nmtsa.org">info@nmtsa.org</a>. <br><br></p>

	<div class="form-group">
	<form:form method="POST" modelAttribute="client" action="reg">
	<div class="form-row">
    <div class="col">
	<form:label path="firstName">First name:</form:label>
	<form:input path="firstName"/><form:errors path="firstName"/>
	</div><div class="col">
	<form:label path="lastName">Last name:</form:label>
	<form:input path="lastName"/><form:errors path="lastName"/>
	</div></div>
	<div class="form-row">
    <div class="col">
	<form:label path="parent1">Parent 1:</form:label>
	<form:input path="parent1"/><form:errors path="parent1"/>
	</div><div class="col">
	<form:label path="parent2">Parent 2:</form:label>
	<form:input path="parent2"/><form:errors path="parent2"/>
	</div>
	</div><div class="col">
	<form:label path="birthDate">Birth date:</form:label>
	<form:input path="birthDate"/><form:errors path="birthDate"/>
	</div><div class="col">
	<form:label path="phoneNumber">Phone Number:</form:label>
	<form:input path="phoneNumber"/><form:errors path="phoneNumber"/>
	</div>
	<div class="form-row">
	<div class="col">
	<form:label path="diagnosis">Diagnosis:</form:label>
	<form:checkboxes path="diagnosis" items="${diagnosisList}" />
	</div>
	</div>
	<div class="form-row">
	<div class="col">
	<form:label path="email">Email Address:</form:label>
	<form:input path="email"/><form:errors path="email"/>
	</div>
	<div class="col">
	<form:label path="reason">Reason:</form:label>
	<form:input path="reason"/><form:errors path="reason"/>
	</div>
	</div>
	<div class="form-row">
	<div class="col">
	<form:label path="funding">Funding Source:</form:label>
	<form:input path="funding"/><form:errors path="funding"/>
	</div><div class="col">
	<form:label path="address">Home Address:</form:label>
	<form:input path="address"/><form:errors path="address"/>
	</div>
	</div>
	<form:label path="availableDay">Days Available:</form:label>
	<c:forEach var="item" items="${availableDay}">
		
		 <form:checkbox class="weekday" path="availableDay" value="${item}"></form:checkbox><form:label path="availableDay">${item}</form:label>
		
	</c:forEach>
		<%-- <form:checkboxes  path="availableDay" items="${availableDay}" /></td> --%>
	<form:label path="availableTime">Time slots Available:</form:label>
	<form:checkboxes path="availableTime" items="${availableTime}" />
	<form:label path="notes">Additional Notes:</form:label>
	<form:input path="notes"/><form:errors path="notes"/>
	
	<input type="submit" class="btn btn-default" value="Create Referral"/>

	</form:form>
	</div>
</body>
