#include<stdio.h>
#include<stdlib.h>
void output(int a)
{
	int i, j;
	for (i = 1; i <= a; i++)
	{
		for (j = 1; j <= i; j++)
			printf("%d*%d=%2d ", i, j, i*j);
		putchar('\n');
	}
}
int main()
{
	printf("请输入要打印的行列数\n");
	int a = 0;
	scanf_s("%d", &a);
	output(a);
	system("pause");
}