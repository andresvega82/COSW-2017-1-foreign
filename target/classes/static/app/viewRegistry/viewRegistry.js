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
            console.log("Entro al registrar");

            RegisterFactory.register($scope.datos.email, $scope.datos.password).then(function(data){
                $scope.datos.user_id=data.uid;
                $scope.datos.paymentId=$scope.datos.cardNumber;
                console.log($scope.datos);
                registerPost.addTodo($scope.datos);
                $location.path("/login");
            });

        }
    }]);
