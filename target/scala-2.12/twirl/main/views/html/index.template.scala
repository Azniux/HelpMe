
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Employee],List[models.Department],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.Employee], categories: List[models.Department], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.125*/("""

"""),_display_(/*3.2*/main("Employees",user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<p class="lead">Employee Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getEmployees.size()),format.raw/*14.53*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Department</th>
          <th>Project</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*38.10*/for(p<-employees) yield /*38.27*/ {_display_(Seq[Any](format.raw/*38.29*/("""
          """),format.raw/*39.11*/("""<tr>

              """),_display_(/*41.16*/if(env.resource("public/images/employeeImages/thumbnails/" + p.getId + ".jpg").isDefined)/*41.105*/ {_display_(Seq[Any](format.raw/*41.107*/("""
                """),format.raw/*42.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/"""),_display_(/*42.73*/(p.getId + ".jpg")),format.raw/*42.91*/(""""/></td>
            """)))}/*43.15*/else/*43.20*/{_display_(Seq[Any](format.raw/*43.21*/("""
                """),format.raw/*44.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/noImage.png"/></td>
            """)))}),format.raw/*45.14*/("""
            """),format.raw/*46.13*/("""<td class="numeric">"""),_display_(/*46.34*/p/*46.35*/.getId),format.raw/*46.41*/("""</td>
            <td>"""),_display_(/*47.18*/p/*47.19*/.getName),format.raw/*47.27*/("""</td>

            <td>"""),_display_(/*49.18*/p/*49.19*/.getDepartment.getName),format.raw/*49.41*/("""</td>    
             
            
            <td>"""),_display_(/*52.18*/for(aa <- p.projects) yield /*52.39*/{_display_(Seq[Any](format.raw/*52.40*/("""
              """),_display_(/*53.16*/aa/*53.18*/.getName),format.raw/*53.26*/("""
            """)))}),format.raw/*54.14*/("""</td>
            <td>
              <a href=""""),_display_(/*56.25*/routes/*56.31*/.HomeController.updateEmployee(p.getId)),format.raw/*56.70*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*60.25*/routes/*60.31*/.HomeController.deleteEmployee(p.getId)),format.raw/*60.70*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*65.10*/("""
      """),format.raw/*66.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*71.17*/routes/*71.23*/.HomeController.addEmployee()),format.raw/*71.52*/("""">
        <button class="btn btn-primary">Add a employee</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(employees:List[models.Employee],categories:List[models.Department],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,categories,user,env)

  def f:((List[models.Employee],List[models.Department],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,categories,user,env) => apply(employees,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 13 10:03:02 GMT 2018
                  SOURCE: /media/sf_student/workingondis/playCaTing-master/app/views/index.scala.html
                  HASH: 1c24270c33accbf5477bcc99a5ede41661246ab2
                  MATRIX: 1026->1|1245->124|1273->127|1303->149|1342->151|1370->153|1553->309|1568->315|1613->339|1691->391|1727->411|1767->413|1803->422|1840->432|1855->438|1906->468|1960->495|1970->496|1999->504|2038->515|2086->536|2096->537|2137->557|2195->585|2227->590|2371->708|2412->740|2452->742|2488->751|2560->796|2574->801|2610->816|2646->825|2690->839|2724->846|2991->1086|3024->1103|3064->1105|3103->1116|3151->1137|3250->1226|3291->1228|3336->1245|3419->1301|3458->1319|3499->1342|3512->1347|3551->1348|3596->1365|3715->1453|3756->1466|3804->1487|3814->1488|3841->1494|3891->1517|3901->1518|3930->1526|3981->1550|3991->1551|4034->1573|4115->1627|4152->1648|4191->1649|4234->1665|4245->1667|4274->1675|4319->1689|4393->1736|4408->1742|4468->1781|4665->1951|4680->1957|4740->1996|4960->2185|4994->2192|5069->2240|5084->2246|5134->2275|5268->2379
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|70->38|70->38|70->38|71->39|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|77->45|78->46|78->46|78->46|78->46|79->47|79->47|79->47|81->49|81->49|81->49|84->52|84->52|84->52|85->53|85->53|85->53|86->54|88->56|88->56|88->56|92->60|92->60|92->60|97->65|98->66|103->71|103->71|103->71|109->77
                  -- GENERATED --
              */
          