#include <bits/stdc++.h>
using namespace std;

struct converters
{
    struct Stacks
    {
        int top = -1;
        int str[10];
    };
    Stacks st;
    void push(int number);
    int pop();
    int result(string s);
    int is_operator(char c)
    {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
        {
            return 1;
        }
        return 0;
    }
};

void converters::push(int number)
{
    st.top++;
    st.str[st.top] = number;
}

int converters::pop()
{
    int x = st.str[st.top];
    st.top--;
    return x;
}

int converters::result(string s)
{
    int i = 0;
    int ans = 0;
    while (s[i] != '\0')
    {
        if (is_operator(s[i]))
        {
            int x = pop();
            int y = pop();
            int z;
            if (s[i] == '+')
            {
                z = x + y;
            }
            if (s[i] == '-')
            {
                z = y - x;
            }
            if (s[i] == '*')
            {
                z = x * y;
            }
            if (s[i] == '/')
            {
                z = y / x;
            }
            if (s[i] == '^')
            {
                z = pow(y, x);
            }
            cout << z << endl;
            push(z);
        }
        else
        {
            push(s[i] - '0');
        }
        i++;
    }
    return st.str[st.top];
}

int main()
{
    converters cn;
    string s;
    cin >> s;
    cout << cn.result(s);
}