import java.util.ArrayList;
import java.util.Stack;

public class Q_901_StockSpan {
    class StockSpanner {
        private final ArrayList<Integer> list;
        private final Stack<Integer> st;

        public StockSpanner() {
            list = new ArrayList<>();
            st = new Stack<>();
        }

        public int next(int price) {
            int currentIndex = list.size();
            int spanIndex = -1;

            if (!st.isEmpty()) {
                while (!st.isEmpty() && list.get(st.peek()) <= price)
                    st.pop();
                if (!st.isEmpty())
                    spanIndex = st.peek();
            }

            st.push(currentIndex);
            list.add(price);
            return currentIndex - spanIndex;
        }
    }
}
