public class AllSubstring {
    public static void printSubstrings(String str) {
// p
// pq
// pqr
// pqrs    for this
// q
// qr
// qrs
// r
// rs
// s

//         for(int i=0;i<str.length();i++){
//            for(int j=i;j<str.length();j++){
//                System.out.println(str.substring(i, j+1));//i inclusive and j exclusive
//            }
//         }

// p
// q
// r
// s
// pq          for this
// qr
// rs
// pqr
// qrs
// pqrs
for(int len=1;len<=str.length();len++){
    for(int start=0;start<=str.length()-len;start++){
        int end=start+len-1;
        System.out.println(str.substring(start, end+1));
    }
}
    }
    public static void main(String[]args){
        String str="pqrs";
        printSubstrings(str);
    }
}
