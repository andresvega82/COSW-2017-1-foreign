'use strict';

angular.module('myApp.viewHistory', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/viewHistory', {
            templateUrl: 'viewHistory/viewHistory.html',
            controller: 'ViewHistoryCtrl'
        });
    }])

    .controller('ViewHistoryCtrl', [function() {

    }]);
