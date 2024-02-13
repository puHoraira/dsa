#include <bits/stdc++.h>

using namespace std;

//
int fun(int n)
{
    if (n > 0)
    {
        return n + fun(n - 1);
    }
    return 0;
}

int fun2(int n)
{
    static int x = 0;
    if (n > 0)
    {
        x++;
        return fun2(n - 1) + x;
    }
    return 0;
}

void t3rees(int n)
{
    if (n > 0)
    {
        cout << n << " ";
        t3rees(n - 1);
        t3rees(n - 1);
    }
    return;
}

int nested(int n)
{
    if (n > 100)
    {
        return n - 10;
    }
    else
    {
        return nested(nested(n + 11));
    }
}

void in1(int n);
void in2(int n);

int recur(int n)
{
    if (n > 100)
    {
        return n - 10;
    }
    else
    {
        return recur(recur(n + 1));
    }
}

int main()
{
    int a = 6;
    cout << fun(a) << endl;
    cout << fun2(a) << endl;
    t3rees(a);
    cout << endl;
    in1(6);
    cout << endl;
    cout << nested(100) << endl;
}

void in2(int n)
{
    if (n > 1)
    {
        cout << n << " ";
        in1(n / 2);
    }
}

void in1(int n)
{
    if (n > 0)
    {
        cout << n << " ";
        in2(n - 1);
    }
}