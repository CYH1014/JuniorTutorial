$(document).ready(function() {

    $("#listUser").click(function() {
        var ajaxSetting = {
            url: "http://localhost:8080/user",
            data: {},
            type: "GET",
            success: function(response) {
                alert(response);
                console.log(response);
            }
        };
        $.ajax(ajaxSetting);
    });

    $("#getUser").click(function() {
        var ajaxSetting = {
            url: "http://localhost:8080/user/user2",
            data: {},
            type: "GET",
            success: function(response) {
                alert(response);
                console.log(response);
            }
        };
        $.ajax(ajaxSetting);
    });
});