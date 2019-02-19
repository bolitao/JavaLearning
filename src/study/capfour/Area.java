package study.capfour;

public interface Area {
    double area();

    static double getTotalArea(Area a[]) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i].area();
        }
        return result;
    }

}
