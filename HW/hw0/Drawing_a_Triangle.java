public class Drawing_a_Triangle {

    public static void DrawTriangle (int x) {
        String output = "";
        for (int i = 0; i < x; i++) {
            output = output + "*";
            System.out.println(output);       
    }
    }

    public static void main(String[] args) {
        DrawTriangle(10);
    }
}
        
