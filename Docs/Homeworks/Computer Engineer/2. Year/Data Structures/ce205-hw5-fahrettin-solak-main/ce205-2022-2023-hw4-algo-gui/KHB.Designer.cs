namespace ce205_2022_2023_hw4_fahrettin_solak
{
    partial class KHB
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
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.tabPage1 = new System.Windows.Forms.TabPage();
            this.KnuthrichTextBox = new System.Windows.Forms.RichTextBox();
            this.SearchKunth = new System.Windows.Forms.Button();
            this.KnuthtextBox = new System.Windows.Forms.TextBox();
            this.tabPage2 = new System.Windows.Forms.TabPage();
            this.HorspoolrichTextBox = new System.Windows.Forms.RichTextBox();
            this.SearchHorspool = new System.Windows.Forms.Button();
            this.HorspooltextBox = new System.Windows.Forms.TextBox();
            this.tabPage3 = new System.Windows.Forms.TabPage();
            this.BoyerrichTextBox = new System.Windows.Forms.RichTextBox();
            this.SearchBoyer = new System.Windows.Forms.Button();
            this.BoyertextBox = new System.Windows.Forms.TextBox();
            this.tabControl1.SuspendLayout();
            this.tabPage1.SuspendLayout();
            this.tabPage2.SuspendLayout();
            this.tabPage3.SuspendLayout();
            this.SuspendLayout();
            // 
            // tabControl1
            // 
            this.tabControl1.Controls.Add(this.tabPage1);
            this.tabControl1.Controls.Add(this.tabPage2);
            this.tabControl1.Controls.Add(this.tabPage3);
            this.tabControl1.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.tabControl1.Location = new System.Drawing.Point(2, 0);
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(545, 438);
            this.tabControl1.TabIndex = 0;
            // 
            // tabPage1
            // 
            this.tabPage1.Controls.Add(this.KnuthrichTextBox);
            this.tabPage1.Controls.Add(this.SearchKunth);
            this.tabPage1.Controls.Add(this.KnuthtextBox);
            this.tabPage1.Location = new System.Drawing.Point(4, 24);
            this.tabPage1.Name = "tabPage1";
            this.tabPage1.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage1.Size = new System.Drawing.Size(537, 410);
            this.tabPage1.TabIndex = 0;
            this.tabPage1.Text = "Knuth-Morris-Pratt";
            this.tabPage1.UseVisualStyleBackColor = true;
            // 
            // KnuthrichTextBox
            // 
            this.KnuthrichTextBox.Location = new System.Drawing.Point(8, 42);
            this.KnuthrichTextBox.Name = "KnuthrichTextBox";
            this.KnuthrichTextBox.Size = new System.Drawing.Size(521, 362);
            this.KnuthrichTextBox.TabIndex = 2;
            this.KnuthrichTextBox.Text = "";
            // 
            // SearchKunth
            // 
            this.SearchKunth.Location = new System.Drawing.Point(8, 6);
            this.SearchKunth.Name = "SearchKunth";
            this.SearchKunth.Size = new System.Drawing.Size(160, 30);
            this.SearchKunth.TabIndex = 1;
            this.SearchKunth.Text = "Search";
            this.SearchKunth.UseVisualStyleBackColor = true;
            this.SearchKunth.Click += new System.EventHandler(this.SearchKunth_Click);
            // 
            // KnuthtextBox
            // 
            this.KnuthtextBox.Location = new System.Drawing.Point(174, 6);
            this.KnuthtextBox.Multiline = true;
            this.KnuthtextBox.Name = "KnuthtextBox";
            this.KnuthtextBox.Size = new System.Drawing.Size(355, 30);
            this.KnuthtextBox.TabIndex = 0;
            // 
            // tabPage2
            // 
            this.tabPage2.Controls.Add(this.HorspoolrichTextBox);
            this.tabPage2.Controls.Add(this.SearchHorspool);
            this.tabPage2.Controls.Add(this.HorspooltextBox);
            this.tabPage2.Location = new System.Drawing.Point(4, 24);
            this.tabPage2.Name = "tabPage2";
            this.tabPage2.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage2.Size = new System.Drawing.Size(537, 410);
            this.tabPage2.TabIndex = 1;
            this.tabPage2.Text = "Horspool";
            this.tabPage2.UseVisualStyleBackColor = true;
            // 
            // HorspoolrichTextBox
            // 
            this.HorspoolrichTextBox.Location = new System.Drawing.Point(8, 42);
            this.HorspoolrichTextBox.Name = "HorspoolrichTextBox";
            this.HorspoolrichTextBox.Size = new System.Drawing.Size(521, 362);
            this.HorspoolrichTextBox.TabIndex = 5;
            this.HorspoolrichTextBox.Text = "";
            // 
            // SearchHorspool
            // 
            this.SearchHorspool.Location = new System.Drawing.Point(8, 6);
            this.SearchHorspool.Name = "SearchHorspool";
            this.SearchHorspool.Size = new System.Drawing.Size(160, 30);
            this.SearchHorspool.TabIndex = 4;
            this.SearchHorspool.Text = "Search";
            this.SearchHorspool.UseVisualStyleBackColor = true;
            this.SearchHorspool.Click += new System.EventHandler(this.SearchHorspool_Click);
            // 
            // HorspooltextBox
            // 
            this.HorspooltextBox.Location = new System.Drawing.Point(174, 6);
            this.HorspooltextBox.Multiline = true;
            this.HorspooltextBox.Name = "HorspooltextBox";
            this.HorspooltextBox.Size = new System.Drawing.Size(355, 30);
            this.HorspooltextBox.TabIndex = 3;
            // 
            // tabPage3
            // 
            this.tabPage3.Controls.Add(this.BoyerrichTextBox);
            this.tabPage3.Controls.Add(this.SearchBoyer);
            this.tabPage3.Controls.Add(this.BoyertextBox);
            this.tabPage3.Location = new System.Drawing.Point(4, 24);
            this.tabPage3.Name = "tabPage3";
            this.tabPage3.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage3.Size = new System.Drawing.Size(537, 410);
            this.tabPage3.TabIndex = 2;
            this.tabPage3.Text = "Boyer-Moore";
            this.tabPage3.UseVisualStyleBackColor = true;
            // 
            // BoyerrichTextBox
            // 
            this.BoyerrichTextBox.Location = new System.Drawing.Point(8, 42);
            this.BoyerrichTextBox.Name = "BoyerrichTextBox";
            this.BoyerrichTextBox.Size = new System.Drawing.Size(521, 362);
            this.BoyerrichTextBox.TabIndex = 5;
            this.BoyerrichTextBox.Text = "";
            // 
            // SearchBoyer
            // 
            this.SearchBoyer.Location = new System.Drawing.Point(8, 6);
            this.SearchBoyer.Name = "SearchBoyer";
            this.SearchBoyer.Size = new System.Drawing.Size(160, 30);
            this.SearchBoyer.TabIndex = 4;
            this.SearchBoyer.Text = "Search";
            this.SearchBoyer.UseVisualStyleBackColor = true;
            this.SearchBoyer.Click += new System.EventHandler(this.SearchBoyer_Click);
            // 
            // BoyertextBox
            // 
            this.BoyertextBox.Location = new System.Drawing.Point(174, 6);
            this.BoyertextBox.Multiline = true;
            this.BoyertextBox.Name = "BoyertextBox";
            this.BoyertextBox.Size = new System.Drawing.Size(355, 30);
            this.BoyertextBox.TabIndex = 3;
            // 
            // KHB
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(549, 443);
            this.Controls.Add(this.tabControl1);
            this.Name = "KHB";
            this.Text = "KHB";
            this.tabControl1.ResumeLayout(false);
            this.tabPage1.ResumeLayout(false);
            this.tabPage1.PerformLayout();
            this.tabPage2.ResumeLayout(false);
            this.tabPage2.PerformLayout();
            this.tabPage3.ResumeLayout(false);
            this.tabPage3.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TabControl tabControl1;
        private System.Windows.Forms.TabPage tabPage1;
        private System.Windows.Forms.TabPage tabPage2;
        private System.Windows.Forms.TabPage tabPage3;
        private System.Windows.Forms.TextBox KnuthtextBox;
        private System.Windows.Forms.RichTextBox KnuthrichTextBox;
        private System.Windows.Forms.Button SearchKunth;
        private System.Windows.Forms.RichTextBox HorspoolrichTextBox;
        private System.Windows.Forms.Button SearchHorspool;
        private System.Windows.Forms.TextBox HorspooltextBox;
        private System.Windows.Forms.RichTextBox BoyerrichTextBox;
        private System.Windows.Forms.Button SearchBoyer;
        private System.Windows.Forms.TextBox BoyertextBox;
    }
}