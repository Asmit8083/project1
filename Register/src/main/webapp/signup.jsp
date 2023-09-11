<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body
	style="background: url(images/pexels-nataliya-vaitkevich-6863515.jpg); background-size: cover; background-attachment: fixed">
	<div class="container">
		<div class="row">
			<div class="col m6 offset-m3">
				<div class="card">
					<div class="card-content">
						<h3 class="center-align">Register here!!!</h3>
						<div class="form center-align">
							<form action="register" method="post">
								<input type="text" placeholder="Enter user name" name="name">
								<input type="password" placeholder="Enter password"
									name="password"> <input type="email"
									placeholder="Enter user email" name="email">
								<button class="btn #e040fb purple accent-2" type="submit">Submit</button>
							</form>
						</div>

						<div class="loader center-align"
							style="margin-top: 10px; display: none;">
							<div class="preloader-wrapper medium active">
								<div class="spinner-layer spinner-blue">
									<div class="circle-clipper left">
										<div class="circle"></div>
									</div>
									<div class="gap-patch">
										<div class="circle"></div>
									</div>
									<div class="circle-clipper right">
										<div class="circle"></div>
									</div>
								</div>

								<div class="spinner-layer spinner-red">
									<div class="circle-clipper left">
										<div class="circle"></div>
									</div>
									<div class="gap-patch">
										<div class="circle"></div>
									</div>
									<div class="circle-clipper right">
										<div class="circle"></div>
									</div>
								</div>

								<div class="spinner-layer spinner-yellow">
									<div class="circle-clipper left">
										<div class="circle"></div>
									</div>
									<div class="gap-patch">
										<div class="circle"></div>
									</div>
									<div class="circle-clipper right">
										<div class="circle"></div>
									</div>
								</div>

								<div class="spinner-layer spinner-green">
									<div class="circle-clipper left">
										<div class="circle"></div>
									</div>
									<div class="gap-patch">
										<div class="circle"></div>
									</div>
									<div class="circle-clipper right">
										<div class="circle"></div>
									</div>
								</div>
							</div>
							<h5>Please wait....</h5>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.7.1.min.js"
		integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
		crossorigin="anonymous"></script>
		
		<script>
		$(document).ready(function(){
			console.log("hiiii")
		})</script>
</body>
</html>