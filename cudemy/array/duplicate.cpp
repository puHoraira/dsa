#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    cin >> s;
    int h = 0, i = 0;
    for (i = 0; s[i] != '\0'; i++)
    {
        int x = 1;
        x = x << (s[i] - 97);
        if ((x & h) > 0)
        {
            cout << "Duplicate";
            return 0;
        }
        else
        {
            h = x | h;
        }
    }
    cout << "unique";
}