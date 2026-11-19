For Google SDE interviews, I would prepare Graphs as a separate major DSA topic, not just as an extension of BFS and DFS.

Your target should be being able to solve 9/10 graph problems across common Google interview patterns, including unfamiliar variations.

I'll structure this as a problem sheet, progressing from fundamentals to advanced interview-level problems. I'll focus on LeetCode and a few problems that develop the kind of reasoning needed for Google interviews.

### Google SDE Graph Preparation – Problem Sheet

### 1\. Graph Fundamentals – BFS & DFS

Master adjacency lists, visited arrays, connected components, traversal, and graph representation.

* Find if Path Exists in Graph

* Number of Provinces

* Number of Connected Components in an Undirected Graph

* Number of Islands

* Max Area of Island

* Flood Fill

* Clone Graph

* Keys and Rooms

* All Paths From Source to Target

* Reorder Routes to Make All Paths Lead to the City Zero

### 2\. Cycle Detection & Bipartite Graphs

Understand cycle detection in directed and undirected graphs, coloring, and DFS recursion-stack techniques.

* Redundant Connection

* Course Schedule

* Course Schedule II

* Is Graph Bipartite?

* Possible Bipartition

* Find Eventual Safe States

* Shortest Cycle in a Graph

### 3\. Topological Sorting

This is particularly important for dependency-based interview problems.

* Course Schedule

* Course Schedule II

* Alien Dictionary

* Parallel Courses

* Parallel Courses III

* Minimum Height Trees

* Find All Possible Recipes from Given Supplies

* Sequence Reconstruction

### 4\. Shortest Path Algorithms

Do not skip this section. You should know when to use BFS, Dijkstra, Bellman-Ford, and Floyd-Warshall.

BFS / Multi-source BFS

* Rotting Oranges

* 01 Matrix

* Shortest Path in Binary Matrix

* As Far from Land as Possible

* Shortest Bridge

Dijkstra

* Network Delay Time

* Path With Minimum Effort

* Cheapest Flights Within K Stops

* Path with Maximum Probability

* Minimum Cost to Make at Least One Valid Path in a Grid

* Number of Ways to Arrive at Destination

* Find the City With the Smallest Number of Neighbors at a Threshold Distance

Advanced shortest paths

* Bellman-Ford

* Floyd-Warshall

* Shortest Path Visiting All Nodes

### 5\. Grid Graphs & Advanced BFS

These problems teach you to treat a matrix as a graph, manage multiple states, and optimize traversal.

* Word Ladder

* Word Ladder II

* Open the Lock

* Snakes and Ladders

* Shortest Path to Get All Keys

* Shortest Path in a Grid with Obstacles Elimination

* Minimum Moves to Move a Box to Their Target Location

* As Far from Land as Possible

### 6\. Minimum Spanning Tree

Learn both Kruskal's and Prim's algorithms. You have already got a separate DSU problem sheet, so these are the additional graph problems worth doing.

* Min Cost to Connect All Points

* Connecting Cities With Minimum Cost

* Optimize Water Distribution in a Village

* Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree

### 7\. Strongly Connected Components, Bridges & Articulation Points

These are advanced topics. They are not the first things I'd prioritize for Google interviews, but they give you stronger graph fundamentals.

* Critical Connections in a Network

* Minimum Number of Days to Disconnect Island

* Strongly Connected Components

* Articulation Points

* Find All People With Secret

### 8\. Graph + Backtracking / State-Space Search

These are particularly useful for developing the ability to recognize when a problem can be modeled as a graph even when the input doesn't explicitly contain one.

* Path with Maximum Gold

* Shortest Path Visiting All Nodes

* Reconstruct Itinerary

* Cracking the Safe

* Valid Arrangement of Pairs

* Number of Ways to Reorder Array to Get Same BST

### 9\. Additional Advanced Graph Problems

* Bus Routes

* Minimum Genetic Mutation

* Escape a Large Maze

* Sliding Puzzle

* Parallel Courses II

* Shortest Path in a Weighted Graph

* Flight Discount

### Algorithms you must know

Solving problems alone isn't enough. You should be able to implement these independently in Java.

| Algorithm                        | Expected proficiency |
| -------------------------------- | -------------------- |
| BFS                              | Expert               |
| DFS (recursive + iterative)      | Expert               |
| Multi-source BFS                 | Expert               |
| Cycle detection                  | Expert               |
| Topological sorting (Kahn + DFS) | Expert               |
| Bipartite checking               | Strong               |
| Dijkstra                         | Expert               |
| Bellman-Ford                     | Strong               |
| Floyd-Warshall                   | Strong               |
| 0-1 BFS                          | Strong               |
| Kruskal                          | Strong               |
| Prim                             | Strong               |
| DSU                              | Expert               |
| Kosaraju                         | Intermediate         |
| Tarjan (bridges/articulation)    | Intermediate         |
| Bidirectional BFS                | Strong               |
| BFS with bitmask/state           | Strong               |
| Eulerian path/circuit            | Intermediate         |

### When can you consider Graphs mastered?

You should be able to:

* Identify a graph hidden inside a problem statement.

* Decide whether BFS, DFS, Dijkstra, DSU or topological sorting is appropriate.

* Handle directed, undirected, weighted and disconnected graphs.

* Solve shortest-path problems with additional constraints.

* Model states as nodes when ordinary graph traversal isn't enough.

* Optimize time and space complexity.

* Handle follow-up constraints without starting your solution from scratch.

One important thing: Google doesn't have a fixed graph question bank, and no problem list can guarantee a 9/10 success rate. Public interview-preparation resources consistently emphasize traversal, shortest paths, connectivity and dependency-based graph problems. soft-eng-practicum.github.io +2

My recommendation: Complete these 70 problems, along with your separate DSU sheet. For each problem, attempt it independently before looking at solutions, and revisit problems you couldn't solve after a few days.

Your ultimate benchmark: Give yourself an unseen LeetCode Medium/Hard graph problem and aim to derive the approach, prove correctness, implement it in Java and analyze complexity within 35–40 minutes. That is a much better measure of interview readiness than simply completing a problem count.
