<html>
<head>
    <meta charset="UTF-8">
    <title>成功提示</title>
    <link href="/sell/css/bootstrap.min.css" rel="stylesheet">

    <script type="text/javascript">
        setTimeout('location.href="${url}"',3000);
    </script>

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="alert alert-success alert-dismissable">
                <h4>
                    成功!
                </h4> <strong>${msg!""}</strong><a href="${url}" class="alert-link">3s后自动跳转</a>
            </div>
        </div>
    </div>
</div>

</body>