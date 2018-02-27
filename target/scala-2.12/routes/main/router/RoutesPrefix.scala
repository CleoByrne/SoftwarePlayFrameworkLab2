
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/SoftDev/Lab2SoftwarePLayFramework/conf/routes
// @DATE:Tue Feb 27 14:48:00 GMT 2018


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
