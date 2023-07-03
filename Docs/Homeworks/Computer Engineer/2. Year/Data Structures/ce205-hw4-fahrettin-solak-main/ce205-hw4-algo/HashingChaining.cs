using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ce205_hw4_algo
{
    public class HashingChaining
    {
        /// <summary>
        /// The Chaining is one collision resolution technique. We cannot avoid collision, but we can try to reduce the collision, 
        /// and try to store multiple elements for same hash value. In the chaining approach, the hash table is an array of linked lists i.e., 
        /// each index has its own linked list. All key-value pairs mapping to the same index will be stored in the linked list of that index.
        /// </summary>
        /// <param name="HashingChaining">true if managed resources should be disposed; otherwise, false.</param>
        public class hashnode
        {
            public int key;
            public string data;
            public hashnode next;
            public hashnode(int key, string data)
            {
                this.key = key;
                this.data = data;
                this.next = null;
            }
        }

        public LinkedList<hashnode>[] table;

        public HashingChaining(int size)
        {
            table = new LinkedList<hashnode>[size];
        }

        public int HashingChainingInsert(int key, string data)
        {
            int index = key % table.Length;
            if (table[index] == null)
            {
                table[index] = new LinkedList<hashnode>();
                table[index].AddFirst(new hashnode(key, data));
                return 0;
            }
            else
            {
                foreach (hashnode node in table[index])
                {
                    if (node.key == key)
                    {
                        return -1;
                    }
                }
                table[index].AddFirst(new hashnode(key, data));
                return 0;
            }
        }

        public string HashingChainingSearch(int key)
        {
            int index = key % table.Length;
            if (table[index] == null)
            {
                return null;
            }
            else
            {
                foreach (hashnode node in table[index])
                {
                    if (node.key == key)
                    {
                        return node.data;
                    }
                }
                return null;
            }
        }

        public int HashingChainingDelete(int key)
        {
            int index = key % table.Length;
            if (table[index] == null)
            {
                return -1;
            }
            else
            {
                foreach (hashnode node in table[index])
                {
                    if (node.key == key)
                    {
                        table[index].Remove(node);
                        return 0;
                    }
                }
                return -1;
            }
        }
    }
}
