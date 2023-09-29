package MemoryModel;

import ModelElements.*;

public class ModelStore implements IModelChanger,IModelChangedObserver{
    public PoligonalModel models;
    public Scene scene;
    public Flash flashes;
    public Camera cameras;
    private IModelChangedObserver changedObserver;

    public ModelStore(PoligonalModel models, Scene scene, Flash flashes, Camera cameras) {
        this.models = models;
        this.scene = scene;
        this.flashes = flashes;
        this.cameras = cameras;
        //Невозможно создать обьект интерфейса.
        this.changedObserver = new IModelChangedObserver();
    }

    public Scene getScene(int num){
        return new Scene(new PoligonalModel(new Poligon()));
    }
    @Override
    public void ApplyUpdateModel() {

    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
