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

    .controller('ViewTutorialCtrl', ['$scope', '$rootScope','$http','$resource', 'user', function($scope, $rootScope,$http,$resource,user) {
        $scope.newTutorial = false;
        $scope.tutorialId = null;
        $scope.lenguaje = "";
        $scope.date = "";
        $scope.hour = "";
        $scope.timeHour=null;
        $scope.timeMin=null;
        $scope.busy=false;

        $scope.userN={"firstName":null,"lastName":null,
            "id":null, "email": null, "address":null, "phone":null,
            "password":null};

        $scope.registrarTutoria = function(){
            $scope.busy=true;
            user.get({iduser:""+$scope.userId})
                .$promise.then(
                //success
                function( value ){
                    alert("Ya existe un usuario con ID: "+$scope.userId+"!!!");
                    $scope.busy=false;
                },
                //error
                function( error ){
                    var newitem={"firstName":$scope.FirstName,"lastName":$scope.LastName,
                        "id":$scope.userId, "email": $scope.email, "address":$scope.address, "phone":$scope.phone,
                        "password": $scope.password};
                    user.save(newitem,function(){});
                    alert("El usuario con el ID: "+$scope.userId+" fue creado satisfactoriamente!!!");
                    $scope.userId=null;
                    $scope.FirstName="";
                    $scope.LastName ="";
                    $scope.email="";
                    $scope.address="";
                    $scope.phone=null;
                    $scope.password="";
                    $scope.busy=false;
                }
            );
        };
    }]);