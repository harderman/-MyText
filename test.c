#include<stdio.h>
#include<stdlib.h>
#include <time.h>
int main()
{
	int i = 0, j = 0;
	int p;
	srand(time(NULL));
	p = rand() % 100 + 1;
	printf("������һ������\n");
	for (int a = 0;; a++)
	{
		scanf_s("%d", &i);
		if (i == p)
			break;
		else if (i > p)
			printf("����\n");
		else
			printf("����\n");
	}
	printf("�¶���\n");
	system("pause");
}