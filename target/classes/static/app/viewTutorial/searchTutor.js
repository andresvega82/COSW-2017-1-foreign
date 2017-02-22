'use strict';

angular.module('myApp.searchTutor', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/searchTutor', {
            templateUrl: 'viewTutorial/searchTutor.html',
            controller: 'SearchTutorCtrl'
        });
    }])

    .controller('SearchTutorCtrl', ['$scope', '$rootScope','$http','$resource','tutores','tutorial', function($scope, $rootScope, $http, $resource, tutores, tutorial) {
        $scope.name = null;
        $scope.age = null;
        $scope.description= null;
        $scope.busy = false;
        $scope.tutoresListAll = []
        $rootScope.id = 1;

        console.log("buscando la informacion de los tutores");
        tutores.get()
            .$promise.then(
            //success
            function( value ){
                for(var i=0;i<value.length; i++){
                    $scope.tutoresListAll.push(value[i]);
                    console.info(value[i]);
                }
                $scope.busy=false;
            },
            //error
            function( error ){
                console.log(error)
            }
        );

        $scope.agregarTutor = function(){
            console.log("agregando a tutor seleccionado")
            var newTutorial = {"languaje":$scope.languaje,"date":$rootScope.date,"startTime":$scope.hour,"duration":$scope.timeHour,"timeMin":$scope.timeMin,"idClient": $rootScope.id, "idTutor": $scope.idTutor};
            tutorial.save({id:$rootScope.id}, newTutorial, function(){
                console.log("guardando la tutoria al usuario con id = 1")


            });
        };

    }]);