'use strict';
angular.module('services.fabricas', ['ngRoute','ngResource'])

    //loginFactory
    .factory('RegisterFactory', function($firebaseAuth){
            return{
                register: function(username, password){
                    var auth = $firebaseAuth();
                    //console.log("registro");
                    return auth.$createUserWithEmailAndPassword(username, password);
                },
                signIn : function(username, password){
                    var auth = $firebaseAuth();
                    return auth.$signInWithEmailAndPassword(username, password);
                }
            }
    })

    .factory('Clients', function($resource){
                return $resource('/clients',{},{
                    get: {
                        method: 'GET',
                        isArray: true
                    }
                });

            })
    //tutorias
    .factory('tutorial', function($resource) {
        return $resource('/tutorial',{},
            { get: {
                method: 'GET',
                isArray: true
        }});
    })

    //tutores
    .factory('tutores', function($resource) {
        return $resource('/tutorial/tutores/:params',{params:"@_params"},
            { get: {
                method: 'GET',
                isArray: true
            }});
    })

    .factory('registerPost', function($resource){
        return $resource('./addUser', {name:'@name',lastName:'@lastbame',country:'@country'},{
            addTodo:{
            method:'POST'}
            });
    })

    .factory('clientById', function($resource) {
        return $resource('/clients/:id',{id:"@_id"},{'get': { method: 'GET'}});
    });

