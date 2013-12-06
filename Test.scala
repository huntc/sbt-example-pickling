import scalax.collection.Graph
import scalax.collection.GraphEdge.DiEdge

object Test extends App {

  import scala.pickling._
  import json._

  println(Graph.from[Int, DiEdge](Seq(42), Nil).pickle)
}