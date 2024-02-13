#include <bits/stdc++.h>

using namespace std;

void hanoi(int n, char frm, char to, char use)
{
    if (n > 0)
    {
        hanoi(n - 1, frm, use, to);
        cout << "Moved " << n << " From " << frm << " to " << to << endl;
        hanoi(n - 1, frm, to, use);
    }
}

int main()
{
    int n;
    cin >> n;
    hanoi(n, '1', '3', '2');
}