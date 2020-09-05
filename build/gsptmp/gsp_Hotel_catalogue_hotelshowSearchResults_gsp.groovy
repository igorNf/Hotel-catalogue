import grails.plugins.metadata.GrailsPlugin
import org.grails.gsp.compiler.transform.LineNumber
import org.grails.gsp.GroovyPage
import org.grails.web.taglib.*
import org.grails.taglib.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_Hotel_catalogue_hotelshowSearchResults_gsp extends org.grails.gsp.GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/hotel/showSearchResults.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'hotel.label', default: 'Hotel'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
createClosureForHtmlPart(4, 2)
invokeTag('link','g',13,['controller':("country"),'action':("index")],2)
printHtmlPart(5)
if(true && (hotelList.size() > 0)) {
printHtmlPart(6)
expressionOut.print(hotelList.size())
printHtmlPart(7)
for( hotel in (hotelList) ) {
printHtmlPart(8)
expressionOut.print(hotel.stars)
printHtmlPart(9)
expressionOut.print(hotel.name)
printHtmlPart(10)
if(true && (hotel.homePage)) {
printHtmlPart(11)
expressionOut.print(hotel.homePage)
printHtmlPart(12)
}
printHtmlPart(13)
}
printHtmlPart(14)
}
else {
printHtmlPart(15)
}
printHtmlPart(16)
createClosureForHtmlPart(17, 2)
invokeTag('form','g',51,['action':("search")],2)
printHtmlPart(18)
invokeTag('paginate','g',54,['total':(hotelCount ?: 0)],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1598194545227L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
