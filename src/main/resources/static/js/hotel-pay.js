// function payOrder() {
//     const orderId = parseInt($('#orderId').val());
//     const name = $('#name').val();
//     const phone = $('#phone').val();
//     const arrived = $('#arrived').val();
//     const note = $('#note').val();
//     alert(name);
//     $.ajax({
//         url: "/order/pay",
//         type: "post",
//         data: JSON.stringify({
//             'orderId': orderId,
//             "name": name,
//             "phone": phone,
//             "arrived": arrived,
//             "note": note,
//         }),//json数据
//         dataType: "html",
//         contentType: "application/json",
//         async: false,
//         success: function (response) {
//             //do
//             console.log(response);
//             alert("支付成功！");
//             window.location.reload();
//         },
//         error: function (response) {
//             console.log(response);
//             alert("error");
//             return response
//         }
//     });
// }

function checkPay(){
    const userMoney = parseFloat($('#userMoney').val());
    const money = parseFloat($('#money').val());
    const userId = $('#userId').val();
    if(userMoney < money){
        alert("余额不足, 请充值！");
        windows.location.href("/user/"+userId);
    }

}