public abstract class WorTool {
    String name;
    int year;

    abstract void use();
}

class Hammer extends WorTool{
    @Override
    public void use(){
        System.out.println("Stukupuku");
    }
}

class ScrewDriver extends WorTool{
    @Override
    public void use(){
        System.out.println("wiertu wiertu");
    }
}

class Saw extends WorTool{
    @Override
    public void use(){
        System.out.println("wżżżż");
    }
}