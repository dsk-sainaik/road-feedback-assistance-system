

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- basic -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>A Lightweight</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- bootstrap css -->
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <!-- style css -->
      <link rel="stylesheet" href="css/style.css">
      <!-- Responsive-->
      <link rel="stylesheet" href="css/responsive.css">
      <!-- fevicon -->
      <link rel="icon" href="images/fevicon.png" type="image/gif" />
      <!-- Scrollbar Custom CSS -->
      <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
     
   </head>
   <!-- body -->
   <body class="main-layout">
      <!-- loader  -->
      <div class="loader_bg">
         <div class="loader"><img src="images/loading.gif" alt="" /></div>
      </div>
      <!-- end loader -->
      <!-- header -->
      <header>
         <!-- header inner -->
         <div class="container-fluid">
            <div class="row">
               <div class="col-lg-3 logo_section">
                  <div class="full">
                     <div class="center-desk">
                        <div class="logo">LightWeight </div>
                     </div>
                  </div>
               </div>
               <div class="col-lg-9">
                  <div class="menu-area">
                     <div class="limit-box">
                        <nav class="main-menu">
                           <ul class="menu-area-main">
                              <li>
                                 <a href="VehicleHome.jsp">Home</a>
                              </li>
                              <li class="active">
                                 <a href="AddDetails.jsp">Add Current Details</a>
                              </li>
                              <li>
                                 <a href="ViewDetails.jsp">My Details</a>
                              </li>
                              <li>
                                 <a href="OViewDetails.jsp">Other Details</a>
                              </li>
                              <li >
                                 <a href="Vehicle.jsp">Logout</a>
                              </li>
                             
                             
                           </ul>
                        </nav>
                     </div>
                  </div>
               </div>
            </div>
         </div>
         <!-- end header inner -->
      </header>
      <!-- end header -->
      <!-- revolution slider -->
      <div class="banner-slider">
         <div class="container-fluid">
            <div class="row">
               <div class="col-md-7">
                  <div id="slider_main" class="carousel slide" data-ride="carousel">
                     <!-- The slideshow -->
                     <div class="carousel-inner">
                        <div class="carousel-item active">
                           <img src="images/Capture.PNG" alt="#" />
                        </div>
                        <div class="carousel-item">
                           <img src="images/img.jpg" alt="#" />
                        </div>
                     </div>
                     <!-- Left and right controls -->
                     <a class="carousel-control-prev" href="#slider_main" data-slide="prev">
                     <i class="fa fa-angle-left" aria-hidden="true"></i>
                     </a>
                     <a class="carousel-control-next" href="#slider_main" data-slide="next">
                     <i class="fa fa-angle-right" aria-hidden="true"></i>
                     </a>
                  </div>
               </div>
               <div class="col-md-5">
                  <div class="full slider_cont_section">
                      <%String vno=(String)session.getAttribute("vno");%>
                     
                    <%request.setAttribute("vno",vno); %>
                       <h4>Add Details Of Vehicle Current Situation</h4>
                    
                      <form action="AddVechileDetails" method="post">
              <table>
                  
                  <tr><th>Vehicle Number</th><td><input type="text" name="vno" value="<%=vno%>" readonly=""></tD></tr>
                   <tr><th>Current Location</th><td><input type="text" name="clocation" required=""></tD></tr>
                    <tr><th>Road Condition</th><td><input type="text" name="road" required=""></tD></tr>
                 
                   <tr><th>Traffic congestion</th><td><textarea cols="20" rows="5" name="traffic" required=""></textarea></tD></tr>
                   <tr><th>Speed</th><td><input type="text" name="speed" required=""></tD></tr>
                   <tr><th></th><td><input type="submit" value="Register">
                       </tD></tr>
              </table>
          </form>
                     
                     
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- end revolution slider -->
      <!-- section --> 
      <div class="section layout_padding">
         <div class="container">
           
           
           
          
         </div>
      </div>
     
     
   
      <script src="js/jquery.min.js"></script>
      <script src="js/popper.min.js"></script>
      <script src="js/bootstrap.bundle.min.js"></script>
      <script src="js/jquery-3.0.0.min.js"></script>
      <script src="js/plugin.js"></script>
      <!-- Scrollbar Js Files -->
      <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
      <script src="js/custom.js"></script>
   </body>
</html>