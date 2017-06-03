<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Product Details...</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
@import url(https://fonts.googleapis.com/css?family=Roboto:300);

.login-page {
	width: 360px;
	padding: 8% 0 0;
	margin: auto;
}

.form {
	position: relative;
	z-index: 1;
	background: #FFFFFF;
	max-width: 360px;
	margin: 0 auto 100px;
	padding: 45px;
	text-align: center;
	box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0
		rgba(0, 0, 0, 0.24);
}

.form input {
	font-family: "Roboto", sans-serif;
	outline: 0;
	background: #f2f2f2;
	width: 100%;
	border: 0;
	margin: 0 0 15px;
	padding: 15px;
	box-sizing: border-box;
	font-size: 14px;
}

.form button {
	font-family: "Roboto", sans-serif;
	text-transform: uppercase;
	outline: 0;
	background: #4CAF50;
	width: 100%;
	border: 0;
	padding: 15px;
	color: #FFFFFF;
	font-size: 14px;
	-webkit-transition: all 0.3 ease;
	transition: all 0.3 ease;
	cursor: pointer;
}

.form button:hover, .form button:active, .form button:focus {
	background: #43A047;
}

.form .message {
	margin: 15px 0 0;
	color: #b3b3b3;
	font-size: 12px;
}

.form .message a {
	color: #4CAF50;
	text-decoration: none;
}

.container {
	position: relative;
	z-index: 1;
	max-width: 300px;
	margin: 0 auto;
}

.container:before, .container:after {
	content: "";
	display: block;
	clear: both;
}

.container .info {
	margin: 50px auto;
	text-align: center;
}

.container .info h1 {
	margin: 0 0 15px;
	padding: 0;
	font-size: 36px;
	font-weight: 300;
	color: #1a1a1a;
}

.container .info span {
	color: #4d4d4d;
	font-size: 12px;
}

.container .info span a {
	color: #000000;
	text-decoration: none;
}

.container .info span .fa {
	color: #EF3B3A;
}

.div {
	height: 75px;
	width: 100%;
	background-color: gray;
}
</style>

<script type="text/javascript">
	$('.message a').click(function() {
		$('form').animate({
			height : "toggle",
			opacity : "toggle"
		}, "slow");
	});
</script>
</head>

<body bgcolor="white">
	<div class="div"></div>
	<div class="login-page">
		<div class="form">
			<form class="login-form" action="ServletDemo" method="post">
				Product_Name :<input type="text" name="prodname"
					placeholder="Product_Name"> Product_Model :<input
					type="text" name="prodmodel" placeholder="Product_Model">
				Product_Brand :<input type="text" name="prodbrand"
					placeholder="Product_Brand"> Product_Prize :<input
					type="number" name="prize" placeholder="Product_Prize">
				<button>Submit</button>
				<p class="message">
					Do you want to add more Products ?<br>
					<a href="index.jsp">Add Products</a>
				</p>
				<!-- <button>
					<a href='index.jsp'>Add Products</a>
				</button>
				<button>
					<a data-toggle="modal" data-target="#myModal" href="#myPopupDialog"
						data-rel="popup">Update Product</a>
				</button>
				<button>
					<a href='delete.jsp'>Delete Product</a>
				</button> -->
			</form>
		</div>
	</div>

	<!-- Modal -->
	<div class="container" id="outer_div">
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">
				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header" id="header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<center>
							<h2 class="modal-title">Employee Details...</h2>
						</center>
					</div>

					<div id="myPopupDialog" data-role='popup' class='ui-content'></div>
					<div id="deletepopup" data-role='popup' class='ui-content'></div>

					<div class="modal-footer" id="footer">
						<button type="button" class="btn btn-warning" id="view_btn">View</button>
						<button type="button" class="btn btn-warning" id="btn_edit">Edit</button>
						<button type="button" class="btn btn-warning" id="btn_delete">
							Delete</button>
						<button type="button" class="btn btn-warning" data-dismiss="modal"
							id="btn_close">Close</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>