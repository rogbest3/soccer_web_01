<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
	<c:when test="${qa eq 'query' }">
		<!-- 2. 쿼리 -->
		<h2><a id="link1" href="#">2.포지션 종류 보기</a></h2>
	</c:when>
	<c:when test="${qa eq 'result' }">
		<!-- 2. 결과 -->
		포지션은 ${positions} 입니다.
	</c:when>
</c:choose>

<form id="query2_form">
	<input type="hidden" name="action" value="search"/>
	<input type="hidden" name="page" value="2_positions"/>
	<input type="hidden" name="a" value="result"/>
</form>
<script>
	app.init('${ctx}');
</script>