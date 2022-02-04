public class JavaStringTokens {

    public static void main(String[] args) {
    stringToken("He is a very very good boy, isn't he?");
    }

    static void stringToken(String s){
        s=s.replaceAll("[^a-z A-Z]"," ");
        s=s.replaceAll("\\s+"," ");
        s=s.trim();
        String [] arr = s.split(" ");
        if(s.length() > 0){
            System.out.println(arr.length);
            for(String e : arr){
                System.out.println(e);
            }
        } else {
            System.out.println(0);
        }
    }

}
