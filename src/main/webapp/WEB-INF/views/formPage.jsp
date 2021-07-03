<?xml version="1.0" encoding="ISO-8859-1" ?>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
<meta lang="es">
<meta charset="utf-8">
	- <!-- etiqueta para forzar que el doc se muestre exactamente con el ancho de la pantalla -->
<meta name="viewport" content="width=device-width">
<title>Ejemplos HTML, CSS y JS</title>
<!-- BootStrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/basic-theme.css" rel="stylesheet"
	type="text/css">
<title>Formulario De Ejemplo</title>
</head>
<body>
	<c:set var="teacher" value="${teacher}">
	</c:set>
	<c:set property="teacher.students" var="students"></c:set>
	<section class="container mt-5">
		<header class="title-container text-center py-4 row card">
			<H1 class="col-12 display-4">Formulario del alumnado</H1>
			<img class="col-lg-4 col-md-12 col-sm-12 mx-auto align-center"
				src="img/header-back.jpg" />
		</header>
		<article
			class="row justify-content-around p-3 text-center card teacher-card mb-5">
			<div class="col-lg-4 col-12">
				<p class="h2 pb-3">${teacher.name}&nbsp;${teacher.surname}</p>
				<p>${teacher.teacherDescription}</p>
			</div>
			<div
				class="col-lg-6 col-12 pr-language-section card align-self-center">
				<ul class="col-12">
					<c:forEach items="${teacher.prLanguages}" var="language">
						<li class="col-12 justify-content-around row"><div
								class="col-lg-5 col-md-5 col-sm-5 col-12">${language.name}</div>
							<div
								class="col-lg-7 col-md-7 col-sm-7 mt-2 row align-items-center ">
								<c:forEach begin="1" end="${language.skill}">
									<div class="circle mr-1"></div>
								</c:forEach>
							</div></li>
					</c:forEach>
				</ul>
			</div>
		</article>
		<form:form class="row p-3 text-center card form-card">
			<section class="name-section">
<%-- 			<form:button id="btn-accept" class="btn " name="btn-ctc"/> --%>
			</section>
		</form:form>
	</section>

</body>
</html>
