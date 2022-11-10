
APP.controller('ContactAddController', _ContactAddController);


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