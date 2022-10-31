interface jj {
    void dg();
}

interface jj1 {
    void dg1();
}

abstract class jj2{
    abstract void dg2();
}

class ee extends jj2 implements jj,jj1{
    public static void main(String[] args) {
        System.out.println("1");
    }

    @Override
    public void dg() {

    }

    @Override
    public void dg1() {

    }

    @Override
    void dg2() {

    }
}