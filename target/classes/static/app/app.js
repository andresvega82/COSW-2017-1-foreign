'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'ngRoute',
  'myApp.perfil',

  'services.fabricas',
  'myApp.version'
]).
config(['$locationProvider', '$routeProvider', '$httpProvider', function($locationProvider, $routeProvider, $httpProvider) {
    $locationProvider.hashPrefix('!');
    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
    $routeProvider.otherwise({redirectTo: '/perfil'});
}])

.controller('appController',['$scope','$http','$location',function($scope,$http,$location){
$scope.logout = function () {
                $http.post('/logout', {}).then(successCallback, errorCallback);

                function successCallback(data){
                    $scope.authenticated = false;
                    $location.path("/perfil");
                };
                function errorCallback(error){
                    $scope.authenticated = false;
                };
            };



}])
;