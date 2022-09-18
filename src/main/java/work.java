import java.util.*;
public class work {
    public static void main(String[] args) {
        Object [] xyesos = {1,"qwe",1,"betina","kot"};
    qwe(xyesos);
    asd(xyesos);
    }
    static void qwe (Object[]qq){
        Stack<Object> stc = new Stack<>();
        for (Object object:qq) {
            stc.push(object);
        }
        System.out.println(stc);
    }
    static void asd (Object[]qwe){
        Queue<Object> stc = new LinkedList<>();
        for (Object qw:qwe) {
            stc.offer(qw);
        }
        System.out.println(stc);
    }

}

