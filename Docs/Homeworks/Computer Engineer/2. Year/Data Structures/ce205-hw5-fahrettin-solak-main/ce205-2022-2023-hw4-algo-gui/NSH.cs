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
    public partial class NSH : Form
    {
        public NSH()
        {
            InitializeComponent();
        }

        private void AlignmentNeedleman_Click(object sender, EventArgs e)
        {
            NeedlemanWunsch needleman = new NeedlemanWunsch();
            string input1 = NeedlemanTextBox1.Text;
            string input2 = NeedlemanTextBox2.Text;

            // Clear the RichTextBox
            NeedlemanRichTextBox.Clear();

            // Iterate over the characters in the input strings
            for (int i = 0; i < Math.Max(input1.Length, input2.Length); i++)
            {
                // Check if the characters at the current position match
                if (i < input1.Length && i < input2.Length && input1[i] == input2[i])
                {
                    if (i < input1.Length)
                    {
                        // If they match, add them to the RichTextBox with a green color
                        NeedlemanRichTextBox.SelectionStart = NeedlemanRichTextBox.TextLength;
                        NeedlemanRichTextBox.SelectionLength = 1;
                        NeedlemanRichTextBox.SelectionColor = Color.Green;
                        NeedlemanRichTextBox.AppendText(input1[i].ToString());
                        NeedlemanRichTextBox.SelectionColor = NeedlemanRichTextBox.ForeColor;
                    }
                    if (i < input2.Length)
                    {
                        NeedlemanRichTextBox.SelectionStart = NeedlemanRichTextBox.TextLength;
                        NeedlemanRichTextBox.SelectionLength = 1;
                        NeedlemanRichTextBox.SelectionColor = Color.Green;
                        NeedlemanRichTextBox.AppendText(input2[i].ToString());
                        NeedlemanRichTextBox.SelectionColor = NeedlemanRichTextBox.ForeColor;
                    }
                    NeedlemanRichTextBox.AppendText("\n");
                }
                else if (i < input1.Length && i < input2.Length && input1[i] != input2[i])
                {
                    // If they do not match, add them to the RichTextBox with a red color
                    if (i < input1.Length)
                    {
                        NeedlemanRichTextBox.SelectionStart = NeedlemanRichTextBox.TextLength;
                        NeedlemanRichTextBox.SelectionLength = 1;
                        NeedlemanRichTextBox.SelectionColor = Color.Red;
                        NeedlemanRichTextBox.AppendText(input1[i].ToString());
                        NeedlemanRichTextBox.SelectionColor = NeedlemanRichTextBox.ForeColor;
                    }
                    if (i < input2.Length)
                    {
                        NeedlemanRichTextBox.SelectionStart = NeedlemanRichTextBox.TextLength;
                        NeedlemanRichTextBox.SelectionLength = 1;
                        NeedlemanRichTextBox.SelectionColor = Color.Red;
                        NeedlemanRichTextBox.AppendText(input2[i].ToString());
                        NeedlemanRichTextBox.SelectionColor = NeedlemanRichTextBox.ForeColor;
                    }
                    NeedlemanRichTextBox.AppendText("\n");
                }
                else
                {
                    // If one of the strings is shorter, add the remaining characters to the RichTextBox with a blue color
                    if (i < input1.Length)
                    {
                        NeedlemanRichTextBox.SelectionStart = NeedlemanRichTextBox.TextLength;
                        NeedlemanRichTextBox.SelectionLength = 1;
                        NeedlemanRichTextBox.SelectionColor = Color.Blue;
                        NeedlemanRichTextBox.AppendText(input1[i].ToString());
                        NeedlemanRichTextBox.SelectionColor = NeedlemanRichTextBox.ForeColor;
                    }
                    if (i < input2.Length)
                    {
                        NeedlemanRichTextBox.SelectionStart = NeedlemanRichTextBox.TextLength;
                        NeedlemanRichTextBox.SelectionLength = 1;
                        NeedlemanRichTextBox.SelectionColor = Color.Blue;
                        NeedlemanRichTextBox.AppendText(input2[i].ToString());
                        NeedlemanRichTextBox.SelectionColor = NeedlemanRichTextBox.ForeColor;
                    }
                    NeedlemanRichTextBox.AppendText("-" + "\n");
                }
            }
        }

        private void NeedlemanRandom1_Click(object sender, EventArgs e)
        {
            int length = 30;

            // Initialize an array of the possible DNA nucleotides
            char[] nucleotides = { 'A', 'C', 'G', 'T' };

            // Generate the random DNA sequence
            string dna = "";
            Random rand = new Random();
            for (int i = 0; i < length; i++)
            {
                dna += nucleotides[rand.Next(4)];
            }

            // Display the DNA sequence in the text box
            NeedlemanTextBox1.Text = dna;

        }

        private void NeedlemanRandom2_Click(object sender, EventArgs e)
        {
            int length = 20;

            // Initialize an array of the possible DNA nucleotides
            char[] nucleotides = { 'A', 'C', 'G', 'T' };

            // Generate the random DNA sequence
            string dna = "";
            Random rand = new Random();
            for (int i = 0; i < length; i++)
            {
                dna += nucleotides[rand.Next(4)];
            }

            // Display the DNA sequence in the text box
            NeedlemanTextBox2.Text = dna;

        }

        private void SmithAlignment_Click(object sender, EventArgs e)
        {
            SmithWaterman smith = new SmithWaterman();
            string gene1 = SmithtextBox1.Text;
            string gene2 = SmithtextBox2.Text;

            SmithrichTextBox.Clear();

            for (int i = 0; i < Math.Max(gene1.Length, gene2.Length); i++)
            {
                // Check if the characters at the current position match
                if (i < gene1.Length && i < gene2.Length && gene1[i] == gene2[i])
                {
                    if (i < gene1.Length)
                    {
                        // If they match, add them to the RichTextBox with a green color
                        SmithrichTextBox.SelectionStart = SmithrichTextBox.TextLength;
                        SmithrichTextBox.SelectionLength = 1;
                        SmithrichTextBox.SelectionColor = Color.Green;
                        SmithrichTextBox.AppendText(gene1[i].ToString());
                        SmithrichTextBox.SelectionColor = SmithrichTextBox.ForeColor;
                    }
                    if (i < gene2.Length)
                    {
                        SmithrichTextBox.SelectionStart = SmithrichTextBox.TextLength;
                        SmithrichTextBox.SelectionLength = 1;
                        SmithrichTextBox.SelectionColor = Color.Green;
                        SmithrichTextBox.AppendText(gene2[i].ToString());
                        SmithrichTextBox.SelectionColor = SmithrichTextBox.ForeColor;
                    }
                    SmithrichTextBox.AppendText("\n");
                }
                else if (i < gene1.Length && i < gene2.Length && gene1[i] != gene2[i])
                {
                    if (i < gene1.Length)
                    {

                        SmithrichTextBox.SelectionStart = SmithrichTextBox.TextLength;
                        SmithrichTextBox.SelectionLength = 1;
                        SmithrichTextBox.SelectionColor = Color.Red;
                        SmithrichTextBox.AppendText(gene1[i].ToString());
                        SmithrichTextBox.SelectionColor = SmithrichTextBox.ForeColor;
                    }
                    if (i < gene2.Length)
                    {
                        SmithrichTextBox.SelectionStart = SmithrichTextBox.TextLength;
                        SmithrichTextBox.SelectionLength = 1;
                        SmithrichTextBox.SelectionColor = Color.Red;
                        SmithrichTextBox.AppendText(gene2[i].ToString());
                        SmithrichTextBox.SelectionColor = SmithrichTextBox.ForeColor;
                        SmithrichTextBox.AppendText("\n");
                    }
                }
                else
                {
                    if (i < gene1.Length)
                    {

                        SmithrichTextBox.SelectionStart = SmithrichTextBox.TextLength;
                        SmithrichTextBox.SelectionLength = 1;
                        SmithrichTextBox.SelectionColor = Color.Blue;
                        SmithrichTextBox.AppendText(gene1[i].ToString());
                        SmithrichTextBox.SelectionColor = SmithrichTextBox.ForeColor;
                    }
                    if (i < gene2.Length)
                    {
                        SmithrichTextBox.SelectionStart = SmithrichTextBox.TextLength;
                        SmithrichTextBox.SelectionLength = 1;
                        SmithrichTextBox.SelectionColor = Color.Blue;
                        SmithrichTextBox.AppendText(gene2[i].ToString());
                        SmithrichTextBox.SelectionColor = SmithrichTextBox.ForeColor;
                    }
                    SmithrichTextBox.AppendText("-" + "\n");
                }
            }
        }

        private void SmithRandom1_Click(object sender, EventArgs e)
        {
            int length = 30;

            // Initialize an array of the possible DNA nucleotides
            char[] nucleotides = { 'A', 'C', 'G', 'T' };

            // Generate the random DNA sequence
            string dna = "";
            Random rand = new Random();
            for (int i = 0; i < length; i++)
            {
                dna += nucleotides[rand.Next(4)];
            }

            // Display the DNA sequence in the text box
            SmithtextBox1.Text = dna;
        }

        private void SmithRandom2_Click(object sender, EventArgs e)
        {
            int length = 20;

            // Initialize an array of the possible DNA nucleotides
            char[] nucleotides = { 'A', 'C', 'G', 'T' };

            // Generate the random DNA sequence
            string dna = "";
            Random rand = new Random();
            for (int i = 0; i < length; i++)
            {
                dna += nucleotides[rand.Next(4)];
            }

            // Display the DNA sequence in the text box
            SmithtextBox2.Text = dna;

        }

        private void HuntAlignment_Click(object sender, EventArgs e)
        {
            // Get the input strings and the pattern
            string input1 = HunttextBox1.Text;
            string input2 = HunttextBox2.Text;

            // Clear the RichTextBox
            HuntrichTextBox.Clear();

            // Iterate over the characters in the input strings
            for (int i = 0; i < Math.Max(input1.Length, input2.Length); i++)
            {
                // Check if the characters at the current position match
                if (i < input1.Length && i < input2.Length && input1[i] == input2[i])
                {
                    if (i < input1.Length)
                    {
                        // If they match, add them to the RichTextBox with a green color
                        HuntrichTextBox.SelectionStart = HuntrichTextBox.TextLength;
                        HuntrichTextBox.SelectionLength = 1;
                        HuntrichTextBox.SelectionColor = Color.Green;
                        HuntrichTextBox.AppendText(input1[i].ToString());
                        HuntrichTextBox.SelectionColor = HuntrichTextBox.ForeColor;
                    }
                    if (i < input2.Length)
                    {
                        HuntrichTextBox.SelectionStart = HuntrichTextBox.TextLength;
                        HuntrichTextBox.SelectionLength = 1;
                        HuntrichTextBox.SelectionColor = Color.Green;
                        HuntrichTextBox.AppendText(input2[i].ToString());
                        HuntrichTextBox.SelectionColor = HuntrichTextBox.ForeColor;
                    }
                    HuntrichTextBox.AppendText("\n");
                }
                else if (i < input1.Length && i < input2.Length && input1[i] != input2[i])
                {
                    // If they do not match, add them to the RichTextBox with a red color
                    if (i < input1.Length)
                    {
                        HuntrichTextBox.SelectionStart = HuntrichTextBox.TextLength;
                        HuntrichTextBox.SelectionLength = 1;
                        HuntrichTextBox.SelectionColor = Color.Red;
                        HuntrichTextBox.AppendText(input1[i].ToString());
                        HuntrichTextBox.SelectionColor = HuntrichTextBox.ForeColor;
                    }
                    if (i < input2.Length)
                    {
                        HuntrichTextBox.SelectionStart = HuntrichTextBox.TextLength;
                        HuntrichTextBox.SelectionLength = 1;
                        HuntrichTextBox.SelectionColor = Color.Red;
                        HuntrichTextBox.AppendText(input2[i].ToString());
                        HuntrichTextBox.SelectionColor = HuntrichTextBox.ForeColor;
                    }
                    HuntrichTextBox.AppendText("\n");
                }
                else
                {
                    // If one of the strings is shorter, add the remaining characters to the RichTextBox with a blue color
                    if (i < input1.Length)
                    {
                        HuntrichTextBox.SelectionStart = HuntrichTextBox.TextLength;
                        HuntrichTextBox.SelectionLength = 1;
                        HuntrichTextBox.SelectionColor = Color.Blue;
                        HuntrichTextBox.AppendText(input1[i].ToString());
                        HuntrichTextBox.SelectionColor = HuntrichTextBox.ForeColor;
                    }
                    if (i < input2.Length)
                    {
                        HuntrichTextBox.SelectionStart = HuntrichTextBox.TextLength;
                        HuntrichTextBox.SelectionLength = 1;
                        HuntrichTextBox.SelectionColor = Color.Blue;
                        HuntrichTextBox.AppendText(input2[i].ToString());
                        HuntrichTextBox.SelectionColor = HuntrichTextBox.ForeColor;
                    }
                    HuntrichTextBox.AppendText("-" + "\n");
                }
            }
        }

        private void HuntRandom1_Click(object sender, EventArgs e)
        {
            int length = 30;

            // Initialize an array of the possible DNA nucleotides
            char[] nucleotides = { 'A', 'C', 'G', 'T' };

            // Generate the random DNA sequence
            string dna = "";
            Random rand = new Random();
            for (int i = 0; i < length; i++)
            {
                dna += nucleotides[rand.Next(4)];
            }

            // Display the DNA sequence in the text box
            HunttextBox1.Text = dna;
        }

        private void HuntRandom2_Click(object sender, EventArgs e)
        {
            int length = 20;

            // Initialize an array of the possible DNA nucleotides
            char[] nucleotides = { 'A', 'C', 'G', 'T' };

            // Generate the random DNA sequence
            string dna = "";
            Random rand = new Random();
            for (int i = 0; i < length; i++)
            {
                dna += nucleotides[rand.Next(4)];
            }

            // Display the DNA sequence in the text box
            HunttextBox2.Text = dna;
        }
    }
}
