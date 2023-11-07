<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <meta charset="utf-8">
    <title>Sign in to Amazon</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <style>
        .img_1 {
            height: 31px;
            width: 103px;
            margin-top: 30px;
            margin-bottom: 20px;
        }

        .extra-margin {
            margin-top: 200px;
        }

        .btn {
            width: 350px;
            margin-top: 20px;
        }




        form {
            border: 1px solid lightgrey;
            padding-left: 25px;
            padding-right: 25px;
            padding-top: 16px;
            padding-bottom: 25px;
            border-radius: 5px;
        }

        #words_1 {
            font-weight: bold;
            font-size: 14px;
        }

        #words_2 {
            font-weight: bold;
            font-size: 14px;
        }

        #words_3 {
            font: 7px;
        }

        .sign-in {
            margin-bottom: 50px;
            font-size: 30px;
            font-weight: bold;
        }

        .conditions {
            font-size: 8px;
            color: blue;
            margin-top: 30px;
            z-index: 2;




        }

        .footer_1 {
            width: max;
            height: 350px;
            background-color: #fff;
            margin-top: 30px;

        }

        #exampleCheck1 {
            margin-left: 3px;
            margin-top: 11px;
        }

        .keep-sign-in {
            margin-left: 24px;
            margin-top: 8px;
            font-size: 14px;
        }

        #sign-in {
            margin-bottom: 10px;
        }

        #grey-button {
            background-color: lightgrey;
            border: black;


        }
    </style>
</head>

<body>

    <header>
        <!--Amazon Image Logo-->
        <div class="d-flex flex-row justify-content-center">
            <div class="row">
                <div class="col-md">
                    <img class="img_1" src="images/Amazon_logo.svg.png"  alt="Amazon Logo" />
                </div><!--Col 1 End-->
            </div><!--Row 1 End-->
        </div><!--Container End-->
        <!--Amazon Image Logo-->
    </header>


    <!--Form-->
    <div class="d-flex flex-row justify-content-center">
        <div class="row">
            <div class="col-md">
                <form action="/LoginAuth" method="post">
                    <div style="font-size: 24px;font-weight: 3px;">Sign in</div>
                    <label style="color: red;">${error}</label>
                    <div class="form-group">
                        <label id="words_1" for="exampleInputEmail1">Mobile number or Email</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                            placeholder="Mobile number or email" name="username" required>
                        <small id="emailHelp" class="form-text text-muted"></small>
                    </div>
                    <div class="form-group">
                        <label id="words_2" for="exampleInputPassword1">Password &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
                            &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <a href="/forgot-password" style="font-weight: lighter;">Forgot your
                                password?</a></label>
                        <input type="password" class="form-control" id="exampleInputPassword1" name="password" required>
                        <div class="form-group">
                            <button type="submit" class="btn btn-warning" id="sign-in">Sign In</button>
                            <p class="keep-sign-in">Keep me signed in. <a href="https://stupidlink.com">Details</a></p>
                        </div>
                    </div>
                    <div class="form-check">


                    </div>
                    <a href="signup"><button type="button" class="btn btn-warning" id="grey-button">Create your Amazon account</button></a>
                </form>
            </div><!--Col 1 End-->
        </div><!--Row 1 End-->
    </div><!--Container End-->
    <!--Form-->
