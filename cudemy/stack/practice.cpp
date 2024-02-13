// Infix to postfix

#include <bits/stdc++.h>
using namespace std;

struct Stack
{
    int top = -1;
    int a[1111];
};
void push(Stack &st, int number)
{
    st.top++;
    st.a[st.top] = number;
}

int pop(Stack &st)
{
    int x = st.a[st.top];
    st.top--;
    return x;
}

int main()
{
    string s;
    cin >> s;
    Stack st;
    for (int i = 0; s[i] != '\0'; i++)
    {
        if (s[i] == '+' || s[i] == '-' || s[i] == '*' || s[i] == '/')
        {
            int x = pop(st);
            int y = pop(st);
            cout << x << " " << y << endl;
            if (s[i] == '+')
            {
                push(st, x + y);
            }
            else if (s[i] == '-')
            {
                push(st, x - y);
            }
            else if (s[i] == '*')
            {
                push(st, x * y);
            }
            else if (s[i] == '/')
            {
                if (x == 0)
                {
                    y += 2;
                }
                push(st, x / y);
            }
        }
        else if (s[i] == '#')
        {
            int x = pop(st);
            push(st, x + 1);
        }
        else if (s[i] == '$')
        {
            int x = pop(st);
            push(st, x - 1);
        }
        else
        {
            push(st, s[i] - '0');
        }
    }
    cout << st.a[st.top];
}