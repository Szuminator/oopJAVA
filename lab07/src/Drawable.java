public interface Drawable {
    void draw();
}

interface ColorDrawable extends Drawable{
    void setColor(String color);
}

class Circle implements ColorDrawable{
    String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(){
        System.out.println("koło narysowane");
    }

    @Override
    public void setColor(String color){
        System.out.println("nowy kolor: "+ color);
    }
}