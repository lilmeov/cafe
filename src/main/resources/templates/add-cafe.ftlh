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

                </ul>
                <form class="d-flex" method="get" action="/cafes/searchByDescriptionCafes">
                    <input name="desc" class="form-control me-2" type="search" placeholder="Search By Description" aria-label="Search" required>
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>

     <h2 style="padding-top: 100px">Add new Place</h2>

    <form style="padding-top: 20px" method="get" action="/cafes/saveCafe">
        <div class="mb-3" >
            <label for="cafeName" class="form-label">Title</label>
            <input name="name" type="text" class="form-control" id="cafeName" aria-describedby="cafeName" required>
        </div>
        <div class="mb-3" >
            <label for="cafeDesc" class="form-label">Description</label>
            <input name="description" type="tel" class="form-control" id="cafeDesc" aria-describedby="cafeDesc" required>
        </div>
        <div class="mb-3" >
            <label for="photoLink" class="form-label">PhotoLink</label>
            <input name="link" type="text" class="form-control" id="photoLink" aria-describedby="photoLink" required>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>