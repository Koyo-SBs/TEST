#include <stdio.h>
#include <math.h>
struct animal
{
    char *name;
    float speed;
    float limit;
    float rest;
    float time;
};

float runningKame(float distance, struct animal kame)
{
    float time = 0;
    time = distance / kame.speed;
    printf("カメのかかった時間：%f\n", time);
    return time;
}

float runningUsagi(float distance, struct animal usagi)
{
    float time = 0;
    float restTime = 0;
    int restPoint = 0;
    time = distance / usagi.speed;
    while (distance > usagi.limit)
    {
        distance = distance - usagi.limit;
        restPoint++;
    }
    restTime = restPoint * usagi.rest;
    printf("ウサギのかかった時間：%f\n", time);
    time = time + restTime;
    printf("ウサギのかかった時間：%f\n", time);
    return time;
}

void showResult(struct animal usagi, struct animal kame)
{
    if (usagi.time == kame.time)
    {
        printf("引き分け！？");
    }
    else if (usagi.time > kame.time)
    {
        printf("カメの勝ち！！！！！");
    }
    else
    {
        printf("ウサギの勝ち...");
    }
}

int main(void)
{
    float distance;

    printf("競争する距離(正の数)を入力してください：");
    scanf("%f", &distance);

    struct animal usagi, kame;

    usagi.name = "うさぎ";
    usagi.speed = 0.5;
    usagi.limit = 2.;
    usagi.rest = 5.;

    kame.name = "かめ";
    kame.speed = 0.25;

    usagi.time = runningUsagi(distance, usagi);
    kame.time = runningKame(distance, kame);
    showResult(usagi, kame);

    return 0;
}
