import java.util.*;

public class Subsequence {
    public static void main(String[] args) {
        List<String> subSequence=findSubSequ("abc");
        // List<String> subSequence=allSubSequ("abc","");
        System.out.println(subSequence);
    }

    // Using Single call recursion => 
    public static List<String> findSubSequ(String str){
        if(str.length()==0){
            List<String> list=new ArrayList<>();
            list.add("");
            return list;
        }

        List<String> ans=findSubSequ(str.substring(1));
        char ch=str.charAt(0);
        int n=ans.size();
        for(int i=0;i<n;i++){
            ans.add(ans.get(i)+ch);
        }
        
        return ans;
    }

    // Using a answer string and double recursion call =>
    public static List<String> allSubSequ(String str,String st){
        if(str.length()==0){
            List<String> list=new ArrayList<>();
            list.add(st);
            return list;
        }

        char ch=str.charAt(0);
        List<String> ans=allSubSequ(str.substring(1), st+ch);
        List<String> lst=allSubSequ(str.substring(1), st+"");
        for(int i=0;i<lst.size();i++)ans.add(lst.get(i));

        return ans;
    }
}
