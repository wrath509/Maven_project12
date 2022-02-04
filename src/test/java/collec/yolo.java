package collec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class yolo {
    public static void main(String[] args) {
        HashSet st = new HashSet();
        st.add(1);
        st.add("Hello");
        st.add("Hello");
        Iterator itr = st.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
