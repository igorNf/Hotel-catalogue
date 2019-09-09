<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'hotel.label', default: 'Hotel')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">            
            <span class="menuButton">
            <a href="/hotel/index">Все отели</a></span>
            <span class="menuButton">
            <g:link controller="country" action="index">Страны</g:link></span>
        </div>
        
        <div id="list-hotel" class="content scaffold-list" role="main">
            <g:if test="${hotelList.size() > 0}">                
                <table class="myTable" >
                    <p>Найдено отелей: <strong>${hotelList.size()}<strong></p>
                    <tr>
                            <th>
                               Звездность 
                            </th>
                            <th>
                                Название
                            </th>
                    </tr>                   
                    <g:each in="${hotelList}" var="hotel">                    
                        <tr>
                            <td class="myTd" align="center" valign="middle">                            
                                    ${hotel.stars}                             
                            </td>
                            <td>
                                ${hotel.name}</br>
                                <g:if test="${hotel.homePage}">
                                    <a href="${hotel.homePage}" target="_blank">Перейти на сайт</a>
                                </g:if>
                            </td>
                        </tr>                    
                    </g:each>

                </table>
            </g:if>
            <g:else>

                <p align="center">По вашему запросу ничего не найдено</p>
                
            </g:else>
            <g:form action="search" >                    
                    <button type="submit" style="margin-left: 45%">Новый поиск</button>    
            </g:form>

            <!-- <div class="pagination">
                <g:paginate total="${hotelCount ?: 0}" />
            </div> -->
        </div>
    </body>
</html>
