/**
 * 
 */
package com.hackerank.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Mayank
 *
 * Hacker Rank: Designer PDF Viewer
 */
public class DesignerPDFViewer {

	static int designerPdfViewer(int[] h, String word) {
        Map<Character, Integer> data = new HashMap<>();
        data.put('a', 0);
        data.put('b', 1);
        data.put('c', 2);
        data.put('d', 3);
        data.put('e', 4);
        data.put('f', 5);
        data.put('g', 6);
        data.put('h', 7);
        data.put('i', 8);
        data.put('j', 9);
        data.put('k', 10);
        data.put('l', 11);
        data.put('m', 12);
        data.put('n', 13);
        data.put('o', 14);
        data.put('p', 15);
        data.put('q', 16);
        data.put('r', 17);
        data.put('s', 18);
        data.put('t', 19);
        data.put('u', 20);
        data.put('v', 21);
        data.put('w', 22);
        data.put('x', 23);
        data.put('y', 24);
        data.put('z', 25);
        
        char[] words = word.toCharArray();
        int max = 0;
        for(char character : words) {
            
            if(h[data.get(character)] > max) {
                max = h[data.get(character)];
            }
        }
        
        return max * words.length;

    }

	//Part of the question
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
