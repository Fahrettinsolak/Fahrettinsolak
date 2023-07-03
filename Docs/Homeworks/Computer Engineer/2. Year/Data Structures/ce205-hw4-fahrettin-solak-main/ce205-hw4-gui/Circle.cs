using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ce205_hw4_gui
{
    public class Circle
    {
        public int x;
        public int y;
        public string value;
        public Brush brush;
        public Circle(int x, int y, string value)
        {
            this.x = x;
            this.y = y;
            this.value = value;
            brush = new SolidBrush(Color.Black);
        }
    }
    public class RBCircle
    {
        public int x;
        public int y;
        public string value;
        public Brush brush;
        public RBCircle(int x, int y, string value, Color c)
        {
            this.x = x;
            this.y = y;
            this.value = value;
            brush = new SolidBrush(c);
        }
    }
}
