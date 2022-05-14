<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    
    <h2>${cafe.name}</h2>
    <p>${cafe.description}</p>
    <p>rating: ${rate}</p>
    <img style="width: 300px; height: 300px" src="${cafe.image}">

    <h2>Comments:</h2>

    <#list comments as comment>
         <p><b>${comment.user.username} :</b>  ${comment.comment}</p>
    </#list>

    <form method="get" action="/comments/save">
        <div class="mb-3">
            <label for="comment" class="form-label">Add Comment</label>
            <input name="cafeId" type="hidden" value="${cafe.id}">
            <input name="userName" type="hidden" value="${userName}">
            <input name="comment" type="text" class="form-control" id="comment">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>

    <form style="width: 300px" method="get" action="/rates/save">
        <div class="mb-3">
            <label for="comment" class="form-label">Evaluate(1-5):</label>

            <input name="cafeId" type="hidden" value="${cafe.id}">
            <input name="userName" type="hidden" value="${userName}">

            <input name="rate" type="number" class="form-control" >
        </div>
        <button type="submit" class="btn btn-primary">Submit rate</button>
    </form>

</div>


</body>
</html>