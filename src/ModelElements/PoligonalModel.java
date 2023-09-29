package ModelElements;

public class PoligonalModel {
    public Poligon poligons;
    public Texture textures;

    public PoligonalModel(Poligon poligons) {
        this.poligons = poligons;//агрегация
        this.textures = new Texture();//композиция
    }
}
