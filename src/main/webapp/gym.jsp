<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page import="com.google.gson.Gson" %>
<html>
<head>
    <title>Gym clients</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <style>
        #chartContainer {
            margin-top: 20px; /* Adjust the top margin as needed */
        }
    </style>
</head>
<body>
<h1>Gym clients</h1>
<table border="1">
    <thead>
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Gender</th>
        <th>Membership</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="client" items="${clients}">
        <tr>
            <td>${client.name}</td>
            <td>${client.age}</td>
            <td>${client.gender}</td>
            <td>${client.membership}</td>
        </tr>
    </c:forEach>
    </tbody>

</table>

<!-- Place the chart in a separate container -->
<div id="chartContainer">
    <canvas id="membershipChart" width="600" height="400"></canvas>
</div>

<script>
    var ctx = document.getElementById('membershipChart').getContext('2d');

    // Convert products to JSON string using Gson
    var clients = <%= new Gson().toJson(request.getAttribute("clients")) %>;

    var quantities = [2, 1, 1]

    var names = ["Gold", "Silver", "Brilliant"];

    // Create pie chart with custom options
    var membershipChart = new Chart(ctx, {
        type: 'pie',
        data: {
            labels: names,
            datasets: [{
                data: quantities,
                backgroundColor: [
                    'rgba(255, 99, 132, 0.6)',
                    'rgba(54, 162, 235, 0.6)',
                    'rgba(255, 206, 86, 0.6)',
                    'rgba(75, 192, 192, 0.6)',
                    'rgba(153, 102, 255, 0.6)',
                    'rgba(255, 159, 64, 0.6)'
                ]
            }]
        },
        options: {
            responsive: true, // Make the chart responsive to container size
            maintainAspectRatio: false, // Do not maintain the aspect ratio
            legend: {
                position: 'right' // Adjust the legend position
            }
        }
    });
</script>
</body>
</html>
