document.addEventListener('DOMContentLoaded', function() {
    var form = document.getElementById('registrationForm');

    form.onsubmit = function(e) {
        e.preventDefault();
        var companyName = document.getElementById('companyName').value;
        var email = document.getElementById('email').value;
        var password = document.getElementById('password').value;
        var confirmPassword = document.getElementById('confirmPassword').value;

        // Add validation for passwords match if necessary

        var data = {
            companyName: companyName,
            email: email,
            password: password
        };

        fetch('/register', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        })
            .then(response => response.text())
            .then(text => alert(text))
            .catch(error => console.error('Error:', error));
    };
});

