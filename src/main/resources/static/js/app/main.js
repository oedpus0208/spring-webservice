var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
    },
    save : function () {
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        $.ajax({
            type: 'POST',
            url: '/posts',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
        	console.log("success");
            alert('글이 등록되었습니다.');
            location.reload();
        }).fail(function (error) {
        	console.log("fail");
        	console.log(error);
            alert(error);
        });
    }

};

main.init();