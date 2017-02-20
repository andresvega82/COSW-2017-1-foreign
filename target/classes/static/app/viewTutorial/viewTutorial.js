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


        $scope.getAll=function(){

     

        tutorial.get()
                    .$promise.then(
                    //success

                    function( value ){
                        for(var i=0;i<value.length; i++){
                                $scope.tutorialListAll.push(value[i]);
                                console.info(value[i]);
                        }
                        $scope.busy=false;
                    },
                    //error
                    function( error ){
                        console.log(error)
                    }
              );


        };



    }]);