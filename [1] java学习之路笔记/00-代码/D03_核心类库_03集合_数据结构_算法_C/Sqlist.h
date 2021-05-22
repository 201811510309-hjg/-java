
#define List_init_size 100 //初始 
#define listincrement  10 //增量 
#define  Status int
#define ok 0
#define Error -1
#define MaxSize 100
typedef int Elemtype;

typedef struct{
	Elemtype *elem;
	Elemtype length;
	Elemtype listsize;//当前分配的存储容量 
}SqList;
