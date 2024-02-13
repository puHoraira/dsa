#include <bits/stdc++.h>

using namespace std;

int main()
{
    int *p = new int[5];
    int *q = new int[10];
    for (int i = 0; i < 5; i++)
    {
        p[i] = i;
    }
    for (int i = 0; i < 5; i++)
    {
        q[i] = p[i] + 1;
    }
    for (int i = 0; i < 5; i++)
    {
        cout << p[i] << " ";
    }
    cout << endl;
    for (int i = 0; i < 10; i++)
    {
        cout << q[i] << " ";
    }
    cout << endl;

    free(p);
    for (int i = 0; i < 5; i++)
    {
        cout << p[i] << " ";
    }
    cout << endl;
    for (int i = 0; i < 10; i++)
    {
        cout << q[i] << " ";
    }
    cout << endl;
    p = q;
    for (int i = 0; i < 5; i++)
    {
        cout << p[i] << " ";
    }
    cout << endl;
    for (int i = 0; i < 10; i++)
    {
        cout << q[i] << " ";
    }
    cout << endl;
    q = NULL;
    for (int i = 0; i < 5; i++)
    {
        cout << p[i] << " ";
    }
    cout << endl;
    for (int i = 0; i < 10; i++)
    {
        cout << q[i] << " r";
    }
    cout << endl;
}