
//--------------������Ƿ���Sqlist.h�ļ���--------------//
#include "Sqlist.h"
#include "stdio.h"
#include <malloc.h>
//----------------------��ʼ����ľ����ͷ��㣩-----------//
Status Initlist_Sq(SqList *L){ //��ʼ�����裺�����ַ ���� ���� 
	L->elem=(Elemtype *)malloc(List_init_size*sizeof(Elemtype));//����Ԥ����ռ� 
	if(!(L->elem)) return Error;
	L->length=0;//��ʼ����Ϊ0
	L->listsize=List_init_size;//����Ϊ��ʼ����
	return ok;	
}
//---------------------------���Ա�Ĳ���-----------------//
Status ListInsert_Sq(SqList *L,int i,Elemtype e){//�����Ա�iλ�ò���eԪ��{
   if(i<1||i>L->length+1) return Error;
   Elemtype *p=&(L->elem[L->length-1]),*newbase; //pָ�����һ������
   if(L->length>=L->L->listsize){
    newbase=(Elemtype *)malloc(sizeof(Elemtype)*(L->listsize+listincrement));
    L->elem=newbase;
    L->listsize+=listincremen;
   }
   Elemtype *q=&(L->elem[i-1]);//qΪ����λ��
   for(:p>q;--p){
   *(p+1)=*p;//��λ
   }
   *q=e,++L->length;
   return ok;
}
//-------------------------ɾ��--------------------------//
Status ListDelete_Sq(SqList *L,int i,Elemtype *e){//ɾ����i��λ�õ�Ԫ�� ��e���� 
       if(i<1||i>L->length) return Error;
       Elemtype *p,*q;
       p=&(L->elem[i-1]);//p����λ
       *e=*p;
       q=L->elem+L->length+1;//q��λ�ڱ�β
       for(++p;p<=q;++p){
       	    *(p-1)=*p; 
	     --(L->length);
       }
       return ok;
}
//-------------------------��ȡ��i��Ԫ��--------------------//
Status GetElement_Sq(SqList *L, int i, Elemtype *e){
       if(i<1||i>L->length) return Error;
       *e=*(L-elem+i-1);
       return ok;
}
//---------------------����ÿһ��Ԫ��---------------//
Status VisitElem_Sq(SqList *L){
       Elemtype e,*p=L->elem;//ָ���ͷ
       for(;p<&(l->elem[l->length-1]);p++){
		e=*p,printf("L�����Ԫ�أ�%d\n",e);
	}
	return ok;
}

//----------------A��B���Ƿǵݼ�����ϲ���A���ǵݼ�����-----------------//
Status TwoListSortMethod(Sqist *A,SqList *B){
       if(A->length+B->length>MaxSize){
       return -1;
       }
       int i=A->length,j=B->length;
       while(j>0){
          if(i==0||A->elem[i-1]<B->elem[j-1]){
          A->elem[i-1+j]=B->elem[j-1];//B[j-1]�ǵ�i+j���Ԫ��
          --j;
          }else{
          A-elem[i-1+j]=A[i-1];//A[i-1]�ǵ�i-i+j���Ԫ��
          ++i;         
          }
       }A->length=A->length+B->length;
}
//-----------------------A��B����ͬ��Ԫ����C��----------------------//
Status A_elemEqualB_elemSort_end(SqList *A,SqList *B,SqList *c){//������β�����C��
       Initlist_Sq(c); 
       if(C->listsize<A->length+B->length) return -1;
       int i=A->length-1,j=B->length-1,k=0;
       while(i>=0 && j>=0){
         if(A->elem[i]>B->elem[j]) --i;
         else if(A->elem[i]<B->elem[j]) --j;
         else{
          C->elem[k++]=A->elem[i];
          (C-length)++;
         --i,--j;
          }
      }return ok;
}
//---------------------����A��BԪ�� �ظ�Ԫ��ֻ�ܱ���һ��------------------------//
Status SavaOnlyoneInCList(SqList *A,SqList *B,SqList *c){
	//A.B�ǵݼ�˳���ϲ����ظ�Ԫ��ֻ����һ���������ݽṹ��P10.7 
	Initlist_Sq(c);
	int i=0,j=0,k=0;
	while(i<=A->length && j<=B->length){
		if(A->elem[i]<B->elem[j]) c->elem[k++]=A->elem[i],++i,c->length++;
		else if(A->elem[i]>B->elem[j]) c->elem[k++]=B->elem[j],++j,c->length++;
		else{
		c->elem[k++]=A->elem[i];
		c->length++;
		i++;
		j++;
		} 
	}
}
//---------------------test-------------------//
void LinearlistTest(){
	SqList la;
	Elemtype e;
	Initlist_Sq(&la);
	int i=0,j=0;
	for(i=1;i<10;i++){
		scanf("%d",&j);
		ListInsert_Sq(&la,i,j);
	}
	VisitElem_Sq(&la);
	GetElement_Sq(&la,3,&e);
	ListDelete_Sq(&la,3,&e);
}



