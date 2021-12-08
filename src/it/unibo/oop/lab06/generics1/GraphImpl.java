package it.unibo.oop.lab06.generics1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphImpl<N> implements Graph<N> {
	
	private Map<N,Set<N>> graph ;

	
	public GraphImpl() {
		this.graph = new LinkedHashMap<>();
	}

	public void addNode(N node) {
		this.graph.put(node, new LinkedHashSet<N>());
	}

	public void addEdge(N source, N target) {
		this.graph.get(source).add(target);
		
	}
	
	public Set<N> nodeSet() {
		return this.graph.keySet();
	}

	public Set<N> linkedNodes(N node) {
		return this.graph.get(node);
	}

	
	public List<N> getPath(N source, N target) {
		List<N> list  = new ArrayList<>();
		return list;
	}
	

}
