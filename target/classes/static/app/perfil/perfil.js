'use strict';

angular.module('myApp.perfil', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/perfil', {
    templateUrl: 'perfil/perfil.html',
    controller: 'perfilCtrl'
  });
}])

    .controller('perfilCtrl',[ 'clientById', '$scope', function(  clientById, $scope) {
        $scope.user="UsuarioMamaya"
        $scope.us=clientById.get({id:""+$scope.user});
        $scope.us.$promise.then(
            //success
         function( value ){
            $scope.us=value;
            console.info($scope.us.nombre+"      "+value);
             alert("Ya existe un usuario con ID: "+"!!!");
             $scope.busy=false;
         });
}]);
