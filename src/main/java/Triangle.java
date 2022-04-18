

public class Triangle {

    private static final String TRIANGLE_RAVNOSTOR = "Треуголник равносторонний";
    private static final String TRIANGLE_RAZNOSTOR = "Треугольник разносторонний";
    public static final String TRIANGLE_RAVNOBEDR = "Треуголник равнобедренный";
    public static final String TRIANGLE_NOT_EXISTS = "Извините, треуголник с такими сторонами не существует";

    public String triangleType(int a, int b, int c) {
        if((a+b)>c && (a+c)>b && (b+c)>a){
            if ((a == b) && (a == c) && (c == b)){
                return TRIANGLE_RAVNOSTOR;
            }else if((a == b) || (b == c) || (a == c)){
                return TRIANGLE_RAVNOBEDR;
            }else return TRIANGLE_RAZNOSTOR;
        } else return TRIANGLE_NOT_EXISTS;

    }

}
