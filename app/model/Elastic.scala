package model


import com.sksamuel.elastic4s.RefreshPolicy
import com.sksamuel.elastic4s.http.search.SearchResponse
import com.sksamuel.elastic4s.http.{ElasticClient, ElasticProperties, Response}

object Elastic extends App {

  import com.sksamuel.elastic4s.http.ElasticDsl._

  import scala.concurrent.ExecutionContext.Implicits.global


  val client = ElasticClient(ElasticProperties("http://localhost:9200"))




  val response: Response[SearchResponse] = client.execute {
    search("seif")
  }.await

  println(response)

  client.close()
}
