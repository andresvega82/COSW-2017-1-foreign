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
        $scope.lenguaje = "";
        $scope.date = "";
        $scope.hour = "";
        $scope.timeHour = null;
        $scope.timeMin = null;
        $scope.busy = false;


        $scope.registrarTutoria = function(){
            console.log("ENTROOO!!!!!")
            $scope.busy=true;

            tutorial.get()
                .$promise.then(
                //success
                function( value ){
                    for(var i=0;i<value.length; i++){
                        if((value[i].home==true)||(value[i].home==false)){
                            $scope.parkListAll.push(value[i]);
                        }
                    }
                    $scope.parkListFiltered=$scope.parkListAll.slice(0);
                    $scope.busy=false;
                },
                //error
                function( error ){

                }
            );
        };
    }]);