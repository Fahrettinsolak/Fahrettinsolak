using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ce205_hw4_gui
{
    public class Node
    {
        public string key;
        public int height;
        public Node left, right;
        public string idCircle;
        public string idLine;

        public Node(string key, string idCircle)
        {
            this.key = key;
            this.idCircle = idCircle;
            height = 1;

        }
    }
    public class NodeRB
    {
        public string value;
        public NodeRB left, right;
        public string idCircle;
        public NodeRB parent;
        public int x, y;
        public Color color;
        public Boolean sentinel;
        public Boolean isRight;
        public int height;
        public Boolean passed = false;

        public NodeRB(string value, string idLingkaran)
        {
            this.value = value;
            this.left = null;
            this.right = null;
            this.parent = null;
            this.idCircle = idLingkaran;
            color = Color.Red;
            this.sentinel = false;
            this.height = 1;
        }
        public NodeRB(string value)
        {
            this.value = value;
            this.left = null;
            this.right = null;
            this.parent = null;
            color = Color.Red;
            this.sentinel = false;
            this.height = 1;
        }
        public NodeRB()
        {
            this.left = null;
            this.right = null;
            this.parent = null;
            color = Color.Red;
            this.sentinel = true;
            this.height = 1;
        }
    }
}
