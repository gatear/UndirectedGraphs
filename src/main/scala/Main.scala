/**
  * Created by gatear on 9/12/17.
  */

import GraphUtils.DepthFirstSearch
import UndirectedGraph.{Graph, In}

object Graph extends App {

  var in = new In("tinyGraph.txt")
  var graph = new Graph(in)

  var vertex = 0

  var depthFirstSearch = new DepthFirstSearch(graph)

  depthFirstSearch.validateVertex(vertex)
  depthFirstSearch.dfs(graph, vertex)

  println(graph)


}
