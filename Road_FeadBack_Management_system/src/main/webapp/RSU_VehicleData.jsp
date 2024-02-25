
<%@page import="dao.RsuDao"%>
<%@page import="dto.Add_Vechile"%>
<%@page import="java.util.List"%>
<%@page import="dao.AddVechileDao"%>
<%@page import="java.sql.ResultSet"%>
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
<link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css" />
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.22/css/dataTables.bootstrap4.min.css" />

</head>
<!-- body -->
<body class="main-layout">
	<!-- loader  -->
	<div class="loader_bg">
		<div class="loader">
			<img src="images/loading.gif" alt="" />
		</div>
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
							<div class="logo">LightWeight</div>
						</div>
					</div>
				</div>
				<div class="col-lg-9">
					<div class="menu-area">
						<div class="limit-box">
							<nav class="main-menu">
								<ul class="menu-area-main">
									<li><a href="RSUHome.jsp">Home</a></li>
									<li class="active"><a href="RSU_VehicleData.jsp">View
											Vehicle Data</a></li>
									<!--    <li>
                                 <a href="RSU_TrasferedData.jsp">All Transfered Data</a>
                              </li>
                            -->
									<li><a href="RSU.jsp">Logout</a></li>


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
						<h4 style="color: white">RSU Home</h4>
					</div>
				</div>
				<div class="col-md-5">
					<div class="full slider_cont_section"></div>
				</div>
			</div>
		</div>
	</div>
	<!-- end revolution slider -->

	<%
	RsuDao rsudao=new RsuDao();
	List<Add_Vechile> list = rsudao.selectAll();
	%>

	<!-- section -->
	<div class="section layout_padding">
		<div class="container">
			<center>
				<h2>View Details</h2>
			</center>
			<table id="example" class="table table-striped table-bordered"
				style="width: 100%">
				<thead>
					<tr>
						<th>Vehicle No</th>
						<th>Added Location</th>
						<th>Road Condition</th>
						<th>Traffic Congestion</th>
						<th>Vehicle Speed</th>
						<th>Date</th>
						<th>Action</th>
					</tr>
				</thead>
					<%
						for (Add_Vechile x : list) {
						%>
						<tr>
							
							<td><%=x.getVechileNo()%></td>
							<td><%=x.getLocation()%></td>
							<td><%=x.getRoadCondition()%></td>
							<td><%=x.getTraffic() %></td>
							<td><%=x.getSpeed()%></td>
							<td><%=x.getDate()%></td>
							
							<td><a href="transfer?id=<%=x.getId()%>">Transfer</a></td>
						</tr>
						
						<%
						}
						%>
				</tbody>
			</table>


			</center>


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
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.22/js/dataTables.bootstrap4.min.js"></script>

	<script>
		$(document).ready(function() {
			$('#example').DataTable();
		});
	</script>
</body>
</html>