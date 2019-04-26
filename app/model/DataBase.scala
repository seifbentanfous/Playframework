package model

import com.datastax.driver.core.Cluster


object DataBase extends App {

  private val cluster = Cluster.builder()
    .addContactPoint("localhost")
    .withPort(9042)
    .build()

  val session = cluster.connect()

  def getValueFromCassandraTable() = {
    session.execute("SELECT * FROM foot.tmaxelements")
  }

  getValueFromCassandraTable().forEach(println)
}
