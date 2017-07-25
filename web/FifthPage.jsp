

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
                <br /> <br /> <font size="5"><span
                    class="logo_colour">
                Project Work</font></div>
            </div>
        </div>
        <div id="menubar">
            <ul id="menu">

                <li class="selected"><a  href="Main1.jsp">Back</a></li>-->

                    <li ><a  href="ThirdPage" class="selected">BlockOperator</a></li>

                <li ><a  href="SecondPage.jsp" class="selected">AddOperator</a></li>-->
                <li ><a  href="Order.jsp" class="selected">New Order</a></li>
                <li ><a  href="FifthPage.jsp" class="selected">All your Orders</a></li>

                <li><a  href="index.jsp " class="selected">Logout</a></li>

            </ul>			</div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
        <div id="sidebar_container">
            <br /> <br /> <br /> <br />
            <div class="sidebar">
                <div class="sidebar_top"></div>

                <div class="sidebar_base"></div>
            </div>
        </div>
        <div id="content">

            <br /> <br /> <br /> <br />


            <form action="FromTo" method="post">
                <div class="form_settings">
                    <p><br> <b><span>ENTER START DATE-1(dd/mm/yyyy) : </span></b></span>
                        <input type="text" name="d1"/>
                    </p>
                    <p><br> <b><span>ENTER END  DATE-2(dd/mm/yyyy) : </span></b></span>
                        <input type="text" name="d2"/>
                    </p>

                    <p style="padding-top: 15px">
                        <span>&nbsp;</span><input class="submit" type="submit"
                                                  name="contact_submitted" value="submit" />
                    </p>
                </div></form>







        </div>
    </div>
    <br /> <br /> <br /> <br />
    <!--  <div id="content_footer"></div>-->
    <div id="footer">
        <p></p>
    </div>
</div>
</body>
</html>


