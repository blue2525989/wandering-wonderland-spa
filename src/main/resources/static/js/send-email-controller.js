/* SEND EMAIL CONTROLLER */
app.controller('contact', function ($scope, $http, $cookies, $location) {
	
	// set the CSRF token here
    $http.defaults.headers.post['X-CSRFToken'] = $cookies.csrftoken;

	var self = this;
	var saved;
	self.sendEmail = function() {
		
		var url = "/sendEmail";
		/* request this in rest controller */
		var emailData = {'name' : self.name, 'surname' : self.surname, 
				'email' : self.email, 'phone' : self.phone,
				'message' : self.message};
		
		$http.post(url, emailData).then(function (response) {
			// grab saved parameter
			window.alert(response.data.saved);
			$location.path("/");
		}, function (response) {
			$location.path("/contact");
		});
	}
});
