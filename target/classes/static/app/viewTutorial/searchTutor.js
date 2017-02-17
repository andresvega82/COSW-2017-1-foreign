'use strict';

angular.module('myApp.searchTutor', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/searchTutor', {
            templateUrl: 'viewTutorial/searchTutor.html',
            controller: 'SearchTutorCtrl'
        });
    }])

    .controller('SearchTutorCtrl', [function() {

    }]);