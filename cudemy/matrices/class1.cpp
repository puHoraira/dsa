#include <bits/stdc++.h>
using namespace std;
class Diagonal
{
private:
    int row;
    int *a;

public:
    Diagonal(int row)
    {
        this->row = row;
        this->a = new int[row];
    }
    void add_value(int i, int j, int x)
    {
        if (i == j)
        {
            a[i] = x;
        }
    }
    int get(int i, int j)
    {
        if (i == j)
        {
            return a[i];
        }
        return 0;
    }
    void display()
    {
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < row; j++)
            {
                if (i == j)
                {
                    cout << a[i] << " ";
                }
                else
                {
                    cout << "0"
                         << " ";
                }
            }
            cout << endl;
        }
    }
};
int main()
{
    int n;
    cin >> n;
    Diagonal dia(n);
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        dia.add_value(i, i, x);
    }
    dia.display();
}