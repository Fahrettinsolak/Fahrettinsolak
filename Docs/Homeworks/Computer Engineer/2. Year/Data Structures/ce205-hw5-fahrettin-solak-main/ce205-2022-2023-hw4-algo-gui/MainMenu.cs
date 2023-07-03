using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ce205_2022_2023_hw4_fahrettin_solak
{
    public partial class MainMenu : Form
    {
        public MainMenu()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            NSH nsh = new NSH();
            nsh.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            KHB khb = new KHB();
            khb.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {  
            Trie trie = new Trie();
            trie.Show();
        }
    }
}
