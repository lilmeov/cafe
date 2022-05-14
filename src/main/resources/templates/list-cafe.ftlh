<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" >Cafe Critic</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <#if userName??>
                            <a class="nav-link" href="/cafes/addNewPlace" tabindex="-1" >Add New Place</a>
                        </#if>
                    </li>
                </ul>
                <p style="padding-right: 35px">
                    <#if userName??>
                        Hello, ${userName}
                    </#if>
                </p>

                <#if hi??>
                    <a href="/users/registerPage" class="list-group-item list-group-item-action list-group-item-primary" style="margin-right: 10px; width: 100px">SignUp</a>
                    <a href="/users/login" class="list-group-item list-group-item-action list-group-item-primary" style="margin-right: 10px; width: 100px">Login</a>
                </#if>

                <form class="d-flex" method="get" action="/cafes/searchCafes">
                    <input name="name" class="form-control me-2" type="search" placeholder="Search By Name" aria-label="Search" required>
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>

    <h2 style="padding-top: 100px">ALL Places:</h2>


    <div style="padding-top: 120px" class="row d-flex justify-content-evenly">
            <#list cafes as cafe>
            <div  class="card" style="width: 18rem; margin-top: 20px">
                <img src="..." class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${cafe.name}</h5>
                    <p class="card-text">${cafe.description}</p>
<#--                    <a href="#" class="btn btn-primary">Go somewhere</a>-->
                </div>
            </div>
            </#list>
    </div>

</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>