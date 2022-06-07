<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시험성적 관리</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
		<link rel="stylesheet" href="/static/css/style.css" type="text/css">
</head>
<body>
<div id="wrap">
		<div class="d-flex justify-content-center">
			<header class="mt-5 d-flex justify-content-between">
				<h3>시험성적 관리</h3>
				<ul class="nav nav-fill">
					<li class="nav-item">
						<a href="/problem_view/analysis" class="nav-link text-dark">오답노트</a>
					</li>
					<li class="nav-item">
						<a href="/score" class="nav-link text-dark">시험성적</a>
					</li>				
				</ul>
			</header>
		</div>
		<hr>
		
		<div class="d-flex justify-content-center">
			<section class="content mt-2">
			
				<table class="table">
					<thead>
						<tr>
							<th>시험종류</th>
							<th>과목</th>
							<th>성적</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="scoreInfo" items="${scoreList }">
							<tr>
								<td>${scoreInfo.exam_Type }</td>
								<c:choose>
									<c:when test="${scoreInfo.subject eq '국어' }">
										<td class="text-danger">${scoreInfo.subject }</td>
									</c:when>
									<c:when test="${scoreInfo.subject eq '수학' }">
										<td class="text-success">${scoreInfo.subject }</td>
									</c:when>
									<c:when test="${scoreInfo.subject eq '영어' }">
										<td class="text-warning">${scoreInfo.subject }</td>
									</c:when>
								</c:choose>
								<td>${scoreInfo.score }점</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				
			</section>
		</div>
	</div>

</body>
</html>