// dllmain.cpp : Defines the entry point for the DLL application.
#define _CRT_SECURE_NO_WARNINGS
#include "Üst Bilgi.h"
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
 /**
  * @file CE103-HW4-Lib.c
  * @author Celal Enes AYAZ
  * @date 30 December 2021
  *
  * @brief <b> HW-4 Functions </b>
  *
  * HW-4 Sample Lib Functions
  *
  * @see http://bilgisayar.mmf.erdogan.edu.tr/en/
  *
  */





  /**
   @name TestFunction(fnCE103HW2Lib)
	  @brief \b Auto Generated Test Function

	  Auto Generated Test Function Has Doxygen and Plantuml Integration

   Sample Web Page Link
   @see https://www.cplusplus.com/reference/cstring/strcpy/

   Sample Image AES Block Decryption Operation

   @image html aes_enc_dec.png
   @image rtf aes_enc_dec.png
   @image latex aes_enc_dec.png

   Sample Related Function Link
   @see TestFunction (fnCE103HW2Lib)
   <b> Plant UML Sample </b> <BR>
   @image html fnCE103HW2Lib.png
   @image rtf fnCE103HW2Lib.png
   @image latex fnCE103HW2Lib.png


   -->

	 @param [in] fia	[\b unsigned char*] Binary Data Input
	 @param [in] fib	[\b int] Binary Data Input Length
	 @param [out] fic	[\b char*] Hex String Output Array

	  @retval [\b int] operation result success 0 fail 1

	  Example Usage :

	   @code
		#include <stdio.h>
		#include <string.h>

		int main (){
		  unsigned char data[]="\x13\x13\x13x\13";
		 int dataLength = 4;
		  char dataHex[40];

		  if(fnCE103HW2Lib(data,dataLength,dataHex)!=0)
		 {
		   printf("Operation Failed!");
		   return -1;
		 }

		printf("Converted Data [%s]",dataHex);

		  return 0;
	   }

  **/
int fnCE103HW2Lib(unsigned char* fia, int fib, char* fic)
{
	//Empty Body...
	return -1;
}

/**
*
*	  @name   fibonacciNumber (ce103_fibonacciNumber)
*
*	  @brief Fibonacci Number Calculator
*
*	  Calculates the fibonacci number in the given index and return as output
*
*	  @param  [in] fiIndex [\b int]  index of fibonacci number in the serie
*
*	  @retval [\b int] calculated fibonacci number
**/
int ce103_fibonacciNumber(int fiIndex)
{
	//TODO:Start from Here...
	{

		int c = 0, e = 1, z = 1;
		/* Calculate fibonacci number array
		i variable starts from 1 and every cylce if i less than fiIndex
		add 1 number to i
		and then calculates fibonacci number */
		for (int i = 1; i <= fiIndex; i++)
		{
			z = c + e;
			c = e;
			e = z;
		}

		return c;
	}



}



/**
	@name   strrev (ce103_strrev)

	@brief \b Reverse String

	Reverse given string

	@param [in] fiStr [\b char*] The given string which is needed to be reversed.

	@retval [\b char*] This function returns the string after reversing the given string
**/
//string reverse code
char* ce103_strrev(char* fiStr)
{
	//TODO:Start from Here...

	{

		char temp;
		int y, u, t;
		t = ce103_strlen(fiStr);

		/*swapping fiStr[i] and fiStr[j] until i<j
		then fiStr array inverts the word
		reduce d and increase e if d equal to zero and e equal to t-1 and d less than e */
		for (y = 0, u = t - 1; y < u; ++y, --u) {
			temp = fiStr[u];
			fiStr[u] = fiStr[y];
			fiStr[y] = temp;
		}

		return fiStr;


	}


}

/**
	@name   strlen (ce103_strlen)
	@brief \b Get string length

	Returns the length of the C string str.

	The length of a C string is determined by the terminating null-character:
	A C string is as long as the number of characters between the beginning of
	the string and the terminating null character
	(without including the terminating null character itself).

	see more <a href="https://en.cppreference.com/w/c/string/byte/strlen">strlen reference 1</a>
	see more <a href="https://www.programiz.com/c-programming/library-function/string.h/strlen">strlen reference 2</a>
	see more <a href="https://www.cplusplus.com/reference/cstring/strlen/">strlen reference 3</a>

	@param [in] fiStr [\b const char*] pointer to the null-terminated byte string to be examined

	@retval [\b int] The length of the null-terminated byte string str.
**/
//string lenght code
int ce103_strlen(const char* fiStr)
{
	//TODO:Start from Here...
	int	name = 0;

	/*returns the lenght of the string fiStr by using dereference operator
	changes the value stored in fiStr*/
	while (*(fiStr++))          // '\0' ends the loop
		name++;

	return name;
}

/**
	@name   strcat (ce103_strcat)
	@brief \b Concatenate strings

	Appends a copy of the null-terminated byte string pointed to by src to the end of the null-terminated byte string pointed to by dest

	The character src[0] replaces the null terminator at the end of dest. The resulting byte string is null-terminated.

	The behavior is undefined if the destination array is not large enough for the contents of
	both src and dest and the terminating null character. The behavior is undefined if the strings overlap.
	The behavior is undefined if either dest or src is not a pointer to a null-terminated byte string.

	see more <a href="https://en.cppreference.com/w/c/string/byte/strcat">strcat reference</a>
	see more <a href="https://www.cplusplus.com/reference/cstring/strcat/">strcat reference</a>

	@param  [in] fiDest [\b char*] pointer to the null-terminated byte string to append to
	@param  [in] fiSrc  [\b char*] pointer to the null-terminated byte string to copy from

	@retval [\b char*] returns a copy of dest
**/
char* ce103_strcat(char* fiDest, char* fiSrc)
{
	//TODO:Start from Here...
	{
		char* fetee = fiDest;
		/*When the char that t points to is '\0',
		the while loop will terminate.Until then,
		it will copy the char that t is pointing to to the char that s is pointing to,
		then increment sand t to point to the next char in their arrays.            */
		while (*fiDest++ != '\0');
		--fiDest;

		/*combines destand srcand do this until the combine words
		and returns a copy test                                */
		while ((*fiDest++ = *fiSrc++) != '\0');

		return fetee;
	}

	;
}

/**
	@name   strcmp (ce103_strcmp)
	@brief  \b Compare two strings

	Compares two null-terminated byte strings lexicographically.

	The sign of the result is the sign of the difference between
	the values of the first pair of characters (both interpreted as unsigned char)
	that differ in the strings being compared.The behavior is undefined
	if lhs or rhs are not pointers to null-terminated byte strings.

	see more <a href="https://en.cppreference.com/w/c/string/byte/strcmp">strcmp reference</a>
	see more <a href="https://www.cplusplus.com/reference/cstring/strcmp/">strcmp reference</a>

	@param  [in] fiLhs [\b const char*] pointers to the null-terminated byte strings to compare
	@param  [in] fiRhs [\b const char*] pointers to the null-terminated byte strings to compare

	@retval [\b int] Negative value if lhs appears before rhs in lexicographical order.
			Zero if lhs and rhs compare equal.
			Positive value if lhs appears after rhs in lexicographical order.
**/
int ce103_strcmp(const char* fiLhs, const char* fiRhs)
{
	//TODO:Start from Here...

	/*negative value if Lhs appears before Rhs in lexicographical order
	zero if Lhs and Rhs compare equal
	positive value if Lhs appears after Rhs in lexicofraphical order  */
	while (*fiLhs && *fiRhs && *(fiLhs++) == *(fiRhs++))
		;
	return *fiLhs - *fiRhs;

}

/**
*
	@name  strcpy (ce103_strcpy)
	@brief \b Copy string

	Copies the C string pointed by source into the array pointed by destination,
	including the terminating null character (and stopping at that point).

	To avoid overflows, the size of the array pointed by destination shall be long enough to contain
	the same C string as source (including the terminating null character),
	and should not overlap in memory with source.

	see more <a href="https://en.cppreference.com/w/c/string/byte/strcpy">strcpy reference 1</a>
	see more <a href="https://www.cplusplus.com/reference/cstring/strcpy/">strcpy reference 2</a>

	@param [out] foDestination	[\b char*]			Pointer to the destination array where the content is to be copied.
	@param [in]  fiSource		[\b const char*]	C string to be copied.

	@retval returns a copy of dest
**/
char* ce103_strcpy(char* foDestination, const char* fiSource)
{
	//TODO:Start from Here...
	/*Equalizes the ret to foDest */
	char* fotee = foDestination;

	/*returns a copy of Dest
	*/
	while ((*foDestination++ = *fiSource++) != '\0');
	return fotee;
}

/**
 * @name    hex2bin (ce103_hex2bin)
 * @brief   \b Hexadecimal to Binary (BCD)  Conversion
 *
 * Hexadecimal to Binary (BCD)  Conversion
 * Packs hexadecimal string to packed binary array, Example: "AB1234" => 0xAB 0x12 0x34
 * If length of the input string is less than the fiHexLen,remaining bytes is not filled.
 * If odd number of characters processed, last nibble is padded with 0
 *
 * @param   [in]  fiHex    [\b unsigned char*] Ascii hex string.
 * @param   [in]  fiHexLen [\b int]     Ascii data length.
 * @param  [out]  foBin    [\b char*]   Convertion result as binary.
 */

void ce103_hex2bin(char* fiHex, int fiHexLen, unsigned char* foBin)
{
	//TODO:Start from Here...
	int noe, noe1;
	//convert hex to bin 
	for (;;) {
		/*read fihex and then increase the fihex
		if c equal to zero break the code*/
		noe = *fiHex++; if (noe == 0) break;
		/*if no bigger than ninety six Subtract eighty seven from num then create a new value of no
		if no bigger than sixty four Subtract fifty five from no then create a new value of no
		Subtract forty eight from no then create a new value of no                                */
		if (noe > 96) noe -= 87;
		else if (noe > 64) noe -= 55;
		else noe -= 48;
		//read fihex and then increase the fihex then equal to no1
		noe1 = *fiHex++;
		//if no1 equal to zero do computes 4 bitwise shift to the left then break
		if (noe1 == 0)
		{
			*foBin = noe << 4;
			break;
		}//
/*if no1 bigger than sixty four Subtract fifty five from no1. Create a new value of no1
if no1 bigger than sixty four Subtract fforty eight from no1. Create a new value of no1
Subtract forty eight from no1. Create a new value of no1                                 */
		else if (noe1 > 64) noe1 -= 55;
		else noe1 -= 48;
		*foBin++ = (noe << 4) | noe1;
	}


}

/**
* @name    bin2hex (ce103_bin2hex)
* @brief   \b Binary (BCD) to Hexadecimal Conversion
*
* Unpacks alpha numeric value, Example: 0x12 0x34 = "1234".
*
* @param [in]  fiBin      [\b unsigned char*]    Binary data to be converted.
* @param [in]  fiBinLen   [\b int]				 Binary data length.
* @param [out] foHex      [\b char*]			 Convertion result as ascii. Doubles the binary length.
*
*/
void ce103_bin2hex(unsigned char* fiBin, int fiBinLen, char* foHex)
{
	////TODO:Start from Here...
	//const char* xdig = "0123456789ABCDEF";
	//long val = strtol(fiBin, NULL, 2);
	//for (int i = 0; i < fiBinLen; ++i) {
	//	int nib = val & 0xf;
	//	if (fiBinLen > i) foHex[i] = xdig[nib];
	//	val = val << 4;
	//}
	//foHex[fiBinLen * 2] = '\0';
	char all[] = { "0123456789ABCDEF" };
	// below code snippet is taken from
	// basically this for loop gets hex number's right or left nibble and finds which character is this
	for (int h = 0; h < fiBinLen; h++)
	{
		foHex[h * 2] = all[fiBin[h] >> 4];  // it means divide by 16. arr[fiBin[i] / 16] is true also
		foHex[h * 2 + 1] = all[fiBin[h] & 0x0F];  // if i = 0 then fiBin[0] & 0x0f Note: fiBin[0] = 0x13
	}                                             // 0001 0011 & 0000 1111 = 3 basically it means
												  // get hexnumber's second 
	foHex[fiBinLen * 2] = '\0';
}

