using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ce205_hw4_algo
{
    public class AVLTree
    {
        /// <summary>
        /// AVL tree is a self-balancing binary search tree in which each node maintains extra information called a balance factor whose value is either -1, 0 or +1.
        /// AVL tree is a self-balancing Binary Search Tree (BST) where the difference between heights of left and right subtrees cannot be more than one for all nodes.
        /// Most of the BST operations (e.g., search, max, min, insert, delete.. etc) take O(h) time where h is the height of the BST.
        /// The cost of these operations may become O(n) for a skewed Binary tree. 
        /// If we make sure that the height of the tree remains O(log(n)) after every insertion and deletion, 
        /// then we can guarantee an upper bound of O(log(n)) for all these operations.
        /// The height of an AVL tree is always O(log(n)) where n is the number of nodes in the tree.
        /// </summary>
        /// <param name="AVLTree">true if managed resources should be disposed; otherwise, false.</param>
        public class Node
        {
            public int ID, height;
            public string data;
            public Node left, right;

            public Node(int ID, string data)
            {
                this.ID = ID;
                this.data = data;
                this.height = 1;
            }
        }

        public Node root;

        public int Height(Node N)
        {
            if (N == null)
                return 0;
            return N.height;
        }

        public int Max(int a, int b)
        {
            return (a > b) ? a : b;
        }

        public Node RightRotate(Node y)
        {
            Node x = y.left;
            Node T2 = x.right;

            x.right = y;
            y.left = T2;

            y.height = Max(Height(y.left), Height(y.right)) + 1;
            x.height = Max(Height(x.left), Height(x.right)) + 1;

            return x;
        }

        public Node LeftRotate(Node x)
        {
            Node y = x.right;
            Node T2 = y.left;

            y.left = x;
            x.right = T2;

            x.height = Max(Height(x.left), Height(x.right)) + 1;
            y.height = Max(Height(y.left), Height(y.right)) + 1;

            return y;
        }

        public int GetBalance(Node N)
        {
            if (N == null)
                return 0;
            return Height(N.left) - Height(N.right);
        }

        public Node Insert(Node node, int ID, string data)
        {
            if (node == null)
                return (new Node(ID, data));

            if (ID < node.ID)
                node.left = Insert(node.left, ID, data);
            else if (ID > node.ID)
                node.right = Insert(node.right, ID, data);
            else
                return node;

            node.height = 1 + Max(Height(node.left), Height(node.right));

            int balance = GetBalance(node);

            if (balance > 1 && ID < node.left.ID)
                return RightRotate(node);

            if (balance < -1 && ID > node.right.ID)
                return LeftRotate(node);

            if (balance > 1 && ID > node.left.ID)
            {
                node.left = LeftRotate(node.left);
                return RightRotate(node);
            }

            if (balance < -1 && ID < node.right.ID)
            {
                node.right = RightRotate(node.right);
                return LeftRotate(node);
            }

            return node;
        }

        public Node Delete(Node root, int ID)
        {
            if (root == null)
                return root;

            if (ID < root.ID)
                root.left = Delete(root.left, ID);
            else if (ID > root.ID)
                root.right = Delete(root.right, ID);
            else
            {
                if ((root.left == null) || (root.right == null))
                {
                    Node temp = null;
                    if (temp == root.left)
                        temp = root.right;
                    else
                        temp = root.left;

                    if (temp == null)
                    {
                        temp = root;
                        root = null;
                    }
                    else
                        root = temp;
                }
                else
                {
                    Node temp = minValueNode(root.right);

                    root.ID = temp.ID;
                    root.right = Delete(root.right, temp.ID);
                }
            }

            if (root == null)
                return root;

            root.height = Max(Height(root.left), Height(root.right)) + 1;

            int balance = GetBalance(root);

            if (balance > 1 && GetBalance(root.left) >= 0)
                return RightRotate(root);

            if (balance > 1 && GetBalance(root.left) < 0)
            {
                root.left = LeftRotate(root.left);
                return RightRotate(root);
            }

            if (balance < -1 && GetBalance(root.right) <= 0)
                return LeftRotate(root);

            if (balance < -1 && GetBalance(root.right) > 0)
            {
                root.right = RightRotate(root.right);
                return LeftRotate(root);
            }

            return root;
        }

        public Node minValueNode(Node node)
        {
            Node current = node;

            while (current.left != null)
                current = current.left;

            return current;
        }

        public void PreOrder(Node node)
        {
            if (node != null)
            {
                Console.Write(node.ID + " ");
                PreOrder(node.left);
                PreOrder(node.right);
            }
        }

        public Node Search(Node root, int ID)
        {
            if (root == null || root.ID == ID)
                return root;

            if (root.ID < ID)
                return Search(root.right, ID);

            return Search(root.left, ID);
        }

        public int delete(int ID)
        {
            if (Search(root, ID) == null)
                return 0;
            else
            {
                root = Delete(root, ID);
                return 1;
            }
        }

        public int search(int ID)
        {
            if (Search(root, ID) == null)
                return 0;
            else
                return 1;
        }

        public int insert(int ID, string data)
        {
            root = Insert(root, ID, data);
            return 0;
        }













    }
}
