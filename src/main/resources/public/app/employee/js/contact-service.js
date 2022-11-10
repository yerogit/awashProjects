App.service('contact-service',contactservice);
function contactservice ($resource,$rootScope,toastr){
	this.getContact=$resource('employee/contactview:idy',{idy:'@idy'},{});
}
