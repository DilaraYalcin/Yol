<?php
include 'db_config.php';
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
  $json = json_decode(file_get_contents('php://input'), true);
  ## $json2 = $json['register'];
    // Use a var_dump to learn what key holds the json data
    // let's say its in $_POST['json']
}
$response = array();
  if (isset($json)) {
#      $name = $json['json']['artists'] ##lazým olcak
    $username = $json['register']['username'];
    $password = $json['register']['password'];
    $cityname = $json['register']['cityname'];
    $countryname = $json['register']['countryname'];
    $hashPass=md5(sha1($password));
    $sase = $json['register']['sase'];
    $carname = $json['register']['carname'];
    $carkm = $json['register']['carkm'];

   
       
          $query = $db->prepare("INSERT INTO uye_kaydi(Arabanin_modeli, Arabanin_km, Sehir, Ulke, Kullanici_adi, Sifre, Sase_no)
          VALUES('".$carname."','".$carkm."','".$cityname."','".$countryname."','".$username."','".$hashPass."','".$sase."')");
        ($query->execute());
        if ($query) {
              $response["success"] = 1;
              $response["message"] = $username;
            echo json_encode($response);
          }
         else {
          // failed to insert row
          $response["success"] = 0;
          $response["message"] = "Oops! An error occurred.";
          // echoing JSON response
          echo json_encode($response);
        }
    }
  

    else {
    // required field is missing
    $response["success"] = 0;
    $response["message"] = "Required field(s) is missing";
    // echoing JSON response
    echo json_encode($response);
};
?>