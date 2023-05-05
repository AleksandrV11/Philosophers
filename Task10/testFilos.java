package Task10;

public class testFilos {
    public static void main(String[] args) {
//        Filosofi person1 = new Filosofi(1);
//        Filosofi person2 = new Filosofi(2);
//        Filosofi person3 = new Filosofi(3);
//        Filosofi person4 = new Filosofi(4);
//        Filosofi person5 = new Filosofi(5);
        Taibl taibl = new Taibl();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                if (taibl.palka1) {
                    taibl.palka1 = false;
                    System.out.println("Первый взял левую ");
                    if (!taibl.palka5) {//??что делать если правой палки нет .думаю положить левую???????
                        taibl.palka1 = true;
                        System.out.println("Первый положил левую т.к. нет правой");
                    }
                    if (taibl.palka5) {           // ?? как долго держать правую палку??
                        taibl.palka5 = false;
                        System.out.println("Первый взял правую .Теперь он ест ");
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                if (taibl.palka2) {
                    taibl.palka2 = false;
                    System.out.println("Второй взял левую ");
                    if (!taibl.palka1) {            //??что делать если правой палки нет .думаю положить левую???????
                        taibl.palka2 = true;
                        System.out.println("Второй положил левую т.к. нет правой");
                    }
                    if (taibl.palka1) {           // ?? как долго держать правую палку??
                        taibl.palka1 = false;
                        System.out.println("Второй взял правую .Теперь он ест ");
                    }
                }

            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                if (taibl.palka3) {
                    taibl.palka3 = false;
                    System.out.println("Третий взял левую ");
                    if (!taibl.palka2) {            //??что делать если правой палки нет .думаю положить левую???????
                        taibl.palka3 = true;
                        System.out.println("Третий положил левую т.к. нет правой");
                    }
                    if (taibl.palka2) {           // ?? как долго держать правую палку??
                        taibl.palka2 = false;
                        System.out.println("Третий взял правую .Теперь он ест ");
                    }
                }

            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                if (taibl.palka4) {
                    taibl.palka4 = false;
                    System.out.println("Четвертый взял левую ");
                    if (!taibl.palka3) {            //??что делать если правой палки нет .думаю положить левую???????
                        taibl.palka4 = true;
                        System.out.println("Четвертый положил левую т.к. нет правой");
                    }
                    if (taibl.palka3) {           // ?? как долго держать правую палку??
                        taibl.palka3 = false;
                        System.out.println("Четвертый взял правую .Теперь он ест ");
                    }
                }
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                if (taibl.palka5) {
                    taibl.palka5 = false;
                    System.out.println("Пятый взял левую ");
                    if (!taibl.palka4) {            //??что делать если правой палки нет .думаю положить левую???????
                        taibl.palka5 = true;
                        System.out.println("Пятый положил левую т.к. нет правой");
                    }
                    if (taibl.palka4) {           // ?? как долго держать правую палку??
                        taibl.palka4 = false;
                        System.out.println("Пятый взял правую .Теперь он ест ");
                    }
                }
            }
        });


        try {
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ну че наелись");


    }


}
