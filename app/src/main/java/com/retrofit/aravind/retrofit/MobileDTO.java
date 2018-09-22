package com.retrofit.aravind.retrofit;

public class MobileDTO {

    /**
     * rom : 32GB
     * screenSize : 5.5 inch
     * backCamera : 21MP
     * name : Moto X Play
     * frontCamera : 5MP
     * processor : 1.8GHz
     */

    private String rom;
    private String screenSize;
    private String backCamera;
    private String name;
    private String frontCamera;
    private String processor;

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getBackCamera() {
        return backCamera;
    }

    public void setBackCamera(String backCamera) {
        this.backCamera = backCamera;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
