package service;

import resource.SystemResource;
import exception.*;

public class MonitoringService {

    public void monitor(SystemResource resource)
            throws ResourceOverloadException {

        resource.checkHealth(); 
        System.out.println("Resource Healthy\n");
    }
}
