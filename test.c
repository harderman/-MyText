#include<stdio.h>
#include<stdlib.h>
#include <time.h>
int main()
{
	int i = 0, j = 0;
	int p;
	srand(time(NULL));
	p = rand() % 100 + 1;
	printf("请输入一个数字\n");
	for (int a = 0;; a++)
	{
		scanf_s("%d", &i);
		if (i == p)
			break;
		else if (i > p)
			printf("高了\n");
		else
			printf("低了\n");
	}
	printf("猜对了\n");
	system("pause");
}