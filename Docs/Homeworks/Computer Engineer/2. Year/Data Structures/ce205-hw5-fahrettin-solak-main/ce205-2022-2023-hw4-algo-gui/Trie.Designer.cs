namespace ce205_2022_2023_hw4_fahrettin_solak
{
    partial class Trie
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.TrieRandom = new System.Windows.Forms.Button();
            this.InsertTrie = new System.Windows.Forms.Button();
            this.SearchTrie = new System.Windows.Forms.Button();
            this.TrietextBox1 = new System.Windows.Forms.TextBox();
            this.TrietextBox2 = new System.Windows.Forms.TextBox();
            this.TrierichTextBox1 = new System.Windows.Forms.RichTextBox();
            this.TrierichTextBox2 = new System.Windows.Forms.RichTextBox();
            this.SuspendLayout();
            // 
            // TrieRandom
            // 
            this.TrieRandom.Location = new System.Drawing.Point(31, 12);
            this.TrieRandom.Name = "TrieRandom";
            this.TrieRandom.Size = new System.Drawing.Size(112, 46);
            this.TrieRandom.TabIndex = 0;
            this.TrieRandom.Text = "Random";
            this.TrieRandom.UseVisualStyleBackColor = true;
            this.TrieRandom.Click += new System.EventHandler(this.TrieRandom_Click);
            // 
            // InsertTrie
            // 
            this.InsertTrie.Location = new System.Drawing.Point(148, 12);
            this.InsertTrie.Name = "InsertTrie";
            this.InsertTrie.Size = new System.Drawing.Size(112, 46);
            this.InsertTrie.TabIndex = 1;
            this.InsertTrie.Text = "Insert";
            this.InsertTrie.UseVisualStyleBackColor = true;
            this.InsertTrie.Click += new System.EventHandler(this.InsertTrie_Click);
            // 
            // SearchTrie
            // 
            this.SearchTrie.Location = new System.Drawing.Point(285, 12);
            this.SearchTrie.Name = "SearchTrie";
            this.SearchTrie.Size = new System.Drawing.Size(230, 46);
            this.SearchTrie.TabIndex = 2;
            this.SearchTrie.Text = "Search";
            this.SearchTrie.UseVisualStyleBackColor = true;
            this.SearchTrie.Click += new System.EventHandler(this.SearchTrie_Click);
            // 
            // TrietextBox1
            // 
            this.TrietextBox1.Location = new System.Drawing.Point(30, 64);
            this.TrietextBox1.Multiline = true;
            this.TrietextBox1.Name = "TrietextBox1";
            this.TrietextBox1.Size = new System.Drawing.Size(230, 30);
            this.TrietextBox1.TabIndex = 3;
            // 
            // TrietextBox2
            // 
            this.TrietextBox2.Location = new System.Drawing.Point(285, 64);
            this.TrietextBox2.Multiline = true;
            this.TrietextBox2.Name = "TrietextBox2";
            this.TrietextBox2.Size = new System.Drawing.Size(230, 30);
            this.TrietextBox2.TabIndex = 4;
            // 
            // TrierichTextBox1
            // 
            this.TrierichTextBox1.Location = new System.Drawing.Point(31, 100);
            this.TrierichTextBox1.Name = "TrierichTextBox1";
            this.TrierichTextBox1.Size = new System.Drawing.Size(229, 334);
            this.TrierichTextBox1.TabIndex = 5;
            this.TrierichTextBox1.Text = "";
            // 
            // TrierichTextBox2
            // 
            this.TrierichTextBox2.Location = new System.Drawing.Point(285, 100);
            this.TrierichTextBox2.Name = "TrierichTextBox2";
            this.TrierichTextBox2.Size = new System.Drawing.Size(230, 334);
            this.TrierichTextBox2.TabIndex = 6;
            this.TrierichTextBox2.Text = "";
            // 
            // Trie
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 14F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(549, 443);
            this.Controls.Add(this.TrierichTextBox2);
            this.Controls.Add(this.TrierichTextBox1);
            this.Controls.Add(this.TrietextBox2);
            this.Controls.Add(this.TrietextBox1);
            this.Controls.Add(this.SearchTrie);
            this.Controls.Add(this.InsertTrie);
            this.Controls.Add(this.TrieRandom);
            this.Font = new System.Drawing.Font("Consolas", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.Name = "Trie";
            this.Text = "Trie";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button TrieRandom;
        private System.Windows.Forms.Button InsertTrie;
        private System.Windows.Forms.Button SearchTrie;
        private System.Windows.Forms.TextBox TrietextBox1;
        private System.Windows.Forms.TextBox TrietextBox2;
        private System.Windows.Forms.RichTextBox TrierichTextBox1;
        private System.Windows.Forms.RichTextBox TrierichTextBox2;
    }
}