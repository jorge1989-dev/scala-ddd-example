package tv.codely.mooc.api

import akka.http.scaladsl.model._
import tv.codely.HttpSpec

final class HelloEntryPointShould extends HttpSpec {
  "respond with hola message when requesting hello endpoint" in getting("/hello") {
    status shouldBe StatusCodes.OK
    contentType shouldBe ContentTypes.`application/json`
    entityAs[String] shouldBe """{"message":"hola"}"""
  }
}
