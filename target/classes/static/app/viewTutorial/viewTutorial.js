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
    .controller('ViewTutorialCtrl', ['$scope', '$rootScope','$http','$resource', 'tutores','tutorial', function($scope, $rootScope, $http, $resource, tutores, tutorial) {
        $scope.userId = null;
        $scope.newTutorial = false;
        $scope.tutorialId = null;
        $scope.languaje = "";
        $scope.date = "";
        $scope.busy = false;
        $scope.tutoresListAll = []
        $rootScope.id = 1;

        $scope.buscarTutorias = function(){
            if ($scope.languaje!="") {
                if ($scope.date!=null) {
                    var newTutorial = {"languaje":$scope.languaje,"date":$rootScope.date};
                        console.log(newTutorial)
                        console.log("Buscando una tutoria, datos iniciales")
                        /*tutorial.save(newTutorial, function(){
                            console.log("Buscando tutorias")
                            });*/

                        var consulta = {params: $scope.languaje}

                        //console.log("buscar tutorias")
                        tutores.get(consulta)
                            .$promise.then(
                            //success

                            function( value ){
                                console.log("realiza la promesa")
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
                }else{
                    alert("Todos los campos son obligatorios, falta la fecha");
                }
            }else{
                alert("Todos los campos son obligatorios, falta el lenguaje");
            }
        }




    }])



    ;