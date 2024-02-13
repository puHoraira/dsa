#include <bits/stdc++.h>

using namespace std;

struct Queues
{
    int rear = -1;
    int front = -1;
    int maxSize;
    int *array;
    Queues(int size)
    {
        maxSize = size;
        array = new int[maxSize];
    }
    int isFull();
    void add(int number);
    void remove();
    int peek_first();
    int isEmpty();
    void print();
};

int Queues::isFull()
{
    return rear == maxSize - 1;
}

int Queues::isEmpty()
{
    return rear == -1;
}
int Queues::peek_first()
{
    if (isEmpty())
    {
        cout << "prothome kisui nai" << endl;
        return -1;
    }
    return array[0];
}

void Queues::add(int number)
{
    if (rear + 1 == maxSize)
    {
        cout << "jayga naito" << endl;
        return;
    }
    rear++;
    array[rear] = number;
    return;
}
void Queues::remove()
{
    if (isEmpty())
    {
        cout << "faka hoia ase" << endl;
        return;
    }
    front++;
    return;
}

void Queues::print()
{
    for (int i = front + 1; i <= rear; i++)
    {
        cout << array[i] << " ";
    }
    cout << endl;
}

int main()
{
    int maxSize;
    cin >> maxSize;
    Queues xy(maxSize);
    xy.remove();
    xy.peek_first();
    xy.add(0);
    xy.add(1);
    xy.add(2);
    xy.add(3);
    xy.add(4);
    xy.print();
}