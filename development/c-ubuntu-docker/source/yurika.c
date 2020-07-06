#include <stdio.h>

void yurika(int, int);

int main()
{
    int a, b;
    int aLimit = 10; //分子の平方根の中の上限
    int bLimit = 10; //分母の平方根の中の上限

    for (a = 1; a <= aLimit; a++)

        for (b = 1; b <= bLimit; b++)
            yurika(a, b);

    return 0;
}

void yurika(int a, int b)
{
    int a1, a2, i; //a1は平方根の外、a2は平方根のなか

    printf("√%d / √%d ＝ ", a, b);

    if (a == b)
    {
        printf("1\n");
        return;
    }

    if (a % b == 0)
    {
        a = a / b;
        b = 1;
    }

    else
        a = a * b;

    for (i = 1; i * i <= a; i++) //ルートのなかを素数に
        if (a % (i * i) == 0)
        {
            a1 = i;
            a2 = a / (i * i);
        }

    for (i = 1; i < 15; i++) //約分
        if (a1 % i == 0 && b % i == 0)
        {
            a1 = a1 / i;
            b = b / i;
        }

    if (a1 == 1 && b == 1)
    {
        printf("√%d\n", a2);
        return;
    }

    else if (a2 == 1 && b == 1)
    {
        printf("%d\n", a1);
        return;
    }

    else if (b == 1)
    {
        printf("%d√%d\n", a1, a2);
        return;
    }

    else if (a2 == 1)
    {
        printf("%d / %d\n", a1, b);
        return;
    }

    else if (a1 == 1)
    {
        printf("√%d / %d\n", a2, b);
        return;
    }

    else
        printf("%d√%d / %d\n", a1, a2, b);
    return;
}