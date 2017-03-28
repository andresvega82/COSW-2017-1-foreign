/**
 * Created by tata on 16/02/17.
 */
'use strict';

angular.module('myApp.viewTutorial', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/viewTutorial', {
            templateUrl: 'viewTutorial/viewTutorial.html',
            controller: 'ViewTutorialCtrl'
        });
    }])
    .controller('ViewTutorialCtrl', ['$scope', '$rootScope','$http','$resource', 'tutorial', function($scope, $rootScope, $http, $resource, tutorial) {
        $scope.userId = null;
        $scope.newTutorial = false;
        $scope.tutorialId = null;
        $scope.languaje = "";
        $scope.date = "";
        $scope.hour = "";
        $scope.timeHour = null;
        $scope.timeMin = null;
        $scope.busy = false;
        $scope.tutorialListAll = []
        sessionStorage.setItem('lenguaje',$scope.languaje);

        $scope.agregarTutoria = function(){
            if ($scope.languaje!="") {
                if ($scope.date!=null) {
                    if ($scope.hour!=null) {
                        if ($scope.timeHour!=null) {
                            var newTutorial = {"languaje":$scope.languaje,"date":$rootScope.date,"hour":$scope.hour,"timeHour":$scope.timeHour,"timeMin":$scope.timeMin};
                            console.log(newTutorial)
                            console.log("creando nueva tutoria, datos iniciales")
                            tutorial.save(newTutorial, function(){
                                console.log("guardando la tutoria")


                            });
                        }else{
                            alert("Todos los campos son obligatorios, falta la Duracion de la sesion");
                        }
                    }else{
                        alert("Todos los campos son obligatorios, falta hora inicial ");
                    }
                }else{
                    alert("Todos los campos son obligatorios, falta la fecha");
                }
            }else{
                alert("Todos los campos son obligatorios, falta el lenguaje");
                console.log($scope.languaje)
            }
        }




    }]);