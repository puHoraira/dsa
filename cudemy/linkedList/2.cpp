#include <bits/stdc++.h>

using namespace std;

struct node
{
    int data;
    node *next;
    // node()
    // {

    // }
    // node(int x)
    // {
    //     data = x;
    //     next = 0;
    // }
};
void print(node *head)
{
    cout << "ELEMENTS: ";
    node *temp = head;
    while (temp != 0)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

void print2(node *tmp)
{
    if (tmp != NULL)
    {
        cout << tmp->data << " ";
        print2(tmp->next);
    }
}

int len(node *head)
{
    int le = 0;
    node *p = head;
    while (p != 0)
    {
        p = p->next;
        le++;
    }
    return le;
}
int len2(node *p)
{
    if (p == 0)
    {
        return 0;
    }
    return 1 + len2(p->next);
}

int sum(node *head)
{
    int ans = 0;
    node *tem = head;
    while (tem != 0)
    {
        ans += tem->data;
        tem = tem->next;
    }
    return ans;
}

int sum2(node *head)
{
    if (head == NULL)
    {
        return 0;
    }
    return head->data + sum2(head->next);
}

void create(node *&head)
{
    node *newnode = new node();
    cin >> newnode->data;
    newnode->next = 0;
    if (head == 0)
    {
        head = newnode;
    }
    else
    {
        node *temp = head;
        while (temp->next != 0)
        {
            temp = temp->next;
        }
        temp->next = newnode;
    }
    return;
}

int maxi(node *head)
{
    int mx = INT_MIN;
    node *tm = head;
    while (tm != 0)
    {
        if (tm->data > mx)
        {
            mx = tm->data;
        }
        tm = tm->next;
    }
    return mx;
}

int mini(node *head)
{
    int mx = INT_MAX;
    node *tm = head;
    while (tm != 0)
    {
        if (tm->data < mx)
        {
            mx = tm->data;
        }
        tm = tm->next;
    }
    return mx;
}

bool search(node *head)
{
    int n;
    cin >> n;
    node *tm = head;
    while (tm != 0)
    {
        if (tm->data == n)
        {
            return true;
        }
        tm = tm->next;
    }
    return false;
}

bool searchEx(node *&head)
{
    int x;
    cin >> x;
    node *prv = 0;
    node *now = head;
    while (now != 0)
    {
        if (x == now->data)
        {
            prv->next = now->next;
            now->next = head;
            head = now;
            return true;
        }
        prv = now;
        now = now->next;
    }
    return false;
}

node *searchh(node *p, int n)
{
    while (p != NULL)
    {
        /* code */
        if (p->data == n)//peye gele ekhane dhubke
        {
            return p;
        }
        else
            p = p->next;
    }
    return NULL;// Na paile ei condition e dhukbe
}

void insert_fast(node *&head)
{
    node *newnode = new node();
    cin >> newnode->data;
    newnode->next = head;
    head = newnode;
    cout << "inserted before first" << endl;
}

void insert_pos(node *&head)
{
    int pos;
    cout << "pos must be greater then 0 and less than length(value, position) " << len(head);
    node *newnode = new node();
    cin >> pos >> newnode->data;
    node *tm = head;
    if (pos == 0 || pos > len(head))
    {
        cout << "Wrong" << endl;
        return;
    }
    if (pos == 1)
    {
        newnode->next = head;
        head = newnode;
        return;
    }
    for (int i = 0; i < pos - 2; i++)
    {
        tm = tm->next;
    }
    newnode->next = tm->next;
    tm->next = newnode;
}

void insert_in_sorted(node *&head)
{
    node *newnode = new node();
    cin >> newnode->data;
    node *tmp = head;
    if (head == 0)
    {
        head = newnode;
        return;
    }
    if (head->next == 0)
    {
        if (head->data > newnode->data)
        {
            newnode->next = head;
            head = newnode;
        }
        else
        {
            head->next = newnode;
        }
        return;
    }
    if (head->data >= newnode->data)
    {
        newnode->next = head;
        head = newnode;
        return;
    }
    while (1)
    {
        if (tmp->next->next == 0)
        {
            if (tmp->next->data >= newnode->data)
            {
                newnode->next = tmp->next;
                tmp->next = newnode;
            }
            else
            {
                tmp->next->next = newnode;
            }
            return;
        }
        if (tmp->next->data > newnode->data)
        {
            newnode->next = tmp->next;
            tmp->next = newnode;
            return;
        }
        tmp = tmp->next;
    }
}

void delete_pos(node *&head)
{
    node *tmp = head, *prv = head;
    int n;
    cin >> n;
    if (n == 1)
    {
        node *newnode = head;
        head = head->next;
        delete (newnode);
        return;
    }
    while (--n)
    {
        prv = tmp;
        tmp = tmp->next;
    }
    node *newnode = tmp;
    prv->next = tmp->next;
    delete (newnode);
}

void delete_number(node *&head)
{
    int n;
    cin >> n;
    while (n == head->data && head != 0)
    {
        node *newnode = head;
        head = head->next;
        delete (newnode);
    }
    node *tmp = head, *prev = head;
    while (tmp != 0)
    {
        if (tmp->data == n)
        {
            node *newnode = tmp;
            prev->next = tmp->next;
            delete (newnode);
        }
        if (tmp != 0)
            prev = tmp;
        tmp = tmp->next;
    }
}

void is_sorted(node *tmp)
{
    while (tmp->next != 0)
    {
        if (tmp->data > tmp->next->data)
        {
            cout << "Not Sorted" << endl;
            return;
        }
        tmp = tmp->next;
    }
    cout << "sorted" << endl;
}

void delete_duplicate(node *&head)
{
    node *q = head;
    while (q != 0)
    {
        int n;
        n = q->data;
        node *tmp = q->next, *prev = q;
        while (tmp != 0)
        {
            if (tmp->data == n)
            {
                node *newnode = tmp;
                prev->next = tmp->next;
                delete (newnode);
            }
            if (tmp != 0)
                prev = tmp;
            tmp = tmp->next;
        }
        q = q->next;
    }
}

void delete_duplicate2(node *&head)
{
    node *p = head;
    node *q = p->next;
    while (q != 0)
    {
        if (p->data != q->data)
        {
            p = q;
            q = q->next;
        }
        else
        {
            p->next = q->next;
            delete q;
            q = q->next;
        }
    }
}

void reverse1(node *&head)
{
    int length = len(head);
    int a[length];
    int i = 0;
    node *tm = head;
    while (tm != 0)
    {
        a[i] = tm->data;
        i++;
        tm = tm->next;
    }
    tm = head;
    i--;
    while (tm != 0)
    {
        tm->data = a[i];
        i--;
        tm = tm->next;
    }
}

void reverse(node *&head)
{
    if (head == 0 || head->next == 0)
    {
        return;
    }
    node *p = head;
    node *q = 0, *r = 0;
    while (p != 0)
    {
        r = q;
        q = p;
        p = p->next;
        q->next = r;
    }
    head = q;
}

void reverse2(node *&head, node *p, node *q)
{
    if (p != 0)
    {
        reverse2(head, p->next, p);
        p->next = q;
    }
    else
    {
        head = q;
    }
}

int main()
{

    node *head = 0;
    while (1)
    {
        int n;
        cin >> n;
        if (n == 1)
            create(head);
        else if (n == 2)
            print(head);
        else if (n == 3)
            cout << "Total Ele: " << len(head) << endl;
        else if (n == 4)
            cout << "SUM OF ALL ELE: " << sum(head) << endl;
        else if (n == 5)
            cout << "Total Ele: " << len2(head) << endl;
        else if (n == 6)
            cout << "Maximum: " << maxi(head) << endl;
        else if (n == 7)
            cout << "Minimum: " << mini(head) << endl;
        else if (n == 8)
            cout << "Searched " << search(head) << endl;
        else if (n == 9)
            cout << "EXTRA SEARCH: " << searchEx(head) << endl;
        else if (n == 10)
            insert_fast(head);
        else if (n == 11)
            insert_pos(head);
        else if (n == 12)
            print2(head);
        else if (n == 13)
            cout << "SUM OF ALL ELE: " << sum2(head) << endl;
        else if (n == 14)
            insert_in_sorted(head);
        else if (n == 15)
            delete_pos(head);
        else if (n == 16)
            delete_number(head);
        else if (n == 17)
            is_sorted(head);
        else if (n == 18)
            delete_duplicate(head);
        else if (n == 19)
            reverse(head);
        else if (n == 20)
            reverse1(head);
        else if (n == 21)
            delete_duplicate2(head);
        else if (n == 22)
            reverse2(head, head, 0);
    }
}