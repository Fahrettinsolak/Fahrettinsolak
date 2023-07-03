using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement.Rebar;
using static ce205_hw4_gui.AVLTree;



namespace ce205_hw4_gui
{
    public partial class Form1 : Form
    {

        readonly AVLTree tree;
        RedBlackTree avl;
        Brush temp;
        public Form1()
        {
            InitializeComponent();
            this.Text = "AVL Visualization";
            tree = new AVLTree(this);
            ///* Constructing tree given in the above figure */
            //tree.root = tree.InsertHelper(tree.root, 9);
            //tree.root = tree.InsertHelper(tree.root, 5);
            //tree.root = tree.InsertHelper(tree.root, 10);
            //tree.root = tree.InsertHelper(tree.root, 0);
            //tree.root = tree.InsertHelper(tree.root, 6);
            //tree.root = tree.InsertHelper(tree.root, 11);
            //tree.root = tree.InsertHelper(tree.root, -1);
            //tree.root = tree.InsertHelper(tree.root, 1);
            tree.preOrder(tree.root);
            foreach (var item in tree.Circle)
            {
                Console.WriteLine("X : " + item.Value.x + " Y: " + item.Value.y);
            }
            avl = new RedBlackTree(this);
            temp = new SolidBrush(Color.White);
            pictureBox1.Width = this.Width;
        }

        private void pictureBox1_Paint(object sender, PaintEventArgs e)
        {
            foreach (var item in tree.Line.Values)
            {
                e.Graphics.DrawLine(new Pen(Color.Black), item.x1, item.y1, item.x2, item.y2);
            }
            foreach (var item in tree.Circle.Values)
            {
                e.Graphics.FillEllipse(item.brush, item.x, item.y, 150, 50);
                e.Graphics.DrawString(item.value, new Font("times new roman", 16), new SolidBrush(Color.White), new Point(item.x + 8, item.y + 10));
                //e.Graphics.DrawString(item.balanceFactor.ToString(), new Font("Arial", 16), new SolidBrush(Color.Black), new Point(item.x + 38, item.y + 10));
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            tree.root = tree.InsertHelper(tree.root, Convert.ToString(textBox1.Text));
            tree.inOrderHelper();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            tree.root = tree.deleteNode(tree.root, Convert.ToString(textBox1.Text));
            tree.inOrderHelper();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            tree.find(Convert.ToString(textBox1.Text));
        }

        private void button4_Click(object sender, EventArgs e)
        {
            tree.inOrder(tree.root);
            MessageBox.Show("Order : " + tree.inOrderResult);
            tree.inOrderResult = "";
            tree.inOrderHelper();
        }

        private void button5_Click(object sender, EventArgs e)
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

            textBox1.Text = ssizes[randomNumber].ToString();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            avl.insertion(ref avl.root, Convert.ToString(textBox2.Text), 500, 50);
            textBox2.Text = "";
        }

        private void button7_Click(object sender, EventArgs e)
        {
            avl.delete(ref avl.root, Convert.ToString(textBox2.Text));
        }

        private void button8_Click(object sender, EventArgs e)
        {
            avl.search(ref avl.root, Convert.ToString(textBox2.Text));
        }

        private void button10_Click(object sender, EventArgs e)
        {
            Random rnm = new Random();
            int rdm = rnm.Next(0, 150);
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

            textBox2.Text = ssizes[rdm].ToString();
        }

        private void pictureBox2_Paint(object sender, PaintEventArgs e)
        {
            foreach (RBline x in avl.line)
            {
                Pen p = new Pen(x.warna);
                e.Graphics.DrawLine(p, x.x1, x.y1, x.x2, x.y2);
            }
            foreach (var item in avl.circle)
            {
                e.Graphics.FillEllipse(item.brush, item.x, item.y, 100, 30);
                e.Graphics.DrawString(item.value, new Font("Arial", 14), temp, new Point(item.x, item.y + 5));
            }
        }
    }
}
