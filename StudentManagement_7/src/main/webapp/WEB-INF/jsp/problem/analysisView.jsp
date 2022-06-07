<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>problem analysis</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
		
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
		<link rel="stylesheet" href="/static/css/style.css" type="text/css">
</head> 
<body>
	
	<div id="wrap">
		
		<header>
			<h3 class="text-center mt-5">오답 노트</h3>
		</header>
		
		<div class="d-flex justify-content-center">
			<section class="content mt-5">
				<table class="table">
					<thead>
						<tr>
							<th>No</th>
							<th>문제유형</th>
							<th>틀린개수</th>
							<th>오답목록</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="mathProblem" items="${MathWrongAnswerAllList }" varStatus="status">
							<tr>
								<td>${status.count }.</td>
								<td>${mathProblem.type }</td>
								<td>${mathProblem.count }개</td>
								<td><a href="#" class="problemList btn btn-info btn-sm" data-toggle="modal" data-target="#exampleModalCenter${status.count }">
								목록 보기</a></td>
							</tr>
							<!-- Modal : 반복문 안에 있을때는 아이디 중복되지 않게!!-->
							<div class="modal fade" id="exampleModalCenter${status.count }" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
							  <div class="modal-dialog modal-dialog-centered" role="document">
							    <div class="modal-content">
							      <div class="modal-body">
							      	
							      	<h4 class="text-center">오답 목록</h4>
							      	<br>
							      	<c:forEach var="wrongAnswerDetail" items="${mathProblem.wrongAnswerDetailList }" varStatus="i">
							      		
							      		<h6 class="text-center">(${i.count }) ${wrongAnswerDetail.bname } : ${wrongAnswerDetail.pchap }장 ${wrongAnswerDetail.pnumber }번</h6>
							      		<br>
							      		
							      	</c:forEach>
							      	
							      </div>
							    </div>
							  </div>
							</div>
						</c:forEach>
					</tbody>
				</table>
			</section>
		</div>
	</div>
</body>
</html>