#include <bits/stdc++.h>

using namespace std;

struct queues
{
    int size;
    int front = -1;
    int rear = -1;
    int *q;
};

void enqu(queues &qu, int number)
{
    if ((qu.rear + 1) % qu.size == qu.front)
    {
        cout << "Full";
    }
    else
    {
        qu.rear = (qu.rear + 1) % qu.size;
        qu.q[qu.rear] = number;
    }
}

int deq(queues &qu)
{
    int x = -1;
    if (qu.front == qu.rear)
    {
        cout << "faka" << endl;
    }
    else
    {
        qu.front = (qu.front + 1) % qu.size;
        x = qu.q[qu.front];
    }
    if (qu.front == qu.rear)
    {
        qu.front = qu.rear = -1;
    }
    return x;
}

void display(queues su)
{
    for (int i = su.front + 1; i <= su.rear; i++)
    {
        cout << su.q[i] << " ";
    }
    cout << endl;
}

int main()
{
    queues qu;
    cin >> qu.size;
    qu.q = new int[qu.size];
    enqu(qu, 4);
    enqu(qu, 5);
    enqu(qu, 6);
    enqu(qu, 7);
    enqu(qu, 8);
    enqu(qu, 6);
    enqu(qu, 7);
    enqu(qu, 8);
    cout << deq(qu) << endl;
    cout << deq(qu) << endl;
    cout << deq(qu) << endl;
    cout << deq(qu) << endl;
    cout << deq(qu) << endl;
    cout << deq(qu) << endl;
    enqu(qu, 5);
    enqu(qu, 6);
    enqu(qu, 7);
    cout << deq(qu) << endl;
    cout << deq(qu) << endl;
    display(qu);
}