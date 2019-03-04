$(document).ready(function() {

    $("#listUser").click(function() {
        var ajaxSetting = {
            url: "http://localhost:8080/user",
            data: {},
            type: "GET",
            success: function(response) {
                alert("User List: " + response);
                console.log("user List: " + response);
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
                alert("User ID: " + response);
                console.log("User ID: " + response);
            }
        };
        $.ajax(ajaxSetting);
    });
});