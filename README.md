# ✏ 학생 오답관리 프로그램 📙


### 💁‍♀️ 프로젝트 소개 🎤 
해당 미니 프로젝트는 학교 데이터베이스 수업의 과제로 만들었습니다. <br>
저를 포함한 조원 4명과 같이 기획했으며 학생들의 오답관리를 위한 프로그램입니다. <br>
✨데이터베이스 설계 ✨프론트엔드 ✨백엔드 부분은 제가 혼자 작성했으며, 테이블의 기본 튜플값들을 위한 쿼리문들은 다른 조원분들이 작성해주셨습니다. 


해당 프로젝트의 기본 기능은 아래와 같습니다. 
* 특정 학생의 과목별 TOP10 오답 유형
* 유형별 오답목록에서 특정유형의 오답문제 리스트 확인
* 시험성적 모아보기


### 🛠 설계 🛠
* UI 기획서

  https://ovenapp.io/project/eykfByruaQNbhi6s8jQBJbVjXc3fOtNp#y3duk
* DB 설계

  https://github.com/sohyun119/StudentManagement/blob/main/DB%EC%84%A4%EA%B3%84.sql
  
* 보고서 💫 [5페이지] ER 다이어그램 및 UML 다이어그램 설명  / [12~13 페이지] ER 다이어그램 및 UML 다이어그램 그림

  https://docs.google.com/document/d/1CnZr3zE9vK0BrHk-zZfcj2Urmxhqd4sf/edit?usp=sharing&ouid=109161359667124849294&rtpof=true&sd=true

 
  
  
###  🔥 주요기능 🔥
1. 회원 가입 & 로그인 & 다른 유저 찾기 기능
> - 관련 패키지 : https://github.com/sohyun119/StudentManagement/tree/main/StudentManagement_7/src/main/java/com/DBproject/user
> * 학생 회원가입 view : https://github.com/sohyun119/StudentManagement/blob/main/StudentManagement_7/src/main/webapp/WEB-INF/jsp/user/signUpView_student.jsp
> * 선생님 회원가입 view : https://github.com/sohyun119/StudentManagement/blob/main/StudentManagement_7/src/main/webapp/WEB-INF/jsp/user/signUpView_teacher.jsp
> * 로그인 view : https://github.com/sohyun119/StudentManagement/blob/main/StudentManagement_7/src/main/webapp/WEB-INF/jsp/user/signInView.jsp

2. 오답관리 기능
> - 관련 패키지 : https://github.com/sohyun119/StudentManagement/tree/main/StudentManagement_7/src/main/java/com/DBproject/problem
> * 오답유형 & 문제리스트 view : https://github.com/sohyun119/StudentManagement/blob/main/StudentManagement_7/src/main/webapp/WEB-INF/jsp/problem/analysisView.jsp

3. 시험성적 모아보기 기능
> - 관련 패키지 : https://github.com/sohyun119/StudentManagement/tree/main/StudentManagement_7/src/main/java/com/DBproject/exam
> * 시험성정 모아보기 view : https://github.com/sohyun119/StudentManagement/blob/main/StudentManagement_7/src/main/webapp/WEB-INF/jsp/exam/examView.jsp



### 💡 데모 영상 💡

#### ✨ 회원가입 및 로그인
![회원가입및로그인.gif](demo/회원가입및로그인.gif)

#### ✨ 과목별 오답 유형 분석 페이지 & 유형별 오답목록
![analysis.gif](demo/오답관리.gif)

#### ✨ 오답 입력하기
![insert.gif](demo/오답insert.gif)




### 🌱 추후 개발 계획
* 보다 간편한 오답문제 입력 폼
* 더욱 많은 책과 문제에 대한 데이터베이스화
* 특정 책 구독기능 (구매 여부 판독) -> 구독한 책에 한하여 오답문제의 정보뿐아니라 문제자체를 볼 수 있게 수정
* 구체화된 시험성적 관리 기능


### 🔎 외부 라이브러리 라이센스
* Spring Framework Apache License 2.0
* tomcat Apache License 2.0
* bootstrap MIT License
* jQuery MIT License
* MySQL GPL

### 📕 사용한 기술 스택
<div class="d-flex">
<img src="https://img.shields.io/badge/java-orange?style=flat-square&logo=java&logoColor=white"/>
<img src="https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white"/>
<img src="https://img.shields.io/badge/jQuery-0769AD?style=flat-square&logo=jQuery&logoColor=white"/>
<img src="https://img.shields.io/badge/JavaScript-black?style=flat-square&logo=JavaScript&logoColor=F7DF1E"/>
<img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=HTML5&logoColor=white"/>
<img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=CSS3&logoColor=white"/>
<img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=MySQL&logoColor=white"/>
</div>
