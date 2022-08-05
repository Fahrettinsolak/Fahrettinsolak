using Microsoft.VisualStudio.TestTools.UnitTesting;
using ce103_hw4_cs_dll;
using System.Text;

namespace ce103_hw4_test
{
    [TestClass]
    public class ce103_hw4_test : ce103_hw4_testBase
    {
        [TestMethod]
        public void ce103_fibonacciNumber_cs_test1()
        {
            ce103func result = new ce103func();
            int resume = result.ce103_fibonacciNumber_cs(2);

            Assert.AreEqual(resume, 2);
        }

        [TestMethod]
        public void ce103_fibonacciNumber_cs_test2()
        {
            ce103func result = new ce103func();
            int resume = result.ce103_fibonacciNumber_cs(23);

            Assert.AreEqual(resume, 46368);
        }

        [TestMethod]
        public void ce103_fibonacciNumber_cs_test3()
        {
            ce103func result = new ce103func();
            int resume = result.ce103_fibonacciNumber_cs(25);

            Assert.AreEqual(resume, 121393);
        }

        [TestMethod]
        public void ce103_fibonacciNumber_cs_cs_test1()
        {
            ce103CsFunctions result = new ce103CsFunctions();
            int resume = result.ce103_fibonacciNumber_cs_cs(35);

            Assert.AreEqual(resume, 9227465);
        }

        [TestMethod]
        public void ce103_fibonacciNumber_cs_cs_test2()
        {
            ce103CsFunctions result = new ce103CsFunctions();
            int resume = result.ce103_fibonacciNumber_cs_cs(41);

            Assert.AreEqual(resume, 165580141);
        }

        [TestMethod]
        public void ce103_fibonacciNumber_cs_cs_test3()
        {
            ce103CsFunctions result = new ce103CsFunctions();
            int resume = result.ce103_fibonacciNumber_cs_cs(39);

            Assert.AreEqual(resume, 63245986);
        }

        [TestMethod]
        public void ce103_fibonacciNumber_cs_vs_cscs_test1()
        {
            ce103CsFunctions cscsdegere = new ce103CsFunctions();
            ce103func csdegere = new ce103func();
            int cse = csdegere.ce103_fibonacciNumber_cs(21);
            int cscse = cscsdegere.ce103_fibonacciNumber_cs_cs(22);

            Assert.AreEqual(cse, cscse);
        }

        [TestMethod]
        public void ce103_fibonacciNumber_cs_vs_cscs_test2()
        {
            ce103CsFunctions cscsdegere = new ce103CsFunctions();
            ce103func csdegere = new ce103func();
            int cse = csdegere.ce103_fibonacciNumber_cs(22);
            int cscse = cscsdegere.ce103_fibonacciNumber_cs_cs(23);

            Assert.AreEqual(cse, cscse);
        }

        [TestMethod]
        public void ce103_fibonacciNumber_cs_vs_cscs_test3()
        {
            ce103CsFunctions cscsdegere = new ce103CsFunctions();
            ce103func csdegere = new ce103func();
            int cse = csdegere.ce103_fibonacciNumber_cs(33);
            int cscse = cscsdegere.ce103_fibonacciNumber_cs_cs(34);

            Assert.AreEqual(cse, cscse);
        }

        [TestMethod]
        public void ce103_strrev_cs_test1()
        {

            ce103func reverse = new ce103func();

            string original = "HelloWorld";
            string reval = "HelloClass";

            Assert.AreEqual(reverse.ce103_strrev_cs(original), reval);

        }


        [TestMethod]
        public void ce103_strrev_cs_test2()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103func revrsee = new ce103func();

            string original = "Fahrettin";
            string revee = "Solak";

            Assert.AreEqual(revrsee.ce103_strrev_cs(original), revee);
        }

        [TestMethod]
        public void ce103_strrev_cs_test3()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103func revrsee = new ce103func();

            string original = "Taze";
            string revee = "Balık";

            Assert.AreEqual(revrsee.ce103_strrev_cs(original), revee);
        }

        [TestMethod]
        public void ce103_strrev_cs_cs_test1()
        {
            ce103CsFunctions revrsee = new ce103CsFunctions();
            string original = "Flowers";
            string revee = "Flowers";
            Assert.AreEqual(revrsee.ce103_strrev_cs_cs(original), revee);
        }

        [TestMethod]
        public void ce103_strrev_cs_cs_test2()
        {
            ce103CsFunctions revrsee = new ce103CsFunctions();
            string original = "Computer";
            string revee = "Engineering";
            Assert.AreEqual(revrsee.ce103_strrev_cs_cs(original), revee);
        }

        [TestMethod]
        public void ce103_strrev_cs_cs_test3()
        {
            ce103CsFunctions revrsee = new ce103CsFunctions();
            string original = "Book";
            string revee = "Table";
            Assert.AreEqual(revrsee.ce103_strrev_cs_cs(original), revee);
        }

        [TestMethod]
        public void ce103_strrev_cs_vs_cscs_test1()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103func revee = new ce103func();
            ce103CsFunctions revee1 = new ce103CsFunctions();
            string original = "Codes";

            Assert.AreEqual(revee.ce103_strrev_cs(original), revee1.ce103_strrev_cs_cs(original));
        }

        [TestMethod]
        public void ce103_strrev_cs_vs_cscs_test2()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103func revee = new ce103func();
            ce103CsFunctions revee1 = new ce103CsFunctions();
            string original = "Google";

            Assert.AreEqual(revee.ce103_strrev_cs(original), revee1.ce103_strrev_cs_cs(original));
        }

        [TestMethod]
        public void ce103_strlen_cs_test1()
        {
            ce103func strl = new ce103func();
            string str = "Police";

            int result = strl.ce103_strlen_cs(str);
            Assert.AreEqual(result, 8);
        }

        [TestMethod]
        public void ce103_strlen_cs_test2()
        {
            ce103func strl = new ce103func();
            string str = "Classroom";

            int result = strl.ce103_strlen_cs(str);
            Assert.AreEqual(result, 10);
        }

        [TestMethod]
        public void ce103_strlen_cs_test3()
        {
            ce103func strl = new ce103func();
            string str = "Visiual";

            int result = strl.ce103_strlen_cs(str);
            Assert.AreEqual(result, 7);
        }

        [TestMethod]
        public void ce103_strlen_cs_cs_test1()
        {
            ce103CsFunctions strl = new ce103CsFunctions();
            string str = "Stop";

            int result = strl.ce103_strlen_cs_cs(str);
            Assert.AreEqual(result, 4);
        }

        [TestMethod]
        public void ce103_strlen_cs_cs_test2()
        {
            ce103CsFunctions strl = new ce103CsFunctions();
            string str = "Kym";

            int result= strl.ce103_strlen_cs_cs(str);
            Assert.AreEqual(result, 3);
        }

        [TestMethod]
        public void ce103_strlen_cs_cs_test3()
        {
            ce103CsFunctions strl = new ce103CsFunctions();
            string str = "Instagram";

            int result = strl.ce103_strlen_cs_cs(str);
            Assert.AreEqual(result, 8);
        }

        [TestMethod]
        public void ce103_strlen_cs_vs_cscs_test1()
        {
            ce103CsFunctions cscsstrlen = new ce103CsFunctions();
            ce103func csstrlen = new ce103func();
            string str = "Computer";

            int cscs = cscsstrlen.ce103_strlen_cs_cs(str);
            int cs = csstrlen.ce103_strlen_cs(str);

            Assert.AreEqual(cs, cscs);
        }

        [TestMethod]
        public void ce103_strlen_cs_vs_cscs_test2()
        {
            ce103CsFunctions cscsstr = new ce103CsFunctions();
            ce103func csstr = new ce103func();
            string str = "Maker";

            int cscs = cscsstr.ce103_strlen_cs_cs(str);
            int cs = csstr.ce103_strlen_cs(str);

            Assert.AreEqual(cs, cscs);
        }

        [TestMethod]
        public void ce103_strlen_cs_vs_cscs_test3()
        {
            ce103CsFunctions cscsstr = new ce103CsFunctions();
            ce103func csstr = new ce103func();
            string str = "Linux";

            int cscs = cscsstr.ce103_strlen_cs_cs(str);
            int cs = csstr.ce103_strlen_cs(str);

            Assert.AreEqual(cs, cscs);
        }

        [TestMethod]
        public void ce103_strcat_cs_test1()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103func rev = new ce103func();
            string str = "Good";
            string streq = "Nice";

            string result = "GoodNice";

            Assert.AreEqual(rev.ce103_strcat_cs(str, streq), result);
        }

        [TestMethod]
        public void ce103_strcat_cs_test2()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103func rev = new ce103func();
            string str = "Galata";
            string streq = "Tower";

            string result = "GalataTower";

            Assert.AreEqual(rev.ce103_strcat_cs(str, streq), result);
        }

        [TestMethod]
        public void ce103_strcat_cs_test3()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103func rev = new ce103func();
            string str = "Mouse";
            string streq = "Pad";

            string result= "MousePad";

            Assert.AreEqual(rev.ce103_strcat_cs(str, streq), result);
        }

        [TestMethod]
        public void ce103_strcat_cs_cs_test2()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103CsFunctions rev = new ce103CsFunctions();
            string str = "Hello";
            string strez = "Fahrettin";

            string result = "HelloFahrettin";

            Assert.AreEqual(rev.ce103_strcat_cs_cs(str, strez), result);
        }

        [TestMethod]
        public void ce103_strcat_cs_cs_test3()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103CsFunctions rev = new ce103CsFunctions();
            string str = "Good";
            string strez = "Night";

            string result = "GoodNigth";

            Assert.AreEqual(rev.ce103_strcat_cs_cs(str, strez), result);
        }

        [TestMethod]
        public void ce103_strcat_cs_vs_cscs_test1()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103func rev = new ce103func();
            ce103CsFunctions revez = new ce103CsFunctions();
            string str = "Good";
            string strez = "Morning";

            Assert.AreEqual(rev.ce103_strcat_cs(str, strez), revez.ce103_strcat_cs_cs(str, strez));
        }

        [TestMethod]
        public void ce103_strcat_cs_vs_cscs_test2()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103func rev = new ce103func();
            ce103CsFunctions revez = new ce103CsFunctions();
            string str = "Epic";
            string strez = "Gog";

            Assert.AreEqual(rev.ce103_strcat_cs(str, strez), revez.ce103_strcat_cs_cs(str, strez));
        }

        [TestMethod]
        public void ce103_strcat_cs_vs_cscs_test3()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103func rev = new ce103func();
            ce103CsFunctions revez = new ce103CsFunctions();
            string str = "Max";
            string strez = "Windows";

            Assert.AreEqual(rev.ce103_strcat_cs(str, strez), revez.ce103_strcat_cs_cs(str, strez));
        }

        [TestMethod]
        public void ce103_strcmp_cs_test1()
        {
            ce103func strcmpezz = new ce103func();
            const string strezz = "Hello";
            const string strezz1 = "Hello";
            Assert.AreEqual(strcmpezz.ce103_strcmp_cs(strezz, strezz1), 0);
        }

        [TestMethod]
        public void ce103_strcmp_cs_test2()
        {
            ce103func strcmzz = new ce103func();
            const string strezz = "Night";
            const string strezz1 = "Night";
            Assert.AreNotEqual(strcmzz.ce103_strcmp_cs(strezz, strezz1), 0);
        }

        [TestMethod]
        public void ce103_strcmp_cs_test3()
        {
            ce103func strcmzz = new ce103func();
            const string strezz = "Good";
            const string strezz1 = "Good";
            Assert.AreEqual(strcmzz.ce103_strcmp_cs(strezz, strezz1), 0);
        }

        [TestMethod]
        public void ce103_strcmp_cs_cs_test1()
        {
            ce103CsFunctions strcmpezz = new ce103CsFunctions();
            const string strezz = "Twitter";
            const string strezz1 = "Twitter";
            Assert.AreEqual(strcmpezz.ce103_strcmp_cs_cs(strezz, strezz1), 0);
        }

        [TestMethod]
        public void ce103_strcmp_cs_cs_test2()
        {
            ce103CsFunctions strcmzz = new ce103CsFunctions();
            const string strezz = "Ugly";
            const string strezz1 = "Ugly";
            Assert.AreEqual(strcmzz.ce103_strcmp_cs_cs(strezz, strezz1), 0);
        }

        [TestMethod]
        public void ce103_strcmp_cs_cs_test3()
        {
            ce103CsFunctions strcmzz = new ce103CsFunctions();
            const string strezz = "Facebook";
            const string strezz1 = "Instagram";
            Assert.AreNotEqual(strcmzz.ce103_strcmp_cs_cs(strezz, strezz1), 0);
        }

        [TestMethod]
        public void ce103_strcmp_cs_vs_cscs_test1()
        {
            ce103CsFunctions cscsstrcmzz = new ce103CsFunctions();
            ce103func csstrcmzz = new ce103func();
            const string strezz1 = "Money";
            const string strezz2 = "Money";
            Assert.AreEqual(cscsstrcmzz.ce103_strcmp_cs_cs(strezz1, strezz2), csstrcmzz.ce103_strcmp_cs(strezz1, strezz2));
        }

        [TestMethod]
        public void ce103_strcmp_cs_vs_cscs_test2()
        {
            ce103CsFunctions cscsstrzz = new ce103CsFunctions();
            ce103func csstrzz = new ce103func();
            const string strezz = "Silver";
            const string strezz1 = "Silver";
            Assert.AreEqual(cscsstrzz.ce103_strcmp_cs_cs(strezz, strezz1), csstrzz.ce103_strcmp_cs(strezz, strezz1));
        }

        [TestMethod]
        public void ce103_strcmp_cs_vs_cscs_test3()
        {
            ce103CsFunctions cscsszz = new ce103CsFunctions();
            ce103func csszz = new ce103func();
            const string strezz = "Your";
            const string strezz1 = "Your";
            Assert.AreEqual(cscsszz.ce103_strcmp_cs_cs(strezz, strezz1), csszz.ce103_strcmp_cs(strezz, strezz1));
        }

        [TestMethod]
        public void ce103_strcpy_cs_test1()
        {
            ce103func strcpzz = new ce103func();
            string strezz = "Hot";
            string strezz1 = "Dog";
            string expectedStrezz = "Dog";
            Assert.AreEqual(strcpzz.ce103_strcpy_cs(strezz, strezz1), expectedStrezz);
        }

        [TestMethod]
        public void ce103_strcpy_cs_test2()
        {
            ce103func strcpyezz = new ce103func();
            string strezz1 = "Change";
            string strezz2 = "Table";
            string expectedStrezz = "Table";
            Assert.AreEqual(strcpyezz.ce103_strcpy_cs(strezz1, strezz2), expectedStrezz);
        }

        [TestMethod]
        public void ce103_strcpy_cs_test3()
        {
            ce103func strcpyezz = new ce103func();
            string strezz1 = "Ship";
            string strezz2 = "Plane";
            string expectedStrezz = "Plane";
            Assert.AreEqual(strcpyezz.ce103_strcpy_cs(strezz1, strezz2), expectedStrezz);
        }

        [TestMethod]
        public void ce103_strcpy_cs_cs_test1()
        {
            ce103CsFunctions strcpyezz = new ce103CsFunctions();
            string strezz1 = "Red";
            string strezz2 = "Apple";
            string expectedStrezz = "Apple";
            Assert.AreEqual(strcpyezz.ce103_strcpy_cs_cs(strezz1, strezz2), expectedStrezz);
        }

        [TestMethod]
        public void ce103_strcpy_cs_cs_test2()
        {
            ce103CsFunctions strcpyezz = new ce103CsFunctions();
            string strezz1 = "Answer";
            string strezz2 = "Code";
            string expectedStrezz = "Code";
            Assert.AreEqual(strcpyezz.ce103_strcpy_cs_cs(strezz1, strezz2), expectedStrezz);
        }

        [TestMethod]
        public void ce103_strcpy_cs_cs_test3()
        {
            ce103CsFunctions strcpyezz = new ce103CsFunctions();
            string strezz1 = "Binary";
            string strezz2 = "System";
            string expectedStrezz = "System";
            Assert.AreEqual(strcpyezz.ce103_strcpy_cs_cs(strezz1, strezz2), expectedStrezz);
        }

        [TestMethod]
        public void ce103_strcpy_cs_vs_cscs_test1()
        {
            ce103CsFunctions strcpyezz = new ce103CsFunctions();
            ce103func strcpyezz2 = new ce103func();
            string strezz1 = "Nice";
            string strezz2 = "Jobs";
            Assert.AreEqual(strcpyezz.ce103_strcpy_cs_cs(strezz1, strezz2), strcpyezz2.ce103_strcpy_cs(strezz1, strezz2));
        }

        [TestMethod]
        public void ce103_strcpy_cs_vs_cscs_test2()
        {
            ce103CsFunctions strcpyezz = new ce103CsFunctions();
            ce103func strcpyezz2 = new ce103func();
            string strezz1 = "Fahrettin";
            string strezz2 = "Solak";
            Assert.AreEqual(strcpyezz.ce103_strcpy_cs_cs(strezz1, strezz2), strcpyezz2.ce103_strcpy_cs(strezz1, strezz2));
        }

        [TestMethod]
        public void ce103_strcpy_cs_vs_cscs_test3()
        {
            ce103CsFunctions strcpyezz = new ce103CsFunctions();
            ce103func strcpyezz2 = new ce103func();
            string strezz1 = "Fahrettin";
            string strezz2 = "Solak";
            Assert.AreEqual(strcpyezz.ce103_strcpy_cs_cs(strezz1, strezz2), strcpyezz2.ce103_strcpy_cs(strezz1, strezz2));
        }

        [TestMethod]
        public void ce103_hex2bin_cs_test1()
        {
            ce103func hex2binzz = new ce103func();
            string hexstringzz = "1818181818181818";
            byte[] expectedArr = { 0x18, 0x18, 0x18, 0x18, 0x18, 0x18, 0x18, 0x18 };
            byte[] hexArr = new byte[hexstringzz.Length / 2];
            hex2binzz.ce103_hex2bin_cs(hexstringzz, hexstringzz.Length, hexArr);

            // assert by sequence
            CollectionAssert.AreEqual(expectedArr, hexArr);
        }

        [TestMethod]
        public void ce103_hex2bin_cs_test2()
        {
            ce103func hex2binzz = new ce103func();
            string hexstringzz = "1111111111111111";
            byte[] expectedArrzz = { 0x11, 0x11, 0x11, 0x11, 0x11, 0x11, 0x11, 0x11 };
            byte[] hexArrzz = new byte[hexstringzz.Length / 2];
            hex2binzz.ce103_hex2bin_cs(hexstringzz, hexstringzz.Length, hexArrzz);

            // assert by sequence
            CollectionAssert.AreEqual(expectedArrzz, hexArrzz);
        }

        [TestMethod]
        public void ce103_hex2bin_cs_test3()
        {
            ce103func hex2binzz = new ce103func();
            string hexstringzz = "FAFAFAFAFAFAFAFA";
            byte[] expectedArrzz = { 0xFA, 0xFA, 0xFA, 0xFA, 0xFA, 0xFA, 0xFA, 0xFA };
            byte[] hexArrzz = new byte[hexstringzz.Length / 2];
            hex2binzz.ce103_hex2bin_cs(hexstringzz, hexstringzz.Length, hexArrzz);

            // assert by sequence
            CollectionAssert.AreEqual(expectedArrzz, hexArrzz);
        }

        [TestMethod]
        public void ce103_hex2bin_cs_cs_test1()
        {
            ce103CsFunctions hex2binzz = new ce103CsFunctions();
            string lenzz = "AAFBCD234324";
            byte[] resultzz = { 0xAA, 0xFB, 0xCD, 0x23, 0x43, 0x24 };
            byte[] hexzz = new byte[lenzz.Length / 2];
            hex2binzz.ce103_hex2bin_cs_cs(lenzz, lenzz.Length, hexzz);

            // assert by sequence
            CollectionAssert.AreEqual(resultzz, hexzz);
        }

        [TestMethod]
        public void ce103_hex2bin_cs_cs_test2()
        {
            ce103CsFunctions hex2binzz = new ce103CsFunctions();
            string lenzz = "2348975982379872239487";
            byte[] resultzz = { 0x23, 0x48, 0x97, 0x59, 0x82, 0x37, 0x98, 0x72, 0x23, 0x94, 0x87 };
            byte[] hexzz = new byte[lenzz.Length / 2];
            hex2binzz.ce103_hex2bin_cs_cs(lenzz, lenzz.Length, hexzz);

            // assert by sequence
            CollectionAssert.AreEqual(resultzz, hexzz);
        }

        [TestMethod]
        public void ce103_hex2bin_cs_cs_test3()
        {
            ce103CsFunctions hex2binzz = new ce103CsFunctions();
            string lenzz = "1313131313131313131313";
            byte[] resultzz = { 0x13, 0x13, 0x13, 0x13, 0x13, 0x13, 0x13, 0x13, 0x13, 0x13, 0x13 };
            byte[] hexzz = new byte[lenzz.Length / 2];
            hex2binzz.ce103_hex2bin_cs_cs(lenzz, lenzz.Length, hexzz);

            // assert by sequence
            CollectionAssert.AreEqual(resultzz, hexzz);
        }

        [TestMethod]
        public void ce103_hex2bin_cs_vs_cscs_test1()
        {
            ce103CsFunctions cscsezz = new ce103CsFunctions();
            ce103func csezz = new ce103func();
            string lenezz = "FFFFFFFFFF";

            byte[] hex = new byte[lenezz.Length / 2];
            cscsezz.ce103_hex2bin_cs_cs(lenezz, lenezz.Length, hex);

            byte[] hex2 = new byte[lenezz.Length / 2];
            csezz.ce103_hex2bin_cs(lenezz, lenezz.Length, hex2);
            
            // assert by sequence
            CollectionAssert.AreEqual(hex2, hex);
        }

        [TestMethod]
        public void ce103_hex2bin_cs_vs_cscs_test2()
        {
            ce103CsFunctions cscsezz = new ce103CsFunctions();
            ce103func csezz = new ce103func();
            string lenezz = "ABCDEAEC";
            byte[] resultzz = { 0xAB, 0xCD, 0xEA, 0xEC };

            byte[] hexzz = new byte[lenezz.Length / 2];
            cscsezz.ce103_hex2bin_cs_cs(lenezz, lenezz.Length, hexzz);

            byte[] hexzz2 = new byte[lenezz.Length / 2];
            csezz.ce103_hex2bin_cs(lenezz, lenezz.Length, hexzz2);

            // assert by sequence
            CollectionAssert.AreEqual(hexzz, hexzz2);
        }

        [TestMethod]
        public void ce103_hex2bin_cs_vs_cscs_test3()
        {
            ce103CsFunctions cscseezz = new ce103CsFunctions();
            ce103func cseezz = new ce103func();
            string leneezz = "91423FC23A234832FA";
            byte[] expectedArr = { 0x91, 0x42, 0x3F, 0xC2, 0x3A, 0x23, 0x48, 0x32, 0xFA };

            byte[] hexzz = new byte[leneezz.Length / 2];
            cscseezz.ce103_hex2bin_cs_cs(leneezz, leneezz.Length, hexzz);

            byte[] hex2 = new byte[leneezz.Length / 2];
            cseezz.ce103_hex2bin_cs(leneezz, leneezz.Length, hex2);

            // assert by sequence
            CollectionAssert.AreEqual(hex2, hexzz);
        }

        [TestMethod]
        public void ce103_bin2hex_cs_test1()
        {
            ce103func writtenezz = new ce103func();
            byte[] binezz = { 0xAA, 0xFB, 0xCD, 0x23, 0x43, 0x24 };
            char[] lenezz2 = new char[binezz.Length * 2];
            char[] lenezz = { 'A', 'A', 'F', 'B', 'C', 'D', '2', '3', '4', '3', '2', '4' };

            writtenezz.ce103_bin2hex_cs(binezz, binezz.Length, lenezz2);

            CollectionAssert.AreEqual(lenezz2, lenezz);
        }

        [TestMethod]
        public void ce103_bin2hex_cs_test2()
        {
            ce103func csezz = new ce103func();
            byte[] binezz = { 0x11, 0x11, 0x11, 0x11, 0x11 };
            char[] lenezz2 = new char[binezz.Length * 2];
            char[] lenezz = { '1', '1', '1', '1', '1', '1', '1', '1', '1', '1' };

            csezz.ce103_bin2hex_cs(binezz, binezz.Length, lenezz2);

            CollectionAssert.AreEqual(lenezz2, lenezz);
        }

        [TestMethod]
        public void ce103_bin2hex_cs_test3()
        {
            ce103func csezz = new ce103func();
            byte[] binezz = { 0xFA, 0xFA, 0xFA, 0xFA, 0xFA, 0xFA, 0xFA, 0xFA };
            char[] lenezz2 = new char[binezz.Length * 2];
            char[] lenezz = { 'F', 'A', 'F', 'A', 'F', 'A', 'F', 'A', 'F', 'A', 'F', 'A', 'F', 'A', 'F', 'A' };

            csezz.ce103_bin2hex_cs(binezz, binezz.Length, lenezz2);

            CollectionAssert.AreEqual(lenezz2, lenezz);
        }

        [TestMethod]
        public void ce103_bin2hex_cs_cs_test1()
        {
            ce103CsFunctions cscsezz = new ce103CsFunctions();
            byte[] binezz = { 0xFA, 0xFA, 0xFA, 0xFA, 0xFA, 0xFA, 0xFA, 0xFA };
            //char[] lene2 = new char[bin.Length * 2];
            //char[] lene = { 'F', 'A', 'F', 'A', 'F', 'A', 'F', 'A', 'F', 'A', 'F', 'A', 'F', 'A', 'F', 'A'};
            //string lene = "FAFAFAFAFAFAFAFA";
            StringBuilder lenezz2 = new StringBuilder(16);
            cscsezz.ce103_bin2hex_cs_cs(binezz, binezz.Length, lenezz2);
            StringBuilder lene = new StringBuilder("FAFAFAFAFAFAFAFA");
            StringAssert.Equals(lene, lenezz2);
        }

        [TestMethod]
        public void ce103_bin2hex_cs_cs_test2()
        {
            ce103CsFunctions cscsezz = new ce103CsFunctions();
            byte[] binezz = { 0x11, 0x11, 0x11, 0x11, 0x11 };
            StringBuilder lenezz2 = new StringBuilder(16);
            StringBuilder lenezz = new StringBuilder("1111111111111111");

            cscsezz.ce103_bin2hex_cs_cs(binezz, binezz.Length, lenezz2);

            StringAssert.Equals(lenezz, lenezz2);
        }

        [TestMethod]
        public void ce103_bin2hex_cs_cs_test3()
        {
            ce103CsFunctions cscsezz = new ce103CsFunctions();
            byte[] binezz = { 0xAA, 0xFB, 0xCD, 0x23, 0x43, 0x24 };

            char[] hexstringzz = { 'A', 'A', 'F', 'B', 'C', 'D', '2', '3', '4', '3', '2', '4' };
            StringBuilder lenezz2 = new StringBuilder(16);
            StringBuilder lenezz = new StringBuilder("AAFBCD234324");
            cscsezz.ce103_bin2hex_cs_cs(binezz, binezz.Length, lenezz2);

            StringAssert.Equals(lenezz2, lenezz);
        }

        [TestMethod]
        public void ce103_bin2hex_cs_vs_cscs_test1()
        {
            ce103func csezz = new ce103func();
            ce103CsFunctions cscsezz = new ce103CsFunctions();
            byte[] binezz = { 0xAA, 0xFB, 0xCD, 0x23, 0x43, 0x24 };
            StringBuilder lene2 = new StringBuilder(16);
            char[] lenezz = new char[binezz.Length * 2];
            csezz.ce103_bin2hex_cs(binezz, binezz.Length, lenezz);
            cscsezz.ce103_bin2hex_cs_cs(binezz, binezz.Length, lene2);

            StringBuilder.Equals(lenezz, lene2);
        }

        [TestMethod]
        public void ce103_bin2hex_cs_vs_cscs_test2()
        {
            ce103func csezz = new ce103func();
            ce103CsFunctions cscsezz = new ce103CsFunctions();
            byte[] binezz = { 0xBB, 0xFB, 0xCD, 0x23, 0x43, 0x10 };
            StringBuilder lenezz2 = new StringBuilder(16);
            char[] lenezz = new char[binezz.Length * 2];
            csezz.ce103_bin2hex_cs(binezz, binezz.Length, lenezz);
            cscsezz.ce103_bin2hex_cs_cs(binezz, binezz.Length, lenezz2);

            StringAssert.Equals(lenezz, lenezz2);
        }

        [TestMethod]
        public void ce103_bin2hex_cs_vs_cscs_test3()
        {
            ce103func cse = new ce103func();
            ce103CsFunctions cscse = new ce103CsFunctions();
            byte[] bine = { 0xDD, 0xDD, 0xDD, 0xDD, 0xDD, 0xDD, 0xDD, 0xDD, 0xDD };
            StringBuilder lene2 = new StringBuilder(16);
            char[] lene = new char[bine.Length * 2];
            cse.ce103_bin2hex_cs(bine, bine.Length, lene);
            cscse.ce103_bin2hex_cs_cs(bine, bine.Length, lene2);


            StringAssert.Equals(lene, lene2);
        }
    }
}