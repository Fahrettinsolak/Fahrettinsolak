#define WIN32_LEAN_AND_MEAN             // Exclude rarely-used stuff from Windows headers

#ifdef _DEBUG
#define EXPORT __declspec(dllexport)
#endif


#ifdef __cplusplus
extern "C" {
#endif

	EXPORT int fnCE103HW2Lib(unsigned char* fia, int fib, char* fic);

	EXPORT int ce103_fibonacciNumber(int fiIndex);

	EXPORT char* ce103_strrev(char* fiStr);

	EXPORT int ce103_strlen(const char* fiStr);

	EXPORT char* ce103_strcat(char* fiDest, char* fiSrc);

	EXPORT int ce103_strcmp(const char* fiLhs, const char* fiRhs);

	EXPORT char* ce103_strcpy(char* foDestination, const char* fiSource);

	EXPORT void ce103_hex2bin(char* fiHex, int fiHexLen, unsigned char* foBin);

	EXPORT void ce103_bin2hex(unsigned char* fiBin, int fiBinLen, char* foHex);


#ifdef __cplusplus
}
#endif