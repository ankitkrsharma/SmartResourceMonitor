package resource;

import exception.*;

public class MemoryResource extends SystemResource {

    public MemoryResource(double usage) {
        super(usage);
    }

    @Override
    public void checkHealth() throws ResourceOverloadException {

        logStatus("Memory");

        if(getUsage() > 80){
            throw new ResourceOverloadException("Memory pressure high.");
        }
    }
}
