'use strict';
angular.module('services.fabricas', ['ngRoute','ngResource'])

    .factory('Clients', function($resource){
                return $resource('/clients',{},{
                    get: {
                        method: 'GET',
                        isArray: true
                    }
                });

            });

    .factory('clientById', function($resource) {
            return $resource('/clients/:id',{id:"@_id"},{'get': { method: 'GET'}});
    })

