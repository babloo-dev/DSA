#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *start = 0;

struct node *createNode()
{
    struct node *k1;

    k1 = (struct node *)malloc(sizeof(struct node));

    printf("Enter a data: ");
    scanf("%d", &k1->data);

    k1->next = 0;

    return k1;
}

void insertStart()
{
    struct node *b1;

    b1 = createNode();

    if (start == 0)
    {
        start = b1;
    }
    else
    {
        b1->next = start;
        start = b1;
    }
}

void insertEnd()
{
}

void insertMiddle()
{
}

void deleteStart()
{
}

void deleteEnd()
{
}

void deleteMiddle()
{
}

void display()
{
    struct node *d1;

    if (start == 0)
    {
        printf("There is no any node to display\n");
    }
    else
    {
        d1 = start;

        while (d1 != 0)
        {
            printf("%d ", d1->data);
            d1 = d1->next;
        }

        printf("\n");
    }
}

int main()
{
    int ch;

    printf("1. Insert from start\n");
    printf("2. Insert from end\n");
    printf("3. Insert from middle\n");
    printf("4. Delete from start\n");
    printf("5. Delete from end\n");
    printf("6. Delete from middle\n");
    printf("7. Display\n");

    while (1)
    {
        printf("\nEnter your choice: ");
        scanf("%d", &ch);

        switch (ch)
        {
        case 1:
            insertStart();
            break;

        case 2:
            insertEnd();
            break;

        case 3:
            insertMiddle();
            break;

        case 4:
            deleteStart();
            break;

        case 5:
            deleteEnd();
            break;

        case 6:
            deleteMiddle();
            break;

        case 7:
            display();
            break;

        default:
            printf("Wrong choice\n");
        }
    }

    return 0;
}