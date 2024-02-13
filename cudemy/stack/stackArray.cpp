#include <bits/stdc++.h>

using namespace std;

struct Stacks
{
    int size;
    int top = -1;
    int *a;
    void push(int x);
    int pop();
    int peek(int pos);
    int is_empty();
    int is_full();
};

void Stacks::push(int x)
{
    if (top + 1 == size)
    {
        cout << "No faka Jayga" << endl;
        return;
    }
    top++;
    a[top] = x;
    return;
}
int Stacks::pop()
{
    if (top == -1)
    {
        cout << "No element left" << endl;
        return 0;
    }
    int x = a[top];
    top--;
    return x;
}
int Stacks::peek(int pos)
{
    if (pos > top)
    {
        cout << "Wrong peek input" << endl;
        return 0;
    }
    return a[pos];
}
int Stacks::is_empty()
{
    if (top == -1)
        return 1;
    return 0;
}
int Stacks::is_full()
{
    if (top + 1 == size)
        return 1;
    return 0;
}

int main()
{
    Stacks *st = new Stacks;
    cin >> st->size;
    st->a = new int[st->size];
    st->push(1);
    st->push(2);
    st->push(3);
    st->push(4);
    st->push(5);
    st->push(6);
    st->push(7);
    cout << st->peek(0) << endl;
    cout << st->peek(1) << endl;
    cout << st->peek(2) << endl;
    cout << st->peek(3) << endl;
    cout << st->peek(4) << endl;
    cout << st->peek(5) << endl;
    cout << st->pop() << endl;
    cout << st->pop() << endl;
    cout << st->pop() << endl;
    cout << st->pop() << endl;
    cout << st->pop() << endl;
    cout << st->pop() << endl;
    cout << st->pop() << endl;
    cout << st->is_full() << endl;
}