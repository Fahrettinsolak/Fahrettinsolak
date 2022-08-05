using ce103_hw4_cs_dll;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace ce103_hw4_test
{
    [TestClass]
    public class ce103_hw4_testBase : ce103_hw4_testBaseBase
    {

        [TestMethod]
        public void ce103_strcat_cs_cs_test1()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103CsFunctions rev = new ce103CsFunctions();
            string str = "Hello";
            string strez = "Mother";

            string result = "Hello Mother";

            Assert.AreEqual(rev.ce103_strcat_cs_cs(str, strez), result);
        }

        [TestMethod]
        public override void ce103_strrev_cs_vs_cscs_test3()
        {
            // we're creating object of it otherwise we cannot use ce103functions class
            ce103func revee = new ce103func();
            ce103CsFunctions revee1 = new ce103CsFunctions();
            string original = "Opera";

            Assert.AreEqual(revee.ce103_strrev_cs(original), revee1.ce103_strrev_cs_cs(original));
        }
    }
}