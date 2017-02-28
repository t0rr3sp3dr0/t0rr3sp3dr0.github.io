$( ".green-score" ).css( "cursor", "pointer" ).css( "background-color", "#337ab7" ).css( "color", "white" );
$( ".green-score" ).click(function() {
    $( this ).unbind( "click" );
    setTimeout(function() {
        alert('Processando...');
    }, 0);
    var self = this;
    var _id;
    var _user;
    var time = $( this ).text().split(' ')[0];
    var user = $( this )[0].parentElement.parentElement.getElementsByTagName('td')[1].innerText;
    $.getJSON( document.URL.replace('/contest/', '/api/contest/') + '/scoreboard', function( data ) {
        for (e in data.contestants)
            if (data.contestants[e].name == user) {
                _user = e;
                break;
            }
        $.getJSON( document.URL.replace('/contest/', '/api/contest/') + '/scoreboard/dynamic', function( data ) {
            for (e in data.submissions)
                if (data.submissions[e].contestant == _user && data.submissions[e].time == time) {
                    _id = data.submissions[e]._id;
                    break;
                }
            console.log(document.URL.split('contest/')[0] + 'api/submission/get/' + _id);
            $.getJSON( document.URL.split('contest/')[0] + 'api/submission/get/' + _id, function( data ) {
                $( self ).click(function() {
                    var popup = window.open('text/plain');
                    popup.document.write('<plaintext>');
                    popup.document.write(data.code);
                });
                alert('Aperte na submissão novamente para abri-la!');
            });
        });
    });
});
