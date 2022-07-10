<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet/css" href="style.css">

<!-- JS  -->
<script type="text/javascript" src="js/script.js"></script>

<!-- css -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!-- JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script type="text/javascript" src="js/script.js"></script>
<!--  -->
<link rel="icon" href="img/logo.png"  type="image/ico"/>
<style>

h2{
	background-color: #d1d1d3;
}

a{
	text-decoration:none;
}

body{
    
    background-image: url("../img/gro1.jpg");
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    transition: 10s;

    animation-name: animate;
    animation-direction: alternate-reverse;
    animation-duration: 30s;
    animation-fill-mode: forwards ;
    animation-iteration-count: infinite;
    animation-play-state: running;
    animation-timing-function:ease-in-out ;
    
   
}

    @keyframes animate{
        0%{
            background-image:url("img/gro2.jpg");
        }
        20%{
            background-image:url("img/gro3.jpg"); 
        }
        40%{
            background-image:url("img/gro4.jpg"); 
        }
        60%{
            background-image:url("img/gro5.jpg"); 
        }
        80%{
            background-image:url("img/gro6.jpg"); 
        }
        100%{
            background-image:url("img/gro1.jpg"); 
        }
    }
    
.card
{
	position:center;
}

</style>
</head>
<body>

</body>
</html>