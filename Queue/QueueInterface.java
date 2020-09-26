public interface QueueInterface<E> {
    /**
     * checks if this Queue contains no elements.
     * @return true if Queue contains no elements.
     * @return false if queue is not empty.
     */
    boolean isEmpty();

    /**
     * checks if this Queue was full
     * @return true if queue is full.
     * @return false if queue is not full
     */
    boolean isFull();

    /**
     * add the element into the queue.
     * @param var1 the element add into the queue.
     * @return true if the element was added into the queue.
     * @return false if the element was not added into the queue.
     */
    boolean enqueue(E var1);

    /**
     * remove the front element from the queue.
     * @return returns the removed element from the queue.
     */
    E dequeue();

    /**
     * Returns the front element in the queue without removing.
     * @return Returns front element in the queue.
     */
    E frontElement();

    /**
     * Returns the rear value of the queue
     * @return Return the rear value of the queue.
     */
    E rearElement();

    /**
     * Display or prints all the elements in the queue.
     */
    void display();
}
