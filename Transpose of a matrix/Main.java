#include<stdio.h>
int main()
{
  //Type your code here
  int r,c,i,j,i1,j1,i2,j2;
  scanf("%d%d",&r,&c);
  int mat[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&mat[i][j]);
    }
  }
  int tran[c][r];
  for(i1=0,i2=0;i<c,i2<r;i1++,i2++)
  {
    for(j1=0,j2=0;j1<r,j2<c;j1++,j2++)
    {
tran[j1][i1]=mat[i2][j2];
    }
  }
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      printf("%d ",tran[i][j]);
    }printf("\n");
  }
      
  
  return 0;
}