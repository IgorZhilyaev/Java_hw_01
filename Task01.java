import java.io.IOException;

public class Task01 {
    public static void main(String[] args)  {

        try {
            System.out.println(FindTriangleNum(6));
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

    }

public static int FindTriangleNum(int n) throws IOException {
        if (n > 0){
            return (n*(n+1))/2;
        }else {
            throw new IOException();
        }
    }
}
