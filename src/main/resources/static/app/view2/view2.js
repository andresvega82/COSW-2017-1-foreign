'use strict';

angular.module('myApp.view2', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view2', {
    templateUrl: 'view2/view2.html',
    controller: 'View2Ctrl'
  });
}])

.controller('View2Ctrl',['$scope', 'FabricaListado', function($scope,FabricaListado) {

$scope.insertar = function(){
$scope.FabricaListado= new FabricaListado ();

var tarea = document.getElementById("Ta").value;
var n = document.getElementById("Pri");
var pri = n.options[n.selectedIndex].value;

$scope.FabricaListado.prioridad = pri;
$scope.FabricaListado.descripcion = tarea;
FabricaListado.save($scope.FabricaListado);
}

}]);