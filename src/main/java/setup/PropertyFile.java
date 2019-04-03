package setup;

public enum PropertyFile {
    NATIVE("nativetests"),
    WEB("webtests"),
    HYBRID("hybridtests");

    private String currentApp;

    PropertyFile(String currentApp) {
        this.currentApp = currentApp;
    }

    public String getName(){
        return currentApp + ".properties";
    }
}
