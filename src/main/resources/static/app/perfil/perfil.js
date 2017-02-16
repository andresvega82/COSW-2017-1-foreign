'use strict';

angular.module('myApp.perfil', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/perfil', {
    templateUrl: 'perfil/perfil.html',
    controller: 'perfilCtrl'
  });
}])

.controller('viewClientesCtrl', 'Clients', '$scope', function( $scope, Clients) {
    //lista de clientes
    $scope.listaClientes=[];
        Clients.get(function(data){
                                $scope.listaClientes=data;
        });

    .controller('viewClientesCtrl', 'clientById', '$scope', function( $scope, clientById) {
        clientById.get({id:""+$scope.id})
        .$promise.then(
            //success
         function( value ){
            var us=value;
            us.nombre;
             alert("Ya existe un usuario con ID: "+$scope.id+"!!!");
             $scope.busy=false;
         });



    private String nombre;
    private String apellido;
    private String correo;
    private Integer telefono;
    private String nombreUsuario;
    private String paisNacimiento;
    private String lugarResidencia;
    private String lenguaMaterna;
    private ArrayList<String> idiomasAprender;
    private ArrayList<Tutorship> tutorias;
    private String descripcion= null;