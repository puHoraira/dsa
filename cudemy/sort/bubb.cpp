#include <bits/stdc++.h>

using namespace std;

void bubble(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (a[j] > a[j + 1])
            {
                int tm = a[j];
                a[j] = a[j + 1];
                a[j + 1] = tm;
            }
        }
    }
}

void selection(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        int minpos = i;
        for (int j = i + 1; j < n; j++)
        {
            if (a[j] < a[minpos])
            {
                minpos = j;
            }
        }
        int tm = a[i];
        a[i] = a[minpos];
        a[minpos] = tm;
    }
}

void ins(int a[], int n)
{
    for (int i = 1; i < n; i++)
    {
        int j = i - 1;
        int x = a[i];
        while (j >= 0 && a[j] > x)
        {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = x;
    }
}

void merge(int a[], int start, int mid, int end)
{
    int i = start, j = mid + 1, k = 0;
    int *tm = new int[end - start + 1];
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
    for (i = 0; i < end - start + 1; i++)
    {
        a[i + start] = tm[i];
    }
}

void mergeSort(int a[], int start, int end)
{
    if (start < end)
    {
        int mid = start + (end - start) / 2;
        mergeSort(a, start, mid);
        mergeSort(a, mid + 1, end);
        merge(a, start, mid, end);
    }
}

int pivotting(int a[], int start, int end)
{
    int pivot = a[end];
    int i = start - 1;
    for (int j = start; j <= end; j++)
    {
        if (a[j] < pivot)
        {
            i++;
            int tm = a[j];
            a[j] = a[i];
            a[i] = tm;
        }
    }
    int tm = a[end];
    a[end] = a[i + 1];
    a[i + 1] = tm;
    return i + 1;
}

void quickSort(int a[], int start, int end)
{
    if (start < end)
    {
        int pivot = pivotting(a, start, end);
        quickSort(a, start, pivot - 1);
        quickSort(a, pivot + 1, end);
    }
}

int getMax(int a[], int n)
{
    int maxi = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        if (a[i] > maxi)
        {
            maxi = a[i];
        }
    }
    return maxi;
}

int *countSort(int a[], int n)
{
    int max = getMax(a, n);
    int *b = new int[max + 1];
    for (int i = 0; i <= max; i++)
    {
        b[i] = 0;
    }
    for (int i = 0; i < n; i++)
    {
        b[a[i]]++;
    }
    return b;
}

int main()
{
    int a[] = {5, 4, 3, 2, 1};
    bubble(a, 5);
    for (int i = 0; i < 5; i++)
    {
        cout << a[i] << " ";
    }
    cout << endl;
    int b[] = {5, 4, 3, 2, 1};
    ins(b, 5);
    for (int i = 0; i < 5; i++)
    {
        cout << b[i] << " ";
    }
    cout << endl;
    int c[] = {5, 4, 3, 2, 1};
    selection(c, 5);
    for (int i = 0; i < 5; i++)
    {
        cout << c[i] << " ";
    }
    cout << endl;
    int d[] = {-1, 4, 9, 2, 1};
    mergeSort(d, 0, 4);
    for (int i = 0; i < 5; i++)
    {
        cout << d[i] << " ";
    }
    cout << endl;
    int e[] = {-1, 4, 9, 2, 1};
    quickSort(e, 0, 4);
    for (int i = 0; i < 5; i++)
    {
        cout << e[i] << " ";
    }
    cout << endl;
    int e[] = {-1, 4, 9, 2, 1};
    quickSort(e, 0, 4);
    for (int i = 0; i < 5; i++)
    {
        cout << e[i] << " ";
    }
}