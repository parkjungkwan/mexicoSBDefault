<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="chart_div"></div>
</body>
<script src="//www.google.com/jsapi"></script>
<script>
var data = [
  ['원소', '밀도'],
  ['구리', 8.94],
  ['은', 10.49],
  ['금', 19.30],
  ['백금', 21.45],
];
var options = {
  title: '귀금속 밀도 (단위: g/cm³)',
  width: 400, height: 500
};
google.load('visualization', '1.0', {'packages':['corechart']});
google.setOnLoadCallback(function() {
  var chart = new google.visualization.ColumnChart(document.querySelector('#chart_div'));
  chart.draw(google.visualization.arrayToDataTable(data), options);
});
</script>
</html>