var app = angular.module('app', []);

app.controller('add', function($scope, $http, $location) {
	$scope.addDelivery = function() {
		var url = $location.absUrl() + "add";

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}

		$http.get(url, config).then(function(response) {
			if (response.data.status == "OK") {
				alert("Data added.");
			} else {
				alert("ERROR!");
			}
		}, function(response) {
			alert("ERROR!");
		});
	}
});

app.controller('delete', function($scope, $http, $location) {
	$scope.deleteDeliveries = function() {
		var url = $location.absUrl() + "delete";

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}

		$http.get(url, config).then(function(response) {
			if (response.data.status == "OK") {
				alert("All data deleted.");
			} else {
				alert("ERROR!");
			}
		}, function(response) {
			alert("ERROR!");
		});
	}
});

app.controller('get', function($scope, $http, $location) {

	$scope.getAllDeliveries = function() {
		var url = $location.absUrl() + "get";

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}

		$http.get(url, config).then(function(response) {
			if (response.data.status == "OK") {
				$scope.deliveries = response.data;
			} else {
				alert("ERROR!");
			}
		}, function(response) {
			alert("ERROR!");
		});

	}
});
