class Solution {
    public int equate(int x,int n){
        int a=(x*(x+1))/2;
        int b=((n*(n+1))/2)-a+x;
        // System.out.print(a+" "+b);
        if(a==b) return 0;
        else if(a>b) return 1;
        return -1;
    }

    public int pivotInteger(int n) {
        int l=0;
        int r=n;
        int mid=-1;;
        while(l<=r){
            mid=l+(r-l)/2;
            if(equate(mid,n)==0) return mid;
            else if(equate(mid,n)==-1) l=mid+1;
            else r=mid-1;
        }
        return -1;
    }
}