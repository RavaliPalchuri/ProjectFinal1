<!DOCTYPE HTML>
<html>

<head>
	<meta name="description" content="website description" />
	<meta name="keywords" content="website keywords, website keywords" />
	<meta http-equiv="content-type"
		  content="text/html; charset=windows-1252" />
	<link rel="stylesheet" type="text/css" href="style/style.css" />

	<script>
        function check() {
            var a = document.ff.user.value;
            var b = document.ff.pass.value;
            if (a == 0) {
                alert('Please Enter UserId');
                return false;
                document.getElementById("name").focus();
            }
            if (b == 0) {
                alert('Please Enter Password');
                return false;
                document.getElementById("pass").focus();
            }
        }
	</script>

</head>

<body>
<div id="main">
	<div id="header">
		<div id="logo">
			<div id="logo_text">
				<br /> <br /> <font size="5"><a href="index.html"><span
					class="logo_colour">Project Work
								</span></a></font>
			</div>
		</div>
	</div>
	<div id="content_header"></div>
	<div id="site_content">
		<div id="sidebar_container">
			<br/><br/><br/><br/>
			<div class="sidebar">
				<div class="sidebar_top"></div>
				<div class="sidebar_item">
					<h3>Pics</h3>
					<ul>
						<li><img src="vehiclehire1.jpg" width="172" height="220"></li>


					</ul>
				</div>
				<div class="sidebar_base"></div>
			</div>
		</div>
		<div id="content">
			<br/><br/><br/><br/>

			<h3>Login Here</h3>

			<div class="form_settings">
				<form action="./App1" name="ff" method="post"
					  onsubmit="return check()">
					<p>
						<span>UserName</span><input class="contact" type="text"
													name="username" id="user" />
					</p>
					<br />
					<p>
						<span>Password</span><input class="contact" type="password"
													name="password"
													id="pass" />
					</p>
					<p style="padding-top: 15px">
						<span>&nbsp;</span><input class="submit" type="submit"
												  name="contact_submitted" value="submit" />
					</p>
				</form>
			</div>
		</div>
	</div>
	<br/><br/><br/><br/>
	<div id="content_footer"></div>
	<div id="footer">
		<p></p>
	</div>
</div>
</body>
</html>
