
#define List_init_size 100 //��ʼ 
#define listincrement  10 //���� 
#define  Status int
#define ok 0
#define Error -1
#define MaxSize 100
typedef int Elemtype;

typedef struct{
	Elemtype *elem;
	Elemtype length;
	Elemtype listsize;//��ǰ����Ĵ洢���� 
}SqList;
