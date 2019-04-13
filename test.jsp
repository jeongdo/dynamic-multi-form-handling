<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Index</title>

<script src="/webjars/jquery/1.12.4/dist/jquery.min.js"></script>

<script>
$(function() {
	$('#btn').on('click', function (){
		$('#boardFrm')[0].submit();
	});

	$('#btnCopy').on('click', function (){
		var html = "";
		// Div Row 갯수
		var length = $('#appendDiv div').length;

		html +=
			"<div>"
			+"	<input type='text' name='test["+ length +"].psngr' value='탑승인원 "+ (length + 1) +"명'>"
			+"	<input type='text' name='test["+ length +"].psngr15' value='15인승 "+ (length + 1) +"명'>"
			+"	<input type='text' name='test["+ length +"].psngr25' value='25인승 "+ (length + 1) +"명'>"
			+"</div>"
		;

		$('#appendDiv').append(html);
	});
});
</script>
</head>
<body>
	<form id="boardFrm" action="/test/data" method="post">
		<div id="appendDiv">
			<div>
				<input type="text" name="test[0].psngr" value="탑승인원 1명">
				<input type="text" name="test[0].psngr15" value="15인승 1대">
				<input type="text" name="test[0].psngr25" value="25인승 1대">
			</div>
		</div>
	</form>
	<button id="btnCopy">복제</button>
	<button id="btn">전송</button>
</body>
</html>