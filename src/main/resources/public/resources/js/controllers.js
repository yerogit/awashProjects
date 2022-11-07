'use strict';

APP
		.controller(
				'LoginController',
				function($rootScope, $scope, AuthSharedService) {
					$scope.rememberMe = true;
					$scope.checkname = function(name) {
						$scope.uname = name
					}
					$scope.login = function() {
						$rootScope.authenticationError = false;
						AuthSharedService.login($scope.username,
								$scope.password, $scope.rememberMe);
					}
				})
		.controller('UsersController', function($scope, $log, UsersService) {
			$scope.users = UsersService.getAll();
		})
		.controller(
				'ApiDocController',
				function($scope) {
					// init form
					$scope.isLoading = false;
					$scope.url = $scope.swaggerUrl = 'v2/api-docs';
					// error management
					$scope.myErrorHandler = function(data, status) {
						console.log('failed to load swagger: ' + status + '   '
								+ data);
					};

					$scope.infos = false;
				})
		.controller(
				'TokensController',
				function($scope, UsersService, TokensService, $q) {

					var browsers = [ "Firefox", 'Chrome', 'Trident' ]

					$q
							.all(
									[ UsersService.getAll().$promise,
											TokensService.getAll().$promise ])
							.then(
									function(data) {
										var users = data[0];
										var tokens = data[1];

										tokens
												.forEach(function(token) {
													users
															.forEach(function(
																	user) {
																if (token.userLogin === user.login) {
																	token.firstName = user.firstName;
																	token.familyName = user.familyName;
																	browsers
																			.forEach(function(
																					browser) {
																				if (token.userAgent
																						.indexOf(browser) > -1) {
																					token.browser = browser;
																				}
																			});
																}
															});
												});

										$scope.tokens = tokens;
									});

				})
		.controller('LogoutController', function(AuthSharedService) {
			AuthSharedService.logout();
		})
		.controller('ErrorController', function($scope, $routeParams) {
			$scope.code = $routeParams.code;
			switch ($scope.code) {
			case "403":
				$scope.message = "Oops! you have come to unauthorised page."
				break;
			case "404":
				$scope.message = "Page not found."
				break;
			default:
				$scope.code = 500;
				$scope.message = "Oops! unexpected error"
			}

		})
		.controller(
				'EmployeeRegisterController',
				function($rootScope, $scope, Service, $routeParams) {

					$scope.empid_error = null;
					$scope.first_name_error = null;
					$scope.last_name_error = null;
					$scope.unit_error = null;
					$scope.role_error = null;
					$scope.password_error = null;
					$scope.confirm_password_error = null;

					$scope.unitList = Service.fetchUnits.query();
					$scope.roleList = Service.roles.query();

					$scope.save = function(datas, empid, firstname, lastname,
							unit, role, password, confirmpassword) {

						// alert("gender: " + datas.gender);

						if (empid == null) {
							$scope.empid_error = "Empty Field";
						} else {
							$scope.empid_error = null;
						}
						if (firstname == null) {
							$scope.first_name_error = "Empty Field";
						} else {
							$scope.first_name_error = null;
						}
						if (lastname == null) {
							$scope.last_name_error = "Empty Field";
						} else {
							$scope.last_name_error = null;
						}
						if (unit == null) {
							console.log("Unit null");
							$scope.unit_error = "Empty Field";
						} else {
							console.log("Unit not null");
							$scope.unit_error = null;
						}
						if (role == null) {
							console.log("Role null");
							$scope.role_error = "Empty Field";
						} else {
							console.log("Role not null");
							$scope.role_error = null;
						}
						if (password == null) {
							$scope.password_error = "Empty Field";
						} else {
							$scope.password_error = null;
						}
						if (confirmpassword == null) {
							$scope.confirm_password_error = "Empty Field";
						} else if (password !== confirmpassword) {
							$scope.confirm_password_error = "Password confirmation does not match.";
						} else {
							$scope.confirm_password_error = null;
						}
						// console.log("NAME: " + datas.firstName);
						if (empid != null && firstname != null
								&& lastname != null && unit != null
								&& role != null && password != null
								&& confirmpassword != null
								&& password == confirmpassword) {
							datas.department = datas.unit;
							datas.enabled = 1;
							// datas.email = "eendaletilahun42@gmail.com";

							Service.savedata.save(datas, success, error);

							function success(obj) {
								// console.log("success");
								$scope.successMessage = "Saved!"
								$scope.errors = null;

								$scope.user.firstname = "";
								$scope.user.lastname = "";
								$scope.user.empid = "";
								// $scope
								$scope.user.password = "";
								$scope.user.confirmpassword = "";
								$scope.user.gender = "Male";
								$scope.user.unit = null;
								$scope.user.role = null;

							}
							function error(obj) {
								// console.log("error");
								$scope.successMessage = null;
								$scope.errors = obj;

							}
						}
					}
				}).controller('ContactListviewController',
				_ContactListviewController).controller('UnitController',
				_UnitController).controller('ContactAddController',
				_ContactAddController).controller('ContactEditController',
				_ContactEditController);

/**
 * Account Role controller
 * 
 * @param $rootScope
 * @param $scope
 * @param Service
 * @param $routeParams
 * @returns
 */

function _ContactEditController($rootScope, $scope, Service, $routeParams) {
	$scope.vis = "visible";

	$scope.contact = getContact();
	function getContact() {
		return Service.contact.get({
			"id" : $routeParams.id
		}, success, error);
	}

	function success(data) {
		$scope.contact = data;
		$scope.contact.phoneNumber = data.phonenumber;
		$scope.contact.officeNumber = data.officenumber;
		$scope.contact.cellPhoneNumber = data.cellphonenumber;
	}
	function error(data) {
		$scope.successMessage = null;
		$scope.errors = data;
	}

	$scope.save = function(datas, phonenumber, email, officenumber, city,
			cellphonenumber, address) {

		if (phonenumber == null) {
			$scope.phonenumber_error = "Empty Field";
		} else {
			$scope.phonenumber_error = null;
		}
		if (email == null) {
			console.log("email null");
			$scope.email_error = "Empty Field";
		} else {
			console.log("email not null");
			$scope.email_error = null;
		}
		if (officenumber == null) {
			$scope.officenumber_error = "Empty Field";
		} else {
			$scope.officenumber_error = null;
		}
		if (city == null) {
			$scope.city_error = "Empty Field";
		} else {
			$scope.city_error = null;
		}
		if (cellphonenumber == null) {
			$scope.cellphonenumber_error = "Empty Field";
		} else {
			$scope.cellphonenumber_error = null;
		}
		if (address == null) {
			$scope.address_error = "Empty Field";
		} else {
			$scope.address_error = null;
		}
		if (phonenumber != null && email != null && officenumber != null
				&& city != null && cellphonenumber != null && address != null) {
			datas.status = 1;
			datas.contact_id = $routeParams.id;
			Service.saveContact.save(datas, success, error);

			function success(obj) {
				// console.log("success");
				$scope.successMessage = "Saved!"
				$scope.errors = null;
				$scope.contact.phoneNumber = "";
				$scope.contact.email = "";
				$scope.contact.officeNumber = "";
				$scope.contact.city = "";
				$scope.contact.cellPhoneNumber = "";
				$scope.contact.address = "";
				$scope.vis = null;
			}
			function error(obj) {
				// console.log("error");
				$scope.successMessage = null;
				$scope.errors = obj;

			}
		}

	}

}

function _ContactListviewController($rootScope, $scope, ContactService,
		$routeParams) {
	$scope.resultData_contacts = getAllContacts();
	function getAllContacts() {
		return ContactService.contacts.query();
	}
}

function _ContactAddController($rootScope, $scope, Service, $routeParams) {
	$scope.vis = "visible";
	$scope.a = getEmployeeName($routeParams.id);

	function getEmployeeName(id) {
		return Service.getempname.get({
			'id' : id
		}, success, error);
	}

	function success(obj) {
		// alert(obj);
		$scope.firstname = obj.firstname;
		$scope.lastname = obj.lastname;
	}
	function error(obj) {

	}

	$scope.save = function(datas, phonenumber, email, officenumber, city,
			cellphonenumber, address) {

		if (phonenumber == null) {
			$scope.phonenumber_error = "Empty Field";
		} else {
			$scope.phonenumber_error = null;
		}
		if (email == null) {
			console.log("email null");
			$scope.email_error = "Empty Field";
		} else {
			console.log("email not null");
			$scope.email_error = null;
		}
		if (officenumber == null) {
			$scope.officenumber_error = "Empty Field";
		} else {
			$scope.officenumber_error = null;
		}
		if (city == null) {
			$scope.city_error = "Empty Field";
		} else {
			$scope.city_error = null;
		}
		if (cellphonenumber == null) {
			$scope.cellphonenumber_error = "Empty Field";
		} else {
			$scope.cellphonenumber_error = null;
		}
		if (address == null) {
			$scope.address_error = "Empty Field";
		} else {
			$scope.address_error = null;
		}
		if (phonenumber != null && email != null && officenumber != null
				&& city != null && cellphonenumber != null && address != null) {
			datas.status = 1;
			datas.user_id = $routeParams.id;
			Service.saveContact.save(datas, success, error);

			function success(obj) {
				// console.log("success");
				$scope.successMessage = "Saved!"
				$scope.errors = null;
				$scope.contact.phoneNumber = "";
				$scope.contact.email = "";
				$scope.contact.officeNumber = "";
				$scope.contact.city = "";
				$scope.contact.cellPhoneNumber = "";
				$scope.contact.address = "";
				$scope.vis = null;
			}
			function error(obj) {
				// console.log("error");
				$scope.successMessage = null;
				$scope.errors = obj;

			}
		}

	}

}

function _UnitController($rootScope, $scope, Service, $routeParams) {
	$scope.unit_name_error = null;
	$scope.unit_description_error = null;

	$scope.save = function(datas, name, description) {

		if (name == null) {
			$scope.unit_name_error = "Unit name cannot be empty";
		} else {
			$scope.unit_name_error = null;
		}
		if (description == null) {
			$scope.unit_description_error = "Unit description cannot be empty";
		} else {
			$scope.unit_description_error = null;
		}
		if (description != null && description != null) {
			Service.saveUnit.save(datas, success, error);

			function success(obj) {
				// console.log("success");
				$scope.successMessage = "Saved!"
				$scope.errors = null;
				$scope.resultData_units = getAllUnits();
				$scope.unit.name = "";
				$scope.unit.description = "";
			}
			function error(obj) {
				// console.log("error");
				$scope.successMessage = null;
				$scope.errors = obj;

			}
		}

	}

	$scope.resultData_units = getAllUnits();
	function getAllUnits() {
		return Service.fetchUnits.query();

	}

}
