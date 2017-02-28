<?php
header('Access-Control-Allow-Origin: *');
header('Content-Type: application/javascript');
readfile('../files/JavaScript/' . $_SERVER['QUERY_STRING']);
