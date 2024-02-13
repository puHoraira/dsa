#include <bits/stdc++.h>
using namespace std;

void swap1(int a, int b)
{
    int t = a;
    a = b;
    b = t;
}
void swap2(int *a, int *b)
{
    int t = *a;
    *a = *b;
    *b = t;
}
void swap3(int &a, int &b)
{
    int t = a;
    a = b;
    b = t;
}

int main()
{
    int a, b;
    cin >> a >> b;
    swap1(a, b);
    cout << a << " " << b << endl;
    swap2(&a, &b);
    cout << a << " " << b << endl;
    swap3(a, b);
    cout << a << " " << b << endl;
}
/*
 */