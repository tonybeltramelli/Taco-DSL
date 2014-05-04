<?php
$sendTo = $_POST['sendTo'];
$subject = $_POST['subject'];
$message = $_POST['message'];
$from = $_POST['from'];


mail($sendTo, $subject, $message, null, $from);
?>
