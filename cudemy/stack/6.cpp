#include <bits/stdc++.h>

using namespace std;

struct Node
{
    int data;
    Node *next;
};

struct Stack
{
    Node *top = NULL;
};

void stack_push(int x, Stack *&st)
{
    Node *newnode = new Node;
    if (newnode == NULL)
    {
        cout << "Heap is full" << endl;
        return;
    }
    newnode->data = x;
    if (st->top == NULL)
    {
        st->top = newnode;
        return;
    }
    newnode->next = st->top;
    st->top = newnode;
}

int stack_pop(Stack *&st)
{
    if (st->top == NULL)
    {
        cout << "No element" << endl;
        return -1;
    }
    Node *newnode = st->top;
    int x = st->top->data;
    st->top = st->top->next;
    delete newnode;
    return x;
}

int stack_peek(int pos, Stack *st)
{
    int x = -1;
    Node *tmp = st->top;
    if (tmp == 0)
    {
        cout << "Empty" << endl;
        return x;
    }
    while (--pos)
    {
        if (tmp == 0)
        {
            cout << "very.. big position" << endl;
            return x;
        }
        tmp = tmp->next;
    }
    if (tmp == 0)
    {
        cout << "..very big position" << endl;
        return x;
    }
    return tmp->data;
}

int stack_top(Stack *st)
{
    if (st->top == 0)
    {
        printf("Kisu nai\n");
        return -1;
    }
    return st->top->data;
}

void stack_empty(Stack *st)
{
    if (st->top == 0)
    {
        cout << "EMPTY" << endl;
        return;
    }
    cout << "NOT EMPTY" << endl;
}

int main()
{
    Stack *st = new Stack;
    while (1)
    {
        int n;
        cin >> n;
        if (n == 1)
        {
            int number;
            cin >> number;
            stack_push(number, st);
        }
        else if (n == 2)
        {
            int position;
            cin >> position;
            cout << stack_peek(position, st) << endl;
        }
        else if (n == 3)
        {
            cout << stack_pop(st) << endl;
        }
    }
}