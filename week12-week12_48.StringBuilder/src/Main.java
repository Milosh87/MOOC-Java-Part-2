
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder sb = new StringBuilder();
        sb.append(" {\n");
        int i =0;
        for(; i<t.length; i++){
            if(i == t.length-1){
                sb.append(" ").append(t[i]);
                break;
            }
            else sb.append(" ").append(t[i]).append(",");
            if((i+1)%4 ==0 && i !=0){
                sb.append("\n");
            }
        }


            sb.append("\n");
        
        sb.append(" }");
        return sb.toString();
    }
}
