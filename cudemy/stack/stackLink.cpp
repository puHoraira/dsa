#include <bits/stdc++.h>

using namespace std;

struct Stacks
{
    struct Node
    {
        int data;
        Node *next;
    };
    Node *top = NULL;
    void push(int x);
    int peek(int pos);
    int pop();
};

void Stacks::push(int x)
{
    Node *newnode = new Node;
    newnode->data = x;
    if (top == NULL)
    {
        top = newnode;
        return;
    }
    newnode->next = top;
    top = newnode;
}

int Stacks::peek(int pos)
{
    if (top == 0)
    {
        return -1;
    }
    Node *tm = top;
    while (--pos)
    {
        tm = tm->next;
        if (tm == 0)
        {
            return -1;
        }
    }
    return tm->data;
}
int Stacks::pop()
{
    if (top == 0)
    {
        return -1;
    }
    int ans = top->data;
    Node *newnode = top;
    top = top->next;
    delete newnode;
    return ans;
}

int main()
{
    Stacks a;
    a.push(1);
    a.push(2);
    a.push(3);
    a.push(4);
    a.push(5);
    a.push(6);
    cout << a.peek(1) << endl;
    cout << a.peek(2) << endl;
    cout << a.peek(3) << endl;
    cout << a.peek(4) << endl;
    cout << a.peek(5) << endl;
    cout << a.peek(6) << endl;
    cout << a.peek(7) << endl;
    cout << a.pop() << endl;
    cout << a.pop() << endl;
    cout << a.pop() << endl;
    cout << a.peek(1) << endl;
    cout << a.peek(2) << endl;
    cout << a.peek(3) << endl;
    cout << a.peek(4) << endl;
    cout << a.peek(5) << endl;
    cout << a.peek(6) << endl;
    cout << a.peek(7) << endl;
    cout << " --------------" << endl;
    a.push(1);
    a.push(2);
    a.push(3);
    a.push(4);
    a.push(5);
    a.push(6);
    cout << a.peek(1) << endl;
    cout << a.peek(2) << endl;
    cout << a.peek(3) << endl;
    cout << a.peek(4) << endl;
    cout << a.peek(5) << endl;
    cout << a.peek(6) << endl;
    cout << a.peek(7) << endl;
    cout << a.pop() << endl;
    cout << a.pop() << endl;
    cout << a.pop() << endl;
    cout << a.peek(1) << endl;
    cout << a.peek(2) << endl;
    cout << a.peek(3) << endl;
    cout << a.peek(4) << endl;
    cout << a.peek(5) << endl;
    cout << a.peek(6) << endl;
    cout << a.peek(7) << endl;
}