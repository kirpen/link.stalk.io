$(function(){

    var url = window.location.pathname;
        
    $('ul.nav.navbar-nav.side-nav li a[href="'+ url +'"]').parent().addClass('active');


    $('#subMenuName').html($('.active span.menuText').text());
    $('#subMenuName2').html($('.active span.menuText').text());

    // Will also work for relative and absolute hrefs
    /*$('ul.nav a').filter(function() {
        return this.href == url;
    }).parent().addClass('active');*/

});

