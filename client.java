import java.io.*;
import java.util.*;
public class client {
    public static void main(String[] args) {
        huffman control = new huffman("a(10)n(7)u(14)p(8)g(5)m(4)r(3)");
        control.displayHuffmanTree();
        String password = control.generatePasswordFromUsername("anupamgarg", 4, true, true, true);
        String username = control.generateUsernameFromPassword(password);
        System.out.println(password + "\n" + username);
    }
}
