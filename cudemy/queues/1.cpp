#include <bits/stdc++.h>

using namespace std;

struct queues
{
    int top = -1;
    int maxSize;
    int *a;
};

void enqu(queues &qu, int number)
{
    if (qu.top + 1 == qu.maxSize)
    {
        cout << "jayganai" << endl;
        return;
    }
    qu.top++;
    qu.a[qu.top] = number;
}

int deq(queues &qu)
{
    if (qu.top == -1)
    {
        cout << "faka" << endl;
        return -1;
    }
    int x = qu.a[0];
    for (int i = 0; i < qu.top; i++)
    {
        qu.a[i] = qu.a[i + 1];
    }
    qu.top--;
    return x;
}

int main()
{
    queues qu;
    cin >> qu.maxSize;
    qu.a = new int[qu.maxSize];
    enqu(qu, 56);
    enqu(qu, 55);
    enqu(qu, 54);
    enqu(qu, 53);
    cout << deq(qu) << endl;
    cout << deq(qu) << endl;
    cout << deq(qu) << endl;
    cout << deq(qu) << endl;
    cout << deq(qu) << endl;
    cout << deq(qu) << endl;
    enqu(qu, 56);
    enqu(qu, 55);
    enqu(qu, 54);
    enqu(qu, 53);
    cout << deq(qu) << endl;
    cout << deq(qu) << endl;
    enqu(qu, 56);
    enqu(qu, 55);
    enqu(qu, 54);
    enqu(qu, 53);
}