package Algorithm;
// 2. Single Source Shortest Path
class SSSP {							// SSSP를 구할 그래프의 adjacency matrix를 담고 해당 그래프의 SSSP를 구하는 클래스
	int graph[][];						// SSSP를 구할 그래프
	int l;								// 그래프 노드의 개수
	final int INFINITE = 9999;			// 무한대를 9999로 설정
	
	SSSP (int graph[][]) {				// SSSP의 생성자
		this.graph = graph;
		this.l = graph.length;
	}
	
	void PrintGraph() {					// 그래프의 adjacency matrix를 출력하는 메소드
	    int i, j;
	    for (i = 0; i < l; i++) {
	        for (j = 0; j < l; j++)		// 그래프 adjacency matrix의 모든 값을 출력
	            System.out.printf(" %2d", graph[i][j]);
	        System.out.println();
	    }
	    System.out.println();
	}
	
	boolean Check() {					// 그래프에 negative weight edge가 포함되어 있는지 확인하는 메소드
	    int i, j;
	    for (i = 0; i < l; i++)
	        for (j = 0; j < l; j++)
	            if (graph[i][j] < 0)	// 그래프의 weight 중 음수가 있을 시 true 반환
	                return true;
	    return false;                   // 그래프의 weight 중 음수가 없을 시 false 반환    
	}
	
	void PrintResult(int dist[], int s) {	// SSSP의 결과를 출력하는 메소드      
	    int i;
	    System.out.println("   Vertex   Shortest Path");
	    for (i = 0; i < l; i++) {
	        if (dist[i] == INFINITE)	// i번째 노드로 가는 경로가 없을 시
	        	System.out.println("      "+i+"\t      INFINITE");
	        else                        // i번째 노드로 가는 경로가 있을 시
	        	System.out.printf("      %d\t\t %2d\n", i, dist[i]);
	    }
	    System.out.println();
	}
	
	int IndexMin(int dist[], boolean visit[])    	// 해당 배열의 최솟값 인덱스를 반환하는 메소드
	{
		int i;
	    int min = INFINITE;							// 최솟값 min을 무한대로 초기화
	    int index = 0;
	    for (i = 0; i < l; i++)
	        if (!visit[i] && min > dist[i]) { 		// 최솟값보다 해당 값이 작고 방문하지 않은 노드일 시
	            index = i;              			// 해당 값의 인덱스 저장
	            min = dist[i];              		// 최솟값 변경
	        }
	    return index;				                // 해당 배열의 최솟값 인덱스를 반환
	}
	
	void Dijkstra(int s) {							// Dijkstra 알고리즘을 통해 SSSP를 구하는 메소드
		int i, j, k;
	    int dist[] = new int[l];                    // 다른 노드까지의 최단거리를 저장하는 배열
	    boolean visit[] = new boolean[l];           // 해당 인덱스의 노드를 방문한 여부를 저장하는 배열
	    for (i = 0; i < l; i++) {               	// 초기화
	        dist[i] = INFINITE;
	        visit[i] = false;
	    }
	    dist[s] = 0;
	    for (i = 0; i < l - 1; i++) {           // 소스노드를 제외한 모든 노드의 최단거리 계산
	        k = IndexMin(dist, visit);         	// IndexMin 메소드를 방문하지 노드 중 가장 거리가 짧은 노드의 인덱스 저장   
	        for (j = 0; j < l; j++)             // 그래프의 모든 노드를 탐색하며 노드의 정보를 수정함
	            if (!visit[j] && graph[k][j]!=0 && dist[k] != INFINITE && dist[j] > dist[k] + graph[k][j]) // 소스 노드로부터 경로가 존재하며 아직 방문하지 않았고 최단거리가 갱신된 노드의 최단거리를 새로 수정함
	                dist[j] = dist[k] + graph[k][j];
	        visit[k] = true;                    // 해당 노드의 방문여부를 true로 바꿈
	    }
	    System.out.println(" - Dijkstra Algorithm (Source Vertex: "+s+")");
	    PrintResult(dist, s); 					// Dijkstra 알고리즘으로 구한 SSSP 결과를 출력
	}
	
	void BellmanFord(int s) {					// BellmanFord 알고리즘을 통해 SSSP를 구하는 메소드
		int i, j, k;
		int dist[] = new int[l];				// 다른 노드까지의 최단거리를 저장하는 배열
		boolean check = false;					// 그래프에 negative weight cycle이 있는지 여부
		for (i = 0; i<l; i++)					// 초기화
			dist[i] = INFINITE;
		dist[s] = 0;
		for (k = 1; k < l; k++)
			for (i = 0; i < l; i++)
				for (j = 0; j < l; j++)
					if(graph[i][j]!=0)			// 해당 edge가 존재할 때
						if(dist[i]!=INFINITE && dist[i] + graph[i][j] < dist[j])	// 노드까지의 경로가 존재하며 바로 가는 거리보다 한번 거쳐서 가는 거리가 더 빠를 때 최단거리 변경
							dist[j] = dist[i] + graph[i][j];
		for (i = 0; i < l; i++)
			for (j = 0; j < l; j++)
				if(graph[i][j]!=0)
					if(dist[i]!=INFINITE && dist[i] + graph[i][j] < dist[j])		// negative-weight로 인해 최단경로가 무한히 작아질 때 negative weight cycle이 있다고 판단 
						check = true;
		if (check)				// 그래프에 negative weight cycle이 있을 때
			System.out.println(" (negative weight cycle를 포함하는 그래프)");
		System.out.println(" - Bellman-Ford Algorithm (Source Vertex: "+s+")");
		PrintResult(dist, s);	// BellmanFord 알고리즘으로 구한 SSSP 결과를 출력
	}
	
	void Result() {			// SSSP의 결과를 출력하는 메소드
		PrintGraph();		// 해당 그래프의 adjacency matrix 출력
		if(Check())			// negative weight edge가 있을 시 BellmanFord 알고리즘 사용
			BellmanFord(0);
		else				// negative weight edge가 없을 시 Dijkstra 알고리즘 사용
			Dijkstra(0);
	}
}

public class SSSPManager {
	public static void main(String[] args) {	
		int i;
		int Graph[][][] =	// 3차원 배열을 사용하여 여러 그래프의 adjacency matrix를 입력받음
			{
					{
						{ 0, 3, 6, 8, 7, 5, 2, 3, 6, 9 },
						{ 6, 0, 2, 4, 0, 3, 4, 2, 7, 8 },
						{ 5, 2, 0, 8, 5, 3, 2, 1, 9, 6 },
						{ 2, 0, 5, 0, 2, 2, 1, 8, 5, 3 },
						{ 3, 8, 5, 2, 0, 2, 5, 7, 8, 7 },
						{ 7, 0, 7, 2, 6, 0, 3, 3, 0, 6 },
						{ 6, 8, 4, 2, 3, 2, 0, 5, 1, 3 },
						{ 0, 7, 4, 6, 9, 7, 2, 0, 9, 5 },
						{ 6, 4, 0, 6, 6, 8, 8, 5, 0, 9 },
						{ 5, 6, 3, 8, 9, 7, 6, 1, 7, 0 },
					},
					{
				        { 0, 9, 6, 8, 0, 0, 2, 0, 6, 0 },
				        { 0, 0, 7, 0, 8, 3, 4, 0, 5, 0 },
				        { 6, 2, 0, 0, 0, 0, 2, 0, 9, 0 },
				        { 0, 0, 5, 0, 0, 8, 7, 0, 0, 0 },
				        { 9, 0, 5, 0, 0, 0, 5, 6, 0, 0 },
				        { 0, 0, 0, 2, 0, 0, 3, 3, 0, 0 },
				        { 0, 8, 5, 0, 3, 0, 0, 5, 0, 0 },
				        { 0, 0, 0, 9, 0, 7, 0, 0, 9, 0 },
				        { 0, 0, 6, 0, 0, 0, 3, 0, 0, 0 },
				        { 6, 0, 0, 0, 0, 0, 0, 8, 0, 0 },
				    },
					{
				        { 0, 3, 6, 8, 7, 5, 2, 3, 6, 3 },
				        { 8, 0, 2, 4, 0, 3, 4, 6, 5, 9 },
				        { 0, 2, 0, 5, 5, 3, 9, 0, 9, 6 },
				        { 0, 0, 7, 0, 2, 2, 8, 4, 5, 3 },
				        { 7, 0, 5, 2, 0, 2, 6, 6, 3, 2 },
				        { 7, 0, -1, 9, 6, 0, 4, 3, 0, 6 },
				        { 0, 5, 5, 2, 3, 2, 0, 8, 1, 3 },
				        { 9, 9, 4, 6, 0, 4, 9, 0, 1, 9 },
				        { 4, 8, 0, 9, 6, 9, 6, 5, 0, 2 },
				        { 7, 6, 9, 2, 8, 7, 4, 7, 7, 0 },
				    },
					{
				        { 0, 4, 0, 9, 0, 0, 2, 0, 0, 0 },
				        { 0, 5, 0, 0, 8, 3, 4, 0, 0, 0 },
				        { 0, 0, 0, 5, 0, 0, 3, 0, 0, 0 },
				        { 7, 0, 0, 0, -2, 0, 0, 0, 0, 0 },
				        { 0, 7, 0, 0, 0, 9, 0, 6, 0, 0 },
				        { 9, 0, 0, 3, 0, 0, 0, 3, 0, 0 },
				        { 0, 8, 0, 0, 4, 0, 0, 6, 0, 9 },
				        { 3, -1, 0, 6, 0, 7, 2, 0, 0, 0 },
				        { 0, 0, 0, 0, 0, 9, 0, 0, 0, 6 },
				        { 0, 0, 7, 0, 3, 0, 0, 6, 0, 0 },
				    },
					{
				        { 0, 3, 6, 8, 7, 5, 2, 3, 6, 3 },
				        { -7, 0, 2, 4, 8, 3, -4, 2, 5, 8 },
				        { 0, 2, 0, 5, 5, 3, 2, 1, -5, 6 },
				        { -9, 4, 5, 0, 2, 2, 1, 9, 5, 3 },
				        { 4, 8, 5, 2, 0, 2, -5, 6, 3, 2 },
				        { -7, 8, -1, 2, 6, 0, 3, 3, 6, 6 },
				        { 9, 8, 9, 2, 3, 2, 0, 5, 1, -3 },
				        { 0, 7, 4, 6, -9, 7, 2, 0, 1, 6 },
				        { -6, 1, -5, 7, 6, 1, 3, 5, 0, 2 },
				        { 9, 0, 2, 0, 6, -2, 6, 0, 7, 0 },
				    },
			};
		SSSP[] A = new SSSP[Graph.length];			// 그래프의 갯수만큼 SSSP 배열의 공간 할당
		System.out.println("\n < 2.Single Source Shortest Paths >\n");
		for(i=0; i<Graph.length; i++)
			A[i] = new SSSP(Graph[i]);				// 생성자를 통해 SSSP 객체 생성
		for(i=0; i<Graph.length; i++) {				// 그래프의 SSSP 결과 출력
			System.out.println("  Graph"+(i+1));
			A[i].Result();
		}
	}
}