'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'ngRoute',
  'ngDialog',
  'myApp.login',
  'myApp.perfil',
  'myApp.viewTutorial',
  'myApp.viewMain',
  'myApp.viewRegistry',
  'myApp.searchTutor',
  'myApp.viewMyTutories',
  'myApp.scheduleTutorial',
  'myApp.viewHistory',
  'services.fabricas',
  'myApp.version',
  'firebase'
]).
config(['$locationProvider', '$routeProvider', '$httpProvider', function($locationProvider, $routeProvider, $httpProvider) {
    $locationProvider.hashPrefix('!');
    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
    $routeProvider.otherwise({redirectTo: '/viewMain'});
}])

.controller('appController',['$scope','$http','$location',function($scope,$http,$location){
    $scope.logout = function () {
        $http.post('/logout', {}).then(successCallback, errorCallback);
        function successCallback(data){
            $scope.authenticated = false;
            if($scope.authenticated){
                $scope.authenticated = false;
            }
            window.location.href = "/app/index.html";
        };
        function errorCallback(error){
            $scope.authenticated = false;
        };
    };
}])
;