<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>After All This Time?</title>
  <!-- Import D3 -->
  <script src="https://d3js.org/d3.v4.min.js"></script>
  <!-- Random number generator -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/seedrandom/2.4.3/lib/alea.min.js"></script>
  <!-- d3-cloud library -->
  <script src="js/d3.layout.cloud.js"></script>
  <link rel="stylesheet" type='text/css' href="css/style.css">

</head>

<body>

  <div id='cloud-container'></div>

  <script src="js/wordcloud.js"></script>
  <script>
  WordCloud({
    container: '#cloud-container',
    data: 'json/dummy.json'
  });

  </script>

</body>
</html>