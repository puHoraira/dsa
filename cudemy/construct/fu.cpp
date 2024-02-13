#include <bits/stdc++.h>
using namespace std;

// int sum(int a, int b)
// {
//     return a + b;
// }
int sum(int a = 1, int b = 2, int c = 4)
{
    return a + b + c;
}
int main()
{
    cout << sum(5, 6, 7) << endl;
    cout << sum(100, 3) << endl;
    cout << sum() << endl;
    cout << sum(4) << endl;
}