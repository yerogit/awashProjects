APP.service('Service', function($resource, $rootScope, toastr) {
	this.saveContact = $resource('/employee/saveContact:ide', {ide : '@ide'}, {});
	return this;
});