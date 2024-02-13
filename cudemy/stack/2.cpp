#include <bits/stdc++.h>

using namespace std;

struct Stack
{
    int size;
    int top;
    int *s;
};

void stack_empty(Stack *st)
{
    if (st->top == -1)
    {
        cout << "Empty" << endl;
        return;
    }
    cout << "Not empty" << endl;
}
void stack_full(Stack *st)
{
    if (st->top == st->size - 1)
    {
        cout << "Full" << endl;
        return;
    }
    cout << "Not Full" << endl;
}

void stack_push(Stack *st)
{
    int n;
    cin >> n;
    if (st->top == st->size - 1)
    {
        cout << "Full" << endl;
        return;
    }
    st->top++;
    st->s[st->top] = n;
    return;
}

int stack_pull(Stack *st)
{
    if (st->top == -1)
    {
        printf("Empty\n");
        return -1;
    }
    int x = st->s[st->top];
    st->top--;
    return x;
}

int stack_peek(Stack *st, int pos)
{
    if (pos < 0 || pos > st->top)
    {
        cout << "empty" << endl;
        return 0;
    }
    return st->s[pos];
}

int stack_top(Stack *st)
{
    if (st->top == -1)
    {
        cout << "NO upadan" << endl;
        return -1;
    }
    return st->s[st->top];
}

int main()
{
    Stack *st = new Stack;
    cout << "Max size: ";
    cin >> st->size;
    st->s = new int[st->size];
    st->top = -1;
    while (1)
    {
        int n;
        cin >> n;
        if (n == 1)
            stack_empty(st);
        else if (n == 2)
            stack_full(st);
        else if (n == 3)
            stack_push(st);
        else if (n == 4)
            cout << stack_pull(st) << endl;
        else if (n == 5)
        {
            int n;
            cin >> n;
            cout << stack_peek(st, n) << endl;
        }

        else if (n == 6)
            cout << stack_top(st) << endl;
    }
}