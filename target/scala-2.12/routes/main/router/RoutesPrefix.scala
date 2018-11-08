// @GENERATOR:play-routes-compiler
// @SOURCE:C:/play-iit/iit-simple-library/conf/routes
// @DATE:Thu Nov 08 12:11:03 IST 2018


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
