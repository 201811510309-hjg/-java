typedef  int Elemtype;
typedef  int Status;
#define  ok  0
#define Error -1
typedef struct LDataNode{
	Elemtype x;
	struct LDataNode *next;//���ָ��
}LDataNode;
typedef struct LHNode{
	LDataNode *next; //
	LDataNode *tail; //β
}LHNode,*LinkList;//��βָ�������
//-------------------��ʼ��----------------//
Status InitLink(LinkList *head){//ָ��**����ṹ��ָ��**��ָ�루ָ��ָ���ָ�룩
       *head=(LinkList)malloc(sizeof(LHNode));
       LDataNode *p=(LDataNode *)malloc(sizeof(LDataNode));//������Ԫ���ָ��,���踨�����Ĳ����ܳ������ر����ڱ�����ʱ��
       if(*head==NULL || p==NULL) return Error;
       p->next=NULL,(*head)->next=p,(*head)->tail=p;
       return ok;
}
//-------------------����Ԫ��----------------//
Status AddElem(LinkList *head,Elemtype e){
       LDataNode *p=(LDataNode *)malloc(sizeof(LDataNode));//��ÿ�ν�����e���и���ů�ļң���㣩
       if(p==NULL) return Error;
       p->next=NULL,p->x=e;
       (*head)->tail->next=p;//��һ��ָ����Ľ��ָ��p
       (*head)->tail=p;//����ָ��
       return ok;

}
//-------------------����----------------//
Status LTraverse(LinkList head){//�ṹ��ָ��
      LDataNode *p=head->next->next;//pָ����Ԫ���
      while(p){
	      printf("%d",p->x);
	      p=p->next;
      }
	  printf("\n);
      return ok;
}
//-------------------ɾ��----------------//
Status Deletelist(LinkList *head,int i,Elemtype *e){//ɾ����i����㲢��e���� 
       if(i<1) return Error;
       int j=1;
       LDataNode *p=(*head)->next;//ָ����Ԫ���
       while(num!=i&&p->next!=NULL){//p�ƶ�����j-1���
       p=p->next;
       j++;
       }
       if��p->next==NULL��return Error;
       *e=p->next->x;
       p->next=p->next-next;//�޸�ָ�� �����ΪʲôҪ�ƶ�����j-1�����
       return ok;
}
//------------�ݹ����������ֵ----------------------//
Status  GetMax(LDataNode *p){///����������Ԫ���ָ��
        if(p->next==NULL) return p->x;//ֻ��һ�����
        int j=GetMax(p->next);
        if(p->x>j) return p->x;
        else return j;
}
//----------�ݹ������ݽ��ĸ���-----------------//
Status GetNum(LDataNode *p){
       if(p->next==NULL) return 1;
       
       return 1+GetNum(p->next);
}
//-----------������������ı���--------------------//
Status NewLTraverse(LinkList head){//�������� 
	LDataNode *p=head->next;//ָ��ڶ�����㣨��һ�������û�����ݵģ� 
    while(p->next){
    	printf("%d",p->x);
    	p=p->next;
	} 
    printf("\n");
	return ok; 
	 
}
//---------------����----------------------//
Status InverseList(LinkList *L){
        LDataNode  *p=(*L)->next;//ָ����Ԫ���
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


