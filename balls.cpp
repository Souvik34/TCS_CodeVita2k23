#include<bits/stdc++.h>
using namespace std;

int main()
{
int n,m,b1_i,b1_j,b2_i,b2_j,p1_i,p1_j,p2_i,p2_j;
cin >> n >> m;
cin >> b1_i >> b1_j;
cin >> p1_i >> p1_j;
cin >> b2_i >> b2_j;
cin >> p2_i >> p2_j;
    
int timing = 0;
int ini_b1i = b1_i ,ini_b1j = b1_j, ini_b2i = b2_i, ini_b2j = b2_j;
int test = n+m-1;
bool flag = false;
;
while(true){
if(b1_i==b2_i && b1_j==b2_j) break;
if(((ini_b1i == b1_i && ini_b1j == b1_j) && (ini_b2i == b2_i && ini_b2j == b2_j))&& timing!=0 && test<=0){
flag = true;
break;
}
if(b1_i==n || b1_i==1)
p1_i = -(p1_i);
if(b1_j==m || b1_j==1)
p1_j = -(p1_j);
if(b2_i==n || b2_i==1)
p2_i = -(p2_i);
if(b2_j==m || b2_j==1)
p2_j = -(p2_j);
            
timing++;
b1_i+=p1_i;
b1_j+=p1_j;
b2_i+=p2_i;
b2_j+=p2_j;

test--;
}
    
if(flag) cout<<"Never";
else cout<<timing;
}