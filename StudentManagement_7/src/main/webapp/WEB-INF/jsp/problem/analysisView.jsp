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
		<div class="d-flex justify-content-center">
			<header class="mt-5 d-flex justify-content-between">
				<h3>오답 노트</h3>
				<ul class="nav nav-fill">
					<li class="nav-item">
						<a href="/problem_view/analysis" class="nav-link text-dark">오답노트</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link text-dark">시험성적</a>
					</li>				
				</ul>
			</header>
		</div>
		<hr>
		<div class="d-flex justify-content-center">
			<section class="content mt-2">
				<button type="button" class="btn btn-info form-control mb-5" data-toggle="modal" data-target="#exampleModalCenter">채점 입력하기</button>
				
				<!-- Modal 창 -->
				<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
					<div class="modal-dialog modal-dialog-centered" role="document">
						<div class="modal-content">
							<div class="modal-body">
								<form id="insertForm">
									 <select class="form-control mt-3" id="subject" aria-label="Default select example">
				                        <option selected>과목명</option>
										<option value="국어">국어</option>
										<option value="수학">수학</option>
										<option value="영어">영어</option>
										<option value="과학">과학</option>
									</select>
									
									<select class="form-control mt-3" id="bname" aria-label="Default select example">
				                        <option selected>책 이름</option>
										<option value="자이스토리1">자이스토리1</option>
										<option value="자이스토리2">자이스토리2</option>
									</select>
									
									<input type="number" id="pchap" class="form-control mt-3" placeholder="챕터 번호 (숫자만 입력하세요)">
									
									<input type="number" id="pnumber" class="form-control mt-3" placeholder="문제 번호 (숫자만 입력하세요)">
									
									<select class="form-control mt-3" id="YorNorX" aria-label="Default select example">
				                        <option selected>채점 여부</option>
										<option value="Y">맞음</option>
										<option value="N">틀림</option>
										<option value="X">안품</option>
									</select>
									
									<button type="submit" class="btn btn-info form-control mt-3">저장</button>
								</form>
							</div>
						</div>
					</div>
				</div>
				
				<h4 class="ml-3 text-secondary">국어</h4>
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
						<c:forEach var="languageProblem" items="${LanguageWrongAnswerAllList }" varStatus="status">
							<tr>
								<td>${status.count }.</td>
								<td>${languageProblem.type }</td>
								<td>${languageProblem.count }개</td>
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
							      	<c:forEach var="wrongAnswerDetail" items="${languageProblem.wrongAnswerDetailList }" varStatus="i">
							      		
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
				
				<br>
				<h4 class="ml-3 text-secondary">수학</h4>
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
				
				<br>
				<h4 class="ml-3 text-secondary">영어</h4>
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
						<c:forEach var="englishProblem" items="${EnglishWrongAnswerAllList }" varStatus="status">
							<tr>
								<td>${status.count }.</td>
								<td>${englishProblem.type }</td>
								<td>${englishProblem.count }개</td>
								<td><a href="#" class="problemList btn btn-info btn-sm" data-toggle="modal" data-target="#exampleModalCenter${status.count }">
								목록 보기</a></td>
							</tr>
							<!-- Modal : 반복문 안에 있을때는 아이디 중복되지 않게! -->
							<div class="modal fade" id="exampleModalCenter${status.count }" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
							  <div class="modal-dialog modal-dialog-centered" role="document">
							    <div class="modal-content">
							      <div class="modal-body">
							      	
							      	<h4 class="text-center">오답 목록</h4>
							      	<br>
							      	<c:forEach var="wrongAnswerDetail" items="${englishProblem.wrongAnswerDetailList }" varStatus="i">
							      		
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
				
				<br>
				<h4 class="ml-3 text-secondary">과학</h4>
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
						<c:forEach var="scienceProblem" items="${ScienceWrongAnswerAllList }" varStatus="status">
							<tr>
								<td>${status.count }.</td>
								<td>${scienceProblem.type }</td>
								<td>${scienceProblem.count }개</td>
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
							      	<c:forEach var="wrongAnswerDetail" items="${scienceProblem.wrongAnswerDetailList }" varStatus="i">
							      		
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
	
	
	<script>
	
		$(document).ready(function(){
			
			
			$("#insertForm").on("submit", function(e){
				e.preventDefault();
				
				let subject = $("#subject").val();
				let bname = $("#bname").val();
				let pchap = $("#pchap").val();
				let pnumber = $("#pnumber").val();
				let YorNorX = $("#YorNorX").val();
				
				
				$.ajax({
					type:"get",
					url:"/problem/AddWrongAnswer",
					data:{"subject":subject, "bname":bname, "pchap":pchap, "pnumber":pnumber, "YorNorX":YorNorX},
					success:function(data){
						if(data.result == "success"){
							alert("입력 완료");
							location.reload();
						}else{
							alert("입력 실패")
						}
					},
					error:function(){
						alert("insert error");
					}
				});
				
			});	
			
			
		});
	
	
	</script>
	
	
</body>
</html>