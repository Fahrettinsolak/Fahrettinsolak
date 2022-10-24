#include <stdio.h>                           							//Standart input output dosyalarini programiniza ekleyen kod.
#include <stdlib.h>                           							//Dinamik bellek yönetimi, rasgele sayı üretimi, çevre ile iletişim, tamsayı aritmetiği, arama, sıralama ve dönüştürme gibi çeşitli genel amaçlı fonksiyonlar tanımlanmıştır.
#include <unistd.h>                           							//Unix standard library header ı. fork() gibi sistem çağrılarının c ile yapılabilmesi için include edilmesi gereken dosya. 
#include <sys/stat.h>                        							//lstat() ve stat() işlevleri tarafından döndürülen verilerin yapısını tanımlar .
#include <sys/wait.h>                         							//Sistem çağrıları child process yaratan parent process’lerin child’ların bitmelerini beklemek için kullanılır. 


void leaf(){                                   
	char namefile[20];                        							//20 karakter sınırlı bir dosya ismi verir.
	sprintf(namefile,"%d.txt",getpid());      							//Sayı türünden processlerin pid değerleri dosya adı olarak gelir.
	FILE *fp=fopen(namefile,"write");        							//Write modu kullanarak process isimlerini dosyaya yazdırılır.
	fprintf(fp,"%d",(getpid()));            							//Processlerin pid değerlerini dosya içinde ilgili alanlara yazdırır.
	fclose(fp);                               							//Fonksiyon fp parametresi ile gösterilen dosya akışını kapatır. Tüm tamponlar temizlenir.
}
void Parent(int pid1, int pid2){              
	wait(NULL);                              							//wait bir sistem çağrısıdır. Çekirdek, işlemi uyku moduna geçirir ve alt işlemlerinden biri sona erdiğinde onu uyandırır
	char namefile1[20];                       							//20 karakter sınırlı bir dosya ismi verir.
	sprintf(namefile1,"%d.txt",pid1);        							//1.Process için pid değeri oluşturulur.
	char namefile2[20];                       							//20 karakter sınırlı bir dosya ismi verir.
	sprintf(namefile2,"%d.txt",pid2);         							//2.Process için pid değeri oluşturulur.
	char namefile3[20];                       							//20 karakter sınırlı bir dosya ismi verir.
	sprintf(namefile3,"%d.txt",getpid());     							//pid için bir dosya oluşturulur.pid değerlerini isim olarak atar.
	FILE *fp1,*fp2,*fp3;                      							//Gerekli pointer dosyaları oluşturulur. 
	fp1=fopen(namefile1,"read");              							//Read komutu ile 1. Processin içini okumamıza yarar.
	fp2=fopen(namefile2,"read");              							//Read komutu ile 2. Processin içini okumamıza yarar.
	int sol,sag;                              							//Dallarda oluşacak 2 tane child processler için sol ve sag şeklinde değişkenler oluşturulur.
	fscanf(fp1,"%d",&sol);                   							//Sol taraftaki processin değeri yazdırılır.
	fscanf(fp2,"%d",&sag);                    							//Sağ taraftaki processin değeri yazdırılır.
	fclose(fp1);                              							//Fonksiyon fp1 parametresi ile gösterilen dosya akışını kapatır. Tüm tamponlar temizlenir.  
	fclose(fp2);                              							//Fonksiyon fp2 parametresi ile gösterilen dosya akışını kapatır. Tüm tamponlar temizlenir.
	fp3=fopen(namefile3,"write");             							//Otomatik oluşan dosyları açmak için kullanılır.
	fprintf(fp3,"%d\n",sol+sag+getpid());              							//sol ve sag processlerin pid değerlerini toplayıp yazdırılır.
	fclose(fp3);                              							//Fonksiyon fp3 parametresi ile gösterilen dosya akışını kapatır. Tüm tamponlar temizlenir.
}
void tree_creation(int height){               							//void parametresine tree_creation adını veriyoruz.Ağacın ne kadar yükseklite oalcağını belirtmek için bir height değişkeni atıyoruz.
	if(height==0){ leaf(); return;}           							//ağaç yüksekliğine göre işlemi bitir yada tekrar döndür.
	else{                                     
	int pid = fork();                         							//pid değerine fork atılır.
	if(pid>0){	                              							//pid değeri eğer 0'dan büyük ise
		int pid2 = fork();                    							//fork'a pid2 yi yazdır.
		if(pid2>0){                           							//Eğer pid2 değeri 0 dan büyük ise
			//parent işlemi                   
			wait(NULL);                       							//wait bir sistem çağrısıdır. Çekirdek, işlemi uyku moduna geçirir ve alt işlemlerinden biri sona erdiğinde onu uyandırır  
			printf("parent : %d, c1:%d,c2:%d\n\n",getpid(),pid,pid2);   //Oluşan processleri yazdır.
			fflush(stdout);                  						    //Akış giriş için açıksa, fflush arabelleğin içeriğini temizler.Başlayan process leri belirli bir sırayla çalıştırır.
			Parent(pid,pid2);                 						    //pid1 ve pid2'yi açıp sayıları okutup 3. oluşan dosyaya yazdırır.
		}
		else if(pid2==0){                     						    //Pid2 0'a eşit ise 
			//sol cocuk                       
			tree_creation(--height);          							//tree_creation'ın yüksekliğini birer birer azalt.
		}             
	}
	else if(pid==0){                         							//pid 0'a eşit ise 
		//sag cocuk 
		tree_creation(--height);              							//tree_creation'ın yüksekliğini birer birer azalt.
	}
	}
	
}
int main(){                                   							//Kodu çalıştır.
	tree_creation(3);                         							//Belirlenen yükseklikte ağaç oluştur.
}

