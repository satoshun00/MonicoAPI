package controllers

import play.api.mvc._
import play.api.libs.json._
import com.voxeo.tropo._
import scala.util.parsing.json.JSONObject

/**
 * Created by shun_sato on 2014/07/28.
 */
object Monico extends Controller {
//  implicit val tropoWrites = new Writes[TropoResponse] {
//    def writes(tropo: TropoResponse) = Json.obj(
//      "tropo" -> JsArray(tropo.methods)
//    )
//  }
//  implicit val tropoMethodsWrites = new Writes[TropoMethods] {
//    def writes(methods: TropoMethods) = Json.obj(
//      "call" -> methods.call,
//      "say" -> methods.say
//    )
//  }
//  implicit val tropoCallWrites = new Writes[TropoCall] {
//    def writes(call: TropoCall) = Json.obj(
//      "to" -> call.to,
//      "network" -> call.network
//    )
//  }
//
//  implicit val tropoSayWrites = new Writes[TropoSay] {
//    def writes(say: TropoSay) = Json.obj(
//      "value" -> say.value
//    )
//  }
//
//  val tropoResponse = TropoResponse(
//    Seq(
//      new TropoCall("sip:satoshun00@sip.antisip.com", "SIP"),
//      new TropoSay("hoge")
//    )
//  )

  def call = Action {
    Ok(JsObject(
      Seq("tropo" -> JsArray(
        JsObject(
          "call" -> JsObject(Seq("to" -> JsString("sip:satoshun00@sip.antisip.com"))) ::
          "say" -> JsObject(Seq("value" -> JsString("hoge"))) :: Nil
        ) :: Nil
      ))
    ))
//      Ok(JsObject(Seq[
//          "tropo", JsArray(
//            Seq[JsObject(
//                Seq["call", JsObject(
//                  Seq["to", JsString("sip:satoshun00@sip.antisip.com")]
//                )]
//              ),
//              JsObject(Seq["say",JsObject(Seq["value", JsString("hoge")])])
//            ]
//          )
//        ]
//      )
//      )
  }
}
