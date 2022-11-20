 APP.service('UnitService', _UnitService);

function _UnitService($resource,$rootScope, toastr) {
	//search share holders
	this.savedata=$resource('newdatareg/savedata/:idy', {idy: '@idy'}, {});
	this.searchDatas=$resource('newdatareg/searchDatas/:idx', {idx: '@idx'}, {});
	this.getbyId=$resource('newdatareg/getbyId/:id', {id: '@id'}, {});
	this.saveUnit=$resource('employee/unit/add/:uid', {uid: '@uid'}, {});
	this.searchDepartment=$resource('employee/unit/search/:sid', {sid: '@sid'}, {});
	this.editFetch=$resource('employee/unit/fetchEdit/:cid', {cid: '@cid'}, {});
	this.deleteUnit=$resource('employee/unit/delete/:uid', {uid: '@uid'}, {});

	
$rootScope.error422 = function(errorCode){ return errorCode === 422 || false; }
	
	$rootScope.error400 = function(errorCode){ return errorCode === 400 || false; }
	
	var errorToastConfig = successToastConfig = { progressBar : true, timeOut: 1500 };
	
	var infoToastConfig =  { progressBar : true, timeOut: 0 };
	
	this.errorToast = function(errorText, title, config){
		      toastr.clear();
			  toastr.error(errorText || "An error has happened.", title || "Error",
					  config || errorToastConfig
			  );
	}
	
	this.successToast = function(successText, title){
	      toastr.clear();
		  toastr.success(successText || "Operation finished successfully", title || "Success",
				  successToastConfig
		  );
	}
	
	this.infoToast = function(infoText, title){
	      toastr.clear();
		  toastr.info(infoText || "Please wait...", title || "Working",
				  infoToastConfig
		  );
	}
	
	return this;
}