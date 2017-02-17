/**
 * Created by tata on 16/02/17.
 */
'use strict';

angular.module('myApp.viewTutorial', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/viewTutorial', {
            templateUrl: 'viewTutorial/viewTutorial.html',
            controller: 'ViewTutorialCtrl'
        });
    }])

    .controller('ViewTutorialCtrl', [function() {

}]);