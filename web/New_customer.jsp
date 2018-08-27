<%-- Lani Pollard --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    
<head>
    <title>Titan Online Banking Application</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/hsml5.js">
    </script>
    <![endif]-->
</head>

<body>
    <div>
        <header>
        <h1>Titan Online Banking Application</h1>
        <br>
        <h2>New Customer</h2>
        </header>
    
        <nav>
            <div>
                <h4><a href="index.html">Home</a></h4>
            </div>
            <div>
                <h4><a href="Login.html">Log In</a></h4>
            </div>
        </nav>
    
        <div>
            <main>
                <h2>Sign Up</h2>
                <p>${emptyMessage}</p>
                <form action="NewCustomer" method="post">
                <label>First Name: </label>
                <input type="text" name="firstName" value="${NewCustomer.firstName}">
                <br>
                <label>Last Name: </label>
                <input type="text" name="lastName" value="${NewCustomer.lastName}">
                <br>
                <label>Phone: </label>
                <input type="text" name="phone" value="${NewCustomer.phone}">
                <br>
                <label>Street Address: </label>
                <input type="text" name="streetAddress" value="${NewCustomer.streetAddress}">
                <br>
                <label>City: </label>
                <input type="text" name="cityAddress" value="${NewCustomer.cityAddress}">
                <br>
                <label>State: </label>
                <input type="text" name="stateAddress" value="${NewCustomer.stateAddress}">
                <br>
                <label>Zip Code: </label>
                <input type="text" name="zipCode" value="${NewCustomer.zipCode}">
                <br>
                <label>Email Address: </label>
                <input type="text" name="emailAddress" value="${NewCustomer.emailAddress}">
                <br>
                <input type="submit" name="submitNewCustomer" value="Submit">
                </form>
                
            </main>
        </div>    
        
    </div>
    
</body>

</html>
