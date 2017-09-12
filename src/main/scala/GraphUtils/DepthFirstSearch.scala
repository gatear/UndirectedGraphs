package GraphUtils

import UndirectedGraph.Graph

/**
  * Created by gatear on 9/12/17.
  */
class DepthFirstSearch( graph:Graph ) {

  private var _marked = new Array[Boolean](graph.V())
  private var  count  = 0



  def validateVertex(vertex:Int):Unit ={


    var tempVertex= _marked.length

    if( vertex < 0 || vertex >= tempVertex ) throw new IllegalArgumentException("vertex " + vertex + " is not between 0 and " + (tempVertex - 1))

  }
  def marked(vertex :Int):Boolean = {

    validateVertex(vertex)
    return _marked(vertex)
  }

  def dfs (graph:Graph, vertex:Int): Unit = {
    count.+=(1)

    println(vertex +" has been marked ..")
    _marked(vertex) = true

    graph.adj(vertex).forEach(vertex => if ( !_marked( vertex ) ) dfs(graph, vertex) )


  }


}
