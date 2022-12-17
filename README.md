Reference Doc : 
<a href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html">Java Docs</a>

A Stream in Java can be defined as a sequence of elements from a source. The source of elements here refers to a Collection or Array that provides data to the Stream.

- Java streams are designed in such a way that most of the stream operations (called intermediate operations) return a Stream. This helps to create a chain of stream operations. This is called stream pipe-lining.
- Java streams also support the aggregate or terminal operations on the elements. The aggregate operations are operations that allow us to express common manipulations on stream elements quickly and clearly, for example, finding the max or min element, finding the first element matching giving criteria, and so on.
- Not that a stream maintains the same ordering of the elements as the ordering in the stream source.
- 
### Intermediate operation :
 - The method return stream itself then called intermediate operation

### Terminal Operation :
  - The method return primitive not stream

#### The main difference between intermediate and terminal operations is that intermediate operations return a stream as a result and terminal operations return non-stream values like primitive or object or collection or may not return anything.
