'use strict';

angular.module('myApp.scheduleTutorial', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/scheduleTutorial', {
            templateUrl: 'viewTutorial/scheduleTutorial.html',
            controller: 'ScheduleTutorialCtrl'
        });
    }])

    .controller('ScheduleTutorialCtrl', [function() {

    }]);