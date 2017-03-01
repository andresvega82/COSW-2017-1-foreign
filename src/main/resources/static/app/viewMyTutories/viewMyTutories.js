'use strict';

angular.module('myApp.viewMyTutories', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/viewMyTutories', {
    templateUrl: 'viewMyTutories/viewMyTutories.html',
    controller: 'viewMyTutoriesCtrl'
  });
}])

    .controller('viewMyTutoriesCtrl',['$scope', 'tutorial', function( $scope, tutorial) {
        $scope.misTutorias = []

        tutorial.get()
            .$promise.then(
                //success
                function( value ){
                    for(var i=0;i<value.length; i++){
                        $scope.misTutorias.push(value[i]);
                        console.info(value[i]);
                    }
                    $scope.busy=false;
                },
                //error
                function( error ){
                    console.log(error)
                }
                );

}]);
