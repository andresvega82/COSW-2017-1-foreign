'use strict';

angular.module('myApp.viewRegistry', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/viewRegistry', {
            templateUrl: 'viewRegistry/viewRegistry.html',
            controller: 'viewRegistryCtrl'
        });
    }])

    .controller('viewRegistryCtrl', ['$scope', '$location', 'RegisterFactory',function($scope,$location,RegisterFactory) {
        $scope.datos = {};
        $scope.registrar = function (){
            RegisterFactory.register($scope.datos.email, $scope.datos.password).then(function(data){
                 //$state.go('parkings');
                  $location.path("/login");
            });

        }
    }]);
