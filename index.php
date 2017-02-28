<?php
if ($_SERVER['HTTPS'] != 'on') {
    header('Location: https://' . $_SERVER['HTTP_HOST'] . $_SERVER['REQUEST_URI']);
    exit();
} elseif (strpos($_SERVER['HTTP_USER_AGENT'], 'curl') !== false) {
    header('Location: https://gist.githubusercontent.com/t0rr3sp3dr0/af2e4eafd721d365c7bb6db09919eff9/raw/CInstala.sh');
    exit();
}

readfile('index.html');
