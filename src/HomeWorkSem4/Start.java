package HomeWorkSem4;

public class Start {
    public static void main(String[] args) {
        Mapa <Integer, String> mapa = new Mapa<>();
        mapa.put(1, "a");
        mapa.put(2, "b");
        mapa.put(3, "c");
        mapa.put(4, "d");
        mapa.put(17, "F+1");
        mapa.put(18, "F+2");
        mapa.put(33, "F+21");
        System.out.println();

//        System.out.println(mapa.get(1));
//        System.out.println(mapa.get(106));
//        System.out.println(mapa.get(33));
//        System.out.println(mapa.get(17));
//        System.out.println();
//
//        System.out.println(mapa.remove(106));
////        System.out.println(mapa.remove(17));
//        System.out.println(mapa.get(17));
//        System.out.println();
        mapa.replace("Jony", 17);

//        System.out.println(mapa.size());

        System.out.println(mapa.containsKey(2222));
        System.out.println(mapa.containsValue("Jony"));
        System.out.println();
    }
}
