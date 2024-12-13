#include <stdio.h>
#include <stdlib.h>
struct Node {
    int data;
    struct Node* next;
};
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}
void insertEnd(struct Node** head, int data) {
    struct Node* newNode = createNode(data);
    if (*head == NULL) {
        *head = newNode;
    } else {
        struct Node* temp = *head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = newNode;
    }
}
void display(struct Node* head) {
    struct Node* temp = head;
    if (temp == NULL) {
        printf("List is empty.\n");
        return;
    }
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

void sortList(struct Node* head) {
    struct Node *i, *j;
    int temp;
    for (i = head; i != NULL; i = i->next) {
        for (j = i->next; j != NULL; j = j->next) {
            if (i->data > j->data) {
                temp = i->data;
                i->data = j->data;
                j->data = temp;
            }
        }
    }
}
void reverseList(struct Node** head) {
    struct Node *prev = NULL, *current = *head, *next = NULL;
    while (current != NULL) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    *head = prev;
}
void concatenate(struct Node** head1, struct Node* head2) {
    if (*head1 == NULL) {
        *head1 = head2;
        return;
    }
    struct Node* temp = *head1;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = head2;
}
int main() {
    struct Node* head1 = NULL;
    struct Node* head2 = NULL;
    insertEnd(&head1, 10);
    insertEnd(&head1, 30);
    insertEnd(&head1, 20);
    insertEnd(&head1, 50);
    insertEnd(&head1, 40);
    

    insertEnd(&head2, 15);
    insertEnd(&head2, 25);
    
    printf("Original List 1: ");
    display(head1);
    
    printf("Original List 2: ");
    display(head2);
    
    
    sortList(head1);
    printf("Sorted List 1: ");
    display(head1);
    
   
    reverseList(&head1);
    printf("Reversed List 1: ");
    display(head1);
    
    concatenate(&head1, head2);
    printf("Concatenated List: ");
    display(head1);
    
    return 0;
}
