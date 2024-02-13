#include <iostream>
using namespace std;

struct Queues
{
    int rear = 0, front = 0;
    int *a;
    int maxSize;

    Queues(int maxSize)
    {
        this->maxSize = maxSize;
        a = new int[maxSize];
    }

    ~Queues()
    {
        delete[] a;
    }

    void enque(int number);
    int deq();
    int peek_first();
    int isEmpty();
    int isFull();
    void print();
};

void Queues::enque(int number)
{
    if ((rear + 1) % maxSize == front)
    {
        cout << "Queue is full" << endl;
        return;
    }
    rear = (rear + 1) % maxSize;
    a[rear] = number;
}

int Queues::deq()
{
    if (front == rear)
    {
        cout << "Queue is empty" << endl;
        return -1;
    }
    front = (front + 1) % maxSize;
    return a[front];
}

int Queues::peek_first()
{
    if (front == rear)
    {
        cout << "Queue is empty" << endl;
        return -1;
    }
    return a[(front + 1) % maxSize];
}

void Queues::print()
{
    if (isEmpty())
    {
        cout << "Queue is empty" << endl;
        return;
    }
    int i = (front + 1) % maxSize;
    do
    {
        cout << a[i] << " ";
        i = (i + 1) % maxSize;
    } while (i != (rear + 1) % maxSize);
    cout << endl;
}

int Queues::isEmpty()
{
    return front == rear;
}

int Queues::isFull()
{
    return (rear + 1) % maxSize == front;
}

int main()
{
    Queues q(5); // creating a circular queue of size 5

    q.enque(1);
    q.enque(2);
    q.enque(3);
    q.enque(4);
    q.enque(5);
    q.enque(6); // Trying to enqueue when the queue is full

    q.print(); // Printing the queue

    cout << "Dequeued: " << q.deq() << endl; // Dequeuing an element
    cout << "Dequeued: " << q.deq() << endl; // Dequeuing another element

    q.print(); // Printing the modified queue

    return 0;
}
