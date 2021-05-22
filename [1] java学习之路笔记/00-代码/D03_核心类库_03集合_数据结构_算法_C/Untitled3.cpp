typedef  int Elemtype;
typedef  int Status;
#define  ok  0
#define Error -1
typedef struct LDataNode{
	Elemtype x;
	struct LDataNode *next;//结点指针
}LDataNode;
typedef struct LHNode{
	LDataNode *next; //
	LDataNode *tail; //尾
}LHNode,*LinkList;//带尾指针的链表
//-------------------初始化----------------//
Status InitLink(LinkList *head){//指向**链表结构体指针**的指针（指向指针的指针）
       *head=(LinkList)malloc(sizeof(LHNode));
       LDataNode *p=(LDataNode *)malloc(sizeof(LDataNode));//数据首元结点指针,增设辅助结点的操作很常见，特别是在遍历的时候
       if(*head==NULL || p==NULL) return Error;
       p->next=NULL,(*head)->next=p,(*head)->tail=p;
       return ok;
}
//-------------------加入元素----------------//
Status AddElem(LinkList *head,Elemtype e){
       LDataNode *p=(LDataNode *)malloc(sizeof(LDataNode));//让每次进来的e都有个温暖的家（结点）
       if(p==NULL) return Error;
       p->next=NULL,p->x=e;
       (*head)->tail->next=p;//上一个指针域的结点指向p
       (*head)->tail=p;//更新指针
       return ok;

}
//-------------------遍历----------------//
Status LTraverse(LinkList head){//结构体指针
      LDataNode *p=head->next->next;//p指向首元结点
      while(p){
	      printf("%d",p->x);
	      p=p->next;
      }
	  printf("\n);
      return ok;
}
//-------------------删除----------------//
Status Deletelist(LinkList *head,int i,Elemtype *e){//删除第i个结点并用e返回 
       if(i<1) return Error;
       int j=1;
       LDataNode *p=(*head)->next;//指向首元结点
       while(num!=i&&p->next!=NULL){//p移动到第j-1结点
       p=p->next;
       j++;
       }
       if（p->next==NULL）return Error;
       *e=p->next->x;
       p->next=p->next-next;//修改指针 这就是为什么要移动到第j-1个结点
       return ok;
}
//------------递归求链表最大值----------------------//
Status  GetMax(LDataNode *p){///进来的是首元结点指针
        if(p->next==NULL) return p->x;//只有一个结点
        int j=GetMax(p->next);
        if(p->x>j) return p->x;
        else return j;
}
//----------递归求数据结点的个数-----------------//
Status GetNum(LDataNode *p){
       if(p->next==NULL) return 1;
       
       return 1+GetNum(p->next);
}
//-----------用于逆置链表的遍历--------------------//
Status NewLTraverse(LinkList head){//遍历链表 
	LDataNode *p=head->next;//指向第二个结点（第一个结点是没有数据的） 
    while(p->next){
    	printf("%d",p->x);
    	p=p->next;
	} 
    printf("\n");
	return ok; 
	 
}
//---------------逆置----------------------//
Status InverseList(LinkList *L){
        LDataNode  *p=(*L)->next;//指向首元结点
        (*L)->next=NULL;
        while(p){
        LDataNode *pre=p->next;
        p->next=(*L)->next;
       (*L)->next=p;
        p=pre;
        }
}
void LinkListTest(){
  
  LinkList head;
  InitLink(&head); 
  int i=0;
   
  for(;i<10;i++){
  	AddElem(&head,i);
  }
  LTraverse(head);
  int e;
  DeleteList(&head,3,&e);
  printf("%d\n",e);
  LTraverse(head);
  InverseList(&head);
  NewLTraverse(head);
} 


