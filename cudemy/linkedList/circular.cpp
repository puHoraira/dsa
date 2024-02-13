#include <bits/stdc++.h>

using namespace std;
class Circular
{
public:
    class Node
    {
    public:
        int data;
        Node *next;

        Node(int n)
        {
            data = n;
            next = 0;
        }
        Node() {}
    };
    Node *head = 0;
    void add_value(int n);

    void display();
    void n_th(int n, int pos);
    void delete_n_th(int pos);
};

void Circular::delete_n_th(int pos)
{
    if (pos == 0)
    {
        Node *newnode = head;
        head = head->next;
        delete newnode;
        return;
    }
    Node *tm = head, *prv = head;
    while (pos--)
    {
        prv = tm;
        tm = tm->next;
    }
    Node *newnode = tm;
    prv->next = tm->next;
    delete newnode;
}

void Circular::n_th(int n, int pos)
{
    Node *newnode = new Node(n);
    if (pos == 0)
    {
        newnode->next = head;
        head = newnode;
        return;
    }
    Node *tm = head, *prv = head;
    while (pos--)
    {
        prv = tm;
        tm = tm->next;
    }
    prv->next = newnode;
    newnode->next = tm;
}

void Circular::display()
{
    Node *tm = head;
    if (head == 0)
    {
        return;
    }
    do
    {
        cout << tm->data << " ";
        tm = tm->next;
    } while (tm != head);
    cout << endl;
}
void Circular::add_value(int n)
{
    Node *newnode = new Node(n);

    if (head == 0)
    {
        head = newnode;
        head->next = head;
        return;
    }
    Node *tm = head;
    Node *prv = head;
    do
    {
        prv = tm;
        tm = tm->next;
        if (tm == head)
        {
            prv->next = newnode;
            newnode->next = head;
            break;
        }
    } while (1);
}

int main()
{
    Circular *cccl = new Circular();
    cccl->add_value(1);
    cccl->add_value(2);
    cccl->add_value(3);
    cccl->add_value(4);
    cccl->add_value(5);
    cccl->add_value(6);
    cccl->add_value(7);
    cccl->add_value(8);
    cccl->add_value(9);
    cccl->n_th(67, 0);
    cccl->display();
}