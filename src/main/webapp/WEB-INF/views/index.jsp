<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<title>Delivery Service</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.6.0/angular.min.js"></script>
<script src="/static/js/angular.js"></script>
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" />
<link href="/static/css/style.css" rel="stylesheet"></link>

</head>
<body>
	<div ng-app="app">
		<h1>Post Trucks</h1>

		<ul>
			<li>
				<div ng-controller="add">
					<a
						style="color: green; margin: 10px; font-size: 30px; text-decoration: none;"
						ng-click="addDelivery()"> <span
						class="glyphicon glyphicon-plus"></span>New
					</a>
				</div>
			</li>

			<li>
				<div ng-controller="delete">
					<a
						style="color: red; margin: 10px; font-size: 30px; text-decoration: none;"
						ng-click="deleteDeliveries()"> <span
						class="glyphicon glyphicon-remove"></span>Delete All
					</a>
				</div>
			</li>
			<li>
				<div ng-controller="get">
					<a style="color: green; margin: 10px; font-size: 35px;"
						ng-click="getAllDeliveries()"> <span
						class="glyphicon glyphicon-play-circle"></span>
					</a>

					<div style="width: 100%">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Rate</th>
									<th>F</th>
									<th>Source</th>
									<th>Age</th>
									<th>Avail</th>
									<th>Truck</th>
									<th>Truck-O</th>
									<th>DH-O</th>
									<th>F/P</th>
									<th>Origin</th>
									<th>Trip</th>
									<th>Destination</th>
									<th>DH-D</th>
									<th>Truck-D</th>
									<th>Length</th>
									<th>Weight</th>
									<th>Company</th>
									<th>Phone</th>
								</tr>
							</thead>
							<tbody>
								<tr ng-repeat="deliver in deliveries.data">
									<td>{{deliver.rate}}</td>
									<td>{{deliver.f}}</td>
									<td>{{deliver.source}}</td>
									<td>{{deliver.age}}</td>
									<td>{{deliver.avail}}</td>
									<td>{{deliver.truck}}</td>
									<td>{{deliver.truck_o}}</td>
									<td>{{deliver.dh_o}}</td>
									<td>{{deliver.f_p}}</td>
									<td>{{deliver.origin}}</td>
									<td>{{deliver.trip}}</td>
									<td>{{deliver.destination}}</td>
									<td>{{deliver.dh_d}}</td>
									<td>{{deliver.truck_d}}</td>
									<td>{{deliver.length}}</td>
									<td>{{deliver.weight}}</td>
									<td>{{deliver.company}}</td>
									<td>{{deliver.phone}}</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</li>
		</ul>
	</div>
</body>
</html>