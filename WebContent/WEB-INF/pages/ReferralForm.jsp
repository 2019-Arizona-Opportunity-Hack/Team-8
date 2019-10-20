
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
	<h1 class="text-center">NMTSA Refferal</h1>
	<p class="text-center">
		<br>In order to better understand your therapy and scheduling
		needs, please fill out the following information. Should you have
		further questions, please feel free to contact us at <a
			href="mailto:info@nmtsa.org">info@nmtsa.org</a>. <br>
		<br>
	</p>

	<div class="form-group">
		<form:form method="POST" modelAttribute="client" action="reg">
			<div class="form-row">
				<div class="col">
					<form:label class="control-label" path="firstName">First name:</form:label>
					<form:input class="form-control" path="firstName" />
					<form:errors path="firstName" />
				</div>
				<div class="col">
					<form:label path="lastName">Last name:</form:label>
					<form:input class="form-control" path="lastName" />
					<form:errors path="lastName" />
				</div>
			</div>
			<div class="form-row">
				<div class="col">
					<form:label path="parent1">Parent 1:</form:label>
					<form:input class="form-control" path="parent1" />
					<form:errors path="parent1" />
				</div>
				<div class="col">
					<form:label path="parent2">Parent 2:</form:label>
					<form:input class="form-control" path="parent2" />
					<form:errors path="parent2" />
				</div>
			</div>
			<div class="form-row">
			<div class="col">
				<form:label path="birthDate">Birth date:</form:label>
				<form:input class="form-control" path="birthDate" />
				<form:errors path="birthDate" />
			</div>
			<div class="col">
				<form:label path="phoneNumber">Phone Number:</form:label>
				<form:input class="form-control" path="phoneNumber" />
				<form:errors path="phoneNumber" />
			</div>
			</div>
			<div class="form-row">
				<div class="col">
					<form:label path="diagnosis">Diagnosis:</form:label>
					<form:checkboxes class="checkbox" path="diagnosis" items="${diagnosisList}" />
				</div>
			</div>
			<div class="form-row">
				<div class="col">
					<form:label path="email">Email Address:</form:label>
					<form:input class="form-control" path="email" />
					<form:errors path="email" />
				</div>
				<div class="col">
					<form:label path="reason">Reason:</form:label>
					<form:input class="form-control" path="reason" />
					<form:errors path="reason" />
				</div>
			</div>
			<div class="form-row">
				<div class="col">
					<form:label path="funding">Funding Source:</form:label>
					<form:input class="form-control" path="funding" />
					<form:errors path="funding" />
				</div>
				<div class="col">
					<form:label path="address">Home Address:</form:label>
					<form:input class="form-control" path="address" />
					<form:errors path="address" />
				</div>
			</div>
			<div class="form-row">
				<div class="col">
			<form:label path="availableDay">Days Available:</form:label>
			<c:forEach var="item" items="${availableDay}">

				<form:checkbox class="checkbox" path="availableDay" value="${item}"></form:checkbox>
				<form:label path="availableDay">${item}</form:label>

			</c:forEach>
			</div></div>
			<%-- <form:checkboxes  path="availableDay" items="${availableDay}" /></td> --%>
			<div class="form-row">
				<div class="col">
			<form:label path="availableTime">Time slots Available:</form:label>
			<c:forEach var="item" items="${availableTime}">

				<form:checkbox class="checkbox" path="availableDay" value="${item}"></form:checkbox>
				<form:label path="availableTime">${item}</form:label>

			</c:forEach>
			</div></div>
			<div class="form-row">
				<div class="col">
			<form:label path="notes">Additional Notes:</form:label>
			<form:input id="msg" path="notes" />
			<form:errors path="notes" />
			</div></div>

			<input type="submit" class="btn btn-primary" value="Create Referral" />

		</form:form>
	</div>
</body>
