'use strict';
angular.module('services.FabricaListado', ['ngRoute','ngResource'])

    .factory('FabricaListado', function($resource) {
            return $resource('/task/tasks');
     });



