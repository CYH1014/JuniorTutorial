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

    $("#postJson").click(function() {
        var ajaxSetting = {
                    url: "http://localhost:8080/test",
                    data: JSON.stringify({"param1":"test1","param2":"test2","param3":"test3"}),
                    dataType: "html",
                    contentType: "application/json",
                    mimeType: 'application/json',
                    type: "POST",
                    success: function(data) {
                        alert(data);
                        return false;
                    },
                    error: function(xhr,status,error) {
                        alert(xhr.responseText+"error");
                        console.log(xhr.responseText);
                    }
                };
        $.ajax(ajaxSetting);
    });
});