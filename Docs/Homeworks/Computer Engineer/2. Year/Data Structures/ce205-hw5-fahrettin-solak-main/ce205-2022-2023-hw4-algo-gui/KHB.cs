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
    public partial class KHB : Form
    {
        public KHB()
        {
            InitializeComponent();
        }

        private void SearchKunth_Click(object sender, EventArgs e)
        {
            KnuthMorrisPratt kmp = new KnuthMorrisPratt();

            string[] words = KnuthtextBox.Text.Split(',');
            foreach (string word in words)
            {
                int startIndex = 0;
                while (startIndex < KnuthrichTextBox.TextLength)
                {
                    int index = kmp.KMPSearch(word, KnuthrichTextBox.Text, startIndex);
                    if (index != -1)
                    {
                        KnuthrichTextBox.SelectionStart = index;
                        KnuthrichTextBox.SelectionLength = word.Length;
                        KnuthrichTextBox.SelectionColor = Color.Blue;
                    }
                    else
                        break;
                    startIndex += index + word.Length;
                }
            }
        }

        private void SearchHorspool_Click(object sender, EventArgs e)
        {
            Horspool h = new Horspool();

            string[] words = HorspooltextBox.Text.Split(',');
            foreach (string word in words)
            {
                int startIndex = 0;
                while (startIndex < HorspoolrichTextBox.TextLength)
                {
                    int index = h.ShiftMyTable(word, HorspoolrichTextBox.Text, startIndex);
                    if (index != -1)
                    {
                        HorspoolrichTextBox.SelectionStart = index;
                        HorspoolrichTextBox.SelectionLength = word.Length;
                        HorspoolrichTextBox.SelectionColor = Color.Red;
                    }
                    else
                        break;
                    startIndex += index + word.Length;
                }
            }
        }

        private void SearchBoyer_Click(object sender, EventArgs e)
        {
            Horspool h = new Horspool();

            string[] words = BoyertextBox.Text.Split(',');
            foreach (string word in words)
            {
                int startIndex = 0;
                while (startIndex < BoyerrichTextBox.TextLength)
                {
                    int index = h.ShiftMyTable(word, BoyerrichTextBox.Text, startIndex);
                    if (index != -1)
                    {
                        BoyerrichTextBox.SelectionStart = index;
                        BoyerrichTextBox.SelectionLength = word.Length;
                        BoyerrichTextBox.SelectionColor = Color.DarkOrange;
                    }
                    else
                        break;
                    startIndex += index + word.Length;
                }
            }
        }
    }
}
