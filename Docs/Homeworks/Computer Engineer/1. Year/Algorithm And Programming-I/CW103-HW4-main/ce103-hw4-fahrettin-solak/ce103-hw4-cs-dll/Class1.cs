using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

using System.Threading.Tasks;



namespace ce103_hw4_cs_dll
    {
        public class ce103func
        {
            public int ce103_fibonacciNumber_cs(int fiIndex)
            {
                //declared variables
                int x = 0, y = 1, z = 1;

                //every loop increase i until to arrive fiIndex
                for (int i = 1; i <= fiIndex; i++)
                {
                    //Fibonacci array creation function
                    z = x + y;
                    x = y;
                    y = z;

                }

                return z;
            }


            public string ce103_strrev_cs(string fistr)
            {
                // Reverse using While loop  
                string reval = "";
                int kane;

                kane = fistr.Length - 1;

                /*swapping fiStr[i] and fiStr[j] until i<j
                then fiStr array inverts the word
                reduce x and increase y if x equal to zero 
                and y equal to n-1 and x less than y */
                while (kane >= 0)
                {
                    reval = reval + fistr[kane];
                    kane--;
                }
                return reval;

            }

            public int ce103_strlen_cs(string fiStr)
            {
                string temperaturer = fiStr + '\0';
                char[] leer = temperaturer.ToCharArray();
                int lenge = 0;
                while (leer[lenge] != '\0') lenge++;
                lenge--;
                return lenge + 1;

            }

            public string ce103_strcat_cs(string fiDest, string fiSrc)
            {
                string str = string.Empty;
                int c, d, c1, d1;
                c1 = fiDest.Length;
                d1 = fiSrc.Length;
                /*When the char that t points to is '\0',
                the while loop will terminate.Until then,
                it will copy the char that t is pointing to to the char that s is pointing to,
                then increment sand t to point to the next char in their arrays.            */
                for (c = 0; c < c1; c++)
                {
                    str = str + fiDest[c];
                }
                for (d = 0; d < d1; d++)
                {
                    str = str + fiSrc[d];
                }
                return str;
            }
            public int ce103_strcmp_cs(string fiLhs, string fiRhs)
            {
                int c = 0, e = 0;

                /*negative value if Lhs appears before Rhs in lexicographical order
                zero if Lhs and Rhs compare equal
                positive value if Lhs appears after Rhs in lexicofraphical order  */
                for (int i = 0; i < (fiLhs.Length > fiRhs.Length ? fiLhs.Length : fiRhs.Length); i++)
                {
                    c += (i >= fiLhs.Length ? 0 : fiLhs[i]) - (i >= fiRhs.Length ? 0 : fiRhs[i]);
                    if (e < 0)
                    {
                        if (c < 0)
                            e += c;
                        if (c > 0)
                            c += -c;
                    }
                    else
                    {
                        e += c;
                    }
                }
                return e;
            }

            public string ce103_strcpy_cs(string fodest, string fisrc)
            {
                // declare and initialize destination array
                char[] dest = new char[fisrc.Length];

                // convert source string to char array
                char[] srcAa = fisrc.ToCharArray();

                // copy string to other
                for (int i = 0; i < fisrc.Length; i++)
                {
                    dest[i] = srcAa[i];
                }

                // transfer string to temp string
                string temp = new string(dest);

                // change foDestination string
                fodest = temp;

                return fodest;
            }

            public void ce103_hex2bin_cs(string fiHex, int fiHexLen, byte[] foBin)
            {


                int[] d = { 0, 0 };  // count array for storing ascii and hex value of selected element 
                for (int i = 0; i < fiHexLen; i += 2)
                {  // array for assigning foBin elements
                    char[] tema = new char[2];  // store two character from fiHex func
                    int hexen = 0;  // hexint stores sum of two ascii values generated from hex base
                    for (int l = 0; l < 2; l++)
                    {  // for loop for calculating sum of ascii values
                        tema[l] = (char)fiHex[i + l];  // assigning first fiHex element to temp
                        if (l == 0)
                        {  // if k == 0 meaning first element of temp
                           // if and else if code snippet is taken from below website and fixed

                            if (tema[l] >= '0' && tema[l] <= '9')
                            {  // bounds
                                d[l] = tema[l] - '0';  // find int value of nibble
                                d[l] *= 16;  // multiply by 16 because of 16^1*hex digit
                            }
                            else if (tema[l] >= 'A' && tema[l] <= 'F')
                            {  // bounds
                                d[l] = tema[l] - 'A' + 10;  // take difference between temp and 'A' then plus 10
                                d[l] *= 16;
                            }
                        }
                        else
                        {  // means 1
                            if (tema[l] >= '0' && tema[l] <= '9')
                            {
                                d[l] = tema[l] - '0';  // we're not multiplying by 16 because it's 16^0 digit
                            }
                            else if (tema[l] >= 'A' && tema[l] <= 'F')
                            {
                                d[l] = tema[l] - 'A' + 10;
                            }
                        }
                        hexen += d[l];  // get two digit value's sum and assign it to hexint
                    }
                    foBin[i / 2] = (byte)hexen;  // assigning summed values to foBin
                }
            }


            public void ce103_bin2hex_cs(byte[] fiBin, int fiBinLen, char[] foHex)

            {

                char[] arklaa = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
                // below code snippet is taken from
                // basically this for loop gets hex number's right or left nibble and finds which character is this
                int a;
                for (a = 0; a < fiBinLen; a++)
                {
                    foHex[a * 2] = arklaa[fiBin[a] >> 4];  // it means divide by 16. arr[fiBin[i] / 16] is true also
                    foHex[a * 2 + 1] = arklaa[fiBin[a] & 0x0F];  // if i = 0 then fiBin[0] & 0x0f Note: fiBin[0] = 0x13
                }                                             // 0001 0011 & 0000 1111 = 3 basically it means
                                                              // get hexnumber's second 
            }
        }
    }




