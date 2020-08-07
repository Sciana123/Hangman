<%@page import="manager.GameManager"%>
<%@page import="javabean.GameDictionary"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%!

public String disableIfGuessed(int idx)
{
	// If word is solved then return "disabled"
	// and if not, then return "disabled" if index is for letter that has been "guessed",
	// or empty string otherwise
	return "";
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hangman</title>
<style type="text/css">
td {
  border: 1px solid black;
}
td {
  width: 40px;
  height: 30px;
  align: center;
  text-align: center;
}
button {
  margin-left: 3px;
  margin-top: 10px;
  width: 25px;
  text-align: center;
  padding: 3px;
}
</style>
</head>
<body>
<%
	// Initialize new game if this is first time page is loaded
	// (GameManager has static variable that states if it's been initialized)
	
%>
<%-- Table of a single row of single character --%>
<table border="1">
	<tr>
	<%-- Use getWordGuessedSoFar --%>
<% 
	// getWordGuessedSoFar
 
	// For loop with charAt(i) to extract letter to go in each <td>
%>
		<td></td>
<%

%>
	</tr>
</table>
<%-- 
	2 rows of 13 buttons that call RequestHandler servlet with correct parameter
	buttons that have been "guessed" should be disabled
--%>

<%-- <form> needs to be method post because query params would get cleared out if GET were used --%>
<form method="post">
<%
	// For loop from 0 to 25
		// Generate A-Z using (char)((int)'A' + i)
%>
<%--
		<button type="submit" formaction="RequestHandler?guess=<%= "generated character"%>" <%= "disabled if guessed already" %>><%="generated character"%></button>
 --%>
<%
		// Only put <br> after 13 buttons have been added
%>
			<br>
<%
%>
</form>
<br>
<%-- Display number of incorrect guesses or congrats message if nothing left to guess --%>
<%
	// If game is solved
%>
		<p>Congratulations, you solved the word with <%= "JSP to get Incorrect Guess count here" %> incorrect guess(es).</p>
<%
	// else
%>
		<p>Number of wrong guesses: <%= "JSP to get Incorrect Guess count here" %></p>
<%
	// end if/else
%>
	<form method="post">
		<button style="width:80px" type="submit" formaction="RequestHandler?newGame">New Game</button>
	</form>
</body>
</html>