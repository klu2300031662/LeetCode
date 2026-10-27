class Solution {
    public String[] createGrid(int m, int n) {
        char[][] ch = new char[m][n];
        if(m == 1){
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    ch[i][j] = '.';
                }
            }
            
        }
        else{
            int j = 0;
            for(int i=0; i<m; i++){
                int count = 2;
                while(count > 0 && j < n){
                    ch[i][j] = '.';
                    count--;
                    j++;
                }
                j--;
            }
            for(int i=0; i<m; i++){
                for(j=0; j<n; j++){
                    if(ch[i][j] != '.'){
                        ch[i][j] = '#';
                    }
                }
            }
            int startIndex = 0;
            for(j = 0; j<n; j++){
                if(ch[m-1][j] == '.'){
                    startIndex = j;
                }
            }
            for(j = startIndex; j<n; j++){
                ch[m - 1][j] = '.';
            }
        }
        String[] str = new String[m];
        for(int i=0; i<m; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(ch[i][j]);
            }
            str[i] = sb.toString();
        }
       
        return str;
    }
}