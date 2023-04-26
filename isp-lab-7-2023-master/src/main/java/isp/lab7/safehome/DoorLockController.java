package isp.lab7.safehome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoorLockController implements ControllerInterface{

    Map<Tenant, String> validAccess = new HashMap<>();
    private static int errorNr = 0;

    List<String> list = new ArrayList<>();

    public DoorStatus enterPin(String pin) throws InvalidPinException {

        if (pin.equals("MasterKeyValue") || (pin.equals("MasterTenant"))){
            if (pin.equals("MasterKeyValue")){
                errorNr = 0;}
            return DoorStatus.OPEN;
        } else{
            errorNr++;
            if(errorNr==3){
                throw new InvalidPinException();
            }
        }
        return DoorStatus.CLOSE;
    }

    public void addTenant(String pin, String tenantName) throws TenantAlreadyExistsException {
        Tenant newTenant = new Tenant(tenantName);
        if (validAccess.containsKey(newTenant)) {
            throw new TenantAlreadyExistsException();
        } else {
            validAccess.put(newTenant, pin);
        }
    }

    public void removeTenant(String name) throws TenantNotFoundException {
        Tenant tenantToRemove = new Tenant(name);
        if (validAccess.containsKey(tenantToRemove)) {
            validAccess.remove(tenantToRemove);
        } else {
            throw new TenantNotFoundException();
        }
    }

    public List<AccessLog> getAccessLogs(){
        for (Map.Entry<Tenant, String> entry : validAccess.entrySet()) {
            list.add(entry.getValue());
        }
        return null;
    }

}
