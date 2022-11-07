/**
 * 
 */
APP.controller('EmployeeViewController', _EmployeeViewController).controller(
		'SearchEmployee', _SearchEmployee).controller('HomeController',
		_HomeController).controller('RoleViewController', _roleViewController);

function _roleViewController($rootScope, $scope, RoleService, $routeParams) {
	$scope.resultData = getAllRoles();
	function getAllRoles() {
		return RoleService.roles.query();
	}
}

function _HomeController($scope, Service) {

	$scope.deleteContact = function() {
		Service.deleteContact.save({
			"id" : 2
		}, success, error);

		function success(data) {
			$scope.successMessage = data;
			$scope.errors = null;
		}
		function error(obj) {
			$scope.successMessage = null;
			$scope.errors = obj;

		}
	}
};

function _EmployeeViewController($rootScope, $scope, Service, $routeParams) {
	$scope.resultData_users = getAllUsers();
	function getAllUsers() {
		return Service.users.query();
	}
}

function _SearchEmployee($rootScope, $scope, theService, $routeParams, $route) {

	$scope.searchDatas = function(keys) {
		theService.searchDatas.query(keys, sucess, error);

		function sucess(data) {
			$scope.resultData = data;
			$scope.errors = null;
		}
		function error(obj) {
			$scope.successMessage = null;
			$scope.errors = obj;

		}

	}
};
