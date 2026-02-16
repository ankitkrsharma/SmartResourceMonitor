package resource;

import exception.*;

public class DiskResource extends SystemResource {

    public DiskResource(double usage) {
        super(usage);
    }

    @Override
    public void checkHealth() throws ResourceOverloadException {

        logStatus("Disk");

        if(getUsage() > 95){
            throw new CriticalFailureException("Disk critical failure!");
        }
    }
}
