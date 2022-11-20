'use strict';

var APP = angular.module('myApp', [ 'ngResource', 'ngRoute', 'swaggerUi',
		'http-auth-interceptor', 'ngAnimate', 'angular-spinkit', 'ui.select',
		'ngSanitize', 'angular-loading-bar', 'toastr', 'oib.localStorage',
		'ngCookies' ]);

APP.constant('USER_ROLES', {
	all : '*',
	admin : 'ADMIN',
	user : 'user'
});
APP.value('version', '1494450883183');
APP.filter('propsFilter', function() {
	return function(items, props) {
		var out = [];

		if (angular.isArray(items)) {
			var keys = Object.keys(props);

			items.forEach(function(item) {
				var itemMatches = false;

				for (var i = 0; i < keys.length; i++) {
					var prop = keys[i];
					var text = props[prop].toLowerCase();
					if (item[prop] !== null
							&& item[prop].toString().toLowerCase()
									.indexOf(text) !== -1) {
						itemMatches = true;
						break;
					}
				}

				if (itemMatches) {
					out.push(item);
				}
			});
		} else {
			// Let the output be the input untouched
			out = items;
		}

		return out;
	};
});

APP.config(function($routeProvider, USER_ROLES, $httpProvider) {

	// Expermental, there is already a progressbar http interceptor
	// let implement reponseInterceptor only here
	$httpProvider.interceptors.push(function($q, $injector, $rootScope) {
		return {
			responseError : function(rejection) {
				$rootScope.$broadcast("httpErrorEvent", rejection);
				return $q.reject(rejection);
			}
		};
	});

	$routeProvider.when("/home", {
		templateUrl : "partials/home.html",
		controller : 'HomeController',
		access : {
			loginRequired : true,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).when('/login', {
		templateUrl : 'partials/login.html',
		controller : 'LoginController',
		access : {
			loginRequired : false,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).when('/loading', {
		templateUrl : 'partials/loading.html',
		access : {
			loginRequired : false,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).when("/logout", {
		template : " ",
		controller : "LogoutController",
		access : {
			loginRequired : false,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).when('/employee/register', {
		templateUrl : 'partials/employee/emp_register.html',
		controller : 'EmployeeRegisterController',
		access : {
			loginRequired : true,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).when('/employee/contact/add/:id', {
		templateUrl : 'partials/employee/contact_add.html',
		controller : 'ContactAddController',
		access : {
			loginRequired : true,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).when('/employee/view', {
		templateUrl : 'partials/employee/emp_view.html',
		controller : 'EmployeeViewController',
		access : {
			loginRequired : true,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).when('/roles/view', {
		templateUrl : 'partials/employee/role_view.html',
		controller : 'RoleViewController',
		access : {
			loginRequired : true,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).when('/employee/contact', {
		templateUrl : 'partials/employee/contact_listview.html',
		controller : 'ContactListviewController',
		access : {
			loginRequired : true,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).when('/employee/search', {
		templateUrl : 'partials/employee/emp_search.html',
		controller : 'SearchEmployee',
		access : {
			loginRequired : true,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).when('/employee/unit', {
		templateUrl : 'partials/employee/add_unit.html',
		controller : 'UnitController',
		access : {
			loginRequired : true,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).when("/partials/employee/newdepartment", {
		templateUrl : "partials/employee/newDepartment.html",
		controller : "UnitController",
		access : {
			
			loginRequired : true,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).when("/partials/employee/edit/:id", {
		templateUrl : "partials/employee/unit_edit.html",
		controller : "UnitController",
		access : {
			
			loginRequired : true,
			authorizedRights : [ USER_ROLES.all ]
		}
	})
	.when("/error/:code", {
		templateUrl : "partials/error.html",
		controller : "ErrorController",
		access : {
			loginRequired : true,
			authorizedRights : [ USER_ROLES.all ]
		}
	}).otherwise({
		redirectTo : '/error/404',
		access : {
			loginRequired : true,
			authorizedRights : [ USER_ROLES.all ]
		}
	});
//	.when('/employee/contact/edit/:id', {
//	templateUrl : 'partials/employee/contact_edit.html',
//	controller : 'ContactEditController',
//	access : {
//		loginRequired : true,
//		authorizedRights : [ USER_ROLES.all ]
//	}
//})
});
	
APP.run(function(RunService) {

	RunService.run()

});
