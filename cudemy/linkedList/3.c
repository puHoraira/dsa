#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
    // node()
    // {

    // }
    // node(int x)
    // {
    //     data = x;
    //     next = 0;
    // }
};
void print(struct node *head)
{
    printf("ELE: ");
    struct node *temp = head;
    while (temp != 0)
    {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int len(struct node *head)
{
    int le = 0;
    struct node *p = head;
    while (p != 0)
    {
        p = p->next;
        le++;
    }
    return le;
}
int len2(struct node *p)
{
    if (p == 0)
    {
        return 0;
    }
    return 1 + len2(p->next);
}

int sum(struct node *head)
{
    int ans = 0;
    struct node *tem = head;
    while (tem != 0)
    {
        ans += tem->data;
        tem = tem->next;
    }
    return ans;
}

void create(struct node **head)
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    scanf("%d", &newnode->data);
    newnode->next = 0;
    if (*head == 0)
    {
        *head = newnode;
    }
    else
    {
        struct node *temp = *head;
        while (temp->next != 0)
        {
            temp = temp->next;
        }
        temp->next = newnode;
    }
    return;
}

int main()
{

    struct node *head = 0;
    while (1)
    {
        int n;
        scanf("%d", &n);
        if (n == 1)
            create(&head);
        else if (n == 2)
            print(head);
        else if (n == 5)
            printf("Total Ele : %d\n", len2(head));
        // else if (n == 3)
        //     cout
        //         << "Total Ele: " << len(head) << endl;
        else if (n == 4)
            printf("SUM OF ALL ELE: %d\n", sum(head));
    }
}