package resource;

import util.ValidationUtil;
import exception.ResourceOverloadException;

public abstract class SystemResource implements ResourceBehavior {

    private double usage;

    protected SystemResource(double usage) {
        setUsage(usage);
    }

   
    public void setUsage(double usage) {
        ValidationUtil.validateUsage(usage);
        this.usage = usage;
    }

    @Override
    public double getUsage() {
        return usage;
    }

    
    protected void logStatus(String resource) {
        System.out.println(resource + " Usage: " + usage + "%");
    }

  
    public abstract void checkHealth() throws ResourceOverloadException;
}
