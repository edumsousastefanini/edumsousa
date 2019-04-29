var app = angular.module("ExtratoManagement", []);
 
// Controller Part
app.controller("ExtratoController", function($scope, $http) {
 
 
    $scope.extratoLancamentos = [];
    
    // Now load the data from server
    _refreshExtratoData();
 
    // Private Method  
    // HTTP GET- get all employees collection
    // Call: http://localhost:8080/employees
    function _refreshExtratoData() {
        $http({
            method: 'GET',
            url: '/extrato/lancamentos'
        }).then(
            function(res) { // success
                $scope.extratoLancamentos = res.data;
            },
            function(res) { // error
                console.log("Error: " + res.status + " : " + res.data);
            }
        );
    }
 
    function _success(res) {
        _refreshExtratoData();
        
    }
 
    function _error(res) {
        var data = res.data;
        var status = res.status;
        var header = res.header;
        var config = res.config;
        alert("Error: " + status + ":" + data);
    }
 
    
});