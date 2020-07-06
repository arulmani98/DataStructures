public interface StackInterface<E> {
        /**
         * Returns true if this stack contains no elements.
         * @return true if stack contains no elements.
         * @return false if stack is not empty.
         */
        boolean isEmpty();

        /**
         * Returns true if this stack was full and top reached the maximum value
         * @return true if stack is full.
         * @return false if stack is not full
         */
        boolean isFull();

        /**
         * push (add) the element into the stack.
         * @param var1 the element want to pushed into the stack.
         * @return true if the element was pushed into the stack.
         * @return true if the element was not pushed into the stack.
         */
        boolean push(E var1);

        /**
         * pop the top element from the stack.
         * @return returns the popped element from the stack.
         */
        E pop();

        /**
         * Returns the Top element in the stack
         * @return Returns top element in the stack.
         */
        E top();

        /**
         * Returns the top value of the stack
         * @return Return the top value as integer of the stack.
         */
        int topValue();

        /**
         * Display or prints the elements in the stack.
         */
        void display();
}
