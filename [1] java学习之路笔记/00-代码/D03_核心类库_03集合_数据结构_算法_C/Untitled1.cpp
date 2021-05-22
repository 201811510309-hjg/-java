
//--------------上面的是放在Sqlist.h文件下--------------//
#include "Sqlist.h"
#include "stdio.h"
#include <malloc.h>
//----------------------初始化（木有设头结点）-----------//
Status Initlist_Sq(SqList *L){ //初始化步骤：分配基址 长度 容量 
	L->elem=(Elemtype *)malloc(List_init_size*sizeof(Elemtype));//分配预定义空间 
	if(!(L->elem)) return Error;
	L->length=0;//初始长度为0
	L->listsize=List_init_size;//容量为初始容量
	return ok;	
}
//---------------------------线性表的插入-----------------//
Status ListInsert_Sq(SqList *L,int i,Elemtype e){//在线性表i位置插入e元素{
   if(i<1||i>L->length+1) return Error;
   Elemtype *p=&(L->elem[L->length-1]),*newbase; //p指向最后一个数据
   if(L->length>=L->L->listsize){
    newbase=(Elemtype *)malloc(sizeof(Elemtype)*(L->listsize+listincrement));
    L->elem=newbase;
    L->listsize+=listincremen;
   }
   Elemtype *q=&(L->elem[i-1]);//q为插入位置
   for(:p>q;--p){
   *(p+1)=*p;//移位
   }
   *q=e,++L->length;
   return ok;
}
//-------------------------删除--------------------------//
Status ListDelete_Sq(SqList *L,int i,Elemtype *e){//删除第i个位置的元素 用e返回 
       if(i<1||i>L->length) return Error;
       Elemtype *p,*q;
       p=&(L->elem[i-1]);//p来定位
       *e=*p;
       q=L->elem+L->length+1;//q定位于表尾
       for(++p;p<=q;++p){
       	    *(p-1)=*p; 
	     --(L->length);
       }
       return ok;
}
//-------------------------获取第i个元素--------------------//
Status GetElement_Sq(SqList *L, int i, Elemtype *e){
       if(i<1||i>L->length) return Error;
       *e=*(L-elem+i-1);
       return ok;
}
//---------------------遍历每一个元素---------------//
Status VisitElem_Sq(SqList *L){
       Elemtype e,*p=L->elem;//指向表头
       for(;p<&(l->elem[l->length-1]);p++){
		e=*p,printf("L链表的元素：%d\n",e);
	}
	return ok;
}

//----------------A和B都是非递减有序合并在A表（非递减有序）-----------------//
Status TwoListSortMethod(Sqist *A,SqList *B){
       if(A->length+B->length>MaxSize){
       return -1;
       }
       int i=A->length,j=B->length;
       while(j>0){
          if(i==0||A->elem[i-1]<B->elem[j-1]){
          A->elem[i-1+j]=B->elem[j-1];//B[j-1]是第i+j大的元素
          --j;
          }else{
          A-elem[i-1+j]=A[i-1];//A[i-1]是第i-i+j大的元素
          ++i;         
          }
       }A->length=A->length+B->length;
}
//-----------------------A和B表相同的元素入C表----------------------//
Status A_elemEqualB_elemSort_end(SqList *A,SqList *B,SqList *c){//递增表尾排序合C法
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
//---------------------保存A，B元素 重复元素只能保存一个------------------------//
Status SavaOnlyoneInCList(SqList *A,SqList *B,SqList *c){
	//A.B非递减顺序表合并（重复元素只保存一个）《数据结构》P10.7 
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



