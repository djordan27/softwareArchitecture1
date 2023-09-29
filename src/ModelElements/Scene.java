package ModelElements;

import java.lang.reflect.Type;

public class Scene {
    public int id;
    public PoligonalModel models;
    public Flash flashes;

    public Scene(PoligonalModel models) {
        this.models = models;//агрегация
    }

    public Type method1 (Type type){
        return type;
    }
    public Type method2 (Type type){
        return type;
    }
}
