<?php
error_reporting(0);
$dsn = 'mysql:host=localhost;dbname=yolarkadasim';
$user = 'dilara';
$password = '1234';
try {
    $db = new PDO($dsn, $user, $password);
   
} catch (PDOException $e) {
    echo 'Connection failed: ' . $e->getMessage();
    exit();
}