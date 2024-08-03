<%@ page language="java" import="com.util.Utility" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Home Page</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            color: #333;
        }

        header {
            background-color: #4CAF50;
            color: white;
            padding: 20px 0;
            text-align: center;
        }

        header h1 {
            margin: 0;
        }

        nav {
            display: flex;
            justify-content: center;
            background-color: #333;
        }

        nav a {
            color: white;
            padding: 14px 20px;
            text-decoration: none;
            text-align: center;
        }

        nav a:hover {
            background-color: #ddd;
            color: black;
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }

        .welcome-section {
            text-align: center;
            padding: 60px 20px;
            background-color: #f4f4f4;
        }

        .welcome-section h2 {
            margin: 0 0 20px;
        }

        .about-section,
        .contact-section {
            padding: 40px 20px;
        }

        .about-section h2,
        .contact-section h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .about-section p,
        .contact-section p {
            text-align: center;
            max-width: 800px;
            margin: 0 auto;
        }

        .contact-form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .contact-form input,
        .contact-form textarea {
            width: 100%;
            max-width: 500px;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .contact-form button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .contact-form button:hover {
            background-color: #45a049;
        }

        footer {
            text-align: center;
            padding: 20px;
            background-color: #333;
            color: white;
        }
    </style>
</head>
<body>
<%
int noo=Utility.parse(request.getParameter("no"));
if(noo==1){
	
%>
<script type="text/javascript">

alert("Login Successful")
</script>


<%

}

%>

    <header>
        <h1>Welcome to My Home Page</h1>
    </header>
    <nav>
        <a href="#welcome">Home</a>
        <a href="#about">About</a>
        <a href="#contact">Contact</a>
    </nav>
    <div class="container">
        <section id="welcome" class="welcome-section">
            <h2>Welcome!</h2>
            <p>Thank you for visiting my home page. Here you will find information about me and how to contact me.</p>
        </section>
        <section id="about" class="about-section">
            <h2>About Me</h2>
            <p>Hello! I am a web developer with a passion for creating beautiful and functional websites. I have experience in various web technologies and enjoy learning new skills. In my free time, I love to read, travel, and explore new places.</p>
        </section>
        <section id="contact" class="contact-section">
            <h2>Contact Me</h2>
            <p>If you have any questions or would like to get in touch, please use the form below to send me a message.</p>
            <form class="contact-form">
                <input type="text" name="name" placeholder="Your Name" required>
                <input type="email" name="email" placeholder="Your Email" required>
                <textarea name="message" rows="5" placeholder="Your Message" required></textarea>
                <button type="submit">Send Message</button>
            </form>
        </section>
    </div>
    <footer>
        &copy; 2024 Your Name. All rights reserved.
    </footer>
</body>
</html>
