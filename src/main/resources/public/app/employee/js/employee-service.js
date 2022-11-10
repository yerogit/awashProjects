/**
 * 
 */

APP.service('Service', function($resource, $rootScope, toastr) {
	// //search share holders
	this.savedata = $resource('/employee/register:idy', {
		idy : '@idy'
	}, {});
	this.saveUnit = $resource('/employee/saveUnit:idu', {
		idy : '@idu'
	}, {});
	this.saveContact = $resource('/employee/saveContact:ide', {
		ide : '@ide'
	}, {});
	this.fetchUnits = $resource('/employee/fetchUnits', {}, {});
	this.roles = $resource('/roles/view', {}, {});
	this.users = $resource('/employee/users', {}, {});
	this.getempname = $resource('/employee/contact/add/:id', {
		id : '@id'
	}, {});
	this.contact = $resource("/employee/contact/get/:id", {
		id : '@id'
	}, {});
	this.deleteContact = $resource('/employee/contact/delete/:id', {
		id : '@id'
	}, {});

	return this;
}).service('RoleService', function($resource, $rootScope, toastr) {
	console.log("/ROLES/VIEW ::::::::::::::   SERVICE");
	this.roles = $resource('/roles/view', {}, {});
}).service('ContactService', function($resource, $rootScope, toastr) {
	console.log("/CONTACTS/LISTVIEW ::::::::::::: SERVICE");
	this.contacts = $resource('/employee/contact', {}, {});

	this.deletecontact = $resource('/employee/contact/delete/:id', {
		id : '@id'
	}, {});

}).service('theService', function($resource, $rootScope, toastr) {
	this.searchDatas = $resource('/employee/searchDatas/:searchKey', {
		searchKey : '@searchKey'
	}, {});
});