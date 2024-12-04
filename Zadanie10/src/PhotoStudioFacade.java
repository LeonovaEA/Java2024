public class PhotoStudioFacade {
    private Background background;
    private Lighting lighting;
    private Camera camera;

    public PhotoStudioFacade() {
        background = new Background();
        lighting = new Lighting();
        camera = new Camera();
    }

    public void setBackground(String backgroundType) {
        background.setBackground(backgroundType);
    }

    public void setLighting(String lightingType) {
        lighting.adjustLighting(lightingType);
    }

    public void takePicture() {
        camera.takePicture();
    }

    public void prepareForShoot(String backgroundType, String lightingType) {
        setBackground(backgroundType);
        setLighting(lightingType);
        takePicture();
    }
}
