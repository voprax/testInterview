public class boucleChaussettesSales{

    public static void main(String []args){
        boucleChaussettesSales();
    }

    public static void boucleChaussettesSales() {

        for (int i = 1; i <= 100; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("chaussettes sales !!!");
            }else if(i % 5 == 0) {
                System.out.println("sales !!!");
            }else if(i % 3 == 0) {
                System.out.println("chaussettes !!!");
            } else {
                System.out.println(i);
            }
        }
    }
}