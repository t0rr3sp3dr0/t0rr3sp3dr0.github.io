$( '.mdl-navigation__link' ).click(function( event ) {
    event.preventDefault();

    $( '.is-active' ).removeClass( 'is-active' );
    $( this ).addClass( 'is-active' );
    $.get( $( this ).attr( 'href' ).toLowerCase().replace('#', '').replace(/ /g, '_') + '/', function( data ) {
      $( 'main' ).html( data );
    });
});

$(function() {
    if (location.hash == '')
        location.hash = '#Portfolio';
    $('.mdl-navigation__link[href="' + decodeURI(location.hash) + '"]')[0].click();
});
