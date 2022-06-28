# Username_Password_Generator

Username Password Generator
The Username Password Generator works on the Huffman Encoding Decoding technique. It is a data encoding method which is mapped during runtime. It helps in loseless conversion.
We can perform the following features using various data- structures:

1. LOSELESS NATURE: Using Trees
2. SHORTER OUTPUT: Using Priority Queues
3. CONSISTENCY: Using Trees and HashMaps
4. STRONGLY ENCODED : Using Trees

TO ENCODE OUR DATA 

A) Steps to build Huffman Tree

1 .Input is an array of unique characters along with their frequency of occurrences and output is Huffman Tree. 

2. Create a leaf node for each unique character and build a min heap of all leaf nodes (Min Heap is used as a priority queue. The value of frequency field is used to compare two nodes in min heap.
Extract two nodes with the minimum frequency from the min heap.
 
3. Create a new internal node with a frequency equal to the sum of the two nodes frequencies. Make the first extracted node as its left child and the other extracted node as its right child. Add this node to the min heap.
4. Repeat steps#2 and #3 until the heap contains only one node. The remaining node is the root node and the tree is complete.


B) Traverse the Huffman Tree and assign codes to characters.

To assign the codes:
1. We start from root and do following until a leaf is found.
2. If current bit is 0, we move to left node of the tree.
3. If the bit is 1, we move to right node of the tree.
4. If during traversal, we encounter a leaf node, we print character of that particular leaf node and then again continue the iteration of the encoded data.

DECODING THE ENCODED PASSWORD:

We iterate through the binary encoded data. If the code matches a particular character, we add it to our answer string else continue till we get a substring as valid code for a character. 

In this manner, we recover our original data.
