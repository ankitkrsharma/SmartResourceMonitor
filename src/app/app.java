package app;

import resource.*;
import exception.*;
import service.MonitoringService;

public class app {

    public static void main(String[] args) {

        MonitoringService service = new MonitoringService();

        SystemResource cpu = new CpuResource(90);
        SystemResource memory = new MemoryResource(70);
        SystemResource disk = new DiskResource(97);

        SystemResource[] resources = {cpu, memory, disk};

        for(SystemResource res : resources){

            try {
                service.monitor(res);

            } catch(ResourceOverloadException e){
                System.out.println("WARNING: " + e.getMessage());

            } catch(CriticalFailureException e){
                System.out.println("CRITICAL: " + e.getMessage());

            } finally {
                System.out.println("Recovery routine executed.\n");
            }
        }

        System.out.println("Monitoring system still running safely.");
    }
}
