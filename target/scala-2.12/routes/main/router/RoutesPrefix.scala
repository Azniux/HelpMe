
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/workingondis/playCaTing-master/conf/routes
// @DATE:Tue Mar 13 10:03:02 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
