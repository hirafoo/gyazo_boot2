<#import "/layout/default.ftl" as layout>
<@layout.myLayout>

<h1>detail</h1>

<table>
<tr><th>id</th><th>hash</th><th>createdAt</th></tr>
  <tr>
      <td>${image.id}</td>
      <td>${image.hash}</td>
      <td>${image.createdAt}</td>
  </tr>
</table>


<form method="post" action="/image/delete/${image.id}">
    <input type="submit" value="delete">
</form>


</@layout.myLayout>
