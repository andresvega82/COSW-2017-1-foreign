'use strict';

angular.module('myApp.viewMyHistory', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/viewMyHistory', {
    templateUrl: 'viewMyHistory/viewMyHistory.html',
    controller: 'viewMyHistoryCtrl'
  });
}])

    .controller('viewMyHistoryCtrl',[ '$scope', 'history', function( $scope, history) {
        history.query({username:localStorage.getItem("usuario")})
        $scope.histories = []
        history.get()
            .$promise.then(
                //success
                function( value ){
                    for(var i=0;i<value.length; i++){
                        $scope.histories.push(value[i]);
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