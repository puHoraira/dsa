#include <iostream>
using namespace std;

void merge(int a[], int start, int mid, int end)
{
    int i = start;
    int j = mid + 1;
    int k = 0;
    int tm[end - start + 1];
    while (i <= mid && j <= end)
    {
        if (a[i] < a[j])
        {
            tm[k++] = a[i++];
        }
        else
        {
            tm[k++] = a[j++];
        }
    }
    while (i <= mid)
    {
        tm[k++] = a[i++];
    }
    while (j <= end)
    {
        tm[k++] = a[j++];
    }
    for (int i = 0; i < end - start + 1; i++)
    {
        a[i + start] = tm[i];
    }
}

void mergeSort(int a[], int st, int end)
{
    if (st < end)
    {
        int mid = st + ((end - st) / 2);
        mergeSort(a, st, mid);
        mergeSort(a, mid + 1, end);
        merge(a, st, mid, end);
    }
}

int main()
{
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    mergeSort(a, 0, n - 1);
    for (int i = 0; i < n; i++)
    {
        cout << " " << a[i];
    }
    return 0;
}
