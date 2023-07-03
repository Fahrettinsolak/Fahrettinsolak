using Microsoft.Msagl.Drawing;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CE205_HW3.libs
{
    internal class MST
    {
        private int minKey(int[] key, bool[] mstSet, int vertexSize)
        {
            int min = int.MaxValue, min_index = -1;
             

            for (int v = 0; v < vertexSize; v++)
                if (mstSet[v] == false && key[v] < min)
                {
                    min = key[v];
                    min_index = v;
                }

            return min_index;
        }
        private void printMST(int[] parent, int[,] graph,bool clearEdges,ref Microsoft.Msagl.Drawing.Graph graphObject)
        {

            if(clearEdges)
            {
                graphObject = new Microsoft.Msagl.Drawing.Graph("graph");
            }
            
            int vertexSize = graph.GetLength(0);

            Console.WriteLine("Edge \tWeight");
            
            for (int i = 1; i < vertexSize; i++)
            {
                string fromNode = Util.GetNodeLetter(parent[i]);
                string toNode = Util.GetNodeLetter(i);
                string weight = graph[i, parent[i]].ToString();

                Node node = graphObject.FindNode(fromNode);
                if(node!=null)
                {
                    node.RemoveOutEdge(new Microsoft.Msagl.Drawing.Edge(fromNode, weight, toNode));
                }

                Edge edge = graphObject.AddEdge(fromNode, weight, toNode);

                edge.Attr.Color = Microsoft.Msagl.Drawing.Color.Green;
                edge.Attr.LineWidth = 5;
            }
                
        }
        public void primMST(int[,] graphArray,bool clearEdges,ref Microsoft.Msagl.Drawing.Graph grapObject)
        {

            int vertexSize = graphArray.GetLength(0);

            int[] parent = new int[vertexSize];

            int[] key = new int[vertexSize];

            bool[] mstSet = new bool[vertexSize];

            for (int i = 0; i < vertexSize; i++)
            {
                key[i] = int.MaxValue;
                mstSet[i] = false;
            }

            key[0] = 0;
            parent[0] = -1;

            for (int count = 0; count < vertexSize - 1; count++)
            {

                int u = minKey(key, mstSet, vertexSize);

                mstSet[u] = true;

                for (int v = 0; v < vertexSize; v++)

                    if (graphArray[u, v] != 0 && mstSet[v] == false
                        && graphArray[u, v] < key[v])
                    {
                        parent[v] = u;
                        key[v] = graphArray[u, v];
                    }
            }
            printMST(parent,graphArray,clearEdges,ref grapObject);
        }
    }
}
