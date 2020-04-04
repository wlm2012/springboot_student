<script>
    function listKemu() {
        $.ajax({
            type: 'post',
            url: 'ListKemu',
            data: {},
            dataType: "json",//类型
            success: function (data) {
                for (let i = 0; i < data.length; i++) {
                    let element = data[i];
                    let id = element.id;
                    let miaoshu = element.miaoshu;
                    let sel1 = $("#listKemu");
                    sel1.append("<option value='" + miaoshu + "'>" + miaoshu + "</option>");
                }
            }

        })
    }
</script>