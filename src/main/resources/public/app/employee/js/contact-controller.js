App.controller('contact-controller', contactcontroller);
function contactcontroller($scope,$rootScope,$route,$routeParams,contact-service){
	getcontact();
	function getContact(){
       contact-service.getContact.query({},success,error);
       function success(obj){
    	   console.log.(obj)
    	   $scope.view=obj;
    	   $scope.error=null;
       }
       funcion error(obj){
  	      console.log("SUCCESS::::::::::::" + obj)

    	   $scope.successMessage=null;
    	   $scope.errors=obj;
       }
	}
	
}
