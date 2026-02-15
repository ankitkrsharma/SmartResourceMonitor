package resource;

import exception.ResourceOverloadException;

public interface ResourceBehavior {

    double getUsage();

    void checkHealth() throws ResourceOverloadException;
}
