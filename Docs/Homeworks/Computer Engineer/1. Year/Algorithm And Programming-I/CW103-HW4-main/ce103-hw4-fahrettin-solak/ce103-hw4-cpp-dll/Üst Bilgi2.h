#pragma once


#ifdef _DEBUG
#define IMPORT __declspec(dllimport)

#endif


#ifdef __cplusplus
extern "C" {
#endif

	IMPORT int fnCE103HW2Lib(unsigned char* fia, int fib, char* fic);


	IMPORT int ce103_fibonacciNumber(int fiIndex);


	IMPORT char* ce103_strrev(char* fiStr);


	IMPORT int ce103_strlen(const char* fiStr);


	IMPORT char* ce103_strcat(char* fiDest, char* fiSrc);


	IMPORT int ce103_strcmp(const char* fiLhs, const char* fiRhs);


	IMPORT char* ce103_strcpy(char* foDestination, const char* fiSource);


	IMPORT void ce103_hex2bin(char* fiHex, int fiHexLen, unsigned char* foBin);


	IMPORT void ce103_bin2hex(unsigned char* fiBin, int fiBinLen, char* foHex);




#ifdef _DEBUG
#define EXPORT __declspec(dllexport)

#endif
	EXPORT int ce103_fibonacciNumber_cpp(int fiIndex);

	EXPORT char* ce103_strrev_cpp(char* fiStr);

	EXPORT int ce103_strlen_cpp(const char* fiStr);

	EXPORT char* ce103_strcat_cpp(char* fiDest, char* fiSrc);

	EXPORT int ce103_strcmp_cpp(const char* fiLhs, const char* fiRhs);

	EXPORT char* ce103_strcpy_cpp(char* foDestination, const char* fiSource);

	EXPORT void ce103_hex2bin_cpp(char* fiHex, int fiHexLen, unsigned char* foBin);

	EXPORT void ce103_bin2hex_cpp(unsigned char* fiBin, int fiBinLen, char* foHex);



#ifdef __cplusplus
}
#endif