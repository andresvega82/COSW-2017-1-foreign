'use strict';

angular.module('myApp.viewRegistry', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/viewRegistry', {
            templateUrl: 'viewRegistry/viewRegistry.html',
            controller: 'viewRegistryCtrl'
        });
    }])

    .controller('viewRegistryCtrl', ['$scope', '$location','$http', 'RegisterFactory','registerPost',function($scope,$location,$http,RegisterFactory,registerPost) {
        $scope.datos = {};
        $scope.registrar = function (){
            RegisterFactory.register($scope.datos.email, $scope.datos.password).then(function(data){
                registerPost.addTodo({user_id:data.uid, name:$scope.datos.name, lastName:$scope.datos.lastname, email:$scope.datos.email, phone:$scope.datos.phone, country:$scope.datos.country, age:$scope.datos.age});
                $location.path("/login");
            });

        }
    }]);
