#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int *p = (int *)malloc(n * sizeof(int));
    for (int i = 0; i < n; i++)
    {
        cin >> *(p + i);
    }
    for (int i = 0; i < n; i++)
    {
        cout << *(p + i) << " ";
    }
    for (int i = 0; i < n; i++)
    {
        cout << (p + i) << " ";
    }
}
/*
 */