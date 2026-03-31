

class MedianFinder {
    private PriorityQueue<Integer> min; // Min-Heap (stores larger half)
    private PriorityQueue<Integer> max; // Max-Heap (stores smaller half)

    public MedianFinder() {
        min = new PriorityQueue<>(); // Min-Heap
        max = new PriorityQueue<>(Collections.reverseOrder()); // Max-Heap
    }
    
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll()); // Ensure max-heap stores smaller half
        
        // Balance the heaps if needed
        if (max.size() < min.size()) {
            max.offer(min.poll());
        }
    }
    
    public double findMedian() {
        if (max.size() > min.size()) {
            return max.peek(); // Odd count → max-heap root is median
        } else {
            return (max.peek() + min.peek()) / 2.0; // Even count → average of roots
        }
    }


}
