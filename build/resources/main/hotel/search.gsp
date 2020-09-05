<!DOCTYPE>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
         <meta name="layout" content="main" />
         <title>Поиск отелей</title>
    </head>
    <body>
        <div class="nav">
            
            <span class="menuButton">
            <a href="/hotel/index">Все отели</a></span>
            <span class="menuButton">
            <g:link controller="country" action="index">Страны</g:link></span>
        </div>
        <div class="body">
           <h1>Поиск отелей</h1>
           <g:form action="showSearchResults" method="post" >
               <div class="dialog">
                 <table>
                      <tr class='prop'>
                          <td valign='top' class='name' style="text-align: right;">
                              <label for='name' >Отель:</label>
                          </td>
                          <td valign='top' class='value'>
                              <input type='text' name='name' value='' style="border-radius: 5px" required/>
                          </td>                          
                     </tr>
                     <tr class='prop'>
                          <td valign='top' class='name' style="text-align: right;">
                              <label for='con'>Страна:</label>
                          </td>
                          <td valign='top' class='value'>                              
                              <g:select name="country" from="${countryList}" optionKey="id" optionValue="name" value="1" style="border-radius: 5px; width: 185px"/>
                          </td>
                      </tr> 
                      <tr>
                        <td></td>
                        <td>                          
                          <button type="submit">Поиск</button>                        
                        </td>
                      </tr>
                 </table>                 
               </div>
               
           </g:form>
        </div>
    </body>
</html>
