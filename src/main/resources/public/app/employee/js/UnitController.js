APP
.controller('UnitController', _UnitController);

function _UnitController($rootScope, $scope, UnitService,
		$routeParams,$route) {
	
	$scope.saveUnit=function(datas){
		console.log(datas);
		UnitService.saveUnit.save(datas,success,error);
		
		function success(obj){
			
			$scope.successMessage="Saved!"
				$scope.errors=null;
		}
		function error(obj){
			$scope.successMessage=null;
			$scope.errors=obj;
			
		}
		
	}
	
	$scope.searchDepartment = function(keys) {
		
		UnitService.searchDepartment.query(keys, success, error);
		
		function success(data) {
			$scope.units = data;
			$scope.errors = null;

		}
		function error(obj) {
			$scope.successMessage = null;
			$scope.errors = obj;

		}
	}
	
	
$scope.editid = $routeParams.id;

if ($scope.editid) {
	edit();
	function edit() {
		UnitService.editFetch.get({
			"cid" : $scope.editid}, sucess, error); 
		
		function sucess(data) {
			$scope.department = data;
			$scope.errors = null;
		
		}
		function error(obj) {
			$scope.successMessage = null;
			$scope.errors = obj;

		}
	}
	
	$scope.saveEditedDepartment=function(datas){
		console.log(datas);
		UnitService.saveUnit.save(datas,success,error);
		
		function success(obj){
			
			$scope.successMessage="Saved!"
				$scope.errors=null;
		}
		function error(obj){
			$scope.successMessage=null;
			$scope.errors=obj;
			
		}
		
	}
	
}
$scope.deleteUnit=function(id){
 
	UnitService.deleteUnit.save({
		"uid" : id},success,error);
	
	function success(obj){
		$scope.successMessage="Deleted Successfully!"
		$scope.errors=null;
	}
	function error(obj){
		$scope.successMessage=null;
		$scope.errors=obj;
		
	}
	
}

	//getUnit();
//	
//	function getUnit(){
//		$scope.y= newService.getUnit.query();
//	}
//	
//	$scope.searchDatas=function(keys){
//		
//newService.searchDatas.query(keys,sucess,error);
//		
//		function sucess(data){
//			$scope.resultData=data;
//				$scope.errors=null;
//				
//		}
//		function error(obj){
//			$scope.successMessage=null;
//			$scope.errors=obj;
//			
//		}
//		
//	}
//	$scope.editid=$routeParams.id;
//	if(!!$scope.editid){
//		$scope.user=newService.getbyId.get({'id':$scope.editid});
//		console.log($scope.user)
//	}

}