using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace ce205_2022_2023_hw4_fahrettin_solak
{
    public partial class Trie : Form
    {
        public Trie()
        {
            InitializeComponent();
        }

        private void InsertTrie_Click(object sender, EventArgs e)
        {
            string paraf = TrietextBox1.Text;
            char[] white = new char[] { ' ', ',', '.', '\t' };
            String[] keys = paraf.Split(white);

            TrieAlgorithm.Trie root = new TrieAlgorithm.Trie();

            // Construct trie

            int i;
            for (i = 0; i < keys.Length; i++)
            {
                TrierichTextBox1.Text = TrierichTextBox1.Text + keys[i] + Environment.NewLine;
                TrieAlgorithm.Trie.Insert(keys[i]);
            }
        }

        private void SearchTrie_Click(object sender, EventArgs e)
        {
            Trie trie = new Trie();
            string prefix = TrietextBox2.Text;

            // Split the text in the insertRichTextBox into words
            string[] words = TrierichTextBox1.Text.Split(new[] { ' ', '\n', '\r' }, StringSplitOptions.RemoveEmptyEntries);

            TrierichTextBox2.Clear();
            foreach (string word in words)
            {
                if (word.StartsWith(prefix))
                {
                    TrierichTextBox2.AppendText(word + Environment.NewLine);
                }
            }
        }

        private void TrieRandom_Click(object sender, EventArgs e)
        {
            Random random = new Random();
            int randomNumber = random.Next(0, 150);
            string strkeys = "Lorem Ipsum simply dummy text printing typesetting industry." +
                " Lorem Ipsum industry standard dummy text ever since,when" +
                " unknown printer took galley type scrambled make type specimen book." +
                " survived only five centuries,leap electronic typesetting," +
                " remaining essentially unchanged.popularised with" +
                " Letraset sheets containing Lorem Ipsum passages, more recently with desktop publishing" +
                " software like Aldus PageMaker including versions Lorem Ipsum. long established" +
                " fact that reader will distracted readable content page when looking" +
                " layout. point using Lorem Ipsum that more-or-less normal " +
                "distribution letters, opposed using 'Content here, content here, making look like readable English. Many desktop " +
                "publishing packages editors Lorem Ipsum their default model text, search lorem ipsum will" +
                " uncover sites still their infancy. Various versions evolved over  years, sometimes accident, sometimes " +
                " purpose injected humou.There many variations passages Lorem Ipsum available, majority have" +
                " suffered alteration some, injected humour, randomised words which look even slightly believable." +
                " going passage Lorem Ipsum, need sure there anything embarrassing hidden middle text. " +
                " Lorem Ipsum generators Internet tend repeat predefined chunks necessary, making this first true generator " +
                " Internet. uses dictionary over Latin words, combined with handful model sentence structures, generate " +
                "Lorem Ipsum which looks reasonable. generated Lorem Ipsum always free from repetition, injected humour, non-characteristic words.";
            char[] whitespace = new char[] { ' ', '\t', '.', ',' };

            string[] ssizes = strkeys.Split(whitespace);

            TrietextBox1.Text = ssizes[randomNumber].ToString();
        }
    }
}
