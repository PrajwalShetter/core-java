package com.prajwal.learnequlsmethod;

public class Application {

   private String appName;
   private double version;
   private String developer;
   private double size;
   private boolean isInstalled;

    public Application(String appName, double version, String developer, double size, boolean isInstalled) {
        this.appName = appName;
        this.version = version;
        this.developer = developer;
        this.size = size;
        this.isInstalled = isInstalled;
    }

    public Application() {
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
           if(obj instanceof Application){
               Application app = (Application) obj;
               if(this.appName.equals(app.appName) && this.version == app.version);
               return true;
           }
        }
        return false;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isInstalled() {
        return isInstalled;
    }

    public void setInstalled(boolean installed) {
        isInstalled = installed;
    }
}
