<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'hotel.label', default: 'Hotel')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <!-- <a href="#list-hotel" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="/hotel/search"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
                
            </ul>
        </div> -->
        <div id="list-hotel" class="content scaffold-list" role="main">
            
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            

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
                <p>По вашему запросу ничего не найдено</p>
                
            </g:else>
            <g:form action="search" style="border-radius: 5px">
                    <g:submitButton name="searchAgain" value="Новый поиск"/>
            </g:form>

            <div class="pagination">
                <g:paginate total="${hotelCount ?: 0}" />
            </div>
        </div>
    </body>
</html>
