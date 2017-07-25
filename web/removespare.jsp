

<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>







<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE HTML>

<html>

<head>
    <meta name="description" content="website description" />
    <meta name="keywords" content="website keywords, website keywords" />
    <meta http-equiv="content-type"
          content="text/html; charset=windows-1252" />
    <link rel="stylesheet" type="text/css" href="style/style.css" />

</head>

<body>
<div id="main">
    <div id="header">
        <div id="logo">
            <div id="logo_text">
                <br /> <br /> <font size="5"><a href="index.html"><span
                    class="logo_colour">
							Project Work</a></font>
            </div>
        </div>
        <div id="menubar">
            <ul id="menu">

                <li class="selected"><a  href="Order.jsp">Back</a></li>
                <li ><a  href="select.jsp">AddSpareparts</a></li>
                <li ><a  href="removespare.jsp">delete Spare</a></li>
                <li ><a  href="Findspare.jsp">View Spare Details</a></li>
                <li><a  href="index.jsp ">Logout</a></li>

            </ul>			</div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
        <div id="sidebar_container">
            <br /> <br /> <br /> <br />
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

            <br /> <br /> <br /> <br />

            <form action="ServletRemoveSpare" method="post">
                <div class="form_settings">

                    <p><br> <b><span>Enter the sparePartid to be removed</span></b></span>
                        <input type="text" name="sid" required>
                    </p>

                    <p style="padding-top: 15px">
                        <span>&nbsp;</span><input class="submit" type="submit"
                                                  name="contact_submitted" value="submit" />
                    </p>
                </div>



            </form>



        </div>
    </div>
    <br /> <br /> <br /> <br />
    <div id="content_footer"></div>
    <div id="footer">
        <p></p>
    </div>
</div>
</body>
</html>

