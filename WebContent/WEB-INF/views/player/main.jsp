<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../common/head.jsp"/>
playerMain 화면
<c:choose>
	<c:when test="${page eq '2_positions' }">
		<jsp:include page="2_positions.jsp"/>
	</c:when>
	<c:when test="${page eq '4_find_by_teamid_position' }">
		<jsp:include page="4_find_by_teamid_position.jsp"/>	
	</c:when>
	<c:when test="${page eq '5_find_by_teamid_height_name' }">
		<jsp:include page="5_find_by_teamid_height_name.jsp"/>	
	</c:when>
</c:choose>

<jsp:include page="../common/foot.jsp"/>