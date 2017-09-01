var app = angular.module('app', []);

app.controller('postcontroller', function($scope, $http, $location) {
	$scope.submitForms = function() {
		var url = $location.absUrl() + "postcustomer";

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}
		var data = {
			/*
			 * firstName is the one in Java Class and firstnames is the one in
			 * html index file
			 */

			firstName : $scope.firstnames,
			lastName : $scope.lastnames
		};

		$http.post(url, data, config).then(function(response) {
			$scope.postResultMessage = "Sucessful!";
		}, function(response) {
			$scope.postResultMessage = "Fail!";
		});

		$scope.firstname = "";
		$scope.lastname = "";
	}
});

app.controller('getcontroller', function($scope, $http, $location) {
	$scope.getfunction = function() {
		var url = $location.absUrl() + "getallcustomer";

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}

		$http.get(url, config).then(function(myResponse) {
			$scope.myResponse = myResponse.data
		}, function(myResponse) {
			$scope.getResultMessage = "Fail!";
		});
	}
});

// The controller

app.controller('getcustomer', function($scope, $http, $location) {
	$scope.getName = function() {
		var url = $location.absUrl() + "getCustomerFirstNameStartWith";

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}
		var data = {
			// firstName is the one in Java Class and firstnames is the one in
			// html index file

			firstName : $scope.firstname

		};

		$http.post(url, data, config).then(function(response) {
			$scope.response = response.data;
		}, function(response) {
			$scope.postResultMessage = "Fail!";
		});

	}
});
