#include <bits/stdc++.h>
using namespace std;

struct Stack
{
    int top = -1;
    char *c;
};

void stack_push(Stack *&st)
{
    st->top++;
    st->c[st->top] = '(';
}

void stack_pop(Stack *&st)
{
    st->top--;
}

int empty(Stack *sts)
{
    if (sts->top == -1)
    {
        return 1;
    }
    return 0;
}

void isBalance(string s);

int main()
{
    string s = "(a+b) *(c(-d))";
    isBalance(s);
}

void isBalance(string s)
{
    Stack *st = new Stack;
    st->c = new char[20];
    int i = 0;
    while (s[i] != '\0')
    {
        if (s[i] == '(')
        {
            stack_push(st);
        }
        else if (s[i] == ')')
        {
            if (empty(st))
            {
                cout << "Faka (short porse)";
                return;
            }
            stack_pop(st);
        }
        cout << "ok" << endl;
        i++;
    }
    if (empty(st))
    {
        cout << "All ok" << endl;
        return;
    }
    cout << "Vejal(beshi roia gese)" << endl;
    return;
}