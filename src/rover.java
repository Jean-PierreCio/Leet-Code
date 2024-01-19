import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'roverMove' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER matrixSize
     *  2. STRING_ARRAY cmds
     */
//  feel free to copy this for your records :) great job buddy! 

    //thank you!
    public static int roverMove(int matrixSize, List<String> cmds) {
        int size = matrixSize;
        int row = 0;
        int column = 0;
        for (int i = 0; i < cmds.size(); i++) {
            if (cmds.get(i).equals("RIGHT")) {
                if (column < size -1) {
                    column++;
                }
            }
            if (cmds.get(i).equals("LEFT")) {
                if (column > 0) {
                    column--;
                }
            }
            if (cmds.get(i).equals("UP")) {
                if (row > 0) {
                    row--;
                }
            }
            if (cmds.get(i).equals("DOWN")) {
                if (row < size -1) {
                    row++;
                }
            }
            System.out.println(row);
            System.out.println(column);
            System.out.println();
            
        }
        
        return (row * size) + column;
    }

}


public class Solution {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int matrixSize = Integer.parseInt(bufferedReader.readLine().trim());

        int cmdsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> cmds = IntStream.range(0, cmdsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.roverMove(matrixSize, cmds);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}