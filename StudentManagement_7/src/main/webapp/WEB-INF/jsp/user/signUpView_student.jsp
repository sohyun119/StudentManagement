<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
		<link rel="stylesheet" href="/static/css/style.css" type="text/css">
</head>
<body>

	<div id="wrap">
		
		<section class="d-flex justify-content-center mt-5">
		
			<div id="signUpBox" class="border d-flex justify-content-center">
				<div id="signInnerBox" class="mt-4">
					<h1 class="font-italic text-center">Student Management</h1>
					<div class="text-center text-secondary">학생 회원가입</div>
					<input type="text" id="loginIdInput" class="form-control mt-4" placeholder="id">
					<input type="password" id="passwordInput" class="form-control mt-3" placeholder="password">
					<input type="text" id="nameInput" class="form-control mt-3" placeholder="name">
					<input type="text" id="phoneNumberInput" class="form-control mt-3" placeholder="phoneNumber">
					<input type="text" id="addressInput" class="form-control mt-3" placeholder="address">
					
					<button type="button" id="signUpBtn" class="btn btn-info form-control my-4">회원가입</button>
					
					<hr>
					<div class="text-center"><a href="/user/signup_view/teacher">선생님 회원가입</a></div>
					<div class="text-center">아이디가 있으신가요? <a href="/user/signin_view">로그인</a></div>
				</div>
			
			</div>
		</section>
	
	</div>
	
	<script>
	
		$(document).ready(function(){
			
			
			$("#signUpBtn").on("click", function(){
				let loginId = $("#loginIdInput").val();
				let password = $("#passwordInput").val();
				let name = $("#nameInput").val();
				let phoneNumber = $("#phoneNumberInput").val();
				let address = $("#addressInput").val();
				
				if(loginId == ""){
					alert("아이디를 입력해주세요");
					return;
				}
				if(password == ""){
					alert("비밀번호를 입력해주세요.");
					return;
				}
				if(name == ""){
					alert("이름을 입력해주세요.");
					return;
				}
				if(phoneNumber == ""){
					alert("전화번호를 입력해주세요.");
					return;
				}
				if(address == ""){
					alert("주소를 입력해주세요.");
					return;
				}
				
				$.ajax({
					type:"post",
					url:"/student/sign_up",
					data:{"loginId":loginId,"password":password, "name":name, "phoneNumber":phoneNumber, "address":address},
					success:function(data){
						if(data.result == "success"){
							alert("회원가입 완료!");
							location.href = "/user/signin_view";
						}else{
							alert("회원가입 오류");
						}
					},
					error:function(){
						alert("에러 발생");
					}
				});
				
			});
			
		});
	
	
	
	
	</script>

</body>
</html>