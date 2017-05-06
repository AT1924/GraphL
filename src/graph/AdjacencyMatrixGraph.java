package graph;

import static support.graph.Constants.MAX_VERTICES;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import net.datastructures.Position;
import src.MyDecorator;
import support.graph.CS16Edge;
import support.graph.CS16Vertex;
import support.graph.Graph;
import support.graph.GraphEdge;
import support.graph.GraphVertex;
import support.graph.InvalidEdgeException;
import support.graph.InvalidVertexException;
import support.graph.NoSuchEdgeException;
import support.graph.NoSuchVertexException;
import support.graph.NodeSequence;
    
/**
 * This class defines a Graph that tracks its edges through the use of an
 * adjacency matrix. Please review the lecture slides and the book before
 * attempting to write this program. An adjacency matrix consists of an 2D array
 * of Vertices, with each vertex of the graph appearing in both dimensions. An
 * edge is indicated if it lies in the intersection of two vertices. I.e. the
 * following is valid:
 *
 * <code>
 *     V1  V2  V3
 * V1   x  e1  e2
 * V2  e1   x   x
 * V3  e2   x   x
 *</code>
 *
 * <p>
 * The above matrix indicates that edge e1 connects vertices V1 and V2, and edge
 * e2 connects vertices V1 and V3. (Here the x's denote nulls) Note that the
 * main diagonal must always consist of null's since no vertex can have an edge
 * to itself in a simple graph.
 * </p>
 *
 * <p>
 * Since we are using an adjacency matrix, each vertex must have a 'number', so
 * that it can represent an index in one of the dimensional arrays. This
 * assignment is not as trivial as it may appear. Remember that your arrays have
 * a maximum index. Thus, you cannot just up the number for each vertex. Why
 * not? Think about what happens when you constantly add and delete new
 * vertices. You will soon exceed the size of your adjacency matrix array. Note
 * that this number must be unique.
 * </p>
 *
 * <p>
 * Good luck, and as always, start early, start today, start yesterday!
 * </p>
 */
public class AdjacencyMatrixGraph<V> implements Graph<V> {

    // The underlying data structure of your graph: the adjacency matrix
    private CS16Edge<V>[][] _adjMatrix;

    // Sets to store the vertices and edges of your graph
    private Set<CS16Vertex<V>> _vertices;
    private Set<CS16Edge<V>> _edges;
    private ArrayList<Integer> _adjIndices;
	private MyDecorator<CS16Vertex<V>, Integer> _adjDecorator;
	

    /**
     * Constructor for your Graph, where among other things, you will most
     * likely want to instantiate your matrix array and your Sets.
     *
     * This must run in O(1) time.
     */
    public AdjacencyMatrixGraph() {
        _adjMatrix = this.makeEmptyEdgeArray();
        // fill in the rest here!
		_vertices = new HashSet<CS16Vertex<V>>();
		_edges = new HashSet<CS16Edge<V>>();
		_adjIndices = new ArrayList<Integer>();
		_adjDecorator = new MyDecorator<CS16Vertex<V>, Integer>();
		// filling the array
		for (int i = 0; i < MAX_VERTICES; i++) {
			_adjIndices.add(i);
		}
    }

    /**
     * Returns an iterator holding all the Vertices of the graph.
     *
     * <p>
     * This must run in O(1) time.
     * </p>
     * * Note that the visualizer uses this method to display the graph's
     * vertices, so you should implement it first.
     *
     * @return an Iterator containing the vertices of the Graph.
     */
    @Override
    public Iterator<CS16Vertex<V>> vertices() {
        return null;
    }

    /**
     * Returns an iterator holding all the edges of the graph.
     *
     * <p>
     * This must run in O(|1|) time.
     * </p>
     *
     * Note that the visualizer uses this method to display the graph's edges,
     * so you should implement it first.
     *
     * @return an Iterator containing the edges of the Graph.
     */
    @Override
    public Iterator<CS16Edge<V>> edges() {
        return null;
    }

    /**
     * Inserts a new Vertex into your Graph. You will want to first generate a
     * unique number for your vertex that falls within the range of your
     * adjacency array. You will then have to add the Vertex to your set of
     * vertices.
     *
     * <p>
     * You will not have to worry about the case where *more* than MAX_VERTICES
     * vertices are in your graph. Your code should, however, be able to hold
     * MAX_VERTICES vertices at any time.
     * </p>
     *
     * <p>
     * This must run in O(1) time.
     * </p>
     * 
     * @param vertElement
     *            the element to be added to the graph as a vertex
     */
    @Override
    public CS16Vertex<V> insertVertex(V vertElement) {
        return null;
    }

    /**
     * Inserts a new Edge into your Graph. You need to update your adjacency
     * matrix to reflect this new added Edge. In addition, the Edge needs to be
     * added to the edge set.
     * <p>
     * This must run in O(1) time.
     * </p>
     * 
     * @param v1
     *            The first vertex of the edge connection.
     * @param v2
     *            The second vertex of the edge connection.
     * @param edgeElement
     *            The element of the newly inserted edge.
     * @return Returns the newly inserted Edge.
     * @throws InvalidVertexException
     *             Thrown when either Vertex is null.
     */
    @Override
    public CS16Edge<V> insertEdge(CS16Vertex<V> v1, CS16Vertex<V> v2, Integer edgeElement)
            throws InvalidVertexException {
        return null;
    }

    /**
     * Removes a Vertex from your graph. You will first have to remove all edges
     * that are connected to this Vertex. (Perhaps you can use other methods you
     * will eventually write to make this easier?) Finally, remove the Vertex
     * from the vertex set.
     * <p>
     * This must run in O(|V|) time.
     * </p>
     *
     * @param vert
     *            The Vertex to remove.
     * @return The element of the removed Vertex.
     * @throws InvalidVertexException
     *             Thrown when the Vertex is null.
     */
    @Override
    public V removeVertex(CS16Vertex<V> vert) throws InvalidVertexException {
        return null;
    }

    /**
     * Removes an Edge from your Graph. You will want to remove all references
     * to it from your adjacency matrix. Don't forget to remove it from the edge
     * set.
     *
     * <p>
     * This must run in O(1) time.
     * </p>
     *
     * @param edge
     *            The Edge to remove.
     * @return The element of the removed Edge.
     * @throws InvalidEdgeException
     *             Thrown when the Edge is null.
     */
    @Override
    public Integer removeEdge(CS16Edge<V> edge) throws InvalidEdgeException {
        return null;
    }

    /**
     * Returns the edge that connects the two vertices. You will want to consult
     * your adjacency matrix to see if they are connected. If so, return that
     * edge, otherwise throw a NoSuchEdgeException.
     *
     * <p>
     * This must run in O(1) time.
     * </p>
     *
     * @param v1
     *            The first vertex that may be connected.
     * @param v2
     *            The second vertex that may be connected.
     * @return The edge that connects the first and second vertices.
     * @throws InvalidVertexException
     *             Thrown when either vertex is null.
     * @throws NoSuchEdgeException
     *             Thrown when no edge connects the vertices.
     */
    @Override
    public CS16Edge<V> connectingEdge(CS16Vertex<V> v1, CS16Vertex<V> v2)
            throws InvalidVertexException, NoSuchEdgeException {
        return null;
    }

    /**
     * Returns an Iterator over all the Edges that are connected to this Vertex.
     * <p>
     * This must run in O(|V|) time;
     * </p>
     * You can look through an entire row or column of your adjacency matrix for
     * this method.
     * 
     *
     * @param vert
     *            The vertex to find the incident edges on.
     * @return Returns an Iterator holding the incident edges on v.
     * @throws InvalidVertexException
     *             Thrown when the Vertex is null.
     */
    @Override
    public Iterator<CS16Edge<V>> incidentEdges(CS16Vertex<V> vert) throws InvalidVertexException {
        return null;
    }

    /**
     * Returns the Vertex that is on the other side of Edge e opposite of Vertex
     * v. Consulting the adjacency matrix may result in a running time that is
     * too high. An alternate way of finding the other Vertex may get this
     * method running in the correct time. If the edge is not incident on v,
     * then throw a NoSuchVertexException.
     *
     * <p>
     * This must run in O(1) time.
     * </p>
     *
     * @param vert
     *            The first vertex on Edge e.
     * @param edge
     *            The edge connecting Vertex v and the unknown opposite Vertex.
     * @return The opposite Vertex of v across Edge e.
     * @throws InvalidVertexException
     *             Thrown when the Vertex is not valid.
     * @throws InvalidEdgeException
     *             Thrown when the Edge is not valid.
     * @throws NoSuchVertexException
     *             Thrown when Edge e is not incident on v.
     */
    @Override
    public CS16Vertex<V> opposite(CS16Vertex<V> vert, CS16Edge<V> edge)
            throws InvalidVertexException, InvalidEdgeException, NoSuchVertexException {
        return null;
    }

    /**
     * Returns the two Vertex's that the Edge e is incident upon.
     * 
     * Checking the adjacency matrix may be too costly for this method.
     *
     * <p>
     * This must run in O(1) time.
     * </p>
     * 
     * Note that the visualizer uses this method to display the graph's edges.
     *
     * @param e
     *            The edge to find the connecting Vertex's on.
     * @return a list of Vertex's holding the two connecting vertices.
     * @throws InvalidEdgeException
     *             Thrown when the Edge e is null.
     */
    @Override
    public List<CS16Vertex<V>> endVertices(CS16Edge<V> e) throws InvalidEdgeException {
        return null;
    }

    /**
     * Returns true if there exists an Edge that connects Vertex v1 and Vertex
     * v2.
     * 
     * <p>
     * This must run in O(1) time.
     * </p>
     * 
     * @param v1
     *            The first Vertex to test adjacency.
     * @param v2
     *            The second Vertex to test adjacency.
     * @return Returns true if the vertices are adjacent.
     * @throws InvalidVertexException
     *             Thrown if either vertex is null.
     */
    @Override
    public boolean areAdjacent(CS16Vertex<V> v1, CS16Vertex<V> v2) throws InvalidVertexException {
        return false;
    }

    /**
     * Clears all the vertices and edges from the graph. You will want to also
     * clear the adjacency matrix. Remember the power of Java's garbage
     * collection mechanism. If you re-instantiate something, the instance of
     * what that Object used to be disappears.
     *
     * <p>
     * This must run in O(1) time.
     * </p>
     */
    @Override
    public void clear() {
    }

    @SuppressWarnings("unchecked")
    private CS16Edge<V>[][] makeEmptyEdgeArray() {
        return new CS16Edge[MAX_VERTICES][MAX_VERTICES];
    }
}
