package tv.codely.mooc.api.controller.hello

import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.StandardRoute
import akka.http.scaladsl.server.Directives.complete

final class HelloGetController {
  def get(): StandardRoute = complete(HttpEntity(ContentTypes.`application/json`, """{"message":"hola"}"""))
}
