#include <bits/stdc++.h>
using namespace std;

struct Converter
{
    struct Stacks
    {
        int top = -1;
        int size;
        string str;
    };
    Stacks st;
    string transform(string s);
    int precedence(char a);
    int is_operand(char a);
    void push(char c);
    char peekTop();
    char pop();
};

void Converter::push(char c)
{

    st.top++;
    st.str[st.top] = c;
    return;
}
char Converter::peekTop()
{
    return st.str[st.top];
}

char Converter::pop()
{

    char x = st.str[st.top];
    st.top--;
    return x;
}

int Converter::is_operand(char a)
{
    if (a == '+' || a == '-' || a == '*' || a == '/' || a == '^')
    {
        return 0;
    }
    return 1;
}

string Converter::transform(string s)
{
    int length = s.length();
    char result[length + 2];
    int i = 0;
    int j = 0;
    while (s[i] != '\0')
    {
        if (s[i] == ')')
        {
            while (st.top != -1 && peekTop() != '(')
            {
                result[j++] = pop();
            }
            // Pop the '(' from the stack
            if (st.top != -1 && peekTop() == '(')
            {
                pop();
            }
            i++;
        }
        else if (s[i] == '(')
        {
            push(s[i++]);
        }
        else if (is_operand(s[i]))
        {

            result[j++] = s[i++];
        }
        else
        {
            if (precedence(s[i]) > precedence(peekTop()))
            {
                push(s[i++]);
            }
            else
            {
                result[j++] = pop();
            }
        }
    } // a+b*c-d/e
    while (st.top != -1)
    {
        char cc = pop();
        result[j] = cc;
        j++;
    }
    result[j] = '\0';
    cout << result;
    return result;
}
int Converter::precedence(char a)
{
    if (a == '-' || a == '+')
    {
        return 1;
    }
    else if (a == '*' || a == '/')
    {
        return 2;
    }
    else if (a == '^')
    {
        return 3;
    }
    return 0;
}

int main()
{
    string s;
    cin >> s;
    Converter *t = new Converter;
    string x = t->transform(s);
}