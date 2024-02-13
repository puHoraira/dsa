#include <iostream>
using namespace std;

int main()
{
    int t;
    scanf("%d", &t);
    while (t--)
    {
        int n, k;
        scanf("%d %d", &n, &k);
        if (n % k == 0)
        {
            cout << n / k << endl;
        }
        else
        {
            int main_n = n - 1;
            while (n)
            {
                if (n % k == 0)
                {
                    if (((main_n + 1) - n) % (n / k) == 0)
                    {
                        cout << n / k << endl;
                        break;
                    }
                }
                n--;
            }
        }
    }
}