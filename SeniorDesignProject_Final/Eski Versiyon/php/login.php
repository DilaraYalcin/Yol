<?php
include 'db_config.php';
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
  $json = json_decode(file_get_contents('php://input'), true);
}
$response = array();
$response2 = array();
if (isset($json)) {
	
  $username = $json['login']['username'];
  $password = $json['login']['password'];
  $hashPass=md5(sha1($password));
  
  $query = $db->prepare("SELECT Sehir,Ulke,Kullanici_adi FROM uye_kaydi WHERE Kullanici_adi = $username");
  $query->execute();
  $get = $query->fetch();
  if ($query->rowcount() == 0)
{
  $response["hata"] = "Lütfen Tekrar Deneyin";
  $response2["message"] = $response;
  echo json_encode($response);
}
  else {
    $query2 = $db->prepare("SELECT Kullanici_adi,Sifre FROM uye_kaydi WHERE Kullanici_adi=$username");
    $query2->execute();
    $get1 = $query2->fetch();
    if(($username == $get1["Kullanici_adi"]) && $hashPass == $get1["Sifre"]) {
      $response["Sehir"] = $get["Sehir"];
	  $response["Ulke"] = $get["Ulke"];
      $response2["message"] = $response;
      echo json_encode($response2);
    }
  }
}
else {
// required field is missing
$response["success"] = 0;
$response["message"] = "Required field(s) is missing";
// echoing JSON response
echo json_encode($response);
}