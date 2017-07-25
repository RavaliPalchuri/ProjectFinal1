
<!DOCTYPE HTML>

<html>

<head>
    <title>Conditional-Identity</title>
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
                Project Work</font>
            </div>
        </div>
        <div id="menubar">
            <ul id="menu">

                <li ><a class="selected" href="Order.jsp">Back</a>
                <li ><a  href="selectVehicle.jsp" class="selected">AddVehicle</a></li>
                <li ><a  href="" class="selected">Update Vehicle</a></li>
                <li ><a  href="" class="selected">delete Vehicle</a></li>
                <li ><a  href="FindVehicle.jsp" class="selected">View Vehicle Details</a></li>
                <li><a  href="index.jsp " class="selected">Logout</a></li></li>
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


            <form action="ServletSpareVehicle" method="post">
                <div class="form_settings">

                    <p><br> <b><span>VehicleId</span></b></span>
                        <input type="text" name="sid" required>
                    </p>
                    <p><br> <span><b>who</b></span>
                        <input type="text"  name="who" required></p>
                    <p> <br> <span><b>price</b></span></p>
                    <input type="text" name="price" required>
                    </br></p>

                    <p><br><span><b>units</b></span>
                        <input type="text" name="units" required></p>
                    <p> <br><span><b>vehiclemodel</b></span>
                        <input type="text" name ="vmodel"></p>
                    <p style=" padding-top: 15px">
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


