<#import "/layout/default.ftl" as layout>
<@layout.myLayout>

<table>
<tr><th>id</th><th>hash</th><th>createdAt</th></tr>
<#list images as x>
  <tr>
      <td><a href="/image/detail/?id=${x.id}">${x.id}</a></td>
      <td>${x.hash}</td>
      <td>${x.createdAt}</td>
  </tr>
</#list>
</table>

</@layout.myLayout>
