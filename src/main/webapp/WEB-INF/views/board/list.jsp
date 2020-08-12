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
table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 16px;
}

tr:nth-child(even) {
  background-color: #f2f2f2;
}
</style>
</head>
<body>

<h2>게시팔</h2>
<p>회원전용 게시판입니다</p>

<section id="container">
	<form role="form" method="post" action="/board/write">
		<table>
		  <tr>
		    <th>번호</th>
		    <th>제목</th>
		    <th>작성자</th>
		    <th>등록일</th>
		  </tr>
		  <c:forEach items="${list}" var = "list">
			  <tr>
			    <td><c:out value="${list.bno}" /></td>
				<td><c:out value="${list.title}" /></td>
				<td><c:out value="${list.writer}" /></td>
				<td><fmt:formatDate value="${list.regdate}" pattern="yyyy-MM-dd"/></td>
			  </tr>
		  </c:forEach>
		</table>
	</form>
</section>

</body>
</html>
