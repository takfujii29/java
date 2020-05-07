<?php
  $symbol = $argv[1];
  $num1 = $argv[2];
  $num2 = $argv[3];

  switch($argv[1]) {
    case "+":
      echo $num1+$num2;
      break;
    case "-":
      echo $num1-$num2;
      break;
    case "*":
      echo $num1*$num2;
      break;
    case "/":
      echo $num1/$num2;
      break;
    default:
      echo 'エラー';
      break;
  }
?>

