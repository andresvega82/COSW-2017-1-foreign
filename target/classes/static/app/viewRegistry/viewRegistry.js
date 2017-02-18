'use strict';

angular.module('myApp.viewRegistry', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/viewRegistry', {
            templateUrl: 'viewRegistry/viewRegistry.html',
            controller: 'viewRegistryCtrl'
        });
    }])

    .controller('viewRegistryCtrl', ['$scope',function($scope) {
        $scope.datos = {};
        $scope.registrar = function (){

        }
    }]);
