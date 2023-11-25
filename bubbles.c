#include <stdio.h>


int des=0,as=0,t;
void Sort_descend(int arr[], int n)
{
  for (int i = 0; i < n - 1; ++i)
    {
    for (int p = 0; p < n - i - 1; ++p)
    {
      if (arr[p] < arr[p + 1])
      {
        t = arr[p];
        arr[p] = arr[p + 1];
        arr[p + 1] = t;
        des++;
      }
    }
  }
}

void Sort_ascend(int arr[], int n)
{
  for (int i = 0; i < n - 1; ++i)
  {
    for (int p = 0; p < n - i - 1; ++p)
    {
      if (arr[p] > arr[p + 1])
      {
        int t = arr[p];
        arr[p] = arr[p + 1];
        arr[p + 1] = t;
        as++;
      }
    }
  }
}

int main() {
    int n;
    scanf("%d",&n);
    int data[n],data1[n];
    for(int p=0;p<n;p++){
        scanf("%d",&data[p]);
        data1[p]=data[p];
    }
  Sort_descend(data, n);
  Sort_ascend(data1, n);
  if(des>as)
  printf("%d",as);
  else
  printf("%d",des);
}