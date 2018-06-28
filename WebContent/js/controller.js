/**
 * 
 */
var myApp=angular.module('myApp');
myApp.config(function($routeProvider){
		$routeProvider
		.when("/",{
			templateUrl : "html/laptopsHome.html",
			controller : "laptopsHomeController"	
		})
		/*.when("/",{
			templateUrl : "html/index.html",
			controller : "indexController"	
		})*/
		.when("/person",{
			templateUrl : "html/samplePage.html",
			controller : "samplePageCtrl"	
		});
	});
myApp.controller('laptopsHomeController',function($scope,$http){
	$http.get("http://localhost:8089/laptop/all")
    .then(function(response){
   	 console.log(response.data);
   	 $scope.laptops=response.data;
   	 //$scope.laptops.push(response.data);
    });
});





myApp.controller('samplePageCtrl',function($scope,$interval,$http){
	$scope.person={
			firstName: "Genius",
			lastName: "Pradeep"
	};
	$scope.localTime=new Date().toLocaleTimeString();
	$interval(function(){
		$scope.localTime=new Date().toLocaleTimeString();
	},1000);
	$http.get("http://localhost:8089/person/all")
	     .then(function(response){
	    	 console.log(response.data);
	    	 $scope.result=response.data;
	    	 $scope.result.push(response.data);
	     });
});

myApp.controller('indexController',function($scope,$interval,$http){
	$scope.person={
			firstName: "Pradeeppaa",
			lastName: "H Ravi"
	};
	$scope.localTime=new Date().toLocaleTimeString();
	$interval(function(){
		$scope.localTime=new Date().toLocaleTimeString();
	},1000);
	$http.get("http://localhost:8089/person/all")
	     .then(function(response){
	    	 console.log(response.data);  	 
	    	 $scope.result=response.data;
	    	 $scope.result.push(response.data);
	     });
	
	$scope.cars=[
	             {   name:"Bugati",
	            	 price:"300K"
	             },
	             {
	            	 name:"Mercedes AMG",
	            	 price:"90K"
	             },
	             {
	            	 name:"McLaren",
	            	 price:"80K"
	             },
	             {
	            	 name:"Lamborgini",
	            	 price:"130K"
	             },
	             {
	            	 name:"Gensys",
	            	 price:"80K"
	             }
	             ];
	$scope.change=function(){
		$scope.myCol="red";
	};
});