package resource;

import exception.*;

public class CpuResource extends SystemResource {

    public CpuResource(double usage) {
        super(usage);
    }

    @Override
    public void checkHealth() throws ResourceOverloadException {

        logStatus("CPU");

        if(getUsage() > 85){
            throw new ResourceOverloadException("CPU overload detected.");
        }
    }
}
