<#macro myLayout>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>Admin</title>
    <meta http-equiv="Content-Style-Type" content="text/css" />
    <meta http-equiv="Content-Script-Type" content="text/javascript" />
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
    <meta name="format-detection" content="telephone=no" />

    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css" />
    <link rel="stylesheet" href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css" />

    <style type="text/css">
        tr.inactive {
            background-color: #cccccc;
        }
        tr.is_pay {
            background-color: #e8a9e1;
        }
        tr.is_ahead {
            background-color: #b1e8ff;
        }
        tr.woman {
            background-color: #ff008d;
        }
        tr.man {
            background-color: #74a9d6;
        }
        tr.periodic {
            background-color: #ff9966;
        }
        tr.restricted18 {
            background-color: #fadce9;
        }

        span.inactive {
          color: #cccccc;
        }

      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
      .sidebar-nav {
        padding: 9px 0;
      }
      body > .navbar {
        background: red;
        color: white;
        font-size: 15px;
      }
      .lm-truncate {
        overflow: hidden;
        white-space: nowrap;
        text-overflow: ellipsis;
      }
      .lm-word-wrap {
        word-break: break-word;
        word-wrap: break-all;
      }

        body > .navbar .navbar-inner .brand {
            color: yellow;
        }
        body > .navbar {
            background: #cc00cc;
        }
        body > .navbar-inverse .navbar-inner {
            background-color: #CC00CC;
            background-image: -moz-linear-gradient(top, #CC00CC, #CC00CC);
            background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#CC00CC), to(#CC00CC));
            background-image: -webkit-linear-gradient(top, #CC00CC, #CC00CC);
            background-image: -o-linear-gradient(top, #CC00CC, #CC00CC);
            background-image: linear-gradient(to bottom, #CC00CC, #CC00CC);
            background-repeat: repeat-x;
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#CC00CC18', endColorstr='#CC00CC0f', GradientType=0);
            border-color: #CC00CC;
        }

    </style>
</head>
<body>
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">admin</a>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="col-md-2"><!-- sidebar -->
                <div class="well sidebar-nav">
                    <ul class="nav nav-list">
                        <li class="nav-header">
                            画像
                        </li>
                        <li><a href="/image/">画像リスト</a></li>
                    </ul>
                </div>
            </div><!-- /sidebar -->
            <div class="col-md-10">

            <!-- include -->
<#nested/>
            <!-- /include -->

            </div>
        </div>
    </div>
</body>
</html>

</#macro>
