#include <stdio.h>

int move(int n, int a, int b, int c);

int main(void)
{
  int input;
  int ans = 0;
  printf("ハノイの塔\n円盤の枚数を入力してください：");
  scanf("%d", &input);

  ans = move(input, 'a', 'b', 'c');

  printf("移動回数：%d\n", ans);

  return 0;
}

int count = 0;
int move(int n, int a, int b, int c) //aは左、bは右、cは真ん中
{
  if (n == 1)
  {
    printf("%dの円盤を%cから%cに移す\n", n, a, b); //残り一枚なら左から右へ
    count++;
  }
  else
  {
    move(n - 1, a, c, b); //n-1枚目の円盤を左から真ん中に移動
    printf("%dの円盤を%cから%cに移す\n", n, a, b);
    move(n - 1, c, b, a); //n-1枚目の円盤を真ん中から右に移動
    count++;
  }
  return count;
}