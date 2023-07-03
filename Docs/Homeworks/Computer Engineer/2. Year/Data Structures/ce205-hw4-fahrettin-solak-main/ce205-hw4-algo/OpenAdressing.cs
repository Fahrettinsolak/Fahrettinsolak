using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ce205_hw4_algo
{
    public class OpenAddressing
    {
        /// <summary>
        /// Like separate chaining, open addressing is a method for handling collisions. In Open Addressing, 
        /// all elements are stored in the hash table itself. So at any point,
        /// the size of the table must be greater than or equal to the total number of keys (Note that we can increase table size by copying old data if needed).
        /// This approach is also known as closed hashing. This entire procedure is based upon probing.
        /// </summary>
        /// <param name="OpenAddressing">true if managed resources should be disposed; otherwise, false.</param>
        public class hashnode
        {
            public int key;
            public string data;

            public hashnode(int key, string data)
            {
                this.key = key;
                this.data = data;
            }
        }
        public hashnode[] table;
        public OpenAddressing(int size)
        {
            table = new hashnode[size];
        }
        public void OpenAddressingLinearProbingInsert(int key, string data)
        {
            int index = key % table.Length;
            while (table[index] != null)
            {
                index = (index + 1) % table.Length;
            }
            table[index] = new hashnode(key, data);
        }

        public void OpenAddressingQuadraticProbingInsert(int key, string data)
        {
            int index = key % table.Length;
            int i = 1;
            while (table[index] != null)
            {
                index = (index + i * i) % table.Length;
                i++;
            }
            table[index] = new hashnode(key, data);
        }

        public void OpenAddressingDoubleProbingInsert(int key, string data)
        {
            int index = key % table.Length;
            int i = 1;
            while (table[index] != null)
            {
                index = (index + i * (key % (table.Length - 1))) % table.Length;
                i++;
            }
            table[index] = new hashnode(key, data);
        }
    }
}
