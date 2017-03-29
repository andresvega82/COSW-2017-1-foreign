'use strict';

angular.module('myApp.perfil', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/perfil', {
    templateUrl: 'perfil/perfil.html',
    controller: 'perfilCtrl'
  });
}])

.controller('perfilCtrl',[ 'clientById', '$scope', function(  clientById, $scope) {
        clientById.query({username:localStorage.getItem("usuario")}).$promise.then(function(data){
            console.log(data[0]);
            document.getElementById("email").innerHTML=data[0].email;
            document.getElementById("pais").innerHTML=data[0].country;
            document.getElementById("nombre").innerHTML=data[0].name+" "+data[0].lastName;
            document.getElementById("edad").innerHTML=data[0].age;
            document.getElementById("tel").innerHTML=data[0].phone;
        });
    }]

/*
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
}]*/
);
