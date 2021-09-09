package Algorithm;
// 2. Single Source Shortest Path
class SSSP {							// SSSP�� ���� �׷����� adjacency matrix�� ��� �ش� �׷����� SSSP�� ���ϴ� Ŭ����
	int graph[][];						// SSSP�� ���� �׷���
	int l;								// �׷��� ����� ����
	final int INFINITE = 9999;			// ���Ѵ븦 9999�� ����
	
	SSSP (int graph[][]) {				// SSSP�� ������
		this.graph = graph;
		this.l = graph.length;
	}
	
	void PrintGraph() {					// �׷����� adjacency matrix�� ����ϴ� �޼ҵ�
	    int i, j;
	    for (i = 0; i < l; i++) {
	        for (j = 0; j < l; j++)		// �׷��� adjacency matrix�� ��� ���� ���
	            System.out.printf(" %2d", graph[i][j]);
	        System.out.println();
	    }
	    System.out.println();
	}
	
	boolean Check() {					// �׷����� negative weight edge�� ���ԵǾ� �ִ��� Ȯ���ϴ� �޼ҵ�
	    int i, j;
	    for (i = 0; i < l; i++)
	        for (j = 0; j < l; j++)
	            if (graph[i][j] < 0)	// �׷����� weight �� ������ ���� �� true ��ȯ
	                return true;
	    return false;                   // �׷����� weight �� ������ ���� �� false ��ȯ    
	}
	
	void PrintResult(int dist[], int s) {	// SSSP�� ����� ����ϴ� �޼ҵ�      
	    int i;
	    System.out.println("   Vertex   Shortest Path");
	    for (i = 0; i < l; i++) {
	        if (dist[i] == INFINITE)	// i��° ���� ���� ��ΰ� ���� ��
	        	System.out.println("      "+i+"\t      INFINITE");
	        else                        // i��° ���� ���� ��ΰ� ���� ��
	        	System.out.printf("      %d\t\t %2d\n", i, dist[i]);
	    }
	    System.out.println();
	}
	
	int IndexMin(int dist[], boolean visit[])    	// �ش� �迭�� �ּڰ� �ε����� ��ȯ�ϴ� �޼ҵ�
	{
		int i;
	    int min = INFINITE;							// �ּڰ� min�� ���Ѵ�� �ʱ�ȭ
	    int index = 0;
	    for (i = 0; i < l; i++)
	        if (!visit[i] && min > dist[i]) { 		// �ּڰ����� �ش� ���� �۰� �湮���� ���� ����� ��
	            index = i;              			// �ش� ���� �ε��� ����
	            min = dist[i];              		// �ּڰ� ����
	        }
	    return index;				                // �ش� �迭�� �ּڰ� �ε����� ��ȯ
	}
	
	void Dijkstra(int s) {							// Dijkstra �˰����� ���� SSSP�� ���ϴ� �޼ҵ�
		int i, j, k;
	    int dist[] = new int[l];                    // �ٸ� �������� �ִܰŸ��� �����ϴ� �迭
	    boolean visit[] = new boolean[l];           // �ش� �ε����� ��带 �湮�� ���θ� �����ϴ� �迭
	    for (i = 0; i < l; i++) {               	// �ʱ�ȭ
	        dist[i] = INFINITE;
	        visit[i] = false;
	    }
	    dist[s] = 0;
	    for (i = 0; i < l - 1; i++) {           // �ҽ���带 ������ ��� ����� �ִܰŸ� ���
	        k = IndexMin(dist, visit);         	// IndexMin �޼ҵ带 �湮���� ��� �� ���� �Ÿ��� ª�� ����� �ε��� ����   
	        for (j = 0; j < l; j++)             // �׷����� ��� ��带 Ž���ϸ� ����� ������ ������
	            if (!visit[j] && graph[k][j]!=0 && dist[k] != INFINITE && dist[j] > dist[k] + graph[k][j]) // �ҽ� ���κ��� ��ΰ� �����ϸ� ���� �湮���� �ʾҰ� �ִܰŸ��� ���ŵ� ����� �ִܰŸ��� ���� ������
	                dist[j] = dist[k] + graph[k][j];
	        visit[k] = true;                    // �ش� ����� �湮���θ� true�� �ٲ�
	    }
	    System.out.println(" - Dijkstra Algorithm (Source Vertex: "+s+")");
	    PrintResult(dist, s); 					// Dijkstra �˰������� ���� SSSP ����� ���
	}
	
	void BellmanFord(int s) {					// BellmanFord �˰����� ���� SSSP�� ���ϴ� �޼ҵ�
		int i, j, k;
		int dist[] = new int[l];				// �ٸ� �������� �ִܰŸ��� �����ϴ� �迭
		boolean check = false;					// �׷����� negative weight cycle�� �ִ��� ����
		for (i = 0; i<l; i++)					// �ʱ�ȭ
			dist[i] = INFINITE;
		dist[s] = 0;
		for (k = 1; k < l; k++)
			for (i = 0; i < l; i++)
				for (j = 0; j < l; j++)
					if(graph[i][j]!=0)			// �ش� edge�� ������ ��
						if(dist[i]!=INFINITE && dist[i] + graph[i][j] < dist[j])	// �������� ��ΰ� �����ϸ� �ٷ� ���� �Ÿ����� �ѹ� ���ļ� ���� �Ÿ��� �� ���� �� �ִܰŸ� ����
							dist[j] = dist[i] + graph[i][j];
		for (i = 0; i < l; i++)
			for (j = 0; j < l; j++)
				if(graph[i][j]!=0)
					if(dist[i]!=INFINITE && dist[i] + graph[i][j] < dist[j])		// negative-weight�� ���� �ִܰ�ΰ� ������ �۾��� �� negative weight cycle�� �ִٰ� �Ǵ� 
						check = true;
		if (check)				// �׷����� negative weight cycle�� ���� ��
			System.out.println(" (negative weight cycle�� �����ϴ� �׷���)");
		System.out.println(" - Bellman-Ford Algorithm (Source Vertex: "+s+")");
		PrintResult(dist, s);	// BellmanFord �˰������� ���� SSSP ����� ���
	}
	
	void Result() {			// SSSP�� ����� ����ϴ� �޼ҵ�
		PrintGraph();		// �ش� �׷����� adjacency matrix ���
		if(Check())			// negative weight edge�� ���� �� BellmanFord �˰��� ���
			BellmanFord(0);
		else				// negative weight edge�� ���� �� Dijkstra �˰��� ���
			Dijkstra(0);
	}
}

public class SSSPManager {
	public static void main(String[] args) {	
		int i;
		int Graph[][][] =	// 3���� �迭�� ����Ͽ� ���� �׷����� adjacency matrix�� �Է¹���
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
		SSSP[] A = new SSSP[Graph.length];			// �׷����� ������ŭ SSSP �迭�� ���� �Ҵ�
		System.out.println("\n < 2.Single Source Shortest Paths >\n");
		for(i=0; i<Graph.length; i++)
			A[i] = new SSSP(Graph[i]);				// �����ڸ� ���� SSSP ��ü ����
		for(i=0; i<Graph.length; i++) {				// �׷����� SSSP ��� ���
			System.out.println("  Graph"+(i+1));
			A[i].Result();
		}
	}
}