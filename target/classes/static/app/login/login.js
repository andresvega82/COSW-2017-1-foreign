'use strict';

angular.module('myApp.login', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/login', {
    templateUrl: 'login/login.html',
    controller: 'loginCtrl'
  });
}])
.controller('loginCtrl', ['$rootScope', '$scope', '$http', '$location','RegisterFactory', function ($scope,$rootScope, $http, $location, RegisterFactory ) {
    $scope.credentials = {};
    $scope.login = function () {
        RegisterFactory.signIn($scope.credentials.username, $scope.credentials.password).then(function (data){
            //console.log("Entro");
            $scope.error = false;
            $scope.authenticated = true;
            $location.path("/viewTutorial");
        }).catch(function(err){
            $scope.authenticated = false;
            $location.path("/login");
        });
};
}]);


