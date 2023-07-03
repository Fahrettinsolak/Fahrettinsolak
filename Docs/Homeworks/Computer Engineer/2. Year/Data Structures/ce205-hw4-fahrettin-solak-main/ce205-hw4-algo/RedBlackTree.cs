using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ce205_hw4_algo
{
    public class RedBlackTree
    {
        /// <summary>
        /// Red-Black tree is a self-balancing binary search tree in which each node contains an extra bit for denoting the color of the node, 
        /// either red or black.Most of the BST operations (e.g., search, max, min, insert, delete.. etc) take O(h) time where h is the height of the BST.
        /// The cost of these operations may become O(n) for a skewed Binary tree. 
        /// If we make sure that the height of the tree remains O(log n) after every insertion and deletion, 
        /// then we can guarantee an upper bound of O(log n) for all these operations.
        /// The height of a Red-Black tree is always O(log n) where n is the number of nodes in the tree. 
        /// </summary>
        /// <param name="RedBlackTree">true if managed resources should be disposed; otherwise, false.</param>

        public class Node
        {
            public int key;
            public Node left;
            public Node right;
            public Node parent;
            public bool isRed;
            public string data;

            public Node(int key, string data)
            {
                this.key = key;
                this.left = null;
                this.right = null;
                this.parent = null;
                this.isRed = true;
                this.data = data;
            }
        }

        public Node root;

        public RedBlackTree()
        {
            root = null;
        }

        public int Insert(int key, string data)
        {
            Node newNode = new Node(key, data);
            if (root == null)
            {
                root = newNode;
                root.isRed = false;
                return 0;
            }
            else
            {
                Node current = root;
                Node parent = null;
                while (true)
                {
                    parent = current;
                    if (key < current.key)
                    {
                        current = current.left;
                        if (current == null)
                        {
                            parent.left = newNode;
                            newNode.parent = parent;
                            break;
                        }
                    }
                    else
                    {
                        current = current.right;
                        if (current == null)
                        {
                            parent.right = newNode;
                            newNode.parent = parent;
                            break;
                        }
                    }
                }
            }
            if (newNode.parent.isRed)
            {
                BalanceTree(newNode);
            }
            return 0;
        }

        public void BalanceTree(Node newNode)
        {
            Node parent = newNode.parent;
            Node grandParent = parent.parent;
            Node uncle = null;
            if (grandParent != null)
            {
                if (grandParent.left == parent)
                {
                    uncle = grandParent.right;
                }
                else
                {
                    uncle = grandParent.left;
                }
            }
            if (uncle != null && uncle.isRed)
            {
                parent.isRed = false;
                uncle.isRed = false;
                grandParent.isRed = true;
                BalanceTree(grandParent);
            }
            else
            {
                if (grandParent.left == parent)
                {
                    if (parent.right == newNode)
                    {
                        RotateLeft(parent);
                        newNode = parent;
                        parent = newNode.parent;
                    }
                    RotateRight(grandParent);
                    parent.isRed = false;
                    grandParent.isRed = true;
                }
                else
                {
                    if (parent.left == newNode)
                    {
                        RotateRight(parent);
                        newNode = parent;
                        parent = newNode.parent;
                    }
                    RotateLeft(grandParent);
                    parent.isRed = false;
                    grandParent.isRed = true;
                }
            }
        }

        public void RotateLeft(Node node)
        {
            Node newNode = node.right;
            node.right = newNode.left;
            if (newNode.left != null)
            {
                newNode.left.parent = node;
            }
            newNode.parent = node.parent;
            if (node.parent == null)
            {
                root = newNode;
            }
            else
            {
                if (node == node.parent.left)
                {
                    node.parent.left = newNode;
                }
                else
                {
                    node.parent.right = newNode;
                }
            }
            newNode.left = node;
            node.parent = newNode;
        }

        public void RotateRight(Node node)
        {
            Node newNode = node.left;
            node.left = newNode.right;
            if (newNode.right != null)
            {
                newNode.right.parent = node;
            }
            newNode.parent = node.parent;
            if (node.parent == null)
            {
                root = newNode;
            }
            else
            {
                if (node == node.parent.right)
                {
                    node.parent.right = newNode;
                }
                else
                {
                    node.parent.left = newNode;
                }
            }
            newNode.right = node;
            node.parent = newNode;
        }

        public int Delete(int key)
        {
            Node current = root;
            Node parent = root;
            bool isLeftChild = false;
            while (current.key != key)
            {
                parent = current;
                if (key < current.key)
                {
                    isLeftChild = true;
                    current = current.left;
                }
                else
                {
                    isLeftChild = false;
                    current = current.right;
                }
                if (current == null)
                {
                    return -1;
                }
            }
            if (current.left == null && current.right == null)
            {
                if (current == root)
                {
                    root = null;
                }
                else if (isLeftChild)
                {
                    parent.left = null;
                }
                else
                {
                    parent.right = null;
                }
            }
            else if (current.right == null)
            {
                if (current == root)
                {
                    root = current.left;
                }
                else if (isLeftChild)
                {
                    parent.left = current.left;
                }
                else
                {
                    parent.right = current.left;
                }
            }
            else if (current.left == null)
            {
                if (current == root)
                {
                    root = current.right;
                }
                else if (isLeftChild)
                {
                    parent.left = current.right;
                }
                else
                {
                    parent.right = current.right;
                }
            }
            else
            {
                Node successor = GetSuccessor(current);
                if (current == root)
                {
                    root = successor;
                }
                else if (isLeftChild)
                {
                    parent.left = successor;
                }
                else
                {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
            return 0;
        }

        public Node GetSuccessor(Node node)
        {
            Node parent = node;
            Node successor = node;
            Node current = node.right;
            while (current != null)
            {
                parent = successor;
                successor = current;
                current = current.left;
            }
            if (successor != node.right)
            {
                parent.left = successor.right;
                successor.right = node.right;
            }
            return successor;
        }

        public int Search(int key)
        {
            Node current = root;
            while (current.key != key)
            {
                if (key < current.key)
                {
                    current = current.left;
                }
                else
                {
                    current = current.right;
                }
                if (current == null)
                {
                    return -1;
                }
            }
            return 0;
        }
    }
}
