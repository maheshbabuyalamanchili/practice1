package Interface;

public interface Laptop {
    public void copy();

    public void cut();

    public void paste();

    //untill java 7
  //implement methods in interface by using(deafult/static)
    default void security(){                     //for implemented classes
        System.out.println("laptop security code");
        audio();
        commoncode();
    }

    public static void audio(){                    //static method
        System.out.println("laptop audio code");
        commoncode();
    }

    private static void commoncode(){
        System.out.println("commoncode");
    }


    }



