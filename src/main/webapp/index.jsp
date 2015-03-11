<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>vLawyer - Hệ thống hỏi đáp trên văn bản luật Việt Nam</title>
<style type="text/css">
	#question {
	    width: 650PX;
	    height: 32px;
	    text-align: left;
	    vertical-align: middle;
	    font-size: 16px;
	    font-style: italic;
	}
	
	.controls input[type="submit"] {
		width: 110px;
		height: 39px;
		text-align: center;
		vertical-align: middle;
		background-color: rgb(177, 138, 17);
		color: cornsilk;
		font-weight: bold;
		font-size: 14px;
	}
	
	.copyright {
		font-size: 12px;
	}
	
	table tr td a {
		text-decoration: inherit;
		color: #6F57EE;
	}
	
	table tr td i a {
		color: #9B9B0A;
		font-weight: bold;
	}
	
	.logo {
		margin-top: 80px;
		margin-bottom: 30px;
	}
</style>
<script type="text/javascript">
	function getQuestion(me) {
		var question = document.getElementById("question");
		question.value = me.innerText.split(". ")[1];
	}
</script>
</head>
<body>
	<div id="question-demo"></div>
	<f:form action="ask" theme="simple">
		<table align="center" width="780px">
			<tr>
				<td colspan="2" align="center">
					<img alt="A Vietnam's Legal Document Question Answering System" src="images/logo.jpeg" class="logo">
				</td>
			</tr>
			<tr>
				<td class="controls">
					<input type="text" name="question" id="question" placeholder="Vui lòng nhập một câu hỏi."></input>
					
					<input type="submit"  value="Hỏi" ></input>
					<input type="submit" value="Đánh chỉ mục" action="indexAction" id="index" style="display:none;" ></input>
					<!-- <s:submit value="Tải tài liệu" action="downloadAction" id="download" style="display:none" ></s:submit> -->
				</td>
			</tr>
			<tr>
				<td align="center" class="copyright">
					Nguyễn Trí Luận Ngữ - Phạm Thành Công &copy 2015, <a href="http://www.hcmus.edu.vn">University of Science</a>, VNU-HCMC
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<br />
					<b>Ví dụ.</b>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<i>
					<a href="#question-demo" onclick="getQuestion(this);">1. Đăng ký đổi tên doanh nghiệp được thực hiện như thế nào? </a><br /> 
					<a href="#question-demo" onclick="getQuestion(this);">2. Doanh nghiệp bị giải thể trong các trường hợp nào?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">3. Giấy đề nghị đăng ký kinh doanh bao gồm những nội dung gì? </a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">4. Việc đăng ký thay đổi người đại diện theo pháp luật của công ty trách nhiệm hữu hạn, công ty cổ phần được pháp luật quy định như thế nào?</a>  <br />
					<a href="#question-demo" onclick="getQuestion(this);">5. Việc xử lý tranh chấp về tên doanh nghiệp được thực hiện như thế nào?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">6. Doanh nghiệp được cấp lại giấy chứng nhận đăng ký kinh doanh trong trường hợp nào?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">7. Theo quy định của luật doanh nghiệp, chủ doanh nghiệp tư nhân có quyền quyết định việc quản lý doanh nghiệp không?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">8. Việc chấm dứt hoạt động chi nhánh, văn phòng đại diện, địa điểm kinh doanh được quy định như thế nào?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">9. Cơ quan nào giải quyết tranh chấp giữa các nhà đầu tư?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">10. Điều kiện kinh doanh dịch vụ logistic?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">11. Các quy định nào của pháp luật cấm cán bộ, công chức, viên chức thành lập và quản lý doanh nghiệp?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">12. Ai có quyền triệu tập hội đồng thành viên?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">13. Điều kiện làm thành viên Hội đồng quản trị là gì?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">14. Quyết định của Đại hội đồng cổ đông có hợp pháp khi vi phạm trình tự, thủ tục?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">15. Luật doanh nghiệp quy định như thế nào về quyền và trách nhiệm của công ty mẹ - công ty con?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">16. Văn phòng đại diện có được khắc con dấu riêng không?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">17. Doanh nghiệp chưa thanh toán hết các khoản nợ có được phép giải thể doanh nghiệp không?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">18. Nghĩa vụ của doanh nghiệp là gì?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">19. Một hộ kinh doanh có thể có tối đa bao nhiêu lao động?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">20. Nội dung của bản danh sách thành viên, danh sách cổ đông sáng lập?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">21. Chấm dứt tư cách thành viên hợp danh trong những trường hợp như thế nào?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">22. Đổi tên doanh nghiệp có phải đăng ký lại tên chủ sở hữu tài sản?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">23. Tôi có quyền sử dụng phần vốn của mình để trả nợ hay không</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">24. Đăng ký cổ phần phổ thông của cổ đông sáng lập được thực hiện như thế nào?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">25. Doanh nghiệp tư nhân có quyền chuyển đổi thành công ty trách nhiệm hữu hạn hay không?</a> <br />
					<span id="more-questions" style="display:none;">
					<a href="#question-demo" onclick="getQuestion(this);">26. Hộ kinh doanh là gì?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">27. Pháp luật quy định như thế nào về địa điểm kinh doanh của hộ kinh doanh?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">28. Điều kiện thành lập khu kinh tế cửa khẩu?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">29. Trường hợp nào doanh nghiệp bị thu hồi Giấy chứng nhận đăng ký kinh doanh?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">30. Quy định phối hợp tạo và cấp mã số doanh nghiệp quy định như thế nào?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">31. Nhóm công ty là loại hình như thế nào?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">32. Xin cho biết những ngành, nghề nào bị cấm kinh doanh?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">33. Những ngành, nghề kinh doanh nào đòi hỏi phải có chứng chỉ hành nghề?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">34. Việc chuyển quyền sở hữu đối với tài sản góp vốn có phải chịu lệ phí trước bạ hay không?</a> <br />
					<a href="#question-demo" onclick="getQuestion(this);">35. Kể từ thời điểm bị thu hồi giấy chứng nhận đăng ký kinh doanh, trong thời gian bao lâu doanh nghiệp bắt buộc phải giải thể?</a>
					</span>
					</i>
				</td>
			</tr>
		</table>
	</f:form>
</body>
</html>