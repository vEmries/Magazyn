app.controller('myCtrl', function($scope, $http) {
    
    $scope.stock = [];
    
    $scope.loadStock = function() {
      $http.get("http://localhost:8080/stock")
              .success(function(data) {
                  $scope.stock = data;
      });
    };
    
});