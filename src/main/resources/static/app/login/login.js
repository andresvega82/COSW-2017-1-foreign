'use strict';

angular.module('myApp.login', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/login', {
    templateUrl: 'login/login.html',
    controller: 'loginCtrl'
  });
}])
.controller('loginCtrl', ['$rootScope', '$scope', '$http', '$location', function ($scope,$rootScope, $http, $location ) {
    var authenticate = function (credentials, callback) {

        var headers = credentials ? {authorization: "Basic "
                    + btoa(credentials.username + ":" + credentials.password)
        } : {};

        $http.get('user', {headers: headers}).then(successCallback, errorCallback);

        function successCallback(data){
            if (data.data.name) {
                $scope.authenticated = true;
            }else {
                $scope.authenticated = false;
            }
                callback && callback();
        }

        function errorCallback(error){
            $scope.authenticated = false;
             callback && callback();
        }
    };
    authenticate();
    $scope.credentials = {};
    $scope.login = function () {
        authenticate($scope.credentials, function () {

            if ($scope.authenticated) {
                $location.path("/viewTutorial");
                $scope.error = false;
            } else {
                $location.path("/login");
                $scope.error = true;
            }
        });
};
}]);
