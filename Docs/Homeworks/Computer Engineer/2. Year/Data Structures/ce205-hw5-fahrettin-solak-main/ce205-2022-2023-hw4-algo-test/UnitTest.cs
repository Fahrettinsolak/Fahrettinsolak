using ce205_2022_2023_hw4_fahrettin_solak;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using static ce205_2022_2023_hw4_fahrettin_solak.TrieAlgorithm;


namespace ce205_2022_2023_hw4_algo_test
{
    [TestClass]
    public class UnitTest
    {
        //############################### HORSPOOL ALGORITHM TEST #################################################
        [TestMethod]
        public void HorspoolGoodTest()
        {
            Horspool h = new Horspool();
            string text = "This is a test text";
            string pattern = "test";
            int index = h.ShiftMyTable(pattern, text, 0);
            Assert.AreEqual(10, index);
        }
        [TestMethod]
        public void HorspoolBadTest()
        {
            Horspool h = new Horspool();
            string text = "Lorem ipsum dolor sit amet.";
            string pattern = "sit";
            int index = h.ShiftMyTable(pattern, text, 0);
            Assert.AreEqual(18, index);
        }
        [TestMethod]
        public void HorspoolUglyTest()
        {
            Horspool h = new Horspool();
            string text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur quis.";
            string pattern = "elit";
            int index = h.ShiftMyTable(pattern, text, 0);
            Assert.AreEqual(51, index);
        }
        //############################### KNUTH-MORRIS-PRATT ALGORITHM TEST #################################################
        [TestMethod]
        public void KMPGoodTest()
        {
            KnuthMorrisPratt k = new KnuthMorrisPratt();
            string text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas congue.";
            string pattern = "congue";
            int index = k.KMPSearch(text, pattern, 0);
            Assert.AreEqual(-1, index);
        }
        [TestMethod]
        public void KMPBadTest()
        {
            KnuthMorrisPratt k = new KnuthMorrisPratt();
            string text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas ut.";
            string pattern = "dolor";
            int index = k.KMPSearch(text, pattern, 0);
            Assert.AreEqual(-1, index);
        }
        [TestMethod]
        public void KMPUglyTest()
        {
            KnuthMorrisPratt k = new KnuthMorrisPratt();
            string text = "Ut eget velit sit amet purus auctor ullamcorper vitae eu enim. Suspendisse efficitur venenatis nisl.";
            string pattern = "enim";
            int index = k.KMPSearch(text, pattern, 0);
            Assert.AreEqual(-1, index);
        }
        //######################################   NEEDLEMAN WUNSCH ##########################################
        [TestMethod]
        public void TestNeedleman()
        {
            NeedlemanWunsch needleman = new NeedlemanWunsch();
            string s1 = "AGCAT";
            string s2 = "GAC";

            string expected = "AGCAT\n-G-AC";
            string actual = needleman.Align(s1, s2);

            Assert.AreEqual(expected, actual);
        }
        //########################## SMITHWATERMAN ######################################
        [TestMethod]
        public void TestSmithWaterman()
        {
            SmithWaterman smith = new SmithWaterman();
            // Arrange
            string seq1 = "AGCT";
            string seq2 = "ACCT";

            // Act
            string actual = smith.SmithWatermanAlign(seq1, seq2);
            string expected = "AGCT\nACCT";
            // Assert
            Assert.AreEqual(expected, actual);
        }
        //################################### BOYER MOORE ALGORTIHM ####################
        [TestMethod]
        public void TestBoyerGoodase()
        {
            Boyer_Moore boyer = new Boyer_Moore();
            string stringToSearch = "The quick brown fox jumps over the lazy dog.";
            string pattern = "fox";
            int expectedResult = 16;
            int actualResult = boyer.BoyerMoore(stringToSearch, pattern);
            Assert.AreEqual(expectedResult, actualResult);
        }

        //################################# TRIE ALGORITHM ############################
        [TestMethod]
        public void TestTrie()
        {
            TrieAlgorithm.Trie trie = new TrieAlgorithm.Trie();
            TrieAlgorithm.Trie.Insert("hello");
            TrieAlgorithm.Trie.Insert("world");
            TrieAlgorithm.Trie.Insert("helix");
            TrieAlgorithm.Trie.Insert("helium");

            List<string> words = trie.SearchPrefix("hel");
            CollectionAssert.AreEqual(new[] { "hello", "helix", "helium" }, words);

            words = trie.SearchPrefix("wor");
            CollectionAssert.AreEqual(new[] { "world" }, words);

        }
        //############################### HUNT MCLLORY ##########################
        [TestMethod]
        public void TestFindLargestCommonSubsequence()
        {
            // Test with simple input
            string lcs = HuntSzymanski.FindLargestCommonSubsequence("ABCBDAB", "BDCABA");
            Assert.AreEqual("BDAB", lcs);

            // Test with empty input
            lcs = HuntSzymanski.FindLargestCommonSubsequence("", "BDCABA");
            Assert.AreEqual("", lcs);

            // Test with identical input
            lcs = HuntSzymanski.FindLargestCommonSubsequence("ABCBDAB", "ABCBDAB");
            Assert.AreEqual("ABCBDAB", lcs);

            // Test with no common characters
            lcs = HuntSzymanski.FindLargestCommonSubsequence("XYZ", "ABC");
            Assert.AreEqual("", lcs);
        }
    }
}
