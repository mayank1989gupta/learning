package com.hackerank.algorithms;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.hackerank.algorithms.GridNavigationTest.Direction;

public class GridNavigationTest {
    

    public enum Direction {
        UP, DOWN, RIGHT, LEFT;

        public Direction reverse() {
            Direction reverse = null;

            if (this.equals(Direction.UP)) {
                reverse = DOWN;
            } else if (this.equals(Direction.DOWN)) {
                reverse = UP;
            } else if (this.equals(Direction.RIGHT)) {
                reverse = LEFT;
            } else if (this.equals(Direction.LEFT)) {
                reverse = RIGHT;
            }

            return reverse;
        }
    };

    private static final Map<String, PathNode> nodesRegistry = new TreeMap<>();
    private static final RouteRegistry routeRegistry = new RouteRegistry();

    private static final String keyRefDelimiter = ":";
    private static final String keyRefFormat = "%d" + keyRefDelimiter + "%d";

    private static PathNode destinationNode = null;

    int minimumDistance(int numRows, int numColumns, List<List<Integer>> area) {
    	int[][] navigableGrid = new int[numRows][numColumns];
    	
    	for(int i = 0; i < numRows; i++) {
    		for(int j = 0; j < numColumns; j++) {
    			navigableGrid[i][j] = area.get(i).get(j);
    		}
    	}
    	
    	createNodesRegistry(navigableGrid);
        findRoutes();
        return routeRegistry.getShortestRoute().length - 1;
    }


    private static void createNodesRegistry(int[][] navigableGrid) {
        for (int rowCount = 0; rowCount < navigableGrid.length; rowCount++) {
            for (int colCount = 0; colCount < navigableGrid[rowCount].length; colCount++) {
                // add current element's node representation to the nodes map, only if it is
                // active (value > 0)
                if (navigableGrid[rowCount][colCount] > 0) {
                    IntPair point = new IntPair(rowCount, colCount);
                    int value = navigableGrid[rowCount][colCount];

                    PathNode currentElementNode = new PathNode(point, value);
                    nodesRegistry.put(String.format(keyRefFormat, rowCount, colCount), currentElementNode);

                    // set	 adjacent references
                    setAdjacentReference(currentElementNode, rowCount - 1, colCount, Direction.UP);
                    setAdjacentReference(currentElementNode, rowCount + 1, colCount, Direction.DOWN);
                    setAdjacentReference(currentElementNode, rowCount, colCount + 1, Direction.RIGHT);
                    setAdjacentReference(currentElementNode, rowCount, colCount - 1, Direction.LEFT);

                    if (currentElementNode.getNodeValue() == 9) {
                        destinationNode = currentElementNode;
                        
                        break;
                    }
                }
            }
        }
    }

    private static void setAdjacentReference(PathNode currentNode, int row, int col, Direction direction) {
        PathNode adjacentNode = nodesRegistry.get(String.format(keyRefFormat, row, col));
        if (adjacentNode != null) {
            currentNode.setAdjacentNode(direction, adjacentNode);

            // set the reverse lookup link
            if (adjacentNode.getAdjacentNode(direction.reverse()) == null) {
                adjacentNode.setAdjacentNode(direction.reverse(), currentNode);
            }
        }
    }

    private static void findRoutes() {
        // initialize reverse tracing from the destination
        destinationNode.traceRoute(routeRegistry, null);
    }
}

class PathNode {
    private int nodeValue = 0;
    private Map<Direction, PathNode> adjacentNodes = new HashMap<>();
    private IntPair location = null;

    public PathNode() {
        super();
    }

    public PathNode(IntPair location, int value) {
        super();
        this.location = location;
        this.nodeValue = value;
    }

    public void traceRoute(RouteRegistry routeRegistry, PathNode fromNode) {
        if (!this.isStartNode()) {
            for (Entry<Direction, PathNode> entry : this.adjacentNodes.entrySet()) {
                PathNode node = entry.getValue(); 
                if (!node.equals(fromNode)) {
                    routeRegistry.put(this.location);
                    node.traceRoute(routeRegistry, this);
                }
            }
        } else {
            routeRegistry.put(this.location);
        }
    }

    public int getNodeValue() {
        return this.nodeValue;
    }

    public void setNodeValue(int value) {
        this.nodeValue = value;
    }

    public void setAdjacentNode(Direction direction, PathNode node) {
        this.adjacentNodes.put(direction, node);
    }

    public PathNode getAdjacentNode(Direction direction) {
        return this.adjacentNodes.get(direction);
    }

    public IntPair getLocation() {
        return location;
    }

    public void setLocation(IntPair location) {
        this.location = location;
    }

    public boolean isStartNode() {
        boolean returnValue = false;

        if (location != null) {
            returnValue = (location.getValue(0) == 0 && location.getValue(1) == 0);
        }

        return returnValue;
    }

    public boolean isDestinationNode() {
        return (this.getNodeValue() == 9);
    }
}

class IntPair {
    private Integer[] values = new Integer[2];

    public IntPair() {
        super();
    }

    public IntPair(Integer value1, Integer value2) {
        super();
        this.values[0] = value1;
        this.values[1] = value2;
    }

    public Integer getValue(int index) {
        return this.values[index];
    }

    public void setValue(int index, int value) {
        this.values[index] = value;
    }

    @Override
    public String toString() {
        return "[" + this.values[0] + ", " + this.values[1] + "]";
    }
}

class RouteRegistry {
    private int routeIndex = 1;
    private Map <String, List<IntPair>> routesMap = new HashMap<>();

    public RouteRegistry() {
        super();
    }

    public void put(IntPair point) {
        String activeRouteKey = String.format("Route %d", routeIndex);
        routesMap.computeIfAbsent(activeRouteKey, k -> new ArrayList<IntPair>());

        List<IntPair> routePoints = routesMap.get(activeRouteKey);
        routePoints.add(point);

        if (point.getValue(0) == 0 && point.getValue(1) == 0) {
            routeIndex++;
        }
    }

    public IntPair[] getShortestRoute() {
        IntPair[] routeArray = null;

        List<IntPair> shortestRoute = null;
        for (Entry<String, List<IntPair>> routeEntry :  routesMap.entrySet()) {
            List<IntPair> route = routeEntry.getValue();

            if (shortestRoute == null || shortestRoute.size() > route.size()) {
                shortestRoute = route;
            }
        }

        if (shortestRoute != null) {
            routeArray = shortestRoute.toArray(new IntPair[shortestRoute.size()]);
        } else {
            routeArray = new IntPair[0];
        }

        return routeArray;
    }
}

