<%@ page contentType="text/html; charset=UTF-8"%>
<!-- forEach , c:out을 쓰려면 땡겨와야됨 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- fmt 날짜포멧을 쓰려면 땡겨와야됨. -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=button] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=button]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>
<body>

<h3>상세보기</h3>

<div class="container">
  <form role="form" method="post">
    <label for="bno">글 번호</label>
    <input type="text" id="bno" name="bno" value="${read.bno}">
    
    <label for="title">제목</label>
    <input type="text" id="title" name="title" value="${read.title}">

    <label for="writer">작성자</label>
    <input type="text" id="writer" name="writer" value="${read.writer}">

    <label for="content">내용</label>
    <textarea id="content" name="content" style="height:200px"><c:out value="${read.content}"/></textarea>
    
    <label for="regdate">작성날짜</label>
    <fmt:formatDate value="${read.regdate}" pattern="yyyy-MM-dd"/>   
	  
  </form>
  
	 <input type="button" value="수정">
	 <input type="button" value="삭제">
	 <input type="button" value="목록">
	 
</div>

</body>
</html>