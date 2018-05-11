<script>
    function onBridgeReady() {
        WeixinJSBridge.invoke(
                'getBrandWCPayRequest', {
                    <#--"appId": "${payResponse.appId}",     //公众号名称，由商户传入-->
                    <#--"timeStamp": "${payResponse.timeStamp}",         //时间戳，自1970年以来的秒数-->
                    <#--"nonceStr": "${payResponse.nonceStr}", //随机串-->
                    <#--"package": "${payResponse.packAge}",-->
                    <#--"signType": "MD5",         //微信签名方式：-->
                    <#--"paySign": "${payResponse.paySign}" //微信签名-->
                    "appId": "wxc80aa306ca075013",     //公众号名称，由商户传入
                    "timeStamp": "1526018250",         //时间戳，自1970年以来的秒数
                    "nonceStr": "EFR4K1rlBerxkX1h", //随机串
                    "package": "prepay_id=wx1113573061004138df51e39a2036115227",
                    "signType": "MD5",         //微信签名方式：
                    "paySign": "1D489496582843BA417E141B628F692B" //微信签名
                    
                },
                function (res) {
                    // if (res.err_msg == "get_brand_wcpay_request:ok") {
                    alert(res.err_msg)
                    <#--location.href = "${returnUrl}"-->
                    // }     // 使用以上方式判断前端返回,微信团队郑重提示：res.err_msg将在用户支付成功后返回    ok，但并不保证它绝对可靠。
                }
        );
    }

    if (typeof WeixinJSBridge == "undefined") {
        if (document.addEventListener) {
            document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
        } else if (document.attachEvent) {
            document.attachEvent('WeixinJSBridgeReady', onBridgeReady);
            document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
        }
    } else {
        onBridgeReady();
    }
</script>